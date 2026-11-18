#!/usr/bin/env python3
"""Enumerate real invokestatic callers of the Pathfinder cache gate setter."""

from __future__ import annotations

import argparse
import hashlib
import json
import sys
import struct
from datetime import datetime, timezone
from pathlib import Path
from zipfile import ZipFile


GATE_OWNER = (
    "me/octo/client/utils/player/pathfinder/"
    "IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$"
    "llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
)
SETTER_NAME = "b"
SETTER_DESCRIPTOR = "(I)V"


def sha256(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as stream:
        for chunk in iter(lambda: stream.read(1024 * 1024), b""):
            digest.update(chunk)
    return digest.hexdigest()


def load_class_tools():
    repo_root = Path(__file__).resolve().parents[4]
    sys.path.insert(0, str(repo_root / ".analysis" / "tools"))
    from verify_r1901_array_field_writes import instructions, read_class

    return read_class, instructions


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--jar", required=True, type=Path)
    parser.add_argument("--output", required=True, type=Path)
    args = parser.parse_args()
    read_class, instructions = load_class_tools()

    calls: list[dict[str, object]] = []
    failures: list[dict[str, str]] = []
    class_count = 0
    with ZipFile(args.jar) as archive:
        for entry in archive.namelist():
            if not entry.endswith(".class"):
                continue
            class_count += 1
            try:
                owner, _cp, refs, methods, _handles = read_class(archive.read(entry))
                targets = {
                    index
                    for index, ref in refs.items()
                    if ref[:3] == (GATE_OWNER, SETTER_NAME, SETTER_DESCRIPTOR)
                }
                for method_name, descriptor, code in methods:
                    for offset, opcode, raw in instructions(code):
                        if opcode != 0xB8:
                            continue
                        constant_index = struct.unpack_from(">H", raw, 1)[0]
                        if constant_index in targets:
                            calls.append(
                                {
                                    "caller_owner": owner,
                                    "caller_method": method_name,
                                    "caller_descriptor": descriptor,
                                    "bytecode_offset": offset,
                                    "target_owner": GATE_OWNER,
                                    "target_method": SETTER_NAME,
                                    "target_descriptor": SETTER_DESCRIPTOR,
                                }
                            )
            except Exception as error:  # Preserve coverage gaps rather than hiding them.
                failures.append({"entry": entry, "error": f"{type(error).__name__}: {error}"})

    result = {
        "experiment_id": "R1949",
        "generated_utc": datetime.now(timezone.utc).isoformat(),
        "jar_path": str(args.jar.resolve()),
        "jar_sha256": sha256(args.jar),
        "scanner_path": str(Path(__file__).resolve()),
        "scanner_sha256": sha256(Path(__file__).resolve()),
        "method": {
            "owner": GATE_OWNER,
            "name": SETTER_NAME,
            "descriptor": SETTER_DESCRIPTOR,
        },
        "class_files_scanned": class_count,
        "parse_failures": failures,
        "invokestatic_call_count": len(calls),
        "invokestatic_calls": calls,
        "probe_state": "static class-file instruction scan; no runtime/cache/world/client/server probe",
    }
    args.output.parent.mkdir(parents=True, exist_ok=True)
    args.output.write_text(json.dumps(result, indent=2, ensure_ascii=False) + "\n", encoding="utf-8")
    print(json.dumps({k: result[k] for k in (
        "jar_sha256", "class_files_scanned", "parse_failures", "invokestatic_call_count", "invokestatic_calls"
    )}, indent=2, ensure_ascii=False))
    return 0 if not failures else 2


if __name__ == "__main__":
    raise SystemExit(main())
