#!/usr/bin/env python3
"""Extract exact original constructor bytecode reached from the client-init state-7 branch."""
from __future__ import annotations
import argparse
import hashlib
import json
import subprocess
from datetime import datetime, timezone
from pathlib import Path


def sha256(path: Path) -> str:
    return hashlib.sha256(path.read_bytes()).hexdigest()


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--root", type=Path, default=Path.cwd())
    parser.add_argument("--jar", type=Path, default=Path("D:/Work/OpenPoli/.analysis/cracked.jar"))
    args = parser.parse_args()
    root = args.root.resolve()
    jar = args.jar.resolve()
    reports = root / ".analysis/reports"
    started = datetime.now(timezone.utc)
    use_map_path = reports / "R1880-client-initialized-method-id-use-map.json"
    jni_path = reports / "R1881-client-initialized-all-jni-calls.json"
    event_dump_path = reports / "R1872-polininex-client-initialized.objdump.txt"
    for path in (jar, use_map_path, jni_path, event_dump_path):
        if not path.is_file():
            raise FileNotFoundError(path)

    uses = json.loads(use_map_path.read_text(encoding="utf-8"))["uses"]
    jni = json.loads(jni_path.read_text(encoding="utf-8"))
    calls = {item["call_site"]: item for item in jni["calls"]}
    constructors = [
        item for item in uses
        if item.get("method_name") == "<init>"
        and item.get("descriptor") == "()V"
        and 0x1800443BC <= int(item["jni_invocation"]["call_site"], 16) <= 0x1800449B2
    ]
    if len(constructors) != 15:
        raise AssertionError(f"expected 15 state-7 no-arg constructors, found {len(constructors)}")

    javap = Path("C:/Program Files/Eclipse Adoptium/jdk-25.0.4.101-hotspot/bin/javap.exe")
    output_parts = []
    command_records = []
    source_hashes = {}
    mappings = []
    for use in constructors:
        site = use["jni_invocation"]["call_site"]
        owner = use["nearby_class_helper"]["class_name"]
        alloc = use["nearby_alloc_object"]
        alloc_call = calls.get(alloc["call_site"])
        constructor_call = calls.get(site)
        if not (alloc_call and constructor_call):
            raise AssertionError(f"missing JNI mapping at {alloc['call_site']} or {site}")
        if alloc_call["jni_function"] != "AllocObject":
            raise AssertionError(f"unexpected allocator at {alloc['call_site']}")
        if constructor_call["jni_function"] != "CallNonvirtualVoidMethod":
            raise AssertionError(f"unexpected constructor invocation at {site}")
        fqcn = owner.replace("/", ".")
        result = subprocess.run(
            [str(javap), "-classpath", str(jar), "-p", "-c", "-s", fqcn],
            cwd=root, text=True, capture_output=True, encoding="utf-8", errors="replace",
        )
        command = subprocess.list2cmdline(
            [str(javap), "-classpath", str(jar), "-p", "-c", "-s", fqcn]
        )
        command_records.append({"command": command, "exit_code": result.returncode})
        if result.returncode:
            raise RuntimeError(f"javap failed for {fqcn}: {result.stderr}")
        if "descriptor: ()V" not in result.stdout:
            raise AssertionError(f"no ()V descriptor found for {fqcn}")
        output_parts.extend([f"===== {fqcn} =====", result.stdout.rstrip(), ""])
        source = root / "polinex-src/src/main/java" / Path(*owner.split("/")).with_suffix(".java")
        source_hashes[fqcn] = sha256(source) if source.is_file() else None
        mappings.append({
            "class": owner,
            "source_file": str(source.relative_to(root)) if source.is_file() else None,
            "source_exists": source.is_file(),
            "source_sha256": source_hashes[fqcn],
            "descriptor": use["descriptor"],
            "allocation_call": alloc["call_site"],
            "constructor_call": site,
            "jni_allocation": alloc_call["jni_function"],
            "jni_constructor": constructor_call["jni_function"],
            "class_helper_call": use["nearby_class_helper"]["event_class_helper_call"],
        })

    dump_path = reports / "R1895-state7-constructor-classes.original.javap.txt"
    dump_path.write_text("\n".join(output_parts), encoding="utf-8")
    ended = datetime.now(timezone.utc)
    head = subprocess.check_output(["git", "rev-parse", "HEAD"], cwd=root, text=True).strip()
    record = {
        "slice_id": "R1895-client-initialized-state7-constructors",
        "source_baseline_commit": head,
        "probe_status": "static-only; no client, game, keyboard, mouse, or server interaction",
        "started_utc": started.isoformat(),
        "ended_utc": ended.isoformat(),
        "command": "python -B .analysis/tools/inspect_r1895_state7_constructor_bytecode.py --root .",
        "exit_code": 0,
        "input_sha256": {
            str(path.relative_to(root)): sha256(path)
            for path in (use_map_path, jni_path, event_dump_path)
        } | {str(jar): sha256(jar)},
        "javap_commands": command_records,
        "class_count": len(mappings),
        "mappings": mappings,
        "full_original_bytecode": str(dump_path.relative_to(root)),
        "full_original_bytecode_sha256": sha256(dump_path),
        "acceptance": {
            "static_reconstruction": "mapped all 15 AllocObject and CallNonvirtualVoidMethod pairs and extracted full original class bytecode",
            "build_regression": "not run; no Java source changed",
            "normal_user_path": "not run",
            "vanilla_comparison": "not run",
            "real_server": "not run",
        },
        "limits": "The constructor bytecode is evidence for this state-7 initialization sequence; call ordering and later consumers remain open.",
    }
    record_path = reports / "R1895-state7-constructor-bytecode.json"
    record_path.write_text(json.dumps(record, indent=2) + "\n", encoding="utf-8")
    print(json.dumps({
        "record": str(record_path),
        "dump": str(dump_path),
        "class_count": len(mappings),
        "source_files_missing": [item["class"] for item in mappings if not item["source_exists"]],
        "exit_code": 0,
    }, indent=2))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())

