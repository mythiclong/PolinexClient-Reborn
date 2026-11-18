#!/usr/bin/env python3
"""Verify the saved original/current Pathfinder wrapper branch decision."""

from __future__ import annotations

import hashlib
import os
import re
from pathlib import Path


ROOT = Path(__file__).resolve().parents[4]
EVIDENCE = ROOT / ".analysis/evidence/mining"
R1950 = EVIDENCE / "r1950-pathfinder-native-api-callers"
R1953 = EVIDENCE / "r1953-pathfinder-wrapper-audit"
SOURCE_RELATIVE = Path(
    "polinex-src/src/main/java/me/octo/client/utils/player/pathfinder/"
    "IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.java"
)
SOURCE_SHA256 = "56117f995b7b5e27194e172695f22290e254ec04ada1ce40449ff02bf121bbf8"
SOURCE_TREE_SHA256 = "a23ce38f1eb037f6042e457e2910423fd00efcc98790fe1d07e85fdf501099d8"
DESCRIPTOR = "(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Z)Ljava/util/List;"


def sha256(path: Path) -> str:
    return hashlib.sha256(read_bytes(path)).hexdigest()


def read_bytes(path: Path) -> bytes:
    native_path = os.path.abspath(str(path))
    if os.name == "nt" and not native_path.startswith("\\\\?\\"):
        native_path = "\\\\?\\" + native_path
    with open(native_path, "rb") as stream:
        return stream.read()


def java_source_fingerprint() -> str:
    source_root = ROOT / "polinex-src/src/main/java"
    entries = sorted(source_root.rglob("*.java"), key=lambda p: p.relative_to(source_root).as_posix())
    aggregate = hashlib.sha256()
    for path in entries:
        relative = path.relative_to(source_root).as_posix()
        content_hash = hashlib.sha256(read_bytes(path)).hexdigest()
        aggregate.update(relative.encode("utf-8") + b"\t" + content_hash.encode("ascii") + b"\n")
    return aggregate.hexdigest()


def method_instructions(path: Path) -> list[tuple[int, str, str, str]]:
    text = path.read_text(encoding="utf-8", errors="replace")
    lines = text.splitlines()
    descriptor_line = next(
        (i for i, line in enumerate(lines) if line.strip() == f"descriptor: {DESCRIPTOR}"),
        None,
    )
    if descriptor_line is None:
        raise AssertionError(f"descriptor absent: {path}")

    method_start = descriptor_line
    while method_start >= 0 and not re.match(r"^  (?:public|private|protected) ", lines[method_start]):
        method_start -= 1
    if method_start < 0:
        raise AssertionError(f"method header absent: {path}")

    method_end = descriptor_line + 1
    while method_end < len(lines) and not re.match(r"^  (?:public|private|protected) ", lines[method_end]):
        method_end += 1

    instructions: list[tuple[int, str, str, str]] = []
    for line in lines[descriptor_line + 1 : method_end]:
        match = re.match(r"\s*(\d+):\s+([a-z][a-z0-9_]*)\b(.*)$", line)
        if match:
            offset, opcode, remainder = match.groups()
            operands, _, comment = remainder.partition("//")
            instructions.append((int(offset), opcode, operands.strip(), comment.strip()))
    return instructions


def simulate_branch(instructions: list[tuple[int, str, str, str]], gate: int, length: int) -> str:
    opcodes = [opcode for _, opcode, _, _ in instructions]
    array_index = opcodes.index("arraylength")
    offset_to_index = {offset: i for i, (offset, _, _, _) in enumerate(instructions)}
    # javap shows gate in local 4 for the original, and local 11 for current;
    # current stores arraylength in local 6 before evaluating the same predicate.
    locals_ = {4: gate, 6: length, 11: gate}
    stack: list[object] = [length]  # value after arraylength
    pc = array_index + 1
    steps = 0
    while pc < len(instructions) and steps < 80:
        steps += 1
        _, opcode, operands, comment = instructions[pc]
        next_pc = pc + 1
        if opcode in ("iload", "aload", "dload", "fload", "lload"):
            slot = int(operands.split()[0]) if operands else int(opcode[-1])
            if opcode == "iload":
                if slot not in locals_:
                    raise AssertionError(f"unexpected int local {slot}")
                stack.append(locals_[slot])
            else:
                stack.append(f"local_{slot}")
        elif opcode in ("istore", "astore", "dstore", "fstore", "lstore"):
            slot = int(operands.split()[0]) if operands else int(opcode[-1])
            locals_[slot] = stack.pop()
        elif opcode.startswith("iconst_"):
            stack.append(int(opcode.rsplit("_", 1)[1]))
        elif opcode == "ifeq" or opcode == "ifne":
            value = stack.pop()
            branch = (value == 0) if opcode == "ifeq" else (value != 0)
            if branch:
                next_pc = offset_to_index[int(operands.split()[0])]
        elif opcode == "goto":
            next_pc = offset_to_index[int(operands.split()[0])]
        elif opcode == "aconst_null":
            stack.append(None)
        elif opcode == "getstatic":
            stack.append("converter_owner")
        elif opcode == "invokevirtual" and "a:([JDDZ)Ljava/util/List;" in comment:
            return "converter"
        elif opcode == "areturn":
            if stack.pop() is None:
                return "null"
            raise AssertionError("returned a non-null value without reaching the route converter")
        elif opcode in ("aload_0", "aload_1", "aload_2", "aload_3", "iload_0", "iload_1", "iload_2", "iload_3"):
            slot = int(opcode[-1])
            stack.append(locals_.get(slot, f"local_{slot}"))
        elif opcode in ("dload_0", "dload_1", "dload_2", "dload_3", "dload", "iconst_m1"):
            stack.append(0)
        else:
            raise AssertionError(f"unsupported opcode while resolving branch: {opcode} {operands}")
        pc = next_pc
    raise AssertionError("branch did not reach a return or the route converter")


def main() -> None:
    source = ROOT / SOURCE_RELATIVE
    if sha256(source) != SOURCE_SHA256:
        raise AssertionError("wrapper source content hash changed")
    if java_source_fingerprint() != SOURCE_TREE_SHA256:
        raise AssertionError("Java source-tree content fingerprint changed")

    original = method_instructions(R1950 / "wrapper-original.javap.txt")
    current = method_instructions(R1950 / "wrapper-compiled.javap.txt")
    original_table = {
        (gate, length): simulate_branch(original, gate, length)
        for gate in (0, 1)
        for length in (0, 1)
    }
    current_table = {
        (gate, length): simulate_branch(current, gate, length)
        for gate in (0, 1)
        for length in (0, 1)
    }
    if original_table != current_table:
        raise AssertionError("original/current branch outcomes differ")

    print("R1953 Pathfinder wrapper static check: PASS")
    print(f"source tree: 1602 Java files, SHA-256 {SOURCE_TREE_SHA256}")
    for (gate, length), outcome in sorted(original_table.items()):
        print(f"gate={gate}, path_length_is_zero={int(length == 0)}: {outcome}")
    print("Dynamic Minecraft/world behavior: NOT RUN")


if __name__ == "__main__":
    main()
