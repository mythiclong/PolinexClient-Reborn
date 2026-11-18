<p align="center">
  <img src="https://img.shields.io/badge/Minecraft-26.1.2-6A8E3A?logo=minecraft&logoColor=white" alt="Minecraft 26.1.2">
  <img src="https://img.shields.io/badge/Loader-Fabric-C9B89A" alt="Fabric">
  <img src="https://img.shields.io/badge/Status-Active%20restoration-orange" alt="Active restoration">
</p>

<p align="center">
  <a href="README.md"><img src="https://img.shields.io/badge/语言-简体中文-lightgrey?style=for-the-badge" alt="Switch to Chinese"></a>
  <a href="README_EN.md"><img src="https://img.shields.io/badge/Language-English-blue?style=for-the-badge" alt="English"></a>
</p>

<h1 align="center">PolinexClient-Reborn</h1>

<p align="center">Source reconstruction and community collaboration for a Minecraft 26.1.2 Fabric mod</p>
<p align="center"><b>Restoration is ongoing · Pathfinder is the current priority</b></p>

---

## About

This repository contains a managed-source snapshot of Polinex, restoration progress, and reviewable evidence. The goal is to recover the original features in source that developers can build, modify, and run. The project is unfinished; source counts and successful compilation do not establish feature equivalence.

I previously planned to leave the remaining work to the community because of limited time and token budget. I am now continuing the Pathfinder source restoration, and contributors are welcome to take on small, verifiable slices. More than **30B DeepSeek V4.1 Flash tokens** were spent along the way.

## Project status

Snapshot: **2026-11-18**. Each claim is limited to the evidence linked below; source inventory is not a feature-completion metric.

| Area | Current status |
|---|---|
| **Pathfinder A\*** | R1947 restores candidate-node and null-contract behavior against complete original bytecode. R1948 fixes A* node-allocation order and the compiled form of its `Function2` callback. Full-tree `compileJava --rerun-tasks --no-daemon` passed with Temurin 25, exit code 0. |
| **Pathfinder cache** | R1949 compares the complete loader bytecode and scans all 5,475 classes in the original JAR with no parse errors. The gate setter calls in class initialization and the cache-constructor branch are identified. Actual cache-file loading has not been tested. |
| **Pathfinder pure-Java layer** | R1951 compares all 25 `NativePathFinder` methods and uses isolated classloaders to compare 31 original/current outputs and cache side effects; all matched. Seven methods have a different compiled control-flow shape, so finite samples do not establish full-domain equivalence. |
| **Pathfinder call sites** | R1952 scans 5,475 original-JAR classes and 2,823 compiled classes with zero parse errors. The same event consumer has matching direct targets for three `BlockPos` API methods. Normal in-game event execution remains unverified. |
| **Pathfinder runtime acceptance** | No acceptance yet for a valid client world, normal player entry point, collision/route output, or cache reads and writes. It has not been verified on a compatible server. Static restoration and compilation do not replace these checks. |
| **ClickGUI** | A same-process vanilla Options comparison records working keyboard and scroll input, with no observable mouse response from category icons or the Draw control. Screen event forwarding, control hit-testing, and leaf controls still need inspection; module toggling and settings save/reload are open. |
| **Other features** | Initialization, Powder Macro, Glacite Commission Macro, rendering, configuration, and networking still have incomplete restoration or acceptance. Login, interaction, disconnect, and reconnect against a real compatible server have not passed. |

Source inventory: **1,602** Java files, **1,158,787** lines, **569** lines / **581** occurrences of `PXDyn`, **7,029** `PX-FIX` markers, and **219** native declarations. Recalculate with `python -B .analysis/stats.py`. These figures only describe the source inventory.

## Build

Requires **JDK 25**. This repository has very long obfuscated class names; on Windows, enable Git long paths before cloning:

```powershell
git config --global core.longpaths true
git clone https://github.com/mythiclong/PolinexClient-Reborn.git
cd PolinexClient-Reborn/polinex-src
.\gradlew.bat build --no-daemon --console=plain
```

Existing records include full-source compilation with dependencies cached. A clean-checkout build, empty-cache network build, and release build are not yet confirmed. The first build downloads Gradle and project dependencies. The expected artifact is under `polinex-src/build/libs/`.

## Handoff and evidence

- [Current short handoff](.analysis/reports/RESUME.md)
- [2026-11-18 latest Pathfinder sync record](.analysis/reports/SYNC-20261118-PATHFINDER-R1951-R1952.json)
- [R1947 candidate-node and null-contract audit](.analysis/evidence/mining/r1947-pathfinder-candidate-null-contract/manifest.json)
- [R1948 A* core audit](.analysis/evidence/mining/r1948-pathfinder-a-star-core-audit/manifest.json)
- [R1949 cache loader and gate call sites](.analysis/evidence/mining/r1949-pathfinder-cache-loader/manifest.json)
- [Reproducible original-JAR call-site scanner](.analysis/evidence/mining/r1949-pathfinder-cache-loader/verify_gate_state_owner.py)
- [R1951 NativePathFinder original comparison and golden probe](.analysis/evidence/mining/r1951-native-pathfinder-implementation-audit/manifest.json)
- [R1952 actual invoke and method-handle call scan](.analysis/evidence/mining/r1952-pathfinder-call-graph/manifest.json)
- [Contribution notes](CONTRIBUTING.md)

## Contributing

- Compare full bytecode using the complete class name, method name, and JVM descriptor. Check fields, call targets, branches, default arguments, exceptions, and side effects.
- Validate world- or entity-dependent logic through a valid game state and normal entry point. Invalid fixtures, marker counts, successful startup, or lack of a crash do not establish behavior equivalence.
- Keep source-content SHA-256, commands and exit codes, inputs/assertions, probe state, and necessary logs. Label VOID runs and unfinished acceptance dimensions.
- Do not replace managed-source implementation with protected original classes or unrecovered JNI payloads.

## Notes

The repository root includes `rawpolinex.jar` (SHA-256 `D85398CFD774781E888A3F36CFBFA87A4CF04235F8459BB6A00437A5D3C48A26`) as a local behavioral reference; it does not replace managed source. This repository has no `LICENSE` and grants no rights to the original Polinex or its binaries.

## Thanks

Thanks to 鲨鱼神 (QQ: 1127367472) for cracking Polinex. Thanks to 猪圈中转站. If you would like to try it, you can [register with my invite link](https://api.pigcode.org/register?invite=N9SM4PWP).

Models used: DeepSeek V4 Flash, DeepSeek V4.1 Flash, DeepSeek V4 Pro, Kimi K3, Kimi K3.1 Pro, Opus 5.5, Opus 4.8, GPT-6 Luna, GPT-6 Sol, GPT-6.1 Sol, and GPT-6.1 Terra.

---

<p align="center">Community contributions are welcome; start with one clearly scoped task that can produce behavioral evidence.</p>
