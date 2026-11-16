#!/usr/bin/env python3
"""Verify the post-constructor static array getter used by E_CLIENT_INITIALIZED."""
from __future__ import annotations

import argparse
import hashlib
import json
import re
import subprocess
import sys
from datetime import datetime, timezone
from pathlib import Path


def sha256(path: Path) -> str:
    return hashlib.sha256(path.read_bytes()).hexdigest().upper()


def utc_now() -> str:
    return datetime.now(timezone.utc).isoformat()


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--root", required=True, type=Path)
    parser.add_argument("--pe", required=True, type=Path)
    parser.add_argument("--keystream", required=True, type=Path)
    parser.add_argument("--jar", required=True, type=Path)
    parser.add_argument("--javap", required=True, type=Path)
    parser.add_argument("--output", required=True, type=Path)
    args = parser.parse_args()

    root = args.root.resolve()
    started = utc_now()
    report_dir = root / ".analysis" / "reports"
    class_dump = report_dir / "R1900-post-constructor-class-helper.objdump.txt"
    method_dump = report_dir / "R1900-post-constructor-method-helper.objdump.txt"
    event_dump = report_dir / "R1872-polininex-client-initialized.objdump.txt"
    jni_calls = report_dir / "R1881-client-initialized-all-jni-calls.json"
    array_report = report_dir / "R1901-post-constructor-array-field-writes.json"
    polinex_source = root / "polinex-src/src/main/java/me/octo/client/Polinex.java"

    # The class helper at RVA 0x1d423 copies 0x6b bytes from this PE address,
    # then XORs the first 0x6a bytes with the recovered keystream.
    pe_data = args.pe.read_bytes()
    keystream = args.keystream.read_bytes()
    rdata_va = 0x18012F000
    rdata_file_offset = 0x12DA00
    class_data_va = 0x18015C69B
    class_key_offset = 0x2F641
    class_xor_length = 0x6A
    class_copy_length = class_xor_length + 1
    class_offset = rdata_file_offset + class_data_va - rdata_va
    raw_class = pe_data[class_offset:class_offset + class_copy_length]
    if len(raw_class) != class_copy_length:
        raise ValueError("class-name bytes are outside the PE image")
    if class_key_offset + class_xor_length > len(keystream):
        raise ValueError("class-name keystream range is outside the recovered stream")
    decoded_class = bytes(
        raw_class[index] ^ keystream[class_key_offset + index]
        for index in range(class_xor_length)
    ).decode("ascii")
    if raw_class[class_xor_length:] != b"\0":
        raise ValueError("decoded class name is not NUL terminated")

    expected_source = (
        root / "polinex-src/src/main/java" / Path(*decoded_class.split("/")).with_suffix(".java")
    )
    if not expected_source.is_file():
        raise FileNotFoundError(f"decoded owner source does not exist: {expected_source}")
    owner_source = expected_source

    # The method-name helper XORs a single encoded byte at 0x2f6ab with 0xb4.
    method_name = chr(keystream[0x2F6AB] ^ 0xB4)
    decode_argv = [
        sys.executable, "-B", str(root / ".analysis/tools/decode_event_string_operands.py"),
        "--disassembly", str(method_dump), "--pe", str(args.pe), "--keystream", str(args.keystream),
    ]
    decode_run = subprocess.run(decode_argv, cwd=root, capture_output=True, text=True)
    if decode_run.returncode != 0:
        raise RuntimeError(f"descriptor decoder failed ({decode_run.returncode}): {decode_run.stderr}")
    decoded_operands = json.loads(decode_run.stdout)["operands"]
    descriptor_matches = [
        item for item in decoded_operands
        if item["call_va"].lower() == "0x18001d9e2"
    ]
    if len(descriptor_matches) != 1:
        raise ValueError("expected one method descriptor operand at 0x18001d9e2")
    method_descriptor = descriptor_matches[0]["decoded"]

    array_record = json.loads(array_report.read_text(encoding="utf-8"))["result"]
    owner_internal = decoded_class
    array_type = f"L{owner_internal};"
    field = array_record["field"]
    if field["owner"] != owner_internal:
        raise ValueError("decoded class helper does not match the array-field owner")
    if field["descriptor"] != f"[{array_type}":
        raise ValueError("array field descriptor is inconsistent with the decoded owner")
    expected_method_descriptor = f"(){field['descriptor']}"

    owner_text = owner_source.read_text(encoding="utf-8")
    field_name = field["name"]
    field_decl = re.search(
        rf"private\s+static\s+{re.escape(owner_source.stem)}\[\]\s+{re.escape(field_name)}\s*;",
        owner_text,
    )
    getter = re.search(
        rf"public\s+static\s+{re.escape(owner_source.stem)}\[\]\s+{re.escape(method_name)}\(\)\s*\{{\s*return\s+{re.escape(field_name)}\s*;\s*\}}",
        owner_text,
    )
    if not field_decl or not getter:
        raise ValueError("managed source field/getter does not match the decoded method")

    javap_argv = [
        str(args.javap), "-classpath", str(args.jar), "-p", "-c", "-s", decoded_class.replace("/", "."),
    ]
    javap_run = subprocess.run(javap_argv, cwd=root, capture_output=True, text=True)
    if javap_run.returncode != 0:
        raise RuntimeError(f"javap failed ({javap_run.returncode}): {javap_run.stderr}")
    javap_lines = javap_run.stdout.splitlines()
    getter_start = next(
        (index for index, line in enumerate(javap_lines) if line.rstrip().endswith(f" {method_name}();")),
        None,
    )
    if getter_start is None:
        raise ValueError("original JAR getter not found in javap output")
    getter_lines = javap_lines[getter_start:getter_start + 8]
    getter_block = "\n".join(getter_lines)
    getstatic_match = re.search(r"0:\s+getstatic\s+#\d+\s+// Field ([^:]+):(\S+)", getter_block)
    original_descriptor = re.search(r"descriptor:\s+(\S+)", getter_block)
    has_areturn = any(re.fullmatch(r"\s*3:\s+areturn\s*", line) for line in getter_lines)
    original_getter_matches = bool(
        getstatic_match
        and getstatic_match.group(1) == field_name
        and getstatic_match.group(2) == field["descriptor"]
        and original_descriptor
        and original_descriptor.group(1) == expected_method_descriptor
        and has_areturn
    )
    if not original_getter_matches:
        raise ValueError(
            "original JAR getter differs from decoded/source method: "
            f"parsed_field={getstatic_match.groups() if getstatic_match else None}, "
            f"parsed_descriptor={original_descriptor.group(1) if original_descriptor else None}, "
            f"expected_field={field_name}:{field['descriptor']}, "
            f"expected_descriptor={expected_method_descriptor}, has_areturn={has_areturn}\n{getter_block}"
        )

    raw_event = event_dump.read_text(encoding="utf-8", errors="replace")
    target_sequence = ["0x1800449d5", "0x1800449e0", "0x1800449ee"]
    if not all(f"{address[2:]}:" in raw_event.lower() for address in target_sequence):
        raise ValueError("event disassembly does not contain the class/method/invoke sequence")
    calls = json.loads(jni_calls.read_text(encoding="utf-8"))["calls"]
    invoke = [item for item in calls if item.get("call_site", "").lower() == "0x1800449ee"]
    if len(invoke) != 1 or invoke[0].get("jni_function") != "CallStaticObjectMethod":
        raise ValueError("0x1800449ee is not confirmed as CallStaticObjectMethod")

    git_head = subprocess.run(
        ["git", "rev-parse", "HEAD"], cwd=root, capture_output=True, text=True, check=True
    ).stdout.strip()
    branch = subprocess.run(
        ["git", "branch", "--show-current"], cwd=root, capture_output=True, text=True, check=True
    ).stdout.strip()
    assertions = {
        "class_helper_decodes_to_array_owner": decoded_class == owner_internal,
        "method_helper_decodes_name_f": method_name == "f",
        "method_helper_decodes_exact_array_descriptor": method_descriptor == expected_method_descriptor,
        "event_calls_static_getter_with_class_and_method_helpers": True,
        "original_jar_getter_is_getstatic_then_areturn": original_getter_matches,
        "managed_source_getter_returns_the_same_field": bool(field_decl and getter),
        "array_field_matches_original_owner_and_array_type": field["owner"] == owner_internal and field["descriptor"] == f"[{array_type}",
    }
    if not all(assertions.values()):
        raise AssertionError(assertions)

    input_files = [
        class_dump, method_dump, event_dump, jni_calls, array_report,
        args.pe, args.keystream, args.jar, owner_source, polinex_source,
    ]
    record = {
        "slice_id": "R1908-post-constructor-array-getter",
        "source_baseline_commit": git_head,
        "branch": branch,
        "probe_status": "static-only; no client, game, keyboard, mouse, or server interaction",
        "started_utc": started,
        "ended_utc": utc_now(),
        "source_files_sha256": {
            str(path.relative_to(root)).replace("\\", "/"): sha256(path)
            for path in (owner_source, polinex_source)
        },
        "inputs_sha256": {str(path): sha256(path) for path in input_files},
        "commands": {
            "descriptor_decode": {"argv": decode_argv, "exit_code": decode_run.returncode},
            "original_javap": {"argv": javap_argv, "exit_code": javap_run.returncode},
            "verifier": {"argv": sys.argv, "exit_code": 0},
        },
        "method_mapping": {
            "event_call_sequence": target_sequence,
            "jni_function": "CallStaticObjectMethod",
            "class_helper_rva": "0x18001d423",
            "class_name": decoded_class,
            "method_id_helper_rva": "0x18001d983",
            "decoded_method_name": method_name,
            "descriptor_helper_rva": "0x18001da1e",
            "descriptor": method_descriptor,
            "target": f"{decoded_class.replace('/', '.')}.{method_name}{method_descriptor}",
        },
        "original_getter_bytecode": getter_block,
        "array_field": field,
        "assertions": assertions,
        "acceptance": {
            "static_reconstruction": "passed for the post-constructor static getter and its backing array field",
            "build_regression": "not run; no source changed",
            "direct_runtime_probe": "not run",
            "normal_user_path": "not run; E_CLIENT_INITIALIZED remains native",
            "vanilla_comparison": "not run",
            "real_server": "not run",
        },
        "limits": "This proves the getter returns the static array field and matches the native helper call. It does not observe runtime values or prove the state -11 branch unreachable under reflective/native writes.",
    }
    args.output.parent.mkdir(parents=True, exist_ok=True)
    args.output.write_text(json.dumps(record, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    print(json.dumps({"output": str(args.output), "assertions": assertions}, ensure_ascii=False, indent=2))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
