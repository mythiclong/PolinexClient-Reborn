# Contributing

Polinex source restoration is incomplete. Small, evidence-backed changes are easier to review and continue than broad rewrites.

## Before editing

- Read `.analysis/reports/RESUME.md` and `.analysis/reports/HANDOFF-20261115.md`.
- Keep existing local edits and evidence. Do not use `git clean`, `git add -A`, or broad resets.
- The original behavior jar is not included. Do not add protected binaries, native payloads, private game directories, account data, or unsanitized desktop captures.

## For each source slice

- Identify the exact original class, method, and JVM descriptor.
- Compare the complete original method, including field reads/writes, invoke owner and descriptor, branch conditions, default-argument masks, exception edges, and side effects.
- Keep changes within a dependency boundary. Record the input source hashes and the evidence baseline separately from the commit that stores the evidence.
- Compile the full tree at the slice boundary. A successful compile is not a functional-equivalence claim.
- For runtime-dependent code, use valid Minecraft state and a normal user path. Record expected and actual object-state changes and compare with the original under matching conditions.
- Mark invalid harnesses `VOID`; they are not evidence for or against the feature.
- Remove temporary probes after the slice is complete and rebuild without them.

## Current priorities

1. Restore the ClickGUI five-page display and verify real Draw/leaf controls plus settings save/reload without affecting the user's active desktop.
2. Finish exact method restoration for Glacite Commission Macro.
3. Continue Powder Macro and Pathfinder with valid in-world inputs.
4. Continue other modules, commands, native helpers, and server validation as evidence and access allow.

Do not add empty methods, fake defaults, swallowed exceptions, disabled features, or protected classes as substitutes for restored behavior. The repository does not yet define a license; check with the maintainer before redistributing builds or claiming rights to the original mod.