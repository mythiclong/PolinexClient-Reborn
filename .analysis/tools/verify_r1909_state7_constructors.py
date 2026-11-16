#!/usr/bin/env python3
"""Compare all 15 E_CLIENT_INITIALIZED constructor calls to compiled source methods."""
from __future__ import annotations

import argparse
import hashlib
import json
import re
import subprocess
from datetime import datetime, timezone
from pathlib import Path


def sha256(path: Path) -> str:
    return hashlib.sha256(path.read_bytes()).hexdigest().upper()


def javap_method_body(output: str, descriptor: str) -> list[str]:
    lines = output.splitlines()
    for i, line in enumerate(lines):
        if not line.rstrip().endswith("();"):
            continue
        if i + 2 >= len(lines) or lines[i + 1].strip() != f"descriptor: {descriptor}" or lines[i + 2].strip() != "Code:":
            continue
        body = []
        for item in lines[i + 3:]:
            if not item.strip():
                break
            body.append(re.sub(r"#\d+", "#", item.rstrip()))
        if not body:
            raise ValueError("javap constructor has no Code entries")
        return body
    raise ValueError(f"javap constructor with descriptor {descriptor} was not found")


def run_javap(javap: Path, classpath: Path, owner: str, cwd: Path) -> tuple[list[str], list[str]]:
    argv = [str(javap), "-classpath", str(classpath), "-p", "-c", "-s", owner.replace("/", ".")]
    result = subprocess.run(argv, cwd=cwd, capture_output=True, text=True, encoding="utf-8", errors="replace")
    if result.returncode:
        raise RuntimeError(f"javap failed for {owner}: {result.stderr}")
    return argv, javap_method_body(result.stdout, "()V")


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--root", required=True, type=Path)
    parser.add_argument("--jar", required=True, type=Path)
    parser.add_argument("--javap", required=True, type=Path)
    parser.add_argument("--output", required=True, type=Path)
    args = parser.parse_args()
    root = args.root.resolve()
    jar = args.jar.resolve()
    javap = args.javap.resolve()
    started = datetime.now(timezone.utc)

    reports = root / ".analysis/reports"
    mappings_path = reports / "R1895-state7-constructor-bytecode.json"
    original_dump = reports / "R1895-state7-constructor-classes.original.javap.txt"
    mapping_record = json.loads(mappings_path.read_text(encoding="utf-8"))
    if mapping_record["class_count"] != 15:
        raise AssertionError(f"expected 15 mapped constructors, got {mapping_record['class_count']}")
    source_classes = root / "polinex-src/build/classes/java/main"

    results = []
    command_records = []
    for item in mapping_record["mappings"]:
        owner = item["class"]
        source = root / "polinex-src/src/main/java" / Path(*owner.split("/")).with_suffix(".java")
        compiled_class = source_classes / Path(*owner.split("/")).with_suffix(".class")
        if not source.is_file() or not compiled_class.is_file():
            raise FileNotFoundError(f"source/class missing for {owner}: {source}, {compiled_class}")
        current_source_hash = sha256(source)
        if current_source_hash.lower() != item["source_sha256"].lower():
            raise AssertionError(f"source changed since R1895 for {owner}")

        original_argv, original_body = run_javap(javap, jar, owner, root)
        candidate_argv, candidate_body = run_javap(javap, source_classes, owner, root)
        command_records.extend([
            {"argv": original_argv, "exit_code": 0},
            {"argv": candidate_argv, "exit_code": 0},
        ])
        original_bytes = ("\n".join(original_body) + "\n").encode("utf-8")
        candidate_bytes = ("\n".join(candidate_body) + "\n").encode("utf-8")
        results.append({
            "owner": owner,
            "descriptor": "()V",
            "allocation_call": item["allocation_call"],
            "constructor_call": item["constructor_call"],
            "source_sha256": current_source_hash,
            "compiled_class_sha256": sha256(compiled_class),
            "compiled_class_mtime_utc": datetime.fromtimestamp(compiled_class.stat().st_mtime, timezone.utc).isoformat(),
            "source_mtime_utc": datetime.fromtimestamp(source.stat().st_mtime, timezone.utc).isoformat(),
            "original_constructor_sha256": hashlib.sha256(original_bytes).hexdigest().upper(),
            "compiled_constructor_sha256": hashlib.sha256(candidate_bytes).hexdigest().upper(),
            "instruction_and_exception_table_match": original_body == candidate_body,
            "original_code_lines": len(original_body),
        })

    assertions = {
        "all_15_original_alloc_and_nonvirtual_constructor_calls_mapped": len(results) == 15,
        "all_15_current_sources_match_the_R1895_source_hashes": all(
            result["source_sha256"].lower() == mapping["source_sha256"].lower()
            for result, mapping in zip(results, mapping_record["mappings"])
        ),
        "all_15_compiled_constructor_bodies_match_original": all(
            result["instruction_and_exception_table_match"] for result in results
        ),
    }
    ended = datetime.now(timezone.utc)
    record = {
        "slice_id": "R1909-state7-constructor-source-bytecode-comparison",
        "source_baseline_commit": mapping_record["source_baseline_commit"],
        "worktree": str(root),
        "branch": subprocess.run(
            ["git", "branch", "--show-current"], cwd=root, capture_output=True, text=True, check=True
        ).stdout.strip(),
        "probe_status": "static-only; no client, game, keyboard, mouse, or server interaction",
        "started_utc": started.isoformat(),
        "ended_utc": ended.isoformat(),
        "inputs_sha256": {
            str(path): sha256(path)
            for path in [mappings_path, original_dump, jar, javap]
        },
        "commands": command_records,
        "constructor_count": len(results),
        "constructors": results,
        "assertions": assertions,
        "acceptance": {
            "static_reconstruction": "pending until all assertions pass",
            "build_regression": "not run by this comparison",
            "direct_runtime_probe": "not run",
            "normal_user_path": "not run; E_CLIENT_INITIALIZED remains native",
            "vanilla_comparison": "not run",
            "real_server": "not run",
        },
        "limits": "This compares the constructor instruction streams and exception tables in the captured compiled class files. It does not compare class initialization, downstream behavior, or the native event handler at runtime.",
    }
    if all(assertions.values()):
        record["acceptance"]["static_reconstruction"] = "passed for all 15 constructor bodies"
    else:
        record["acceptance"]["static_reconstruction"] = "failed; inspect per-constructor differences"
    args.output.parent.mkdir(parents=True, exist_ok=True)
    args.output.write_text(json.dumps(record, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    print(json.dumps({"output": str(args.output), "assertions": assertions,
                      "mismatches": [r["owner"] for r in results if not r["instruction_and_exception_table_match"]]},
                     ensure_ascii=False, indent=2))
    return 0 if all(assertions.values()) else 1


if __name__ == "__main__":
    raise SystemExit(main())
