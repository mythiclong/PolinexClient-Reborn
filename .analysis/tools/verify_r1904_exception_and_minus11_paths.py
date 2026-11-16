#!/usr/bin/env python3
"""Recheck E_CLIENT_INITIALIZED exception forwarding and state -11 from raw evidence."""
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
OUTPUT = REPORTS / "R1904-client-init-exception-and-minus11-paths.json"
NESTED = "me.octo.client.Polinex$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"


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


def instruction_map(text: str) -> dict[int, str]:
    result: dict[int, str] = {}
    for line in text.splitlines():
        match = re.match(r"\s*([0-9a-fA-F]+):", line)
        if match:
            result[int(match.group(1), 16)] = line.lower()
    return result


def require_instruction(items: dict[int, str], address: int, fragment: str) -> None:
    line = items.get(address)
    normalized_line = " ".join(line.split()) if line is not None else None
    normalized_fragment = " ".join(fragment.lower().split())
    if normalized_line is None or normalized_fragment not in normalized_line:
        raise AssertionError(
            f"instruction mismatch at 0x{address:x}: expected {fragment!r}, got {line!r}"
        )


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--pe", required=True, type=Path)
    parser.add_argument("--keystream", required=True, type=Path)
    parser.add_argument("--jar", required=True, type=Path)
    parser.add_argument("--javap", required=True, type=Path)
    parser.add_argument("--objdump", required=True, type=Path)
    args = parser.parse_args()
    started = datetime.now(timezone.utc).isoformat()

    dump_path = REPORTS / "R1872-polininex-client-initialized.objdump.txt"
    dump = dump_path.read_text(encoding="utf-8", errors="replace")
    ins = instruction_map(dump)
    anchors = [
        # State 21 invokes the identity helper and separates pending-exception and return paths.
        (0x180043EF4, "callq  *%rdi"),
        (0x180043EFF, "callq  *0x720(%rax)"),
        (0x180043F07, "je     0x180044beb"),
        (0x180044BEE, "test   %rbx,%rbx"),
        (0x180044BF1, "je     0x180044ddb"),
        (0x180044BFD, "callq  *0x68(%rax)"),
        (0x180044C00, "jmpq   0x180044df6"),
        (0x180044DDB, "mov    0x70(%rax),%rdi"),
        (0x180044DE2, "callq  0x18001f4f2"),
        (0x180044DED, "lea    0xf5a39(%rip),%r8"),
        (0x180044DF4, "callq  *%rdi"),
        (0x180044DF6, "mov    (%rsi),%rax"),
        (0x180044DFC, "callq  *0x78(%rax)"),
        (0x180044E1D, "callq  *%rdi"),
        (0x180044E21, "je     0x18004610e"),
        (0x180044E2D, "callq  *0x88(%rax)"),
        (0x180044E47, "jmpq   0x180043cea"),
        # State -9/-10 common relay: nonnull is rethrown; null uses ThrowNew.
        (0x1800460CB, "callq  *%rbx"),
        (0x1800460D6, "callq  *0x720(%rax)"),
        (0x1800460DE, "jne    0x18004610e"),
        (0x1800460E3, "test   %rdi,%rdi"),
        (0x1800460E6, "je     0x1800460f3"),
        (0x1800460EE, "callq  *0x68(%rax)"),
        (0x1800460F3, "mov    0x70(%rax),%rdi"),
        (0x1800460FA, "callq  0x18001f4f2"),
        (0x1800460FF, "lea    0xf4727(%rip),%r8"),
        (0x18004610C, "callq  *%rdi"),
        # State -11 creates an int array and invokes the original nested setter.
        (0x180044A63, "mov    $0x1,%edx"),
        (0x180044A68, "callq  *0x598(%rax)"),
        (0x180044A77, "callq  *0x720(%rax)"),
        (0x180044A82, "je     0x180044c05"),
        (0x180044C0F, "callq  0x180046124"),
        (0x180044C30, "callq  *%rdi"),
        (0x180044C38, "callq  *0x720(%rax)"),
        (0x180044C40, "je     0x180044c98"),
        (0x180044C48, "callq  *0x78(%rax)"),
        (0x180044C69, "callq  *%rdi"),
        (0x180044C79, "callq  *0x88(%rax)"),
        (0x180044C9F, "cmpl   $0xf7ee810a,0x8fb1(%rax)"),
        (0x180044CA9, "jne    0x180044cbd"),
        (0x180044CBD, "mov    0x8fb5(%rax),%eax"),
        (0x180044CCA, "jmpq   0x180043cea"),
    ]
    for address, fragment in anchors:
        require_instruction(ins, address, fragment)

    pe = args.pe.read_bytes()
    stream = args.keystream.read_bytes()
    pe_sha = sha256_bytes(pe)
    stream_sha = sha256_bytes(stream)
    assert pe_sha == "0319C4F2C967E3C9C4BCC13863947B07797FD4DC1B3DD046D6EEEAFEF09DB42B"
    assert stream_sha == "5FF9BCD0EFF99D8037E4FEE224E6CE8A47016816E0AE8192047B39B03CFF6334"

    # Decode the exact class name used by 0x18001f4f2, which the older route note did not cover.
    helper_start = 0x18001F4F2
    helper_end = 0x18001F594
    objdump_command = [
        str(args.objdump), "-d", f"--start-address=0x{helper_start:x}",
        f"--stop-address=0x{helper_end:x}", str(args.pe),
    ]
    objdump_result = subprocess.run(objdump_command, text=True, capture_output=True)
    if objdump_result.returncode != 0:
        raise RuntimeError(f"objdump exited {objdump_result.returncode}: {objdump_result.stderr}")
    helper_ins = instruction_map(objdump_result.stdout)
    for address, fragment in [
        (0x18001F51F, "movups 0x13d3ba(%rip),%xmm0"),
        (0x18001F52A, "movups 0x13d3a0(%rip),%xmm0"),
        (0x18001F53E, "mov 0x31af3(%rcx,%rdx,1),%r8b"),
        (0x18001F546, "xor %r8b,-0x20(%rbp,%rdx,1)"),
        (0x18001F554, "lea -0x20(%rbp),%rdx"),
        (0x18001F55B, "callq *%rax"),
        (0x18001F566, "callq *0xa8(%r8)"),
    ]:
        require_instruction(helper_ins, address, fragment)
    class_data_va = 0x18015C8D1
    class_data_offset = class_data_va - 0x180000000 - 0x1600
    class_cipher = pe[class_data_offset:class_data_offset + 30]
    class_key = stream[0x31AF3:0x31AF3 + 30]
    class_name = bytes(a ^ b for a, b in zip(class_cipher, class_key)).decode("ascii")
    assert class_name == "java/lang/NullPointerException"

    # Recover the exact original bytecode of b([I)V and c()[I from the source JAR.
    javap_command = [str(args.javap), "-classpath", str(args.jar), "-p", "-c", "-s", NESTED]
    javap_result = subprocess.run(javap_command, text=True, capture_output=True)
    if javap_result.returncode != 0:
        raise RuntimeError(f"javap exited {javap_result.returncode}: {javap_result.stderr}")
    javap_lines = javap_result.stdout.splitlines()
    setter_start = javap_lines.index("  public static void b(int[]);")
    getter_start = javap_lines.index("  public static int[] c();", setter_start + 1)
    setter_block = javap_lines[setter_start:getter_start]
    getter_block = javap_lines[getter_start:]
    setter_text = "\n".join(setter_block)
    getter_text = "\n".join(getter_block[:5])
    field_match = re.search(r"putstatic\s+#\d+\s+// Field ([^:]+):\[I", setter_text)
    assert field_match is not None
    field_name = field_match.group(1)
    assert re.search(r"^\s*0:\s+aload_0\s*$", setter_text, re.MULTILINE)
    assert "putstatic" in setter_text and re.search(r"^\s*4:\s+return\s*$", setter_text, re.MULTILINE)
    assert field_name in getter_text and "descriptor: ()[I" in getter_text and "areturn" in getter_text

    source_path = ROOT / "polinex-src/src/main/java/me/octo/client/Polinex.java"
    source = source_path.read_text(encoding="utf-8")
    assert re.search(
        r"public static void b\(int\[\]\s+\w+\)\s*\{\s*" + re.escape(field_name)
        + r"\s*=\s*\w+;\s*\}", source, re.DOTALL
    )
    assert re.search(
        r"public static int\[\] c\(\)\s*\{\s*return\s+" + re.escape(field_name) + r";\s*\}",
        source,
        re.DOTALL,
    )

    method_map = read_json("R1880-client-initialized-method-id-use-map.json")
    setter_use = next(
        use for use in method_map["uses"]
        if use.get("jni_invocation", {}).get("call_site") == "0x180044c30"
    )
    assert setter_use["method_name"] == "b" and setter_use["descriptor"] == "([I)V"
    assert setter_use["nearby_class_helper"]["class_name"].replace("/", ".") == NESTED

    jni = read_json("R1881-client-initialized-all-jni-calls.json")
    jni_by_site = {item["call_site"]: item["jni_function"] for item in jni["calls"]}
    expected_jni = {
        "0x180043ef4": "CallStaticObjectMethod",
        "0x180043eff": "ExceptionCheck",
        "0x180043f13": "ExceptionOccurred",
        "0x180043f34": "IsInstanceOf",
        "0x180043f44": "ExceptionClear",
        "0x180044bfd": "Throw",
        "0x180044df4": "ThrowNew",
        "0x180044dfc": "ExceptionOccurred",
        "0x180044e1d": "IsInstanceOf",
        "0x180044e2d": "ExceptionClear",
        "0x1800460cb": "CallStaticObjectMethod",
        "0x1800460d6": "ExceptionCheck",
        "0x1800460ee": "Throw",
        "0x18004610c": "ThrowNew",
        "0x180044a68": "NewIntArray",
        "0x180044a77": "ExceptionCheck",
        "0x180044a8b": "ExceptionOccurred",
        "0x180044c30": "CallStaticVoidMethod",
        "0x180044c38": "ExceptionCheck",
        "0x180044c48": "ExceptionOccurred",
        "0x180044c69": "IsInstanceOf",
        "0x180044c79": "ExceptionClear",
    }
    assert {site: jni_by_site.get(site) for site in expected_jni} == expected_jni

    r1883 = read_json("R1883-client-initialized-dispatch-map.json")
    r1885 = read_json("R1885-client-initialized-dispatch-path-correction.json")
    assert any(
        item["transition_site"] == "0x180044e47"
        and item["decoded_state_signed"] == -9
        and item["next_target"] == "0x1800460a2"
        for item in r1883["transitions"]
    )
    assert any(
        item["decoded_state_signed"] == 4
        and item["effective_route"]["target"] == "0x18004610e"
        for item in r1885["transitions"]
    )
    assert any(
        item["decoded_state_signed"] == -10
        and item["effective_route"]["target"] == "0x1800460a2"
        for item in r1885["transitions"]
    )

    # State -11's successful setter path has its own guard. Decode its value from the same keystream.
    minus11_guard = int.from_bytes(stream[0x8FB1:0x8FB5], "little")
    minus11_guard_expected = 0xF7EE810A
    minus11_next = int.from_bytes(stream[0x8FB5:0x8FB9], "little") ^ 0x336DC796
    assert minus11_guard == 0x90584005 and minus11_guard != minus11_guard_expected
    assert minus11_next == 4

    identity = read_json("R1874-polinex-exception-identity-helper.json")
    assert identity["method"]["native_va"] == "0x180049c76"
    assert "returns the same Exception reference" in identity["static_reconstruction"]["semantics"]
    prior_r1893 = read_json("R1893-client-initialized-state17-state21-control-flow.json")
    prior_r1902 = read_json("R1902-client-init-state8-state5-control-flow.json")
    pe_msg_va = 0x18013A82D
    pe_msg_offset = pe_msg_va - 0x180000000 - 0x1600
    static_message_prefix = pe[pe_msg_offset:pe_msg_offset + 32].split(b"\0", 1)[0].decode("ascii", errors="replace")

    report_inputs = {
        "R1872-polininex-client-initialized.objdump.txt": sha256_file(dump_path),
        "R1874-polinex-exception-identity-helper.json": sha256_file(REPORTS / "R1874-polinex-exception-identity-helper.json"),
        "R1880-client-initialized-method-id-use-map.json": sha256_file(REPORTS / "R1880-client-initialized-method-id-use-map.json"),
        "R1881-client-initialized-all-jni-calls.json": sha256_file(REPORTS / "R1881-client-initialized-all-jni-calls.json"),
        "R1883-client-initialized-dispatch-map.json": sha256_file(REPORTS / "R1883-client-initialized-dispatch-map.json"),
        "R1885-client-initialized-dispatch-path-correction.json": sha256_file(REPORTS / "R1885-client-initialized-dispatch-path-correction.json"),
        "R1893-client-initialized-state17-state21-control-flow.json": sha256_file(REPORTS / "R1893-client-initialized-state17-state21-control-flow.json"),
        "R1902-client-init-state8-state5-control-flow.json": sha256_file(REPORTS / "R1902-client-init-state8-state5-control-flow.json"),
        "native_pe_sha256": pe_sha,
        "keystream_sha256": stream_sha,
        "jar_sha256": sha256_file(args.jar),
        "source_sha256": sha256_file(source_path),
        "javap_output_sha256": sha256_bytes(javap_result.stdout.encode("utf-8")),
        "helper_objdump_output_sha256": sha256_bytes(objdump_result.stdout.encode("utf-8")),
    }
    report = {
        "slice_id": "R1904-client-init-exception-and-minus11-paths",
        "source_baseline_commit": git("rev-parse", "HEAD"),
        "worktree": str(ROOT).replace("\\", "/"),
        "branch": git("branch", "--show-current"),
        "source_files_sha256": {"polinex-src/src/main/java/me/octo/client/Polinex.java": sha256_file(source_path)},
        "tool_sha256": sha256_file(Path(__file__)),
        "probe_status": "static-only; no client, game, keyboard, mouse, or server interaction",
        "started_utc": started,
        "commands": {
            "verifier": "python -B .analysis/tools/verify_r1904_exception_and_minus11_paths.py --pe <static-pe> --keystream <derived-keystream> --jar <cracked.jar> --javap <jdk-25-javap> --objdump <objdump>",
            "objdump": objdump_command,
            "objdump_exit_code": objdump_result.returncode,
            "javap": javap_command,
            "javap_exit_code": javap_result.returncode,
        },
        "inputs_sha256": report_inputs,
        "supersedes": [
            "R1893 state-21 normal_result claim that a null helper return dispatches state 8",
            "R1902 equal-guard repeat/loop inference; state 5 findings remain independently corroborated",
        ],
        "state21": {
            "entry": "0x180043ecb",
            "helper": "Polinex.a(Exception):Exception; R1874 proves identity native semantics",
            "no_pending_exception_and_nonnull_return": "Throw at 0x180044bfd, then common ExceptionOccurred/IsInstanceOf; RuntimeException is cleared and routes state -9; other pending exception returns",
            "no_pending_exception_and_null_return": {
                "route": "ThrowNew at 0x180044df4, then common ExceptionOccurred/IsInstanceOf; RuntimeException is cleared and routes state -9",
                "throwable_class": class_name,
                "message_pointer": "0x18013a82d",
                "static_pe_c_string_prefix": static_message_prefix,
                "runtime_message": "not directly observed; static PE pointer begins with NUL",
            },
            "handler_leaves_exception_pending": "ExceptionOccurred/IsInstanceOf; RuntimeException is cleared and routes state -9; other exception remains pending to return",
            "state_minus9_target": "0x1800460a2",
            "state_minus9_minus10_relay": "same identity helper; pending exception returns, nonnull helper result is Throw, null result uses ThrowNew with the same class/message pointer",
            "raw_branch_proof": "0x180044f07 -> 0x180044beb; rbx==null branches to 0x180044ddb (ThrowNew), while nonnull is Throw then jumps to 0x180044df6; neither branch dispatches state 8",
        },
        "state_minus11": {
            "entry": "0x180044a5d",
            "new_array": "NewIntArray(1)",
            "setter": {
                "owner": NESTED,
                "method": "b([I)V",
                "field": field_name,
                "descriptor": "[I",
                "original_bytecode": [line.strip() for line in setter_block if re.match(r"\s*\d+:", line)],
                "current_source_matches": True,
                "getter": "c()[I returns the same static field",
            },
            "successful_setter_guard": {
                "global_offset": "0x8fb1",
                "derived_keystream_u32": f"0x{minus11_guard:08x}",
                "compare_immediate": f"0x{minus11_guard_expected:08x}",
                "comparison": "not equal",
                "route": "encoded state 4 -> epilogue 0x18004610e",
            },
            "setter_exception": "RuntimeException is cleared and routes state -10; a non-RuntimeException remains pending to return",
            "limits": "The normal reachability of state -11 remains unproven; R1901 leaves reflection/native writers outside its classfile scan.",
        },
        "assertions": {
            "state21_null_return_uses_ThrowNew_not_state8": True,
            "ThrowNew_class_helper_decodes_to_NullPointerException": True,
            "state_minus9_and_minus10_share_exception_relay": True,
            "state_minus11_original_setter_and_source_match": True,
            "state_minus11_guard_decodes_to_state4_return": True,
        },
        "acceptance": {
            "static_reconstruction": "passed for state-21 null/non-null branches and state -11 setter/guard path",
            "build_regression": "not run; analysis-only slice",
            "direct_runtime_probe": "not run",
            "normal_user_path": "not run; E_CLIENT_INITIALIZED remains native",
            "vanilla_comparison": "not run",
            "real_server": "not run",
        },
        "limits": "ThrowNew's message pointer is not decoded beyond the static PE's leading NUL; runtime mutation of that region is unobserved. State -11 runtime reachability and global initialization are unprobed.",
    }
    report["ended_utc"] = datetime.now(timezone.utc).isoformat()
    report["exit_code"] = 0
    OUTPUT.write_text(json.dumps(report, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    print(json.dumps({
        "output": str(OUTPUT),
        "assertions": report["assertions"],
        "state21_null_route": report["state21"]["no_pending_exception_and_null_return"]["route"],
        "state_minus11_route": report["state_minus11"]["successful_setter_guard"],
        "exit_code": 0,
    }, ensure_ascii=False))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
