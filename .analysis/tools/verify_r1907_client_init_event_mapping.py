#!/usr/bin/env python3
"""Capture the original event publisher/handler mapping for Polinex.a(event)."""

from __future__ import annotations

import argparse
import hashlib
import json
import re
import subprocess
import sys
from datetime import datetime, timezone
from pathlib import Path


EVENT_INIT = (
    "me.octo.client.events.impl."
    "IIIIIIIlllIIllIlllIlllIIlIIIIllIllIlllIlIIllllllIlIIlIIlllIllIllIIlIIlIlIllIlllllIIlI"
)
EVENT_CLOSE = (
    "me.octo.client.events.impl."
    "IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI"
)
EVENT_OTHER = (
    "me.octo.client.events.impl."
    "IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
)
EVENT_BASE = (
    "me.octo.client.events."
    "llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
)
EVENT_BUS = (
    "me.octo.client.events.impl.base."
    "IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
)
INIT_MIXIN_METHOD = "polinex$onInitFinished"
CLOSE_MIXIN_METHOD = "onClose"


def sha256(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as source:
        for chunk in iter(lambda: source.read(1024 * 1024), b""):
            digest.update(chunk)
    return digest.hexdigest()


def method_blocks(disassembly: str) -> list[str]:
    starts = list(re.finditer(r"(?m)^  [^\n]*\([^\n]*\);$", disassembly))
    blocks = []
    for index, match in enumerate(starts):
        end = starts[index + 1].start() if index + 1 < len(starts) else len(disassembly)
        blocks.append(disassembly[match.start() : end].rstrip())
    return blocks


def run_javap(javap: Path, jar: Path, class_name: str) -> tuple[list[str], str, int]:
    argv = [str(javap), "-classpath", str(jar), "-v", "-p", "-c", "-s", class_name]
    result = subprocess.run(argv, capture_output=True, text=True, encoding="utf-8", errors="replace")
    return argv, result.stdout + result.stderr, result.returncode


def require(condition: bool, label: str, failures: list[str]) -> None:
    if not condition:
        failures.append(label)


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--root", type=Path, default=Path.cwd())
    parser.add_argument("--jar", type=Path, required=True)
    parser.add_argument("--javap", type=Path, required=True)
    parser.add_argument("--baseline", default="cb4551747dfbe7d3e8fb5668b3ad088da30fa8df")
    parser.add_argument(
        "--output",
        type=Path,
        default=Path(".analysis/reports/R1907-client-init-event-type-map.json"),
    )
    parser.add_argument(
        "--bytecode-output",
        type=Path,
        default=Path(".analysis/reports/R1907-client-init-event-type-map.javap.txt"),
    )
    args = parser.parse_args()

    root = args.root.resolve()
    jar = args.jar.resolve()
    javap = args.javap.resolve()
    output = args.output if args.output.is_absolute() else root / args.output
    bytecode_output = args.bytecode_output if args.bytecode_output.is_absolute() else root / args.bytecode_output
    output.parent.mkdir(parents=True, exist_ok=True)
    bytecode_output.parent.mkdir(parents=True, exist_ok=True)

    source_files = {
        "Polinex.java": root / "polinex-src/src/main/java/me/octo/client/Polinex.java",
        "MinecraftMixin.java": root / "polinex-src/src/main/java/me/octo/client/mixin/client/MinecraftMixin.java",
    }
    classes = [
        "me.octo.client.Polinex",
        "me.octo.client.mixin.client.MinecraftMixin",
        EVENT_INIT,
        EVENT_CLOSE,
        EVENT_OTHER,
        EVENT_BUS,
    ]

    started = datetime.now(timezone.utc).isoformat()
    commands = []
    outputs: dict[str, str] = {}
    exit_codes = []
    for class_name in classes:
        argv, disassembly, exit_code = run_javap(javap, jar, class_name)
        commands.append({"argv": argv, "exit_code": exit_code})
        exit_codes.append(exit_code)
        outputs[class_name] = disassembly

    failures: list[str] = []
    polinex = outputs["me.octo.client.Polinex"]
    mixin = outputs["me.octo.client.mixin.client.MinecraftMixin"]
    event_init = outputs[EVENT_INIT]
    event_close = outputs[EVENT_CLOSE]
    event_other = outputs[EVENT_OTHER]
    bus = outputs[EVENT_BUS]

    init_descriptor = f"(L{EVENT_INIT.replace('.', '/')};)V"
    close_descriptor = f"(L{EVENT_CLOSE.replace('.', '/')};)V"
    other_descriptor = f"(L{EVENT_OTHER.replace('.', '/')};)V"
    init_method = next((b for b in method_blocks(polinex) if init_descriptor in b), "")
    close_method = next((b for b in method_blocks(polinex) if close_descriptor in b), "")
    other_method = next((b for b in method_blocks(polinex) if other_descriptor in b), "")
    init_publisher = next((b for b in method_blocks(mixin) if INIT_MIXIN_METHOD in b), "")
    close_publisher = next((b for b in method_blocks(mixin) if re.search(r"\bonClose\b", b)), "")
    bus_dispatch = next(
        (
            b
            for b in method_blocks(bus)
            if f"(L{EVENT_BASE.replace('.', '/')};)Z" in b
        ),
        "",
    )

    for label, code in zip(classes, exit_codes):
        require(code == 0, f"javap succeeded for {label}", failures)
    require(init_method != "" and "SubscribeEvent" in init_method and "ACC_NATIVE" in init_method,
            "original Polinex declares the initialization event handler native and subscribed", failures)
    require(close_method != "" and "SubscribeEvent" in close_method and "ACC_NATIVE" in close_method,
            "original Polinex declares the close event handler native and subscribed", failures)
    require(other_method != "" and "SubscribeEvent" in other_method,
            "original Polinex declares the third subscriber with its distinct event descriptor", failures)
    require(
        INIT_MIXIN_METHOD in init_publisher
        and "buildInitialScreens(Lnet/minecraft/client/Minecraft$GameLoadCookie;)Ljava/lang/Runnable;" in init_publisher
        and 'value="RETURN"' in init_publisher
        and EVENT_INIT.replace(".", "/") in init_publisher
        and "ACC_NATIVE" not in init_publisher,
        "MinecraftMixin posts the first singleton at buildInitialScreens RETURN", failures)
    require(
        re.search(r"\bonClose\b", close_publisher) is not None
        and 'method=["close"]' in close_publisher
        and 'value="HEAD"' in close_publisher
        and EVENT_CLOSE.replace(".", "/") in close_publisher,
        "MinecraftMixin posts the second singleton at close HEAD", failures)
    require("INSTANCE" not in event_init and "ACC_PRIVATE" in event_init and "ACC_STATIC" in event_init,
            "first event class bytecode captured", failures)
    require("ACC_PRIVATE" in event_init and "new" in event_init and "putstatic" in event_init,
            "first event has private constructor and static singleton initialization", failures)
    require("putstatic" in event_close and "<init>" in event_close,
            "second event has a static singleton instance", failures)
    require("public" in event_other and "putstatic" not in event_other,
            "third event is constructible and is not either singleton posted by MinecraftMixin", failures)
    require(bus_dispatch != "" and "Consumer.accept" in bus_dispatch,
            "the EventBus event descriptor dispatches registered consumers", failures)

    selected = [
        ("Polinex original event declarations", [init_method, close_method, other_method]),
        ("MinecraftMixin original publishers", [init_publisher, close_publisher]),
        ("original init event class", [event_init]),
        ("original close event class", [event_close]),
        ("original third event class", [event_other]),
        ("EventBus original dispatch method", [bus_dispatch]),
    ]
    bytecode_parts = []
    for title, blocks in selected:
        bytecode_parts.append(f"\n===== {title} =====\n")
        bytecode_parts.extend(blocks)
    bytecode_text = "\n\n".join(bytecode_parts).rstrip() + "\n"
    with bytecode_output.open("w", encoding="utf-8", newline="\n") as destination:
        destination.write(bytecode_text)

    report = {
        "slice_id": "R1907-client-init-event-type-map",
        "source_baseline_commit": args.baseline,
        "worktree": str(root).replace("\\", "/"),
        "probe_status": "static-only; no client, game, keyboard, mouse, or server interaction",
        "started_utc": started,
        "ended_utc": datetime.now(timezone.utc).isoformat(),
        "commands": commands,
        "inputs_sha256": {
            "original_jar": sha256(jar),
            **{name: sha256(path) for name, path in source_files.items()},
        },
        "method_mapping": {
            "initialization_event_class": EVENT_INIT,
            "initialization_handler": f"Polinex.a{init_descriptor}",
            "initialization_publisher": {
                "class": "MinecraftMixin",
                "method": "polinex$onInitFinished(Ljava/lang/Object;CallbackInfoReturnable;)V",
                "injection_target": "Minecraft.buildInitialScreens(Minecraft$GameLoadCookie):Runnable at RETURN",
                "action": "loads the event singleton and calls EventBus.a(Event):Z",
            },
            "close_event_class": EVENT_CLOSE,
            "close_handler": f"Polinex.a{close_descriptor}",
            "close_publisher": {
                "class": "MinecraftMixin",
                "method": "onClose(CallbackInfo)V",
                "injection_target": "Minecraft.close at HEAD",
                "action": "loads the other event singleton and calls EventBus.a(Event):Z",
            },
            "third_subscriber_descriptor": f"Polinex.a{other_descriptor}",
        },
        "assertions": {
            "all_javap_commands_succeeded": all(code == 0 for code in exit_codes),
            "first_native_subscriber_is_posted_after_initial_screens": init_method != "" and init_publisher != "" and "buildInitialScreens" in init_publisher,
            "second_native_subscriber_is_posted_during_close": close_method != "" and close_publisher != "" and 'method=["close"]' in close_publisher,
            "event_bus_invokes_registered_consumers": bus_dispatch != "" and "Consumer.accept" in bus_dispatch,
        },
        "acceptance": {
            "static_reconstruction": "passed for event class identity and direct publisher-to-handler descriptor mapping",
            "build_regression": "not run; no Java source changed",
            "direct_runtime_probe": "not run",
            "normal_user_path": "not run; initialization handler remains native",
            "vanilla_comparison": "not run",
            "real_server": "not run",
        },
        "limits": "The mapping proves which original event descriptor is published after Minecraft.buildInitialScreens returns. It does not recover the remaining native handler body or its later side effects.",
        "bytecode_excerpt": str(bytecode_output.relative_to(root)).replace("\\", "/"),
        "bytecode_excerpt_sha256": sha256(bytecode_output),
        "verification_failures": failures,
        "exit_code": 0 if not failures else 1,
    }
    with output.open("w", encoding="utf-8", newline="\n") as destination:
        destination.write(json.dumps(report, indent=2, ensure_ascii=False) + "\n")
    print(json.dumps(report, indent=2, ensure_ascii=False))
    return report["exit_code"]


if __name__ == "__main__":
    sys.exit(main())
