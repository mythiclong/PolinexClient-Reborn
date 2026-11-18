#!/usr/bin/env python3
"""Scan JVM class files for executed Pathfinder invocations and method handles.

This parses class-file constant pools, Code attributes, and BootstrapMethods.
It reports actual invoke bytecodes referencing Pathfinder owners, plus bootstrap
method handles that can invoke those owners. Constant-pool-only matches are not
reported as executable call sites.
"""

from __future__ import annotations

import argparse
import json
import os
import struct
import zipfile
from pathlib import Path


def u1(data: bytes, p: int) -> tuple[int, int]:
    return data[p], p + 1


def u2(data: bytes, p: int) -> tuple[int, int]:
    return struct.unpack_from(">H", data, p)[0], p + 2


def u4(data: bytes, p: int) -> tuple[int, int]:
    return struct.unpack_from(">I", data, p)[0], p + 4


def s4(data: bytes, p: int) -> tuple[int, int]:
    return struct.unpack_from(">i", data, p)[0], p + 4


def parse_constant_pool(data: bytes, p: int) -> tuple[list, int]:
    count, p = u2(data, p)
    cp = [None] * count
    i = 1
    while i < count:
        tag, p = u1(data, p)
        if tag == 1:
            size, p = u2(data, p)
            cp[i] = (tag, data[p:p + size].decode("utf-8", "replace"))
            p += size
        elif tag in (3, 4):
            cp[i] = (tag, data[p:p + 4])
            p += 4
        elif tag in (5, 6):
            cp[i] = (tag, data[p:p + 8])
            p += 8
            i += 1
        elif tag in (7, 8, 16, 19, 20):
            value, p = u2(data, p)
            cp[i] = (tag, value)
        elif tag in (9, 10, 11, 12, 17, 18):
            a, p = u2(data, p)
            b, p = u2(data, p)
            cp[i] = (tag, a, b)
        elif tag == 15:
            kind, p = u1(data, p)
            ref, p = u2(data, p)
            cp[i] = (tag, kind, ref)
        else:
            raise ValueError(f"unknown constant-pool tag {tag} at index {i}")
        i += 1
    return cp, p


def cp_utf8(cp: list, index: int) -> str:
    item = cp[index]
    if item is None or item[0] != 1:
        raise ValueError(f"constant {index} is not Utf8")
    return item[1]


def cp_class(cp: list, index: int) -> str:
    item = cp[index]
    if item is None or item[0] != 7:
        raise ValueError(f"constant {index} is not Class")
    return cp_utf8(cp, item[1])


def cp_member(cp: list, index: int) -> dict:
    item = cp[index]
    if item is None or item[0] not in (9, 10, 11):
        raise ValueError(f"constant {index} is not a member reference")
    owner = cp_class(cp, item[1])
    name_type = cp[item[2]]
    if name_type is None or name_type[0] != 12:
        raise ValueError(f"constant {item[2]} is not NameAndType")
    return {"owner": owner, "name": cp_utf8(cp, name_type[1]), "descriptor": cp_utf8(cp, name_type[2])}


def cp_handle(cp: list, index: int) -> dict:
    item = cp[index]
    if item is None or item[0] != 15:
        raise ValueError(f"constant {index} is not MethodHandle")
    result = cp_member(cp, item[2])
    result["reference_kind"] = item[1]
    return result


