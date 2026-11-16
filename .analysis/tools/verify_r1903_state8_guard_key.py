#!/usr/bin/env python3
"""Check the state-8 guard against the recovered JNIC keystream bytes."""
from __future__ import annotations

import argparse
import hashlib
import json
import re
import subprocess
from datetime import datetime, timezone
from pathlib import Path


ROOT = Path(__file__).resolve().parents[2]
REPORTS = ROOT / ".analysis" / "reports"
OUTPUT = REPORTS / "R1903-client-init-state8-guard-key.json"


def sha256_bytes(data: bytes) -> str:
    return hashlib.sha256(data).hexdigest().upper()


def sha256_file(path: Path) -> str:
    return sha256_bytes(path.read_bytes())


def read_json(name: str) -> dict:
    return json.loads((REPORTS / name).read_text(encoding="utf-8"))


def git(*args: str) -> str:
    return subprocess.check_output(
        ["git", *args], cwd=ROOT, text=True, stderr=subprocess.STDOUT
    ).strip()


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--keystream", required=True, type=Path)
    args = parser.parse_args()

    started = datetime.now(timezone.utc).isoformat()
    stream = args.keystream.read_bytes()
    stream_sha = sha256_bytes(stream)
    dispatch = read_json("R1883-client-initialized-dispatch-map.json")
    strings = read_json("R1875-client-init-string-operands.json")
    state_paths = read_json("R1885-client-initialized-dispatch-path-correction.json")
    state5 = read_json("R1902-client-init-state8-state5-control-flow.json")
    assert stream_sha == dispatch["inputs_sha256"][str(args.keystream).replace("/", "\\")]
    assert stream_sha == strings["decoded"]["keystream_sha256"]

    offset = 0x8EDB
    observed = int.from_bytes(stream[offset:offset + 4], "little")
    comparison = 0x6CCE96CB
    assert observed == 0x16B31C06
    assert observed != comparison

    disassembly_path = REPORTS / "R1872-polininex-client-initialized.objdump.txt"
    disassembly = disassembly_path.read_text(encoding="utf-8", errors="replace")
    lines = disassembly.splitlines()

    def line_at(address: int) -> str:
        prefix = f"{address:x}:"
        for line in lines:
            if re.match(r"\s*" + re.escape(prefix), line, flags=re.IGNORECASE):
                return line.lower()
        raise AssertionError(f"missing instruction at 0x{address:x}")

    guard_line = line_at(0x180043EA9)
    mismatch_line = line_at(0x180043EB3)
    state5_load = line_at(0x180044B83)
    state5_xor = line_at(0x180044B89)
    assert "cmpl   $0x6cce96cb,0x8edb(%rax)" in guard_line
    assert "jne    0x180044b83" in mismatch_line
    assert "mov    0x8edf(%rax),%eax" in state5_load
    assert "mov    $0x26080e54,%ecx" in state5_xor
    assert any(
        item["decoded_state_signed"] == 5 and item["next_target"] == "0x180044adc"
        for item in dispatch["transitions"]
    )
    assert any(
        item["decoded_state_signed"] == 5
        and item["effective_route"]["target"] == "0x180044adc"
        for item in state_paths["transitions"]
    )
    string_operand = next(
        item for item in strings["decoded"]["operands"]
        if item["call_va"] == "0x180044ce7"
    )
    assert string_operand["key_offset"] == "0x8ef3"
    assert string_operand["decoded"] == "Cannot initialize client on render thread."
    assert state5["assertions"]["state5_runtimeexception_class_and_jni_calls"]

    inputs = {
        "keystream_path": str(args.keystream.resolve()).replace("\\", "/"),
        "keystream_sha256": stream_sha,
        "R1872-polininex-client-initialized.objdump.txt": sha256_file(disassembly_path),
        "R1875-client-init-string-operands.json": sha256_file(REPORTS / "R1875-client-init-string-operands.json"),
        "R1883-client-initialized-dispatch-map.json": sha256_file(REPORTS / "R1883-client-initialized-dispatch-map.json"),
        "R1885-client-initialized-dispatch-path-correction.json": sha256_file(REPORTS / "R1885-client-initialized-dispatch-path-correction.json"),
        "R1902-client-init-state8-state5-control-flow.json": sha256_file(REPORTS / "R1902-client-init-state8-state5-control-flow.json"),
    }
    source = ROOT / "polinex-src/src/main/java/me/octo/client/Polinex.java"
    report = {
        "slice_id": "R1903-client-init-state8-guard-key",
        "source_baseline_commit": git("rev-parse", "HEAD"),
        "worktree": str(ROOT).replace("\\", "/"),
        "branch": git("branch", "--show-current"),
        "source_files_sha256": {"polinex-src/src/main/java/me/octo/client/Polinex.java": sha256_file(source)},
        "probe_status": "static-only; no client, game, keyboard, mouse, or server interaction",
        "started_utc": started,
        "command": f"python -B .analysis/tools/verify_r1903_state8_guard_key.py --keystream {args.keystream}",
        "inputs": inputs,
        "guard": {
            "global_offset": "0x8edb",
            "derived_keystream_u32_little_endian": f"0x{observed:08x}",
            "comparison_immediate": f"0x{comparison:08x}",
            "comparison_result": "not equal",
            "branch": "jne 0x180044b83",
            "decoded_next_state": 5,
            "effective_target": "0x180044adc",
            "state5_behavior": "R1902 maps RuntimeException construction with message 'Cannot initialize client on render thread.'",
        },
        "cross_check": {
            "R1875_string_xor_uses_same_keystream": True,
            "R1875_decoded_message": string_operand["decoded"],
            "dispatcher_map_state5_target": "0x180044adc",
            "dispatch_correction_state5_target": "0x180044adc",
        },
        "assertions": {
            "keystream_hash_matches_R1875_and_R1883_inputs": True,
            "guard_load_and_comparison_match_disassembly": True,
            "derived_value_does_not_equal_guard_immediate": True,
            "mismatch_branch_decodes_to_state5": True,
            "state5_routes_to_runtimeexception_block": True,
        },
        "acceptance": {
            "static_reconstruction": "passed for derived-key comparison and state-5 route",
            "build_regression": "not run; analysis-only slice",
            "direct_runtime_probe": "not run",
            "normal_user_path": "not run",
            "vanilla_comparison": "not run",
            "real_server": "not run",
        },
        "limits": "The recovered derived keystream and matching string-XOR use support the field-to-stream mapping. This static check does not observe the live native global buffer or its runtime initialization; the branch is therefore a static expectation, not runtime proof.",
    }
    report["tool_sha256"] = sha256_file(Path(__file__))
    report["ended_utc"] = datetime.now(timezone.utc).isoformat()
    report["exit_code"] = 0
    OUTPUT.write_text(json.dumps(report, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    print(json.dumps({"output": str(OUTPUT), "guard": report["guard"], "exit_code": 0}, ensure_ascii=False))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
