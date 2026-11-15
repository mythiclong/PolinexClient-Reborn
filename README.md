<p align="center">
  <img src="https://img.shields.io/badge/Minecraft-26.1.2-6A8E3A?logo=minecraft&logoColor=white" alt="Minecraft 26.1.2">
  <img src="https://img.shields.io/badge/Loader-Fabric-C9B89A" alt="Fabric">
  <img src="https://img.shields.io/badge/Status-Community%20handoff-orange" alt="Community handoff">
  <img src="https://img.shields.io/badge/文档-中文%20%7C%20English-blue" alt="Chinese and English">
</p>

<h1 align="center">PolinexClient-Reborn</h1>

<p align="center">Minecraft 26.1.2 Fabric 模组的源码重建与社区交接<br>Source reconstruction and community handoff for a Minecraft 26.1.2 Fabric mod</p>

<p align="center"><b>未完成项目 · 作者已停止继续源码还原 · 欢迎社区接手</b><br><b>Work in progress · Source restoration by the author has stopped · Community contributions welcome</b></p>

---

## 项目简介 / About

这里整理了 Polinex 的托管源码快照、恢复进度和可复核证据，供后续开发者继续重建。目标是恢复原有功能，并让源码可以自行构建、修改和运行。**当前仓库并不等于功能完整或行为等价的成品。**

This repository brings together a managed-source snapshot of Polinex, its restoration status, and reviewable evidence for future contributors. The goal is to recover the original features in source that can be built, modified, and run. **This is not a feature-complete or behavior-equivalent release.**

作者因精力和 token 限制，停止继续推进源码还原，把剩余工作交给愿意接手的开发者。前后累计消耗了 **30B+ DeepSeek V4.1 Flash tokens**。

The author has stopped restoration work due to limited time and token budget, and is leaving the remaining work to contributors. More than **30B DeepSeek V4.1 Flash tokens** were spent along the way.

## 当前进度 / Project status

状态快照：**2026-11-15**。下列是已有证据能支持的结论；源码库存数字不是已还原功能数。

Snapshot: **2026-11-15**. The notes below reflect available evidence. Source-inventory counts do not represent completed features.

| 范围 / Area | 当前状态 / Status |
|---|---|
| **ClickGUI** | 多页布局和字体/绘制辅助方法有静态修复及编译记录。R1871 无探针验收为 **VOID**：启动流程未到 F4 或页面断言，并记录到 `UnsatisfiedLinkError: Polinex.a(event)`；因此不能据此判定页面显示或输入已通过/失败。五页画面、控件交互及设置保存/重载仍未闭环。<br>Static fixes and compile records exist for page layout and drawing/font helpers. The R1871 no-probe acceptance was **VOID**: startup never reached F4 or page assertions and logged `UnsatisfiedLinkError: Polinex.a(event)`. It does not prove the GUI passed or failed. Page visuals, control interaction, and settings persistence remain open. |
| **OpenGL FBO** | framebuffer、program、VAO、array buffer 和 pixel-pack/unpack 状态恢复已有原版字节码对照与编译后语义检查；尚无客户端运行验收。<br>Framebuffer, program, VAO, array-buffer, and pixel-pack/unpack restoration have bytecode comparisons and post-compile semantic checks; client runtime acceptance is still missing. |
| **Glacite Commission Macro** | 注册入口和若干方法已静态恢复；`aC()` / `bs()` 等仍需完整控制流、异常和副作用对照，整项未通过正常用户路径验收。<br>Registration paths and some methods have been statically restored. `aC()` / `bs()` still need full control-flow, exception, and side-effect comparison; the feature has not passed a normal user-path acceptance. |
| **Powder Macro / Pathfinder** | 有部分源码片段和扫描/BFS/flood-fill helper；依赖有效 Minecraft 世界或实体状态的行为尚未完成实机对照。<br>Some source fragments and scan/BFS/flood-fill helpers exist. Behavior that depends on a valid Minecraft world or entities has not been compared in-game. |
| **整体验收 / Overall** | 干净 checkout 的发布构建、完整功能等价和真实兼容服务器的登录/交互/断开/重连均未通过验收。<br>A release build from a clean checkout, full feature equivalence, and login/interact/disconnect/reconnect against a compatible live server have not been accepted. |

截至该快照的源码库存记录：**1602** 个 Java 文件、**1,159,472** 行、**622** 处 `PXDyn`、**7075** 个 `PX-FIX` 标记、**220** 个 native 声明。这些数字仅帮助定位工作，不衡量功能完成度。

