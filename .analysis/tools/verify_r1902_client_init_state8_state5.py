#!/usr/bin/env python3
"""Verify the state-8/state-5 branch and RuntimeException path in E_CLIENT_INITIALIZED."""
from __future__ import annotations

import hashlib
import json
import re
import subprocess
from datetime import datetime, timezone
from pathlib import Path


ROOT = Path(__file__).resolve().parents[2]
REPORTS = ROOT / ".analysis" / "reports"
OUTPUT = REPORTS / "R1902-client-init-state8-state5-control-flow.json"
INPUT_NAMES = [
    "R1872-polininex-client-initialized.objdump.txt",
    "R1874-polinex-exception-identity-helper.json",
    "R1875-client-init-string-operands.json",
    "R1880-client-initialized-method-id-use-map.json",
    "R1881-client-initialized-all-jni-calls.json",
    "R1883-client-initialized-dispatch-map.json",
    "R1885-client-initialized-dispatch-path-correction.json",
    "R1893-client-initialized-state17-state21-control-flow.json",
]
SOURCE = ROOT / "polinex-src/src/main/java/me/octo/client/Polinex.java"


def sha256(path: Path) -> str:
    return hashlib.sha256(path.read_bytes()).hexdigest()


def read_json(name: str) -> dict:
    return json.loads((REPORTS / name).read_text(encoding="utf-8"))


def instruction_map(text: str) -> dict[int, str]:
    result: dict[int, str] = {}
    for line in text.splitlines():
        match = re.match(r"\s*([0-9a-fA-F]+):", line)
        if match:
            result[int(match.group(1), 16)] = line.lower()
    return result


def require_instruction(instructions: dict[int, str], address: int, fragment: str) -> None:
    line = instructions.get(address)
    if line is None or fragment.lower() not in line:
        raise AssertionError(
            f"instruction mismatch at 0x{address:x}: expected {fragment!r}, got {line!r}"
        )


def git(*args: str) -> str:
    return subprocess.check_output(
        ["git", *args], cwd=ROOT, text=True, stderr=subprocess.STDOUT
    ).strip()


