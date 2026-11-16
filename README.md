<p align="center">
  <img src="https://img.shields.io/badge/Minecraft-26.1.2-6A8E3A?logo=minecraft&logoColor=white" alt="Minecraft 26.1.2">
  <img src="https://img.shields.io/badge/加载器-Fabric-C9B89A" alt="Fabric">
  <img src="https://img.shields.io/badge/状态-社区交接-orange" alt="社区交接">
</p>

<p align="center">
  <a href="README.md"><img src="https://img.shields.io/badge/%E8%AF%AD%E8%A8%80-%E4%B8%AD%E6%96%87-blue?style=for-the-badge" alt="简体中文"></a>
  <a href="README_EN.md"><img src="https://img.shields.io/badge/Language-English-lightgrey?style=for-the-badge" alt="切换到英文"></a>
</p>

<h1 align="center">PolinexClient-Reborn</h1>

<p align="center">Minecraft 26.1.2 Fabric 模组的源码重建与社区交接</p>
<p align="center"><b>项目尚未完成 · 作者已停止继续源码还原 · 欢迎社区接手</b></p>

---

## 项目简介

这里整理了 Polinex 的托管源码快照、恢复进度和可复核证据，供后续开发者继续重建。目标是恢复原有功能，并让源码可以自行构建、修改和运行。**当前仓库并不等于功能完整或行为等价的成品。**

我因精力和 token 限制，停止继续推进源码还原，把剩余工作交给愿意接手的开发者。前后累计消耗了 **30B+ DeepSeek V4.1 Flash tokens**。

## 当前进度

状态快照：**2026-11-16**。下列是已有证据能支持的结论；源码库存数字不是已还原功能数。

| 范围 | 当前状态 |
|---|---|
| **启动事件** | `Polinex.a(E_CLIENT_INITIALIZED)` 的入口检查、状态 17/21 和部分状态 7/8/异常路径已静态映射；native 处理器尚未恢复为托管源码。R1909 的 15 个状态 7 构造器在原版/编译字节码比较中全部不匹配，原因待查。 |
| **ClickGUI** | 多页布局和字体/绘制辅助方法有静态修复及编译记录。R1871 无探针验收为 **VOID**：启动流程未到 F4 或页面断言，并记录到 `UnsatisfiedLinkError: Polinex.a(event)`；因此不能据此判定页面显示或输入已通过/失败。五页画面、控件交互及设置保存/重载仍未闭环。 |
| **OpenGL FBO** | framebuffer、program、VAO、array buffer 和 pixel-pack/unpack 状态恢复已有原版字节码对照与编译后语义检查；尚无客户端运行验收。 |
| **Glacite Commission Macro** | 注册入口和若干方法已静态恢复；`aC()` / `bs()` 等仍需完整控制流、异常和副作用对照，整项未通过正常用户路径验收。 |
| **Powder Macro / Pathfinder** | 有部分源码片段和扫描/BFS/flood-fill helper；依赖有效 Minecraft 世界或实体状态的行为尚未完成实机对照。 |
| **整体验收** | 干净 checkout 的发布构建、完整功能等价和真实兼容服务器的登录/交互/断开/重连均未通过验收。 |

截至该快照的源码库存记录：**1602** 个 Java 文件、**1,159,513** 行、**620** 处 `PXDyn`、**7075** 个 `PX-FIX` 标记、**219** 个 native 声明。这些数字仅帮助定位工作，不衡量功能完成度；可运行 `python -B .analysis/stats.py` 复算。

## 构建

需要 **JDK 25**。Windows 上仓库含有很长的混淆类名，克隆前可启用 Git 长路径：

```powershell
git config --global core.longpaths true
git clone https://github.com/mythiclong/PolinexClient-Reborn.git
cd PolinexClient-Reborn/polinex-src
.\gradlew.bat build --no-daemon --console=plain
```

现有记录包含依赖缓存环境中的全树编译通过；**干净 checkout、空缓存和正式发布构建尚未确认**。首次构建需要网络下载 Gradle 和项目依赖。预期产物位于 `polinex-src/build/libs/`。

## 交接资料

- [当前短交接](.analysis/reports/RESUME.md)
- [R1909 启动事件构造器比较](.analysis/reports/R1909-state7-constructor-source-bytecode-comparison.json)
- [详细交接](.analysis/reports/HANDOFF-20261115.md)
- [FBO 状态恢复记录](.analysis/reports/FBO-STATE-RESTORE.md)
- [R1871 去标识化机器记录](.analysis/evidence/clickgui/r1871-five-pages-no-probe/runtime-public.json)
- [贡献说明](CONTRIBUTING.md)

## 接手须知

- 仓库根目录包含 `rawpolinex.jar`，SHA-256 为 `D85398CFD774781E888A3F36CFBFA87A4CF04235F8459BB6A00437A5D3C48A26`，与本轮分析使用的 `.analysis/cracked.jar` 完全相同。它是行为对照输入，不能替代托管源码；受保护 class 和未恢复的 JNI 载荷也不能冒充源码实现。
- 对照方法时记录完整类名、方法名和 JVM descriptor，并核对字段、调用目标、分支、默认参数、异常与副作用。编译通过或标记减少不等于功能等价。
- 依赖 Minecraft 世界/实体的逻辑应在有效游戏状态和正常入口下验证。留下最小机器记录，并说明 VOID、环境噪声和未完成项。
- 快照中的 `fabric.mod.json` 仍引用未随仓库提供的 `occlusionculling-0.0.8-SNAPSHOT.jar`。该嵌套包原本含有 7 个 `me/octo/client` 类，其中 1 个尚无对应源码；因此当前快照的客户端加载状态也未验证。
- 仓库没有 `LICENSE`。请勿将本仓库理解为原始 Polinex 或其二进制文件的授权声明。

## 致谢

感谢鲨鱼神（QQ：1127367472）破解 Polinex。感谢猪圈中转站；如果你想使用，可以用我的[邀请码注册](https://api.pigcode.org/register?invite=N9SM4PWP)。

使用过的模型：**DeepSeek V4 Flash**、**DeepSeek V4.1 Flash**、**DeepSeek V4 Pro**、**Kimi K3**、**Kimi K3.1 Pro**、**Opus 5.5**、**Opus 4.8**、**GPT-6 Luna**、**GPT-6 Sol**、**GPT-6.1 Sol**、**GPT-6.1 Terra**。

---

<p align="center">如果你愿意接手，请从一项边界清楚、能留下行为证据的小任务开始。</p>
