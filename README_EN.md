# OpenPolinex Source Restoration

This repository contains the managed-source reconstruction of a Minecraft 26.1.2 Fabric mod. The goal is to restore its original features in source developers can build, modify, and run. The project is ongoing; source counts, compilation, and static matches do not establish feature equivalence.

<p align="center">
  <a href="README.md"><img src="https://img.shields.io/badge/语言-简体中文-lightgrey?style=for-the-badge" alt="Switch to Chinese"></a>
  <a href="README_EN.md"><img src="https://img.shields.io/badge/Language-English-blue?style=for-the-badge" alt="English"></a>
</p>

## Current progress (2026-11-19)

The current slice is **R1955: Pathfinder route conversion and its step/collision helpers**.

- **A* search and candidate nodes:** R1947 restored the candidate-node gate, traversal, and null contract against complete original bytecode. R1948 corrected A* node-allocation order and the compiled form of its `Function2` callback. Existing full-tree compilation with Temurin 25 passed with exit code 0.
- **Cache-loading gate:** R1949 compared the complete cache-loader bytecode and scanned all 5,475 classes in the original JAR with no parse errors. Gate-setter call sites are identified. Actual cache-file reads and writes remain unverified.
- **Pure-Java pathfinding layer:** R1951 compared all 25 `NativePathFinder` methods with the class compiled from current source. An isolated classloader probe matched original and current outputs and cache side effects across 31 fixtures. Seven methods have a different compiled control-flow shape; finite samples do not establish full-domain or in-game equivalence.
- **Actual call sites:** R1952 scanned 5,475 original-JAR classes and 2,823 compiled classes, with zero parse errors in either set. The same event consumer has matching direct targets for three `BlockPos` API methods. Their execution through normal in-game events has not been verified.
- **Route entry and cache writes:** R1954 compared the complete original/current bytecode for `a(long[], double, double, boolean): List` and the cache writer `(int, int, ByteBuffer): void`. The entry gate, empty-level path, smoothing call order, cache-directory gate, data header, file options, write loop, and close path showed no confirmed mismatch. An apparent directory mismatch came from misreading the JVM operand stack; the temporary edit was reverted and the Java source fingerprint remains `a23ce38f…`. The Gradle `build` command passed under Temurin 25 with exit code 0; no production source changed.
- **Current route slice:** R1955 is comparing the complete `a(long[], double, double, ClientLevel): List` method and its direct step/collision helpers, including branches, fields, call targets, and side effects. World/entity behavior still needs a valid Minecraft scenario through a normal user entry point.
- **Runtime acceptance:** Routes, collisions, and cache reads/writes have not passed verification through a valid Minecraft world and normal player entry point. No compatible-server acceptance has been completed. Static restoration, sample probes, and compilation do not replace these checks.
- **ClickGUI:** A same-process vanilla Options comparison showed working keyboard and scroll input, with no observable mouse feedback from category icons or the Draw control. Screen event forwarding, hit testing, module toggling, and settings save/reload remain open.
- **Other features:** Initialization, Powder Macro, Glacite Commission Macro, rendering, configuration, and networking still have incomplete restoration or acceptance. Real-server login, interaction, disconnect, and reconnect remain unverified.

## Handoff and evidence

- [Current short handoff](.analysis/reports/RESUME.md)
- [Latest Pathfinder sync record (2026-11-19)](.analysis/reports/SYNC-20261119-PATHFINDER-R1954.json)
- Published snapshots: private `openpolinex` branch `codex/handoff-progress-2026-11-15` (`bca0564`) and public `PolinexClient-Reborn` `main` (`3c36a2a`).
- [R1954 route-entry and cache-write review](.analysis/evidence/mining/r1954-route-converter-cache-exception/manifest.json)
- [R1947 candidate-node audit](.analysis/evidence/mining/r1947-pathfinder-candidate-null-contract/manifest.json)
- [R1948 A* core audit](.analysis/evidence/mining/r1948-pathfinder-a-star-core-audit/manifest.json)
- [R1949 cache-loader audit](.analysis/evidence/mining/r1949-pathfinder-cache-loader/manifest.json)
- [R1951 NativePathFinder bytecode and golden probe](.analysis/evidence/mining/r1951-native-pathfinder-implementation-audit/manifest.json)
- [R1952 actual invoke and method-handle scan](.analysis/evidence/mining/r1952-pathfinder-call-graph/manifest.json)
- [R1953 Pathfinder wrapper static review](.analysis/evidence/mining/r1953-pathfinder-wrapper-audit/manifest.json)

The current source inventory is 1,602 Java files, 1,158,787 lines, 569 lines / 581 occurrences of `PXDyn`, 7,029 `PX-FIX` markers, and 219 native declarations. Recalculate with `python -B .analysis/stats.py`; these figures describe inventory only.

The full R1954 `javap` dumps remain in the local analysis directory. The public snapshot contains method descriptors, the review summary, and dump SHA-256 values; it does not include the original JAR or protected class files.

## Build

Requires JDK 25. On Windows, enable Git long paths before cloning:

```powershell
git config --global core.longpaths true
git clone https://github.com/mythiclong/openpolinex.git
cd openpolinex/polinex-src
.\gradlew.bat build --no-daemon --console=plain
```

Existing records cover full-tree compilation with dependencies cached. A clean-checkout build, empty-cache network build, and release build remain unverified. Do not treat a machine-local cache or copied build output as a project requirement.

## Restoration notes

- Compare full bytecode by complete class name, method name, and JVM descriptor. Check fields, call targets, branches, default arguments, exceptions, and side effects.
- Validate world- and entity-dependent logic through a valid game state and normal user entry point. Invalid fixtures, inventory counts, and lack of a crash do not establish feature equivalence.
- Keep source-content SHA-256, commands and exit codes, input assertions, probe state, and necessary logs. Mark void runs and unfinished acceptance dimensions.
- This repository has no `LICENSE` and grants no rights to the original Polinex or its binaries.