def main() -> int:
    started = datetime.now(timezone.utc).isoformat()
    inputs = {name: sha256(REPORTS / name) for name in INPUT_NAMES}
    dump = (REPORTS / INPUT_NAMES[0]).read_text(encoding="utf-8", errors="replace")
    ins = instruction_map(dump)

    # State 8 compares the guard value and selects the corrected inline/table route.
    anchors = [
        (0x180043EA9, "cmpl   $0x6cce96cb,0x8edb(%rax)"),
        (0x180043EB3, "jne    0x180044b83"),
        (0x180043EB9, "mov    0x8ee3(%rax),%eax"),
        (0x180043EBF, "mov    $0xab22f2d8,%ecx"),
        (0x180043EC6, "jmpq   0x180043cea"),
        (0x180043CE4, "xor    %r12d,%r12d"),
        (0x180043E32, "mov    %eax,%ebx"),
        (0x180043E3A, "callq  *0x720(%rax)"),
        (0x180043E42, "je     0x180044bb7"),
        (0x180043EF1, "mov    %r12,%r9"),
        (0x180044B83, "mov    0x8edf(%rax),%eax"),
        (0x180044B89, "mov    $0x26080e54,%ecx"),
        (0x180044B90, "jmpq   0x180043cea"),
        # State 5: allocate RuntimeException and inspect JNI exception state.
        (0x180044ADF, "mov    0xd8(%rax),%rdi"),
        (0x180044AE9, "callq  0x180046281"),
        (0x180044AF7, "callq  *%rdi"),
        (0x180044B02, "callq  *0x720(%rax)"),
        (0x180044B0D, "je     0x180044ccf"),
        (0x180044B16, "callq  *0x78(%rdx)"),
        (0x180044B28, "callq  *0x100(%rax)"),
        (0x180044B30, "je     0x18004610e"),
        (0x180044B3C, "callq  *0x88(%rax)"),
        (0x180044B56, "jmpq   0x180043cea"),
        (0x180044BB7, "movzbl %bl,%ecx"),
        (0x180044BBA, "movabs $0xffffffff00000000,%rax"),
        (0x180044BC4, "and    %rax,%r12"),
        (0x180044BC7, "or     %rcx,%r12"),
        (0x180044BD1, "test   %cl,%cl"),
        (0x180044BD3, "je     0x180044dc9"),
        (0x180044DC9, "mov    0x8ed7(%rax),%eax"),
        (0x180044DD6, "jmpq   0x180043cea"),
        # The decoded message is constructed as a Java String and passed to <init>.
        (0x180044CCF, "mov    0x518(%rdx),%rdi"),
        (0x180044CDC, "lea    -0x58(%rbp),%rcx"),
        (0x180044CE0, "lea    0xf9f7e(%rip),%rdx"),
        (0x180044D09, "mov    %rsi,%rcx"),
        (0x180044D0C, "lea    -0x58(%rbp),%rdx"),
        (0x180044D10, "mov    $0x2a,%r8d"),
        (0x180044D16, "callq  *%rdi"),
        (0x180044E71, "callq  *%rdi"),
        (0x180044E79, "callq  *0x720(%rax)"),
        (0x180044E89, "callq  *0x78(%r8)"),
        (0x180044E9C, "callq  *0x100(%rax)"),
        (0x180044EB0, "callq  *0x88(%rax)"),
        (0x180044ED2, "callq  *0x68(%r8)"),
        (0x180044EDC, "callq  *0x78(%rax)"),
        (0x180044EEE, "callq  *0x100(%rax)"),
        (0x180044F02, "callq  *0x88(%rax)"),
    ]
    for address, fragment in anchors:
        require_instruction(ins, address, fragment)

    dispatch = read_json("R1883-client-initialized-dispatch-map.json")
    corrected = read_json("R1885-client-initialized-dispatch-path-correction.json")
    routes = dispatch["transitions"]
    state21_routes = [
        item["effective_route"]["target"]
        for item in corrected["transitions"]
        if item["decoded_state_signed"] == 21
    ]
    state5_routes = [
        item["next_target"] for item in routes if item["decoded_state_signed"] == 5
    ]
    state_minus9_routes = [
        item["next_target"] for item in routes if item["decoded_state_signed"] == -9
    ]
    state8_routes = [
        item["next_target"] for item in routes if item["decoded_state_signed"] == 8
    ]
    assert "0x180044adc" in state5_routes
    assert "0x180043ecb" in state21_routes
    assert "0x1800460a2" in state_minus9_routes
    assert "0x180043ea2" in state8_routes

    string_record = read_json("R1875-client-init-string-operands.json")
    string_operand = next(
        item for item in string_record["decoded"]["operands"]
        if item["call_va"] == "0x180044ce7"
    )
    assert string_operand["decoded"] == "Cannot initialize client on render thread."
    assert string_operand["encoding"] == "utf-16le"
    assert string_operand["copy_length"] == 85
    assert string_operand["xor_length"] == 84
    assert string_operand["stack_buffer_displacement"] == -88

    jni = read_json("R1881-client-initialized-all-jni-calls.json")
    jni_by_site = {item["call_site"]: item["jni_function"] for item in jni["calls"]}
    expected_jni = {
        "0x180044af7": "AllocObject",
        "0x180044b02": "ExceptionCheck",
        "0x180044b16": "ExceptionOccurred",
        "0x180044b28": "IsInstanceOf",
        "0x180044b3c": "ExceptionClear",
        "0x180044d16": "NewString",
        "0x180044e71": "CallNonvirtualVoidMethod",
        "0x180044e79": "ExceptionCheck",
        "0x180044e89": "ExceptionOccurred",
        "0x180044e9c": "IsInstanceOf",
        "0x180044eb0": "ExceptionClear",
        "0x180044ed2": "Throw",
        "0x180044edc": "ExceptionOccurred",
        "0x180044eee": "IsInstanceOf",
        "0x180044f02": "ExceptionClear",
    }
    assert {site: jni_by_site.get(site) for site in expected_jni} == expected_jni

    method_map = read_json("R1880-client-initialized-method-id-use-map.json")
    ctor = next(
        use for use in method_map["uses"]
        if use.get("jni_invocation", {}).get("call_site") == "0x180044e71"
    )
    assert ctor["method_name"] == "<init>"
    assert ctor["descriptor"] == "(Ljava/lang/String;)V"
    assert ctor["nearby_class_helper"]["class_name"] == "java/lang/RuntimeException"

    old_helper = read_json("R1874-polinex-exception-identity-helper.json")
    assert old_helper["method"]["native_va"] == "0x180049c76"
    assert old_helper["static_reconstruction"]["semantics"].startswith(
        "Windows x64 JNI static method parameter 1 is in R8; returns the same Exception reference"
    )
    state21 = read_json("R1893-client-initialized-state17-state21-control-flow.json")
    assert "null return dispatches state 8" in state21["key_observations"][1]["normal_result"]
    source_sha = sha256(SOURCE)
    assert source_sha.upper() == old_helper["source_files_sha256"]["after"]

    observations = [
        {
            "entry_state": 8,
            "normal_false_render_thread_predecessor": {
                "exception_check": "clear at 0x180043e42",
                "boolean_source": "RenderSystem.isOnRenderThread()Z result in EBX/BL",
                "r12_effect": "dispatcher initialized R12 to zero; the false BL value is merged into the low bits, preserving zero",
                "state8_entry": "0x180043ea2",
            },
            "comparison": "[global+0x8edb] == 0x6cce96cb",
            "equal_route": {
                "encoded_state": 21,
                "effective_target_after_dispatch_correction": "0x180043ecb",
                "handler": "Polinex.a(Exception):Exception",
                "handler_result_on_null_input": "null, then state 8 per R1893",
                "normal_false_thread_result_enters_with_null_r12": True,
                "repeat_condition": "possible if the guard remains equal; reachability/value and external writers are not established here",
            },
            "unequal_route": {
                "encoded_state": 5,
                "target": "0x180044adc",
            },
            "guard_value_origin": "unresolved; no writer/reachability claim in this slice",
        },
        {
            "entry_state": 5,
            "target": "0x180044adc",
            "class": "java/lang/RuntimeException",
            "normal_path": [
                "AllocObject(RuntimeException)",
                "NewString(decoded message, 42 UTF-16 code units)",
                "RuntimeException.<init>(String)",
                "Throw(allocated exception)",
                "ExceptionOccurred + IsInstanceOf(RuntimeException)",
                "ExceptionClear then encoded state -9",
            ],
            "decoded_message": string_operand["decoded"],
            "exceptional_path": "JNI exceptions are class-checked; non-RuntimeException remains pending to return, RuntimeException is cleared and routed through -9",
        },
        {
            "entry_state": -9,
            "target": "0x1800460a2",
            "helper": "Polinex.a(Exception):Exception",
            "helper_evidence": "R1874 proves the native implementation returns the same reference; R1893 links the event call",
        },
    ]

    report = {
        "slice_id": "R1902-client-init-state8-state5-control-flow",
        "source_baseline_commit": git("rev-parse", "HEAD"),
        "worktree": str(ROOT).replace("\\", "/"),
        "branch": git("branch", "--show-current"),
        "source_files_sha256": {"polinex-src/src/main/java/me/octo/client/Polinex.java": source_sha},
        "tool_sha256": sha256(Path(__file__)),
        "reference_artifacts": {
            "cracked_jar_sha256": old_helper["method"]["original_jar_sha256"],
            "native_pe_sha256": old_helper["method"]["native_pe_sha256"],
        },
        "probe_status": "static-only; no client, game, keyboard, mouse, or server interaction",
        "started_utc": started,
        "command": "python -B .analysis/tools/verify_r1902_client_init_state8_state5.py",
        "inputs_sha256": inputs,
        "assertions": {
            "state8_equal_and_unequal_routes": True,
            "false_thread_state8_null_payload": True,
            "state5_runtimeexception_class_and_jni_calls": True,
            "decoded_render_thread_message": True,
            "runtimeexception_constructor_descriptor": True,
            "exception_relay_identity_and_state_minus9_link": True,
        },
        "key_observations": observations,
        "acceptance": {
            "static_reconstruction": "passed for state 8 branch targets and state 5 construction/throw/exception-cleanup sequence",
            "build_regression": "not run; analysis-only slice",
            "direct_runtime_probe": "not run",
            "normal_user_path": "not run; E_CLIENT_INITIALIZED remains native",
            "vanilla_comparison": "not run",
            "real_server": "not run",
        },
        "limits": "The source and normal reachability of [global+0x8edb] remain unresolved. This record does not prove the guard's runtime value or that either state-8 branch is reachable in normal startup.",
    }
    OUTPUT.write_text(json.dumps(report, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    report["ended_utc"] = datetime.now(timezone.utc).isoformat()
    report["exit_code"] = 0
    OUTPUT.write_text(json.dumps(report, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    print(json.dumps({"output": str(OUTPUT), "assertions": report["assertions"], "exit_code": 0}, ensure_ascii=False))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