Source inventory at this snapshot: **1,602** Java files, **1,159,472** lines, **622** `PXDyn` occurrences, **7,075** `PX-FIX` markers, and **220** native declarations. These figures help locate work; they do not measure feature completion.

## 构建 / Build

需要 **JDK 25**。Windows 上仓库含有很长的混淆类名，克隆前可启用 Git 长路径：

Requires **JDK 25**. This repository contains very long obfuscated class names; on Windows, enable Git long paths before cloning:

```powershell
git config --global core.longpaths true
git clone https://github.com/mythiclong/PolinexClient-Reborn.git
cd PolinexClient-Reborn/polinex-src
.\gradlew.bat build --no-daemon --console=plain
```

现有记录包含依赖缓存环境中的全树编译通过；**干净 checkout、空缓存和正式发布构建尚未确认**。首次构建需要网络下载 Gradle 和项目依赖。预期产物位于 `polinex-src/build/libs/`。

Existing records include successful full-source compilation with dependencies cached. **A clean-checkout build, empty-cache build, and release build are not yet confirmed.** The first build needs network access to download Gradle and project dependencies. The expected artifact is under `polinex-src/build/libs/`.

## 交接资料 / Handoff documents

- [当前短交接 / Current resume](.analysis/reports/RESUME.md)
- [详细交接 / Detailed handoff](.analysis/reports/HANDOFF-20261115.md)
- [FBO 状态恢复记录 / FBO restoration report](.analysis/reports/FBO-STATE-RESTORE.md)
- [R1871 去标识化机器记录 / Sanitized R1871 record](.analysis/evidence/clickgui/r1871-five-pages-no-probe/runtime-public.json)
- [贡献说明 / Contribution notes](CONTRIBUTING.md)

## 接手须知 / Notes for contributors

- 原始 jar 是行为对照依据，但没有包含在仓库中。请只使用自己合法持有、获授权的文件；不要把原始 jar、受保护 class 或未恢复的 JNI 载荷当作源码实现提交。
- 对照方法时记录完整类名、方法名和 JVM descriptor，并核对字段、调用目标、分支、默认参数、异常与副作用。编译通过或标记减少不等于功能等价。
- 依赖 Minecraft 世界/实体的逻辑应在有效游戏状态和正常入口下验证。留下最小机器记录，并说明 VOID、环境噪声和未完成项。
- 快照中的 `fabric.mod.json` 仍引用未随仓库提供的 `occlusionculling-0.0.8-SNAPSHOT.jar`。该嵌套包原本含有 7 个 `me/octo/client` 类，其中 1 个尚无对应源码；因此当前快照的客户端加载状态也未验证。
- 仓库没有 `LICENSE`。请勿将本仓库理解为原始 Polinex 或其二进制文件的授权声明。

- The original jar is the behavioral reference, but it is not included. Use only files you are legally authorized to access; do not submit the original jar, protected classes, or unrecovered JNI payloads as source implementations.
- Record the full class name, method name, and JVM descriptor when comparing methods. Check fields, call targets, branches, default arguments, exceptions, and side effects. Compilation or a lower marker count does not establish behavioral equivalence.
- Validate world/entity-dependent logic through valid game state and normal entry points. Keep minimal machine-readable evidence and label VOID runs, environment noise, and unfinished work.
- The snapshot's `fabric.mod.json` still references `occlusionculling-0.0.8-SNAPSHOT.jar`, which is not included. The original nested package contained seven `me/octo/client` classes, one of which has no corresponding source; client loading from this snapshot is therefore unverified.
- This repository has no `LICENSE`. It does not grant permission to use or redistribute the original Polinex or its binaries.

## 致谢 / Thanks

感谢鲨鱼神（QQ：1127367472）破解 Polinex。感谢猪圈中转站；如果你想使用，可以用我的[邀请码注册](https://api.pigcode.org/register?invite=N9SM4PWP)。

Thanks to 鲨鱼神 (QQ: 1127367472) for cracking Polinex. Thanks to 猪圈中转站. If you would like to try it, you can [register with my invite link](https://api.pigcode.org/register?invite=N9SM4PWP).

使用过的模型 / Models used: **DeepSeek V4 Flash**, **DeepSeek V4.1 Flash**, **DeepSeek V4 Pro**, **Kimi K3**, **Kimi K3.1 Pro**, **Opus 5.5**, **Opus 4.8**, **GPT-6 Luna**, **GPT-6 Sol**, **GPT-6.1 Sol**, **GPT-6.1 Terra**.

---

<p align="center">如果你愿意接手，请从一项边界清楚、能留下行为证据的小任务开始。<br>If you want to continue, start with a small, clearly scoped task that can produce behavioral evidence.</p>
