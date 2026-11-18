<p align="center">
  <img src="https://img.shields.io/badge/Minecraft-26.1.2-6A8E3A?logo=minecraft&logoColor=white" alt="Minecraft 26.1.2">
  <img src="https://img.shields.io/badge/加载器-Fabric-C9B89A" alt="Fabric">
  <img src="https://img.shields.io/badge/状态-持续还原-orange" alt="持续还原">
</p>

<p align="center">
  <a href="README.md"><img src="https://img.shields.io/badge/语言-简体中文-blue?style=for-the-badge" alt="简体中文"></a>
  <a href="README_EN.md"><img src="https://img.shields.io/badge/Language-English-lightgrey?style=for-the-badge" alt="切换到英文"></a>
</p>

<h1 align="center">PolinexClient-Reborn</h1>

<p align="center">Minecraft 26.1.2 Fabric 模组的源码重建与社区协作</p>
<p align="center"><b>仍在还原中 · 当前优先 Pathfinder 寻路源码</b></p>

---

## 项目简介

本仓库保存 Polinex 的托管源码快照、源码还原进度和可复核证据，目标是恢复原有功能，并让开发者能够自行构建、修改和运行。项目没有完成；源码数量和编译结果不代表功能等价。

此前我因精力和 token 限制，打算把剩余工作交给社区。现在继续推进 Pathfinder 源码还原，也欢迎其他开发者接手清楚、可验证的小切片。前后累计消耗了 **30B+ DeepSeek V4.1 Flash tokens**。

## 当前进度

快照日期：**2026-11-18**。结论以对应证据为准，源码库存数字不代表已恢复的功能数量。

| 范围 | 当前状态 |
|---|---|
| **Pathfinder A*** | R1947 按完整原版字节码恢复候选节点与空值契约；R1948 修正 A* 节点分配顺序和 `Function2` 回调编译形式。Temurin 25 `compileJava --rerun-tasks --no-daemon` 全树编译退出码 0。 |
| **Pathfinder 缓存** | R1949 完整对照加载器字节码，并扫描原版 JAR 的 5,475 个 class、0 个解析错误；gate setter 的类初始化及缓存构造器调用点已确认。缓存文件实际加载尚未测试。 |
| **Pathfinder 运行验收** | 尚未通过有效客户端世界、玩家入口、碰撞/路线结果和缓存读写验收，也未在兼容服务器验证。静态还原与编译不能替代这些结果。 |
| **ClickGUI** | 同进程原版 Options 对照记录显示键盘和滚轮有效，分类图标及 Draw 控件没有可观察的鼠标反馈。内部 Screen 事件转发、控件命中和叶子控件仍需核对；模块开关及设置保存/重载未闭环。 |
| **其他功能** | 初始化事件、Powder Macro、Glacite Commission Macro、渲染、配置和网络等仍有未恢复或未验收部分。真实服务器登录、交互、断开和重连未通过验收。 |

源码库存：**1,602** 个 Java 文件、**1,158,787** 行、**569** 行 / **581** 处 `PXDyn`、**7,029** 个 `PX-FIX` 标记、**219** 个 native 声明。可运行 `python -B .analysis/stats.py` 复算；这些数字仅用于定位源码工作量。

## 构建

需要 **JDK 25**。仓库包含很长的混淆类名，Windows 克隆前可启用 Git 长路径：

```powershell
git config --global core.longpaths true
git clone https://github.com/mythiclong/PolinexClient-Reborn.git
cd PolinexClient-Reborn/polinex-src
.\gradlew.bat build --no-daemon --console=plain
```

已有记录覆盖依赖缓存环境中的全树编译。干净 checkout、空缓存网络构建和正式发布构建尚未确认；首次构建需要下载 Gradle 和依赖。产物预期位于 `polinex-src/build/libs/`。

## 交接与证据

- [当前短交接](.analysis/reports/RESUME.md)
- [2026-11-18 Pathfinder 同步记录](.analysis/reports/SYNC-20261118-PATHFINDER.json)
- [R1947 候选节点与空值契约](.analysis/evidence/mining/r1947-pathfinder-candidate-null-contract/manifest.json)
- [R1948 A* 核心审查](.analysis/evidence/mining/r1948-pathfinder-a-star-core-audit/manifest.json)
- [R1949 缓存加载与 gate 调用点](.analysis/evidence/mining/r1949-pathfinder-cache-loader/manifest.json)
- [R1949 可重跑的原版 JAR 调用扫描](.analysis/evidence/mining/r1949-pathfinder-cache-loader/verify_gate_state_owner.py)
- [贡献说明](CONTRIBUTING.md)

## 参与还原

- 按完整类名、方法名和 JVM descriptor 对照完整原版字节码，核对字段、调用目标、分支、默认参数、异常与副作用。
- 依赖 Minecraft 世界或实体的逻辑必须通过有效游戏状态和正常入口验证。无效夹具、标记变化、启动成功或无崩溃都不能证明功能等价。
- 每项工作留下源码内容 SHA-256、命令和退出码、输入/断言、探针状态与必要日志。注明 VOID 和未完成的验收维度。
- 不要用原始受保护 class 或未恢复 JNI 载荷替代托管源码实现。

## 说明

仓库根目录包含 `rawpolinex.jar`，SHA-256 为 `D85398CFD774781E888A3F36CFBFA87A4CF04235F8459BB6A00437A5D3C48A26`，作为本地行为对照输入；它不能代替托管源码。本仓库尚无 `LICENSE`，不构成对原始 Polinex 或其二进制文件的授权声明。

## 致谢

感谢鲨鱼神（QQ：1127367472）破解 Polinex。感谢猪圈中转站；如果你想使用，可以用我的[邀请码注册](https://api.pigcode.org/register?invite=N9SM4PWP)。

使用过的模型：DeepSeek V4 Flash、DeepSeek V4.1 Flash、DeepSeek V4 Pro、Kimi K3、Kimi K3.1 Pro、Opus 5.5、Opus 4.8、GPT-6 Luna、GPT-6 Sol、GPT-6.1 Sol、GPT-6.1 Terra。

---

<p align="center">剩余还原工作欢迎社区接手；请从一个边界清楚、能留下行为证据的切片开始。</p>
