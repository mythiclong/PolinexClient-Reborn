#!/usr/bin/env python3
"""Audit all Java bytecode writes to the post-constructor array sentinel."""

from __future__ import annotations

import argparse
import hashlib
import json
import struct
from collections import Counter
from datetime import datetime, timezone
from pathlib import Path
from zipfile import ZipFile


OWNER = (
    "me/octo/client/utils/"
    "lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll"
)
FIELD = "IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII"
FIELD_DESC = f"[L{OWNER};"
SETTER = "b"
SETTER_DESC = f"([L{OWNER};)V"


def sha256(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as stream:
        for chunk in iter(lambda: stream.read(1024 * 1024), b""):
            digest.update(chunk)
    return digest.hexdigest()


def read_class(data: bytes):
    if data[:4] != b"\xca\xfe\xba\xbe":
        raise ValueError("invalid class magic")
    pos = 8
    count = struct.unpack_from(">H", data, pos)[0]
    pos += 2
    cp = [None] * count
    index = 1
    while index < count:
        tag = data[pos]
        pos += 1
        if tag == 1:
            length = struct.unpack_from(">H", data, pos)[0]
            pos += 2
            cp[index] = (tag, data[pos : pos + length].decode("utf-8", "replace"))
            pos += length
        elif tag in (3, 4):
            cp[index] = (tag, data[pos : pos + 4])
            pos += 4
        elif tag in (5, 6):
            cp[index] = (tag, data[pos : pos + 8])
            pos += 8
            index += 1
        elif tag in (7, 8, 16, 19, 20):
            cp[index] = (tag, struct.unpack_from(">H", data, pos)[0])
            pos += 2
        elif tag in (9, 10, 11, 12, 17, 18):
            cp[index] = (tag, *struct.unpack_from(">HH", data, pos))
            pos += 4
        elif tag == 15:
            cp[index] = (tag, data[pos], struct.unpack_from(">H", data, pos + 1)[0])
            pos += 3
        else:
            raise ValueError(f"unsupported constant-pool tag {tag}")
        index += 1

    def utf8(index: int) -> str:
        item = cp[index]
        if item is None or item[0] != 1:
            raise ValueError(f"constant {index} is not UTF-8")
        return item[1]

    def class_name(index: int) -> str:
        item = cp[index]
        if item is None or item[0] != 7:
            raise ValueError(f"constant {index} is not a class")
        return utf8(item[1])

    def member_ref(index: int):
        item = cp[index]
        if item is None or item[0] not in (9, 10, 11):
            return None
        owner = class_name(item[1])
        name_type = cp[item[2]]
        if name_type is None or name_type[0] != 12:
            raise ValueError(f"constant {item[2]} is not a name-and-type")
        return owner, utf8(name_type[1]), utf8(name_type[2]), item[0]

    _, this_index, _ = struct.unpack_from(">HHH", data, pos)
    pos += 6  # access_flags, this_class, super_class
    interface_count = struct.unpack_from(">H", data, pos)[0]
    pos += 2 + 2 * interface_count

    def skip_members(pos: int, with_code: bool = False):
        member_count = struct.unpack_from(">H", data, pos)[0]
        pos += 2
        methods = []
        for _ in range(member_count):
            if with_code:
                pos += 2  # access_flags
                name_index, desc_index = struct.unpack_from(">HH", data, pos)
                pos += 4
                name, desc = utf8(name_index), utf8(desc_index)
            else:
                pos += 6  # access_flags, name_index, descriptor_index
            attr_count = struct.unpack_from(">H", data, pos)[0]
            pos += 2
            for _ in range(attr_count):
                attr_name_index = struct.unpack_from(">H", data, pos)[0]
                attr_name = utf8(attr_name_index)
                attr_length = struct.unpack_from(">I", data, pos + 2)[0]
                pos += 6
                if with_code and attr_name == "Code":
                    code_length = struct.unpack_from(">I", data, pos + 4)[0]
                    code = data[pos + 8 : pos + 8 + code_length]
                    methods.append((name, desc, code))
                pos += attr_length
        return pos, methods

    pos, _ = skip_members(pos)
    pos, methods = skip_members(pos, with_code=True)
    refs = {
        index: member_ref(index)
        for index in range(1, len(cp))
        if cp[index] is not None and cp[index][0] in (9, 10, 11)
    }
    method_handles = [
        {"constant_pool_index": index, "reference_index": item[2], "reference": refs.get(item[2])}
        for index, item in enumerate(cp)
        if item is not None and item[0] == 15 and item[2] in refs
    ]
    return class_name(this_index), cp, refs, methods, method_handles


def instructions(code: bytes):
    pc = 0
    while pc < len(code):
        opcode = code[pc]
        size = 1
        if opcode in (0x10, 0x12, 0x15, 0x16, 0x17, 0x18, 0x19, 0x36, 0x37, 0x38, 0x39, 0x3A, 0xA9, 0xBC):
            size = 2
        elif opcode in (
            0x11, 0x13, 0x14, 0x84, *range(0x99, 0xA9), 0xB2, 0xB3, 0xB4, 0xB5,
            0xB6, 0xB7, 0xB8, 0xBB, 0xBD, 0xC0, 0xC1, 0xC6, 0xC7,
        ):
            size = 3
        elif opcode in (0xB9, 0xBA, 0xC8, 0xC9):
            size = 5
        elif opcode == 0xC5:
            size = 4
        elif opcode in (0xAA, 0xAB):
            cursor = pc + 1
            while cursor % 4:
                cursor += 1
            if opcode == 0xAA:
                low, high = struct.unpack_from(">ii", code, cursor + 4)
                size = cursor - pc + 12 + 4 * (high - low + 1)
            else:
                pairs = struct.unpack_from(">i", code, cursor + 4)[0]
                size = cursor - pc + 8 + 8 * pairs
        elif opcode == 0xC4:
            size = 6 if code[pc + 1] == 0x84 else 4
        if pc + size > len(code):
            raise ValueError(f"truncated bytecode instruction at {pc}")
        yield pc, opcode, code[pc : pc + size]
        pc += size


def audit(jar: Path):
    method_desc = SETTER_DESC
    setter_calls = []
    field_writes = []
    handles = []
    class_count = 0
    class_errors = []
    initializer_window = None
    initializer_array_type = None
    with ZipFile(jar) as archive:
        for entry in archive.namelist():
            if not entry.endswith(".class"):
                continue
            class_count += 1
            try:
                owner, cp, refs, methods, method_handles = read_class(archive.read(entry))
                matching_setters = {
                    index
                    for index, ref in refs.items()
                    if ref[:3] == (OWNER, SETTER, method_desc)
                }
                matching_fields = {
                    index
                    for index, ref in refs.items()
                    if ref[:3] == (OWNER, FIELD, FIELD_DESC)
                }
                if matching_setters:
                    for handle in method_handles:
                        if handle["reference_index"] in matching_setters:
                            handles.append({"class": owner, **handle})
                for method_name, descriptor, code in methods:
                    decoded = list(instructions(code))
                    for offset, opcode, raw in decoded:
                        if opcode == 0xB8:
                            cp_index = struct.unpack_from(">H", raw, 1)[0]
                            if cp_index in matching_setters:
                                prev = next((x for x in reversed(decoded) if x[0] < offset), None)
                                previous_array_type = None
                                if prev and prev[1] == 0xBD:
                                    array_class_index = struct.unpack_from(">H", prev[2], 1)[0]
                                    array_class = cp[array_class_index]
                                    previous_array_type = cp[array_class[1]][1]
                                setter_calls.append(
                                    {
                                        "class": owner,
                                        "method": method_name,
                                        "descriptor": descriptor,
                                        "bci": offset,
                                        "previous_opcode": prev[1] if prev else None,
                                        "previous_bytes": prev[2].hex() if prev else None,
                                        "previous_array_type": previous_array_type,
                                    }
                                )
                                if owner == OWNER and method_name == "<clinit>":
                                    initializer_allocation = next(
                                        (item for item in decoded if item[0] == 7 and item[1] == 0xBD), None
                                    )
                                    if initializer_allocation:
                                        allocation_index = struct.unpack_from(">H", initializer_allocation[2], 1)[0]
                                        initializer_array_type = cp[cp[allocation_index][1]][1]
                                    initializer_window = [
                                        {"bci": pc, "opcode": op, "bytes": raw.hex()}
                                        for pc, op, raw in decoded
                                        if 6 <= pc <= offset
                                    ]
                        elif opcode == 0xB3:
                            cp_index = struct.unpack_from(">H", raw, 1)[0]
                            if cp_index in matching_fields:
                                field_writes.append(
                                    {
                                        "class": owner,
                                        "method": method_name,
                                        "descriptor": descriptor,
                                        "bci": offset,
                                    }
                                )
            except Exception as error:  # preserve coverage gaps in evidence
                class_errors.append({"entry": entry, "error": f"{type(error).__name__}: {error}"})

    producer_counts = Counter(
        f"0x{call['previous_opcode']:02x}" if call["previous_opcode"] is not None else "none"
        for call in setter_calls
    )
    array_type_counts = Counter(
        call["previous_array_type"] for call in setter_calls if call["previous_array_type"] is not None
    )
    special_initializers = [
        call for call in setter_calls
        if call["class"] == OWNER and call["method"] == "<clinit>"
    ]
    ordinary_array_calls = [
        call for call in setter_calls
        if not (call["class"] == OWNER and call["method"] == "<clinit>")
    ]
    assertions = {
        "all_classes_parsed": not class_errors,
        "single_field_write": len(field_writes) == 1,
        "all_direct_setter_calls_nonnull_array_allocations": (
            len(ordinary_array_calls) == len(setter_calls) - 1
            and all(
                call["previous_opcode"] == 0xBD and call["previous_array_type"] == OWNER
                for call in ordinary_array_calls
            )
            and len(special_initializers) == 1
            and initializer_array_type == OWNER
        ),
        "no_setter_method_handle": not handles,
        "checked_initializer_int_store_does_not_consume_array": initializer_window is not None
        and [item["opcode"] for item in initializer_window] == [0x06, 0xBD, 0x03, 0x3E, 0xB8],
    }
    return {
        "jar_sha256": sha256(jar),
        "class_files_scanned": class_count,
        "class_parse_errors": class_errors,
        "field": {"owner": OWNER, "name": FIELD, "descriptor": FIELD_DESC},
        "setter": {"name": SETTER, "descriptor": method_desc},
        "putstatic_sites": field_writes,
        "invokestatic_calls": setter_calls,
        "invokestatic_count": len(setter_calls),
        "previous_opcode_counts": dict(sorted(producer_counts.items())),
        "previous_array_type_counts": dict(sorted(array_type_counts.items())),
        "method_handle_references": handles,
        "class_initializer_call": special_initializers,
        "class_initializer_array_type": initializer_array_type,
        "class_initializer_stack_evidence": initializer_window,
        "assertions": assertions,
        "interpretation": (
            "The only field write is the setter's putstatic. Every direct setter call is preceded by "
            "anewarray, except the class initializer call: it allocates the array at bci 7, then "
            "pushes/stores an int before invokestatic at bci 12, leaving the nonnull array below it."
        ),
        "limits": (
            "This archives Java class-file putstatic/invokestatic references and method handles. "
            "It does not exclude reflective or native writes elsewhere in the program."
        ),
    }


def main():
    started = datetime.now(timezone.utc)
    parser = argparse.ArgumentParser()
    parser.add_argument("--jar", type=Path, required=True)
    parser.add_argument("--output", type=Path, required=True)
    parser.add_argument("--context", type=Path, action="append", default=[])
    parser.add_argument("--baseline", default="cb4551747dfbe7d3e8fb5668b3ad088da30fa8df")
    args = parser.parse_args()
    result = audit(args.jar)
    end = datetime.now(timezone.utc)
    report = {
        "slice_id": "R1901-post-constructor-array-field-writes",
        "source_baseline_commit": args.baseline,
        "probe_status": "static-only; no client, game, keyboard, mouse, or server interaction",
        "started_utc": started.isoformat(),
        "ended_utc": end.isoformat(),
        "command": f"python -B {Path(__file__).as_posix()} --jar {args.jar} --output {args.output} "
        + " ".join(f"--context {path}" for path in args.context),
        "exit_code": 0,
        "inputs_sha256": {
            str(args.jar): result["jar_sha256"],
            str(Path(__file__).resolve()): sha256(Path(__file__).resolve()),
            **{str(path): sha256(path) for path in args.context},
        },
        "result": result,
        "acceptance": {
            "static_reconstruction": "checked all Java class files in the pinned archive for direct field writes and setter calls",
            "build_regression": "not applicable; analysis tool only",
            "direct_runtime_probe": "not run",
            "normal_user_path": "not run",
            "vanilla_comparison": "not run",
            "real_server": "not run",
        },
    }
    args.output.parent.mkdir(parents=True, exist_ok=True)
    args.output.write_text(json.dumps(report, indent=2) + "\n", encoding="utf-8")
    print(json.dumps({
        "slice_id": report["slice_id"],
        "output": str(args.output),
        "jar_sha256": result["jar_sha256"],
        "class_files_scanned": result["class_files_scanned"],
        "class_parse_errors": len(result["class_parse_errors"]),
        "putstatic_sites": len(result["putstatic_sites"]),
        "invokestatic_count": result["invokestatic_count"],
        "previous_opcode_counts": result["previous_opcode_counts"],
        "assertions": result["assertions"],
        "method_handle_references": len(result["method_handle_references"]),
        "initializer_window": result["class_initializer_stack_evidence"],
    }, indent=2))
    if (
        result["class_parse_errors"]
        or result["invokestatic_count"] != 137
        or not all(result["assertions"].values())
    ):
        raise SystemExit(2)


if __name__ == "__main__":
    main()
