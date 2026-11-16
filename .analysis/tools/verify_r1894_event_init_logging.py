#!/usr/bin/env python3
"""Recheck the state-7 logging call and record its original/compiled evidence."""
from __future__ import annotations
import argparse
import hashlib
import json
import re
import struct
import subprocess
import sys
from datetime import datetime, timezone
from pathlib import Path


CLASS_SLASH = (
    "me/octo/client/utils/"
    "lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI"
)
CLASS_DOT = CLASS_SLASH.replace("/", ".")
LOG_MESSAGE = "Initializing Polinex Rendering (pt2)."


def sha256(path: Path) -> str:
    return hashlib.sha256(path.read_bytes()).hexdigest()


def run(argv: list[str], cwd: Path) -> tuple[subprocess.CompletedProcess[str], str]:
    result = subprocess.run(
        argv, cwd=cwd, text=True, capture_output=True, encoding="utf-8", errors="replace"
    )
    command = subprocess.list2cmdline(argv)
    if result.returncode:
        raise RuntimeError(f"command failed ({result.returncode}): {command}\n{result.stderr}")
    return result, command


def method_block(text: str, signature: str) -> str:
    lines = text.splitlines()
    start = next(i for i, line in enumerate(lines) if line.strip() == signature)
    end = next(
        (i for i in range(start + 1, len(lines)) if lines[i].startswith("  public ") or lines[i].startswith("  private ")),
        len(lines),
    )
    return "\n".join(lines[start:end])


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--root", type=Path, default=Path.cwd())
    parser.add_argument("--output", type=Path, required=True)
    args = parser.parse_args()
    root = args.root.resolve()
    started = datetime.now(timezone.utc)
    reports = root / ".analysis/reports"
    tools = root / ".analysis/tools"
    pe_path = Path("D:/Work/OpenPoli/.analysis/artifacts/jnic-windows-x64.static-pe.bin")
    key_path = Path("D:/Work/OpenPoli/.analysis/artifacts/jnic-windows-x64.derived-keystream.bin")
    jar_path = Path("D:/Work/OpenPoli/.analysis/cracked.jar")
    helper_dump = reports / "R1894-event-initialization-helpers.objdump.txt"
    original_dump = reports / "R1894-original-log-utility.javap.txt"
    compiled_dump = reports / "R1894-compiled-log-utility.javap.txt"
    disasm = reports / "R1872-polininex-client-initialized.objdump.txt"
    literals = reports / "R1876-client-initialized-helper-literals.json"
    jni_map = reports / "R1881-client-initialized-all-jni-calls.json"
    source = root / "polinex-src/src/main/java/me/octo/client/utils" / (CLASS_SLASH.rsplit("/", 1)[1] + ".java")
    for path in (pe_path, key_path, jar_path, helper_dump, original_dump, compiled_dump, disasm, literals, jni_map, source):
        if not path.is_file():
            raise FileNotFoundError(path)

    objdump_bin = Path("D:/Apps/mingw64/bin/objdump.exe")
    objdump_cmd = [
        str(objdump_bin), "-d", "--start-address=0x180002dc0",
        "--stop-address=0x180002f3a", str(pe_path),
    ]
    objdump_result, objdump_command = run(objdump_cmd, root)
    saved_lines = helper_dump.read_text(encoding="utf-8-sig").splitlines()
    fresh_lines = objdump_result.stdout.splitlines()
    dump_match = [
        line.replace("/", "\\") for line in saved_lines
    ] == [
        line.replace("/", "\\") for line in fresh_lines
    ]

    decoder_result, decoder_command = run([
        sys.executable, "-B", str(tools / "decode_event_string_operands.py"),
        "--disassembly", str(helper_dump), "--pe", str(pe_path), "--keystream", str(key_path),
    ], root)
    decoded_class = json.loads(decoder_result.stdout)
    class_name = next(
        item["decoded"] for item in decoded_class["operands"]
        if item.get("call_va") == "0x180002e44"
    )
    helper_text = helper_dump.read_text(encoding="utf-8-sig")
    name_key_match = re.search(r"mov\s+0x3af13\(%rax\),%cl", helper_text)
    descriptor_source = re.search(r"movabs\s+\$0x([0-9a-f]+),%rcx", helper_text)
    if not (name_key_match and descriptor_source):
        raise AssertionError("method name/descriptor operands not found in helper dump")
    pe = pe_path.read_bytes()
    key = key_path.read_bytes()
    data_va = 0x18015b100
    data_offset = 0x12da00 + data_va - 0x18012f000
    descriptor_cipher = bytearray(pe[data_offset:data_offset + 14])
    descriptor_cipher.extend(struct.pack("<Q", int(descriptor_source.group(1), 16))[:7])
    method_name = bytes([key[0x3af13] ^ 0xd0]).decode("ascii")
    descriptor = bytes(
        byte ^ key[0x3af14 + index]
        for index, byte in enumerate(descriptor_cipher)
    ).decode("ascii")

    jni = json.loads(jni_map.read_text(encoding="utf-8"))
    target_call = next(item for item in jni["calls"] if item["call_site"] == "0x180044069")
    literals_json = json.loads(literals.read_text(encoding="utf-8"))
    message = next(
        item["decoded"] for item in literals_json["decoded"]["operands"]
        if item.get("call_va") == "0x180043ff8"
    )

    javap = Path("C:/Program Files/Eclipse Adoptium/jdk-25.0.4.101-hotspot/bin/javap.exe")
    original_result, original_command = run([
        str(javap), "-classpath", str(jar_path), "-p", "-c", "-s", CLASS_DOT,
    ], root)
    compiled_result, compiled_command = run([
        str(javap), "-classpath", str(root / "polinex-src/build/classes/java/main"),
        "-p", "-c", "-s", CLASS_DOT,
    ], root)
    original_method = method_block(original_result.stdout, "public static final void d(java.lang.String);")
    compiled_method = method_block(compiled_result.stdout, "public static final void d(java.lang.String);")
    source_text = source.read_text(encoding="utf-8")
    method_matches = all(token in original_method and token in compiled_method for token in [
        "descriptor: (Ljava/lang/String;)V",
        "Intrinsics.checkNotNullParameter",
        "Logger.info:(Ljava/lang/String;)V",
    ])
    source_matches = (
        "public static final void d(@NotNull String" in source_text
        and ".info(var0);" in source_text
    )
    assertions = {
        "helper_dump_matches_fresh_objdump": dump_match,
        "class_helper_decodes_to_source_owner": class_name == CLASS_SLASH,
        "static_method_name_descriptor_decode": method_name == "d" and descriptor == "(Ljava/lang/String;)V",
        "event_call_uses_CallStaticVoidMethod": target_call["jni_function"] == "CallStaticVoidMethod",
        "progress_message_decodes": message == LOG_MESSAGE,
        "original_and_compiled_method_body_match_logger_info": method_matches,
        "managed_source_has_same_log_effect": source_matches,
    }
    if not all(assertions.values()):
        raise AssertionError(assertions)

    source_paths = {
        "Polinex.java": root / "polinex-src/src/main/java/me/octo/client/Polinex.java",
        source.name: source,
    }
    head = subprocess.check_output(["git", "rev-parse", "HEAD"], cwd=root, text=True).strip()
    report = {
        "slice_id": "R1894-client-initialized-state7-progress-log",
        "source_baseline_commit": head,
        "source_files_sha256": {name: sha256(path) for name, path in source_paths.items()},
        "probe_status": "static-only; no client, game, keyboard, mouse, or server interaction",
        "started_utc": started.isoformat(),
        "ended_utc": datetime.now(timezone.utc).isoformat(),
        "command": "python -B .analysis/tools/verify_r1894_event_init_logging.py --root . --output .analysis/reports/R1894-event-init-state7-progress-log.json",
        "exit_code": 0,
        "subcommands": [
            {"command": objdump_command, "exit_code": objdump_result.returncode},
            {"command": decoder_command, "exit_code": decoder_result.returncode},
            {"command": original_command, "exit_code": original_result.returncode},
            {"command": compiled_command, "exit_code": compiled_result.returncode},
        ],
        "inputs_sha256": {
            str(path): sha256(path)
            for path in (pe_path, key_path, jar_path, helper_dump, original_dump, compiled_dump, disasm, literals, jni_map, source)
        },
        "decoded_call": {
            "helper_class": class_name,
            "method": method_name,
            "descriptor": descriptor,
            "jni_callsite": target_call["call_site"],
            "jni_function": target_call["jni_function"],
            "message": message,
        },
        "assertions": assertions,
        "acceptance": {
            "static_reconstruction": "passed for helper class, method ID, descriptor, invocation target, message, and Logger.info side effect",
            "build_regression": "not run in this slice; compiled class is from the R1892 full-tree compile",
            "normal_user_path": "not run",
            "vanilla_comparison": "not run",
            "real_server": "not run",
        },
        "limits": "This proves only the progress-log call at the start of state 7. The remaining initialization calls and dispatcher effects are open.",
    }
    output = args.output if args.output.is_absolute() else root / args.output
    output.parent.mkdir(parents=True, exist_ok=True)
    output.write_text(json.dumps(report, indent=2) + "\n", encoding="utf-8")
    print(json.dumps({"output": str(output), "assertions": assertions, "exit_code": 0}, indent=2))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())

