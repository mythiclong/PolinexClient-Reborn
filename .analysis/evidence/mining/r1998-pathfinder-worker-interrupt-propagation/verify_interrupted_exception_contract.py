#!/usr/bin/env python3
"""Verify Pathfinder worker interruption propagation against an available original archive."""
from __future__ import annotations
import argparse
import hashlib
import json
import re
import subprocess
import zipfile
from pathlib import Path

OWNER = "me.octo.client.utils.player.pathfinder.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
WORKER_DESC = "(Lme/octo/client/events/impl/IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl;)V"
RETHROW_DESC = "(Ljava/lang/InterruptedException;)Ljava/lang/RuntimeException;"
ENTRY = OWNER.replace(".", "/") + ".class"


def sha256(data: bytes) -> str:
    return hashlib.sha256(data).hexdigest()


def disassemble(javap: str, classpath: str) -> str:
    result = subprocess.run(
        [javap, "-p", "-s", "-c", "-classpath", classpath, OWNER],
        text=True, encoding="utf-8", errors="replace", capture_output=True,
        check=False,
    )
    if result.returncode:
        raise RuntimeError(f"javap exited {result.returncode}: {result.stderr[-2000:]}")
    return result.stdout


def method_block(dump: str, descriptor: str, name_fragment: str) -> str:
    lines = dump.splitlines()
    headers = [i for i, line in enumerate(lines) if line.startswith("  ") and name_fragment in line and "(" in line]
    for start in headers:
        desc_line = next((lines[j].strip() for j in range(start + 1, min(start + 5, len(lines))) if "descriptor:" in lines[j]), "")
        if desc_line == "descriptor: " + descriptor:
            end = next((j for j in range(start + 1, len(lines)) if re.match(r"^  (?:public|private|protected|static) ", lines[j])), len(lines))
            return "\n".join(lines[start:end])
    raise AssertionError(f"method not found: {name_fragment} {descriptor}")


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("original_archive", type=Path)
    parser.add_argument("compiled_classes", type=Path)
    parser.add_argument("source_file", type=Path)
    parser.add_argument("--javap", default="javap")
    args = parser.parse_args()

    original_hash = hashlib.sha256(args.original_archive.read_bytes()).hexdigest()
    with zipfile.ZipFile(args.original_archive) as archive:
        original_class_hash = sha256(archive.read(ENTRY))
    class_file = args.compiled_classes / (OWNER.replace(".", "/") + ".class")
    current_class_hash = sha256(class_file.read_bytes())
    source = args.source_file.read_text(encoding="utf-8")
    original_dump = disassemble(args.javap, str(args.original_archive))
    current_dump = disassemble(args.javap, str(args.compiled_classes))
    original_worker = method_block(original_dump, WORKER_DESC, " b(")
    current_worker = method_block(current_dump, WORKER_DESC, " b(")
    helper = method_block(current_dump, RETHROW_DESC, "rethrowInterruptedException(")

    assert "Method java/lang/Thread.sleep:(J)V" in original_worker
    assert "Exception table:" not in original_worker
    assert "RuntimeException" not in original_worker
    assert "Method java/lang/Thread.sleep:(J)V" in current_worker
    assert "Class java/lang/InterruptedException" in current_worker
    assert "Method rethrowInterruptedException:(Ljava/lang/InterruptedException;)Ljava/lang/RuntimeException;" in current_worker
    assert re.search(r"invokestatic[^\n]*rethrowInterruptedException[^\n]*\n\s*\d+: athrow", current_worker)
    helper_code = helper.split("Code:", 1)[1]
    assert re.search(r"0: aload_0\s+1: athrow", helper_code)
    assert "new           #" not in helper_code and "RuntimeException.<init>" not in helper_code
    assert "throw rethrowInterruptedException(exception);" in source
    assert "throw new RuntimeException(exception);" not in source

    print(json.dumps({
        "status": "PASS",
        "owner": OWNER,
        "worker_descriptor": WORKER_DESC,
        "original": {
            "archive_sha256": original_hash,
            "class_sha256": original_class_hash,
            "sleep_call": "Thread.sleep(J)V",
            "interrupted_exception_handler": False,
            "runtime_exception_wrapper": False,
            "semantics": "InterruptedException escapes directly from the worker."
        },
        "compiled": {
            "class_sha256": current_class_hash,
            "source_sha256": sha256(args.source_file.read_bytes()),
            "handler": "InterruptedException is caught only to satisfy Java checked-exception rules, then the same object is rethrown.",
            "relay_descriptor": RETHROW_DESC,
            "relay_bytecode": ["aload_0", "athrow"],
            "runtime_exception_wrapper": False
        },
        "scope": "Static original/current bytecode contract and source check; no client, world, or server runtime."
    }, indent=2))

if __name__ == "__main__":
    main()
