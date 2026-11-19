# OpenPolinex Source Restoration

This repository contains the managed-source reconstruction of a Minecraft 26.1.2 Fabric mod. The goal is to restore its original features in source developers can build, modify, and run. The project is ongoing; source counts, compilation, and static matches do not establish feature equivalence.

<p align="center">
  <a href="README.md"><img src="https://img.shields.io/badge/语言-简体中文-lightgrey?style=for-the-badge" alt="Switch to Chinese"></a>
  <a href="README_EN.md"><img src="https://img.shields.io/badge/Language-English-blue?style=for-the-badge" alt="English"></a>
</p>

## Current progress (2026-11-19 UTC; Chicago local date: 2026-11-19)

The current slice is **R1969: Pathfinder `d(List): void`**. All three original call sites are mapped: offsets 1180 and 1420 in the route-event consumer, and offset 98 in `a(List, boolean): void`. The current method is still a single return; reconstruct its full branches and side effects next.

- **A* search and candidate nodes:** R1947 restored the candidate-node gate, traversal, and null contract against complete original bytecode. R1948 corrected node-allocation order and the compiled `Function2` callback form.
- **Route and collision helpers:** R1955 repaired both `0.5625`/NaN branches in route conversion and restored the gate, call order, and fallback in `g(BlockPos)`. The full-tree Gradle `build` passed under Temurin 25.
- **R1956 collision-gate review:** The original `$llII…` and current `$PXEvMid` names refer to the same source-renamed state holder. Getter, setter, initialization, and `a(BlockPos, ClientLevel): boolean` showed no confirmed semantic mismatch. Valid-world collision behavior is still unverified.
- **R1957–R1961 `NativePathFinder` differential checks:** Original and current compiled classes matched in isolated classloaders for all 256 inputs to `normalizeState(B)B`, 2,049 `processChunk` lengths, 2,049 `loadCache` lengths, 34,324 `updateChunk` boundary combinations, and 384 `updateHeights` boundary/signed-short fixtures. Each check compared actual cache side effects; see the manifests for precise limits.
- **R1962 `isWalkable` / `findPath`:** Complete descriptor-level static review found no confirmed mismatch. An isolated-classloader differential covered 98,304 cases across all 512 blocked-cell masks on a bounded 3×3 grid, movement modes, 12 node limits, and 8 float arguments. The retained output says PASS, but the exact invocation and process exit code were not preserved; see the manifest for limits.
- **R1963 route API branch correction:** Full operand-stack review shows that the original retains `arraylength` across the gate branch. It returns null when `gate=0 && route.length>0` or `gate!=0 && route.length=0`; only the other two combinations invoke the converter. The earlier claim that an empty route with nonzero gate reaches the converter is withdrawn. Current source and compiled bytecode match the original branch and call behavior. Independent static review found no other confirmed mismatch in `b(Entity): BlockPos`.
- **R1964 normal route-event consumer:** Fixed x/y/z and `option` parsing that previously cast each configuration value to `String[]` before checking its type. The current source performs the original `Integer`/`String` `instanceof` guard before casting. The seven mode branches retain their Pathfinder call targets and eight state-write targets/order. This is a static bytecode finding; the event was not exercised in-game.
- **R1965 Pathfinder `/pathfind` command entry:** At offset 127 of the original provider method, the complete bytecode captures the provider and binds a `Function1` to the existing `a(Self, RouteContext): Unit` route helper. The managed source previously passed null; the original builder throws `IllegalArgumentException` when both executor and subcommands are absent. A callable closure to the same helper is now restored. The final Java class invokes it through a synthetic adapter; this is not a claim that its bootstrap shape is byte-for-byte identical to the Kotlin original. See the [R1965 static review and build evidence](.analysis/evidence/mining/r1965-pathfind-command-executor/manifest.json).
- **Scope of this batch:** One Pathfinder command-provider source was corrected; a full Temurin 25 `build --rerun-tasks` succeeded. The first attempt inherited Java 17 through `JAVA_HOME` and failed during Gradle configuration before source compilation; explicitly selecting Temurin 25 passed. No Minecraft client, normal command dispatch, valid world, or compatible server was used.
- **R1966 Pathfinder tick executor:** Restored one `a(PathNode, List): void` method. The complete original CFG filters the route suffix, calls `a(List,false)` under its gate condition, skips target-facing input when that helper runs with a non-null sentinel, and reads option 150 on non-early-return paths before choosing sneak. The final exact-source full-tree `build --rerun-tasks` passed. Two intermediate builds had passed before full branch review exposed evaluation-order/gate differences; they are retained but are not final validation. No direct probe, normal player path, valid world, or compatible server was tested. See the [R1966 evidence](.analysis/evidence/mining/r1966-pathfinder-executor-reconstruction/manifest.json).
- **R1967 Pathfinder history predicate `q(): boolean`:** Restored the complete original `()Z` control flow over the latest eight records. It counts positive/negative classifications and only counts a direction change after a prior nonzero classification; the three counters must each reach two for `true`. The restoration preserves the gate-null index/early-exit branch, list element null check, and the `a()`/`d()` getter targets. The first original differential exposed an incorrect assumption that the initial nonzero value counted as a direction change; the implementation was corrected from the original CFG. The final isolated-classloader differential passed all **65,536** combinations of eight boolean record pairs and 0–9-entry boundaries with both null and non-null guards. A Temurin 25 full-tree `build --rerun-tasks` also passed. The probe used no Minecraft world; normal player path, valid-world, and server behavior remain unverified. See the [R1967 evidence](.analysis/evidence/mining/r1967-pathfinder-history-predicate/manifest.json).
- **R1968 Pathfinder entity-route handling:** Restored `a(Entity, List, Vec3): void` from the complete original descriptor/CFG: collision/jam counting, configured threshold and timer gate, exact route-request overload with `(false, true)`, success-only timer/counter side effects, and conditional GhostPath message. The Temurin 25 full-tree `build --rerun-tasks` passed. This method depends on a real player and world-collision helpers; no invalid null/plain-object probe or in-game/server acceptance was claimed. All three original `d(List)` call sites are mapped. See the [R1968 static review and build evidence](.analysis/evidence/mining/r1968-pathfinder-entity-route/manifest.json).
- **Current R1969 gap:** `d(List): void` still compiles to a single return while the original has a full implementation. Its three original invoke sites are event-consumer offsets 1180/1420 and `a(List, boolean):void` offset 98. Reconstruct its full branches and state/input side effects next.
- **Open acceptance:** Pathfinder through its normal player entry point, routes/collisions in a valid world, on-disk cache lifecycle, and compatible-server behavior remain unverified. Offline comparisons do not replace in-game acceptance.
- **ClickGUI:** A same-process vanilla Options comparison showed working keyboard and scroll input, but no observable mouse feedback from category icons or the Draw control. Event forwarding, hit testing, module toggling, and settings persistence remain open.
- **Other features:** Initialization, Powder Macro, Glacite Commission Macro, rendering, configuration, networking, and native/JNIC still have incomplete restoration or acceptance. Real-server login, interaction, disconnect, and reconnect remain unverified.

