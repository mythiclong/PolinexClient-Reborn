# 2026-11-16 progress sync

This snapshot imports the current OpenPolinex source and evidence slice into the independent `PolinexClient-Reborn` history.

## Source and evidence provenance

- Source snapshot: OpenPolinex commit `b4960fe` (`recovery: sync client initialization progress and evidence`). The evidence-generation base recorded by each report remains authoritative; the Git commit that imports the material into this repository is recorded in `SYNC-20261116.json`.
- Included: reports R1872–R1909, the current `RESUME.md`, 12 verifier scripts, the source metrics script, and three Java source updates (`Polinex.java` plus two restored classes).
- Public report copies replace machine-specific paths with `<WORKTREE_ROOT>`, `<REFERENCE_ROOT>`, `<JDK_25>`, and `<PYTHON_39>`. Recorded source/input hashes and captured bytecode are preserved; the redacted report files naturally have different whole-file hashes from local originals.
- The verifier scripts are copied byte-for-byte from the source snapshot. A few still use machine-specific JDK or input-JAR paths, so replay on another machine requires setting equivalent local paths. The reports record the original command results.

## Current limits

`Polinex.a(E_CLIENT_INITIALIZED)` is still native. Static analysis has mapped parts of the entry, state 7/8, and exception paths, but the 15 state-7 constructors compare differently from the current compiled output in R1909; the cause is unresolved. No client, keyboard, mouse, world, or server acceptance was performed for this sync. The latest recorded full-tree compile is R1892 and does not validate R1909 or runtime behavior.

`rawpolinex.jar` in the repository root has SHA-256 `D85398CFD774781E888A3F36CFBFA87A4CF04235F8459BB6A00437A5D3C48A26`, matching the reference JAR used by this analysis. It remains a binary input, not a managed-source implementation.
