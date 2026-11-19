# Polinex Source Restoration

这是 Minecraft 26.1.2 Fabric 模组的托管源码重建工程。目标是恢复原有功能，让开发者能够自行构建、修改和运行。项目仍在进行中；源码库存、编译成功和静态匹配都不等于功能已经完整或行为等价。

<p align="center">
  <a href="README.md"><img src="https://img.shields.io/badge/语言-简体中文-lightgrey?style=for-the-badge" alt="简体中文"></a>
  <a href="README_EN.md"><img src="https://img.shields.io/badge/Language-English-blue?style=for-the-badge" alt="切换至英文"></a>
</p>

## 当前进度（2026-11-19）

当前唯一切片是 **R1955 Pathfinder 路线/高度 helper 还原后的有效世界验收**。

- **A* 主搜索与候选节点**：R1947 按完整原版字节码恢复候选节点的 gate、遍历与空值契约；R1948 修正 A* 节点分配顺序和 `Function2` 回调编译形式。既有 Temurin 25 全树编译退出码为 0。
- **缓存加载 gate**：R1949 对照完整缓存加载器字节码，并扫描原版 JAR 的 5,475 个 class，0 个解析错误；gate setter 调用点已确认。缓存文件实际读写仍未验证。
- **纯 Java 寻路层**：R1951 将 `NativePathFinder` 的 25 个完整方法与当前源码编译产物对照，并用隔离 classloader 比较原版和当前实现的 31 组输出及缓存副作用，全部匹配。7 个方法的字节码控制流形状不同；有限样本一致不代表全域或实机等价。
- **实际调用点**：R1952 扫描原版 JAR 5,475 个 class 和当前编译产物 2,823 个 class，均为 0 个解析错误。确认同一事件消费者对三个 `BlockPos` API 方法有相同的直接调用目标；尚未通过游戏内正常事件验证这些分支会执行。
- **路线入口与缓存写入**：R1954 对照 `a(long[], double, double, boolean): List` 和缓存写方法 `(int, int, ByteBuffer): void` 的完整原版/当前字节码。入口 gate、空世界、平滑调用顺序匹配；缓存目录 gate、数据头、文件选项、写循环和关闭路径未发现可确认差异。先前看似目录不匹配的判断是 JVM 操作数栈误读，临时改动已撤回，Java 源树内容指纹仍为 `a23ce38f…`。Temurin 25 下 Gradle `build` 退出码 0；本批次没有生产源码修改。
- **R1955 路线/高度 helper 修复**：按完整 descriptor 对照路线转换器 `a([JDDLClientLevel;)List` 和 `g(BlockPos)`。两处 `0.5625` 条件改为直接比较，修复旧 Kotlin 比较翻译对 NaN 的错误分支；六个边界样本匹配原版。恢复 `g` 的 `d()` gate、在参数校验和读取世界前执行的顺序，以及 gate 非零时居中/顶面 fallback。扫描原版 5,475 个 class 未发现模组内部正常路径把 gate 改为 0；public setter/反射仍可能由外部触发，因此 fallback 按原版保留。最终 R1955 源树在 Temurin 25 下全树 `build` 通过。
- **运行验收**：尚未通过有效 Minecraft 世界和玩家入口验证路线、碰撞及缓存读写，也没有真实兼容服务器验收。静态还原、样本探针和编译不能代替这些验收。
- **ClickGUI**：已有同进程原版 Options 对照证据：键盘和滚轮有效，分类图标、Draw 控件未观察到鼠标反馈。内部 Screen 鼠标事件转发与控件命中路径仍待核对；尚未通过悬停、点击、模块开关及设置保存/重载验收。
- **其他功能**：初始化事件、Glacite Commission Macro、Powder Macro、渲染与网络等仍有未恢复或未验收部分。真实服务器登录、交互、断开、重连未验证。

最新 Pathfinder 证据与简短交接：

