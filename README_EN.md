<p align="center">
  <img src="https://img.shields.io/badge/Minecraft-26.1.2-6A8E3A?logo=minecraft&logoColor=white" alt="Minecraft 26.1.2">
  <img src="https://img.shields.io/badge/Loader-Fabric-C9B89A" alt="Fabric">
  <img src="https://img.shields.io/badge/Status-Community%20handoff-orange" alt="Community handoff">
</p>

<p align="center">
  <a href="README.md"><img src="https://img.shields.io/badge/Language-Chinese-lightgrey?style=for-the-badge" alt="Switch to Chinese"></a>
  <a href="README_EN.md"><img src="https://img.shields.io/badge/Language-English-blue?style=for-the-badge" alt="English"></a>
</p>

<h1 align="center">PolinexClient-Reborn</h1>

<p align="center">Source reconstruction and community handoff for a Minecraft 26.1.2 Fabric mod</p>
<p align="center"><b>Work in progress · The author has stopped source restoration · Community contributions welcome</b></p>

---

## About

This repository brings together a managed-source snapshot of Polinex, its restoration status, and reviewable evidence for future contributors. The goal is to recover the original features in source that can be built, modified, and run. **This is not a feature-complete or behavior-equivalent release.**

The author has stopped restoration work due to limited time and token budget, and is leaving the remaining work to contributors. More than **30B DeepSeek V4.1 Flash tokens** were spent along the way.

## Project status

Snapshot: **2026-11-16**. The notes below reflect available evidence. Source-inventory counts do not represent completed features.

| Area | Current status |
|---|---|
| **Initialization event** | The entry checks, state 17/21, and parts of the state 7/8 and exception paths in `Polinex.a(E_CLIENT_INITIALIZED)` are mapped statically; the native handler has not been restored to managed source. R1909 found all 15 state-7 constructors mismatching the original bytecode; the cause remains under investigation. |
| **ClickGUI** | Static fixes and compile records exist for page layout and drawing/font helpers. The R1871 no-probe acceptance was **VOID**: startup never reached F4 or page assertions and logged `UnsatisfiedLinkError: Polinex.a(event)`. It does not prove the GUI passed or failed. Page visuals, control interaction, and settings persistence remain open. |
| **OpenGL FBO** | Framebuffer, program, VAO, array-buffer, and pixel-pack/unpack restoration have original-bytecode comparisons and post-compile semantic checks; client runtime acceptance is still missing. |
| **Glacite Commission Macro** | Registration paths and some methods have been statically restored. `aC()` / `bs()` still need full control-flow, exception, and side-effect comparison; the feature has not passed a normal user-path acceptance. |
| **Powder Macro / Pathfinder** | Some source fragments and scan/BFS/flood-fill helpers exist. Behavior that depends on a valid Minecraft world or entities has not been compared in-game. |
| **Overall acceptance** | A release build from a clean checkout, full feature equivalence, and login/interact/disconnect/reconnect against a compatible live server have not been accepted. |

Source inventory at this snapshot: **1,602** Java files, **1,159,513** lines, **620** `PXDyn` occurrences, **7,075** `PX-FIX` markers, and **219** native declarations. These figures help locate work; they do not measure feature completion. Recalculate them with `python -B .analysis/stats.py`.

## Build

Requires **JDK 25**. This repository contains very long obfuscated class names; on Windows, enable Git long paths before cloning:

```powershell
git config --global core.longpaths true
git clone https://github.com/mythiclong/PolinexClient-Reborn.git
cd PolinexClient-Reborn/polinex-src
.\gradlew.bat build --no-daemon --console=plain
```

Existing records include successful full-source compilation with dependencies cached. **A clean-checkout build, empty-cache build, and release build are not yet confirmed.** The first build needs network access to download Gradle and project dependencies. The expected artifact is under `polinex-src/build/libs/`.

## Handoff documents

- [Current resume](.analysis/reports/RESUME.md)
- [R1909 initialization constructor comparison](.analysis/reports/R1909-state7-constructor-source-bytecode-comparison.json)
- [Detailed handoff](.analysis/reports/HANDOFF-20261115.md)
- [FBO restoration report](.analysis/reports/FBO-STATE-RESTORE.md)
- [Sanitized R1871 machine record](.analysis/evidence/clickgui/r1871-five-pages-no-probe/runtime-public.json)
- [Contribution notes](CONTRIBUTING.md)

## Notes for contributors

- The repository root includes `rawpolinex.jar` (SHA-256 `D85398CFD774781E888A3F36CFBFA87A4CF04235F8459BB6A00437A5D3C48A26`), byte-identical to the `.analysis/cracked.jar` used for this analysis. It is a behavioral input, not a managed-source implementation; protected classes and unrecovered JNI payloads must not be presented as source.
- Record the full class name, method name, and JVM descriptor when comparing methods. Check fields, call targets, branches, default arguments, exceptions, and side effects. Compilation or a lower marker count does not establish behavioral equivalence.
- Validate world/entity-dependent logic through valid game state and normal entry points. Keep minimal machine-readable evidence and label VOID runs, environment noise, and unfinished work.
- The snapshot's `fabric.mod.json` still references `occlusionculling-0.0.8-SNAPSHOT.jar`, which is not included. The original nested package contained seven `me/octo/client` classes, one of which has no corresponding source; client loading from this snapshot is therefore unverified.
- This repository has no `LICENSE`. It does not grant permission to use or redistribute the original Polinex or its binaries.

## Thanks

Thanks to 鲨鱼神 (QQ: 1127367472) for cracking Polinex. Thanks to 猪圈中转站. If you would like to try it, you can [register with my invite link](https://api.pigcode.org/register?invite=N9SM4PWP).

Models used: **DeepSeek V4 Flash**, **DeepSeek V4.1 Flash**, **DeepSeek V4 Pro**, **Kimi K3**, **Kimi K3.1 Pro**, **Opus 5.5**, **Opus 4.8**, **GPT-6 Luna**, **GPT-6 Sol**, **GPT-6.1 Sol**, **GPT-6.1 Terra**.

---

<p align="center">If you want to continue, start with a small, clearly scoped task that can produce behavioral evidence.</p>
