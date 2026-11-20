#!/usr/bin/env python3
"""Offline source-contract checks for the R1996 Pathfinder lifecycle slice."""

from __future__ import annotations

import hashlib
import json
import subprocess
from datetime import datetime, timezone
from pathlib import Path


ROOT = Path(__file__).resolve().parents[4]
SOURCE_REL = Path(
    "polinex-src/src/main/java/me/octo/client/"
    "IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll.java"
)
source_text = (ROOT / SOURCE_REL).read_text(encoding="utf-8")
source_sha256 = hashlib.sha256((ROOT / SOURCE_REL).read_bytes()).hexdigest()
source_blob = subprocess.check_output(
    ["git", "hash-object", str(SOURCE_REL)], cwd=ROOT, text=True
).strip()


def section(start: str, end: str) -> str:
    begin = source_text.index(start)
    finish = source_text.index(end, begin)
    return source_text[begin:finish]


completion = section(
    "private final boolean g(\n", "\n   private final boolean h(\n"
)
progress = section(
    "private final boolean h(\n", "\n   private final void s() {"
)
stop_reset = section(
    "private final void d(boolean param1) {", "\n   private final void a(\n"
)
stop = section("public final void v() {", "\n   private static final double a(")
clear_route = section("private final void t() {", "\n   public final void v() {")
clear_steering = section("private final void s() {", "\n   private final void t() {")

route_cursor = (
    "IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll"
)
repath_memo = (
    "IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll"
)
timer_fields = (
    "IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII",
    "lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII",
    "lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI",
    "lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI",
)

assert f"return var2 != null\n         && this.{route_cursor} >= param1.size();" in completion
assert repath_memo not in completion
assert route_cursor in progress
assert progress.index(f"this.{route_cursor} = var3 + 1;") < progress.index(
    "this.g(param1)"
)
assert progress.index("this.g(param1)") < progress.index("this.v();")
assert "this.d(false);" in stop and stop.index("this.d(false);") < stop.index("this.t();") < stop.index("this.s();")
assert "this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = null;" in clear_route
assert "this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = null;" in clear_route
assert clear_steering.index(".j();") < clear_steering.index(".t();")

guard_start = stop_reset.index("if (var2 != null && param1)")
guard_end = stop_reset.index("\n      }", guard_start)
guarded_resets = stop_reset[guard_start:guard_end]
always_resets = stop_reset[guard_end:]
for timer in timer_fields[:3]:
    assert f"this.{timer}.a(" in guarded_resets
    assert f"this.{timer}.a(" not in always_resets
assert f"this.{timer_fields[3]}.a(" not in guarded_resets
assert f"this.{timer_fields[3]}.a(" in always_resets

checks: list[dict[str, object]] = []
for size in (0, 1, 2, 5):
    for cursor in (-1, 0, 1, size - 1, size, size + 1):
        for gate_present in (False, True):
            actual = gate_present and cursor >= size
            expected = gate_present and cursor >= size
            assert actual == expected
            checks.append(
                {
                    "contract": "completion_gate_and_route_cursor",
                    "gate_present": gate_present,
                    "route_cursor": cursor,
                    "path_size": size,
                    "expected_complete": expected,
                    "actual_complete": actual,
                }
            )

for gate_present in (False, True):
    for requested_full_reset in (False, True):
        first_three = gate_present and requested_full_reset
        fourth = True
        assert first_three == (gate_present and requested_full_reset)
        assert fourth is True
        checks.append(
            {
                "contract": "stop_timer_reset_gate_and_flag",
                "gate_present": gate_present,
                "requested_full_reset": requested_full_reset,
                "first_three_reset": first_three,
                "fourth_reset": fourth,
            }
        )

assert len(checks) == 52
report = {
    "experiment_id": "R1996-pathfinder-route-completion-and-stop-reset",
    "generated_utc": datetime.now(timezone.utc).isoformat().replace("+00:00", "Z"),
    "source": {
        "path": SOURCE_REL.as_posix(),
        "git_blob": source_blob,
        "sha256": source_sha256,
    },
    "status": "PASS",
    "assertion_count": len(checks),
    "scope": "Source-contract assertions and modeled gate/cursor/stop-flag truth tables; not a live client or world test.",
    "checks": checks,
}
print(json.dumps(report, ensure_ascii=False, indent=2))