- [当前交接](.analysis/reports/RESUME.md)
- [2026-11-19 Pathfinder 最新同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1955-GATE.json)
- R1955 源码与证据已推送：私有 `openpolinex` 分支 `codex/handoff-progress-2026-11-15`（`980aac4`）；公开 `PolinexClient-Reborn` 的 `main`（`8bd1d61`）。
- [R1955 路线/高度 helper 复核](.analysis/evidence/mining/r1955-pathfinder-route-converter-nan-semantics/manifest.json)
- [R1954 路线入口与缓存写入复核](.analysis/evidence/mining/r1954-route-converter-cache-exception/manifest.json)
- [R1947 候选节点与空值契约](.analysis/evidence/mining/r1947-pathfinder-candidate-null-contract/manifest.json)
- [R1948 A* 核心审查与全树构建](.analysis/evidence/mining/r1948-pathfinder-a-star-core-audit/manifest.json)
- [R1949 缓存加载与 gate 调用点](.analysis/evidence/mining/r1949-pathfinder-cache-loader/manifest.json)
- [R1949 原版 JAR 调用扫描脚本](.analysis/evidence/mining/r1949-pathfinder-cache-loader/verify_gate_state_owner.py)
- [R1951 NativePathFinder 原版对照与 golden 记录](.analysis/evidence/mining/r1951-native-pathfinder-implementation-audit/manifest.json)
- [R1952 Pathfinder 实际 invoke 与 method-handle 扫描](.analysis/evidence/mining/r1952-pathfinder-call-graph/manifest.json)
- [R1953 Pathfinder 包装层静态复核](.analysis/evidence/mining/r1953-pathfinder-wrapper-audit/manifest.json)

当前源码库存：**1,602** 个 Java 文件、**1,158,790** 行、**569** 行 / **581** 处 `PXDyn`、**7,029** 个 `PX-FIX` 标记、**219** 个 native 声明。可用 `python -B .analysis/stats.py` 复算；这些数值只描述源码库存，不代表恢复完成度。

R1954/R1955 的完整 `javap` 转储只保留在本地分析目录；公开快照只含方法 descriptor、判定摘要和转储 SHA-256，不包含原版 JAR 或受保护 class。

## 构建

需要 JDK 25。Windows 下先启用 Git 长路径，再克隆：

```powershell
git config --global core.longpaths true
git clone https://github.com/mythiclong/openpolinex.git
cd openpolinex/polinex-src
.\gradlew.bat build --no-daemon --console=plain
```

已有记录覆盖依赖缓存环境中的全树 `compileJava`。干净 checkout、空缓存网络构建和正式发布构建仍待验证。不要把本机缓存、预存产物或手工复制环境作为构建前提。

## 还原与验收约定

- 原版行为对照使用合法取得的原版文件；仓库内的源代码才是待构建实现。
- 每个方法按完整类名、方法名和 JVM descriptor 对照完整字节码，核对字段、调用目标、分支、默认参数、异常和副作用。
- 依赖 Minecraft 世界或实体的逻辑要通过有效游戏状态和正常用户入口验证；无效夹具、计数变化和“没有崩溃”不能证明功能等价。
- 记录源码内容 SHA-256、真实命令及退出码、输入/断言和探针状态。临时探针服务于具体假设，完成后移除并用无探针构建复核。
- 尚未添加 `LICENSE`。本仓库不声明对原始 Polinex 或其二进制文件的授权。

## 致谢

感谢鲨鱼神（QQ：1127367472）破解 Polinex。感谢猪圈中转站；如果你想使用，可以用我的[邀请码注册](https://api.pigcode.org/register?invite=N9SM4PWP)。

这一路用过的模型：DeepSeek V4 Flash、DeepSeek V4.1 Flash、DeepSeek V4 Pro、Kimi K3、Kimi K3.1 Pro、Opus 5.5、Opus 4.8、GPT-6 Luna、GPT-6 Sol、GPT-6.1 Sol、GPT-6.1 Terra。前后累计消耗 **30B+ DeepSeek V4.1 Flash tokens**。剩余工作欢迎社区接手，也欢迎继续提交可复核的源码与行为证据。