def instruction_calls(code: bytes, cp: list) -> list[dict]:
    # Fixed instruction sizes, including opcode byte; variable switches and wide
    # instructions are handled below according to the JVMS alignment rules.
    lengths = [1] * 256
    for op in (16, 169, 188, *range(21, 26), *range(54, 59)):
        lengths[op] = 2
    for op in (17, 19, 20, 132, *range(153, 169), 178, 179, 180, 181, 182, 183, 184, 187, 189, 192, 193, 198, 199):
        lengths[op] = 3
    lengths[18] = 2
    lengths[185] = 5
    lengths[186] = 5
    lengths[197] = 4
    lengths[200] = 5
    lengths[201] = 5

    calls = []
    handle_loads = []
    p = 0
    while p < len(code):
        offset = p
        op = code[p]
        p += 1
        if op == 170:  # tableswitch
            p += (4 - (p & 3)) & 3
            _, p = s4(code, p)  # default
            low, p = s4(code, p)
            high, p = s4(code, p)
            count = high - low + 1
            if count < 0:
                raise ValueError(f"invalid tableswitch at bytecode offset {offset}")
            p += 4 * count
            continue
        if op == 171:  # lookupswitch
            p += (4 - (p & 3)) & 3
            _, p = s4(code, p)  # default
            count, p = s4(code, p)
            if count > len(code) // 8:
                raise ValueError(f"invalid lookupswitch at bytecode offset {offset}")
            p += 8 * count
            continue
        if op == 196:  # wide
            nested = code[p]
            p += 1
            p += 4 if nested == 132 else 2
            continue
        if op in (18, 19):  # ldc / ldc_w can load a MethodHandle or ConstantDynamic
            cp_index = code[p] if op == 18 else struct.unpack_from(">H", code, p)[0]
            item = cp[cp_index]
            if item is not None and item[0] == 15:
                call = {"kind": "ldc_method_handle", **cp_handle(cp, cp_index)}
                call["bytecode_offset"] = offset
                handle_loads.append(call)
            elif item is not None and item[0] == 17:
                name_type = cp[item[2]]
                call = {"kind": "ldc_constant_dynamic", "name": cp_utf8(cp, name_type[1]), "descriptor": cp_utf8(cp, name_type[2]), "bootstrap_index": item[1]}
                call["bytecode_offset"] = offset
                handle_loads.append(call)
        if op in (182, 183, 184, 185, 186):
            cp_index = struct.unpack_from(">H", code, p)[0]
            if op == 186:
                dynamic = cp[cp_index]
                if dynamic is None or dynamic[0] != 18:
                    raise ValueError(f"invokedynamic at {offset} has invalid constant {cp_index}")
                name_type = cp[dynamic[2]]
                call = {"kind": "invokedynamic", "name": cp_utf8(cp, name_type[1]), "descriptor": cp_utf8(cp, name_type[2]), "bootstrap_index": dynamic[1]}
            else:
                call = {"kind": {182: "invokevirtual", 183: "invokespecial", 184: "invokestatic", 185: "invokeinterface"}[op], **cp_member(cp, cp_index)}
            call["bytecode_offset"] = offset
            calls.append(call)
        p = offset + lengths[op]
        if p > len(code):
            raise ValueError(f"truncated opcode {op} at bytecode offset {offset}")
    return calls, handle_loads


def parse_class(data: bytes, origin: str) -> dict:
    if data[:4] != b"\xca\xfe\xba\xbe":
        raise ValueError("bad class-file magic")
    p = 8
    cp, p = parse_constant_pool(data, p)
    _, p = u2(data, p)  # access flags
    this_class, p = u2(data, p)
    _, p = u2(data, p)  # super class
    class_name = cp_class(cp, this_class)
    interfaces, p = u2(data, p)
    p += interfaces * 2

    fields, p = u2(data, p)
    for _ in range(fields):
        p += 6
        attributes, p = u2(data, p)
        for _ in range(attributes):
            _, p = u2(data, p)
            size, p = u4(data, p)
            p += size

    methods, p = u2(data, p)
    invokes = []
    indy = []
    handle_loads = []
    for _ in range(methods):
        _, p = u2(data, p)
        name_index, p = u2(data, p)
        desc_index, p = u2(data, p)
        method_name, method_desc = cp_utf8(cp, name_index), cp_utf8(cp, desc_index)
        attributes, p = u2(data, p)
        for _ in range(attributes):
            attr_name_index, p = u2(data, p)
            attr_size, p = u4(data, p)
            attr_end = p + attr_size
            if cp_utf8(cp, attr_name_index) == "Code":
                _, p = u2(data, p)  # max_stack
                _, p = u2(data, p)  # max_locals
                code_size, p = u4(data, p)
                method_calls, method_handles = instruction_calls(data[p:p + code_size], cp)
                for call in method_calls:
                    call.update({"caller_owner": class_name, "caller_name": method_name, "caller_descriptor": method_desc, "class_file": origin})
                    (indy if call["kind"] == "invokedynamic" else invokes).append(call)
                for call in method_handles:
                    call.update({"caller_owner": class_name, "caller_name": method_name, "caller_descriptor": method_desc, "class_file": origin})
                    handle_loads.append(call)
                p += code_size
                exception_count, p = u2(data, p)
                p += exception_count * 8
                nested_count, p = u2(data, p)
                for _ in range(nested_count):
                    _, p = u2(data, p)
                    nested_size, p = u4(data, p)
                    p += nested_size
            else:
                p = attr_end
            if p != attr_end:
                raise ValueError(f"bad method attribute size in {origin}")

    attributes, p = u2(data, p)
    bootstrap_methods = []
    for _ in range(attributes):
        name_index, p = u2(data, p)
        size, p = u4(data, p)
        end = p + size
        if cp_utf8(cp, name_index) == "BootstrapMethods":
            count, p = u2(data, p)
            for _ in range(count):
                handle, p = u2(data, p)
                arg_count, p = u2(data, p)
                args = []
                for _ in range(arg_count):
                    arg, p = u2(data, p)
                    item = cp[arg]
                    if item is not None and item[0] == 15:
                        args.append(cp_handle(cp, arg))
                bootstrap_methods.append({"bootstrap": cp_handle(cp, handle), "arguments": args})
        else:
            p = end
        if p != end:
            raise ValueError(f"bad class attribute size in {origin}")

    return {"owner": class_name, "invokes": invokes, "invokedynamic": indy, "method_handle_loads": handle_loads, "bootstrap_methods": bootstrap_methods, "constant_pool": cp}


