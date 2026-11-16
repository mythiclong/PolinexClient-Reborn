#!/usr/bin/env python3
"""Validate static JNI/control-flow evidence for client-init states 17 and 21."""
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
    parser.add_argument("--output", type=Path, required=True)
    args = parser.parse_args()
    root = args.root.resolve()
    reports = root / ".analysis" / "reports"
    started = datetime.now(timezone.utc)
    evidence = {
        "event_disassembly": reports / "R1872-polininex-client-initialized.objdump.txt",
        "method_use_map": reports / "R1880-client-initialized-method-id-use-map.json",
        "jni_call_map": reports / "R1881-client-initialized-all-jni-calls.json",
        "inline_resolvers": reports / "R1879-client-initialized-inline-resolvers.json",
        "static_field_map": reports / "R1882-client-initialized-static-field-lookups.json",
        "dispatch_correction": reports / "R1885-client-initialized-dispatch-path-correction.json",
    }
    for path in evidence.values():
        if not path.is_file():
            raise FileNotFoundError(path)
    disassembly = evidence["event_disassembly"].read_text(encoding="utf-8")
    jni = json.loads(evidence["jni_call_map"].read_text(encoding="utf-8"))
    uses = json.loads(evidence["method_use_map"].read_text(encoding="utf-8"))
    resolvers = json.loads(evidence["inline_resolvers"].read_text(encoding="utf-8"))
    field_map = json.loads(evidence["static_field_map"].read_text(encoding="utf-8"))
    dispatch = json.loads(evidence["dispatch_correction"].read_text(encoding="utf-8"))
    lines = {
        "0x" + line.strip().split(":", 1)[0]: line.strip()
        for line in disassembly.splitlines()
        if ":" in line
    }
    call_map = {item["call_site"]: item["jni_function"] for item in jni["calls"]}

    render_lookup = any(
        item.get("method_name") == "isOnRenderThread"
        and item.get("descriptor") == "()Z"
        and item.get("jni_invocation", {}).get("call_site") == "0x180043e2f"
        and item.get("nearby_class_helper", {}).get("class_name")
        == "com/mojang/blaze3d/systems/RenderSystem"
        for item in uses["uses"]
    )
    runtime_class = any(
        item.get("helper") == "0x180046281"
        and item.get("decoded_class_name") == "java/lang/RuntimeException"
        for item in resolvers["inline_class_helpers"]
    )
    method_helper = resolvers["inline_GetStaticMethodID_helper"]
    wrapper_method = (
        method_helper.get("helper") == "0x180046323"
        and method_helper.get("name") == "a"
        and method_helper.get("descriptor") == "(Ljava/lang/Exception;)Ljava/lang/Exception;"
        and method_helper.get("resolved_class_name") == "me/octo/client/Polinex"
    )
    singleton_field = next(
        item for item in field_map["fields"]
        if item.get("get_static_object_field_call") == "0x180043f8e"
    )
    state7_aL_call = any(
        item.get("method_name") == "aL"
        and item.get("descriptor") == "()V"
        and item.get("nearby_class_helper", {}).get("class_name") == singleton_field.get("owner")
        and item.get("jni_invocation", {}).get("call_site") == "0x180043fc7"
        for item in uses["uses"]
    )
    singleton_field_matches = (
        singleton_field.get("field_id_cache_global") == "0x180170f00"
        and singleton_field.get("descriptor") == f"L{singleton_field.get('owner')};"
        and singleton_field.get("source_file_field_descriptor_match") is True
        and singleton_field.get("original_jar_field_descriptor_match") is True
    )
    required_calls = {
        "0x180043e2f": "CallStaticBooleanMethod",
        "0x180043e3a": "ExceptionCheck",
        "0x180043e4e": "ExceptionOccurred",
        "0x180043e72": "IsInstanceOf",
        "0x180043e82": "ExceptionClear",
        "0x180043ef4": "CallStaticObjectMethod",
        "0x180043eff": "ExceptionCheck",
        "0x180043f13": "ExceptionOccurred",
        "0x180043f34": "IsInstanceOf",
        "0x180043f44": "ExceptionClear",
        "0x180044bfd": "Throw",
        "0x180044dfc": "ExceptionOccurred",
        "0x180044e1d": "IsInstanceOf",
        "0x180044e2d": "ExceptionClear",
    }
    jni_mapping = all(call_map.get(site) == name for site, name in required_calls.items())
    branches = {
        "0x180043e42": "je     0x180044bb7",
        "0x180043e7c": "je     0x180044d7a",
        "0x180043f07": "je     0x180044beb",
        "0x180043f38": "je     0x18004610e",
        "0x180044bf1": "je     0x180044ddb",
        "0x180044e21": "je     0x18004610e",
    }
    branch_checks = all(target in lines.get(site, "") for site, target in branches.items())
    transitions = {item["transition_site"]: item for item in dispatch["transitions"]}
    route_checks = (
        transitions["0x180043e9d"]["decoded_state_signed"] == 21
        and transitions["0x180043e9d"]["effective_route"]["target"] == "0x180043ecb"
        and transitions["0x180043f5e"]["decoded_state_signed"] == -9
        and transitions["0x180043f5e"]["effective_route"]["target"] == "0x1800460a2"
        and transitions["0x180044daf"]["decoded_state_signed"] == -9
        and transitions["0x180044daf"]["effective_route"]["target"] == "0x1800460a2"
        and transitions["0x180044dd6"]["decoded_state_signed"] == 8
        and transitions["0x180044dd6"]["effective_route"]["target"] == "0x180043ea2"
        and transitions["0x180044e47"]["decoded_state_signed"] == -9
        and transitions["0x180044e47"]["effective_route"]["target"] == "0x1800460a2"
    )
    checks = {
        "render_thread_method_and_descriptor": render_lookup,
        "runtime_exception_class_resolution": runtime_class,
        "Polinex_a_Exception_method_resolution": wrapper_method,
        "state_7_singleton_field_matches_source_and_jar": singleton_field_matches,
        "state_7_calls_aL_on_singleton": state7_aL_call,
        "JNI_callsite_mapping": jni_mapping,
        "branch_targets": branch_checks,
        "state_21_state_8_and_state_minus_9_routes": route_checks,
    }
    if not all(checks.values()):
        raise AssertionError(checks)

    changed = subprocess.check_output(["git", "diff", "--name-only"], cwd=root, text=True).splitlines()
    source_paths = {"Polinex.java": root / "polinex-src/src/main/java/me/octo/client/Polinex.java"}
    for name in changed:
        path = root / name
        if path.is_file() and path.suffix == ".java":
            source_paths[path.name] = path
    head = subprocess.check_output(["git", "rev-parse", "HEAD"], cwd=root, text=True).strip()
    report = {
        "slice_id": "R1893-client-initialized-state17-state21-control-flow",
        "source_baseline_commit": head,
        "source_worktree_sha256": {name: sha256(path) for name, path in source_paths.items()},
        "probe_status": "static-only; no client, game, keyboard, mouse, or server interaction",
        "started_utc": started.isoformat(),
        "ended_utc": datetime.now(timezone.utc).isoformat(),
        "command": "python -B .analysis/tools/verify_r1893_client_initialized_states.py --root . --output .analysis/reports/R1893-client-initialized-state17-state21-control-flow.json",
        "exit_code": 0,
        "inputs_sha256": {str(path.relative_to(root)): sha256(path) for path in evidence.values()},
        "assertions": checks,
        "key_observations": [
            {
                "state": 17,
                "entry": "0x180043e04",
                "call": "RenderSystem.isOnRenderThread()Z via CallStaticBooleanMethod at 0x180043e2f",
                "normal_result": "With no pending JNI exception, true routes to state 7 at 0x180043f63; false routes to state 8 at 0x180043ea2",
                "exception_result": "The pending throwable is checked against java/lang/RuntimeException; a match is cleared and dispatches state 21 at 0x180043ecb",
                "other_exception_path": "The shared fallback repeats IsInstanceOf using the same cached class; false returns with the exception pending, true clears and dispatches state -9 at 0x1800460a2",
            },
            {
                "state": 21,
                "entry": "0x180043ecb",
                "call": "Polinex.a(Exception):Exception via CallStaticObjectMethod at 0x180043ef4, with the throwable from ExceptionOccurred as its argument",
                "normal_result": "After ExceptionCheck reports no pending exception, a null return dispatches state 8; a non-null return is passed to JNI Throw at 0x180044bfd",
                "throw_result": "The pending throwable is checked against RuntimeException; a match is cleared and dispatches state -9, while a non-match remains pending at return",
                "handler_exception": "If the static handler itself leaves an exception pending, RuntimeException is cleared and dispatches state -9; another exception remains pending at return",
            },
            {
                "state": 7,
                "entry": "0x180043f63",
                "static_receiver": (
                    f"GetStaticObjectField at 0x180043f8e reads "
                    f"{singleton_field['owner']}.{singleton_field['field_name']} "
                    f"with descriptor {singleton_field['descriptor']}; the field declaration "
                    "matches both managed source and the original JAR"
                ),
                "first_call": (
                    "CallVoidMethod invokes aL()V at 0x180043fc7 on the object returned "
                    "by that static field read"
                ),
                "scope": "This confirms only the first state-7 call; the rest of the branch remains open",
            },
        ],
        "acceptance": {
            "static_reconstruction": "passed for states 17 and 21 call targets, arguments, predicates, JNI exception operations, and dispatcher routes",
            "build_regression": "not run; this slice changed no Java source",
            "direct_runtime_probe": "not run",
            "normal_user_path": "not run",
            "vanilla_comparison": "not run",
            "real_server": "not run",
        },
        "limits": "States 7, 8, and -9 have confirmed destinations but their complete effects remain open. The native E_CLIENT_INITIALIZED method and remaining dispatcher paths are not restored.",
    }
    output = args.output if args.output.is_absolute() else root / args.output
    output.parent.mkdir(parents=True, exist_ok=True)
    output.write_text(json.dumps(report, indent=2) + "\n", encoding="utf-8")
    print(json.dumps({"output": str(output), "assertions": checks, "exit_code": 0}, indent=2))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())