### Latest handoff and evidence

- [Current short handoff](.analysis/reports/RESUME.md)
- [R1966 Pathfinder tick-executor static review and full-tree build](.analysis/evidence/mining/r1966-pathfinder-executor-reconstruction/manifest.json)
- [R1967 Pathfinder history predicate bytecode review, differential, and full-tree build](.analysis/evidence/mining/r1967-pathfinder-history-predicate/manifest.json)
- [R1968 Pathfinder entity-route static review and full-tree build](.analysis/evidence/mining/r1968-pathfinder-entity-route/manifest.json)
- [R1966 dual-repository sync record](.analysis/reports/SYNC-20261119-PATHFINDER-R1966.json): private content commit `21ec44f`, public `PolinexClient-Reborn/main` content commit `624128b`; both refs were verified after push.
- [R1965 Pathfinder command executor callback repair](.analysis/evidence/mining/r1965-pathfind-command-executor/manifest.json)
- [R1965 dual-repository sync record](.analysis/reports/SYNC-20261119-PATHFINDER-R1965.json): source and evidence were fast-forwarded to private `openpolinex` at `b502476` and public `PolinexClient-Reborn` at `2fff92a`; both remote refs were verified.
- [R1962–R1963 dual-repository sync record](.analysis/reports/SYNC-20261119-PATHFINDER-R1962-R1963.json)
- [R1963–R1964 current evidence and dual-repository sync](.analysis/reports/SYNC-20261119-PATHFINDER-R1963-R1964.json): private `67ded95` / public `6d79cfd`.
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

The current source inventory is 1,602 Java files, 1,158,598 lines, 569 lines / 581 occurrences of `PXDyn`, 7,029 `PX-FIX` markers, and 219 native declarations. Recalculate with `python -B .analysis/stats.py`; these figures describe inventory only.

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