def class_files(path: Path):
    if path.is_file() and path.suffix.lower() == ".jar":
        with zipfile.ZipFile(path) as archive:
            for item in archive.infolist():
                if item.filename.endswith(".class"):
                    yield item.filename, archive.read(item.filename)
    else:
        for item in path.rglob("*.class"):
            read_path = item
            if os.name == "nt":
                read_path = Path("\\\\?\\" + str(item.resolve()))
            yield item.relative_to(path).as_posix(), read_path.read_bytes()


def interesting(owner: str) -> bool:
    return owner == "me/octo/client/utils/player/pathfinder/NativePathFinder" or owner.startswith("me/octo/client/utils/player/pathfinder/")


def scan(path: Path) -> dict:
    rows = []
    failures = []
    class_count = 0
    for name, data in class_files(path):
        class_count += 1
        try:
            parsed = parse_class(data, name)
            for call in parsed["invokes"]:
                if interesting(call["owner"]):
                    rows.append(call)
            for call in parsed["invokedynamic"]:
                bootstrap = parsed["bootstrap_methods"][call["bootstrap_index"]]
                handles = [bootstrap["bootstrap"], *bootstrap["arguments"]]
                targets = [h for h in handles if interesting(h["owner"])]
                if targets:
                    call["bootstrap_handles_to_pathfinder"] = targets
                    rows.append(call)
            for call in parsed["method_handle_loads"]:
                if call["kind"] == "ldc_method_handle":
                    if interesting(call["owner"]):
                        rows.append(call)
                else:
                    bootstrap = parsed["bootstrap_methods"][call["bootstrap_index"]]
                    handles = [bootstrap["bootstrap"], *bootstrap["arguments"]]
                    targets = [h for h in handles if interesting(h["owner"])]
                    if targets:
                        call["bootstrap_handles_to_pathfinder"] = targets
                        rows.append(call)
        except Exception as error:  # recorded per class; never hidden
            failures.append({"class_file": name, "error": f"{type(error).__name__}: {error}"})
    rows.sort(key=lambda x: (x["class_file"], x["caller_name"], x["caller_descriptor"], x["bytecode_offset"], x["kind"]))
    return {"input": str(path), "class_files_scanned": class_count, "parse_failures": failures, "pathfinder_call_sites": rows}


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--original", type=Path, required=True, help="original JAR")
    parser.add_argument("--compiled", type=Path, required=True, help="compiled class directory or JAR")
    parser.add_argument("--out", type=Path, required=True)
    args = parser.parse_args()
    result = {"experiment_id": "R1952", "slice_id": "PATHFINDER-ACTUAL-INVOKE-GRAPH", "original": scan(args.original), "compiled": scan(args.compiled)}
    args.out.parent.mkdir(parents=True, exist_ok=True)
    args.out.write_text(json.dumps(result, indent=2, ensure_ascii=False) + "\n", encoding="utf-8")
    print(f"original classes={result['original']['class_files_scanned']} parse_failures={len(result['original']['parse_failures'])} invoke_sites={len(result['original']['pathfinder_call_sites'])}")
    print(f"compiled classes={result['compiled']['class_files_scanned']} parse_failures={len(result['compiled']['parse_failures'])} invoke_sites={len(result['compiled']['pathfinder_call_sites'])}")
    if result["original"]["parse_failures"] or result["compiled"]["parse_failures"]:
        return 2
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
