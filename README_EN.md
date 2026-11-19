# OpenPolinex Source Restoration

This repository contains the managed-source reconstruction of a Minecraft 26.1.2 Fabric mod. The goal is to restore its original features in source developers can build, modify, and run. The project is ongoing; source counts, compilation, and static matches do not establish feature equivalence.

<p align="center">
  <a href="README.md"><img src="https://img.shields.io/badge/语言-简体中文-lightgrey?style=for-the-badge" alt="Switch to Chinese"></a>
  <a href="README_EN.md"><img src="https://img.shields.io/badge/Language-English-blue?style=for-the-badge" alt="English"></a>
</p>

## Current progress (2026-11-19 UTC; Chicago local date: 2026-11-18)

The current slice is **R1965: trace Pathfinder execution state, stopping, and cache writes after the route consumer**. R1964 static type-guard repair and the full-tree build are complete; an in-game route remains unverified.

- **A* search and candidate nodes:** R1947 restored the candidate-node gate, traversal, and null contract against complete original bytecode. R1948 corrected node-allocation order and the compiled `Function2` callback form.
- **Route and collision helpers:** R1955 repaired both `0.5625`/NaN branches in route conversion and restored the gate, call order, and fallback in `g(BlockPos)`. The full-tree Gradle `build` passed under Temurin 25.
- **R1956 collision-gate review:** The original `$llII…` and current `$PXEvMid` names refer to the same source-renamed state holder. Getter, setter, initialization, and `a(BlockPos, ClientLevel): boolean` showed no confirmed semantic mismatch. Valid-world collision behavior is still unverified.
- **R1957–R1961 `NativePathFinder` differential checks:** Original and current compiled classes matched in isolated classloaders for all 256 inputs to `normalizeState(B)B`, 2,049 `processChunk` lengths, 2,049 `loadCache` lengths, 34,324 `updateChunk` boundary combinations, and 384 `updateHeights` boundary/signed-short fixtures. Each check compared actual cache side effects; see the manifests for precise limits.
- **R1962 `isWalkable` / `findPath`:** Complete descriptor-level static review found no confirmed mismatch. An isolated-classloader differential covered 98,304 cases across all 512 blocked-cell masks on a bounded 3×3 grid, movement modes, 12 node limits, and 8 float arguments. The retained output says PASS, but the exact invocation and process exit code were not preserved; see the manifest for limits.
- **R1963 route API branch correction:** Full operand-stack review shows that the original retains `arraylength` across the gate branch. It returns null when `gate=0 && route.length>0` or `gate!=0 && route.length=0`; only the other two combinations invoke the converter. The earlier claim that an empty route with nonzero gate reaches the converter is withdrawn. Current source and compiled bytecode match the original branch and call behavior. Independent static review found no other confirmed mismatch in `b(Entity): BlockPos`.
- **R1964 normal route-event consumer:** Fixed x/y/z and `option` parsing that previously cast each configuration value to `String[]` before checking its type. The current source performs the original `Integer`/`String` `instanceof` guard before casting. The seven mode branches retain their Pathfinder call targets and eight state-write targets/order. This is a static bytecode finding; the event was not exercised in-game.
- **Scope of this batch:** One route API source and one normal route-consumer source were corrected; a full Temurin 25 `build --rerun-tasks` succeeded. No Minecraft client, valid world, or compatible server was used.
- **Open acceptance:** Pathfinder through its normal player entry point, routes/collisions in a valid world, on-disk cache lifecycle, and compatible-server behavior remain unverified. Offline comparisons do not replace in-game acceptance.
- **ClickGUI:** A same-process vanilla Options comparison showed working keyboard and scroll input, but no observable mouse feedback from category icons or the Draw control. Event forwarding, hit testing, module toggling, and settings persistence remain open.
- **Other features:** Initialization, Powder Macro, Glacite Commission Macro, rendering, configuration, networking, and native/JNIC still have incomplete restoration or acceptance. Real-server login, interaction, disconnect, and reconnect remain unverified.

### Latest handoff and evidence

- [Current short handoff](.analysis/reports/RESUME.md)
- [R1962–R1963 dual-repository sync record](.analysis/reports/SYNC-20261119-PATHFINDER-R1962-R1963.json)
- [R1963–R1964 current evidence and dual-repository sync](.analysis/reports/SYNC-20261119-PATHFINDER-R1963-R1964.json)
- [R1964 normal route-consumer bytecode review and build](.analysis/evidence/mining/r1964-pathfinder-route-consumer/manifest.json)
- [R1956–R1961 dual-repository sync record](.analysis/reports/SYNC-20261119-PATHFINDER-R1956-R1961.json)
- [R1956 collision-gate static review](.analysis/evidence/mining/r1956-pathfinder-collision-gate/manifest.json)
- [R1962 `isWalkable` / A* bounded differential](.analysis/evidence/mining/r1962-pathfinder-walkability-astar-diff/manifest.json)
- [R1963 route API gate repair and entity-start static review](.analysis/evidence/mining/r1963-pathfinder-route-api-bridge/manifest.json)
- [R1957 exhaustive `normalizeState` byte-domain comparison](.analysis/evidence/mining/r1957-pathfinder-normalize-state-exhaustive/manifest.json)
- [R1958 `processChunk` boundary comparison](.analysis/evidence/mining/r1958-pathfinder-process-chunk-boundaries/manifest.json)
- [R1959 `loadCache` boundary comparison](.analysis/evidence/mining/r1959-pathfinder-load-cache-boundaries/manifest.json)
- [R1960 `updateChunk` boundary comparison](.analysis/evidence/mining/r1960-pathfinder-update-chunk-boundaries/manifest.json)
- [R1961 `updateHeights` boundary comparison](.analysis/evidence/mining/r1961-pathfinder-height-cache-boundaries/manifest.json)
- [R1955 route/height-helper repairs](.analysis/evidence/mining/r1955-pathfinder-route-converter-nan-semantics/manifest.json)
- [R1954 route entry and cache writes](.analysis/evidence/mining/r1954-route-converter-cache-exception/manifest.json)
- [R1951 initial NativePathFinder comparison](.analysis/evidence/mining/r1951-native-pathfinder-implementation-audit/manifest.json)

Recalculate source inventory with `python -B .analysis/stats.py`; counts do not establish equivalence. The original JAR SHA-256 is `d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`; it is not published. Full `javap` dumps remain local.
- [R1953 Pathfinder wrapper static review](.analysis/evidence/mining/r1953-pathfinder-wrapper-audit/manifest.json)

The current source inventory is 1,602 Java files, 1,158,787 lines, 569 lines / 581 occurrences of `PXDyn`, 7,029 `PX-FIX` markers, and 219 native declarations. Recalculate with `python -B .analysis/stats.py`; these figures describe inventory only.

The full R1954/R1955 `javap` dumps remain in the local analysis directory. The public snapshot contains method descriptors, the review summary, and dump SHA-256 values; it does not include the original JAR or protected class files.

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
