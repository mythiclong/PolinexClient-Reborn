# Polinex Source Restoration

这是 Minecraft 26.1.2 Fabric 模组的托管源码重建工程。目标是恢复原有功能，让开发者能够自行构建、修改和运行。项目仍在进行中；源码库存、编译成功和静态匹配都不等于功能已经完整或行为等价。

<p align="center">
  <a href="README.md"><img src="https://img.shields.io/badge/语言-简体中文-lightgrey?style=for-the-badge" alt="简体中文"></a>
  <a href="README_EN.md"><img src="https://img.shields.io/badge/Language-English-blue?style=for-the-badge" alt="切换至英文"></a>
</p>

## 当前进度（2026-11-19 UTC；芝加哥当地日期为 2026-11-18）

当前唯一切片：**R1964：沿 Pathfinder 正常调用链追踪路线消费者、执行状态与缓存写入**。

- **A* 主搜索与候选节点**：R1947 按完整原版字节码恢复候选节点 gate、遍历及空值契约；R1948 修正节点分配顺序和 `Function2` 回调编译形式。
- **路线与碰撞 helper**：R1955 修复路线转换器两处 `0.5625`/NaN 分支，并恢复 `g(BlockPos)` 的 gate、调用顺序及 fallback；Temurin 25 全树 Gradle `build` 通过。
- **R1956 碰撞 gate 静态复核**：确认原版 `$llII…` 与当前 `$PXEvMid` 是同一状态持有者的源码重命名；getter、setter、初始化及 `a(BlockPos, ClientLevel): boolean` 的分支语义未发现确认差异。有效世界碰撞仍未验收。
- **R1957–R1961 `NativePathFinder` 差分**：原版与当前编译产物在隔离 classloader 中通过 `normalizeState(B)B` 的 256 个输入、`processChunk` 的 2,049 个长度、`loadCache` 的 2,049 个长度、`updateChunk` 的 34,324 组边界组合，以及 `updateHeights` 的 384 组边界/短整型样本。各测试检查真实缓存副作用；完整范围与限制见每份 manifest。
- **R1962 `isWalkable` / `findPath`**：完整 descriptor 静态对照未发现确认偏差；隔离 classloader 对 3×3 网格的 512 种障碍掩码、移动类型、12 个节点上限和 8 个浮点参数完成 98,304 组差分。保存的结果日志为 PASS，但未保留精确启动命令和进程退出码；详情及限制见 manifest。
- **R1963 路线 API 修复**：按原版 `a(BlockPos, BlockPos, boolean)` 完整字节码修复 gate 与空路线条件；原版 gate 非零时空路线仍传给 converter。`b(Entity): BlockPos` 经独立静态复核未发现确认差异。Temurin 25 下全树 `build --rerun-tasks` 成功，编译后 javap 复核了修复分支。
- **本批次边界**：R1963 修改 1 个托管 Java 文件；全树重建成功。R1962/R1963 均未启动 Minecraft、有效世界或兼容服务器。
- **尚未通过的验收**：Pathfinder 正常玩家入口、有效世界路线/碰撞、磁盘缓存生命周期及兼容服务器行为仍开放。离线差分不能替代游戏内验证。
- **ClickGUI**：同进程原版 Options 对照显示键盘和滚轮有效，但分类图标与 Draw 控件无可观察鼠标反馈；事件转发、命中、模块开关及设置保存/重载仍未闭环。
- **其他功能**：初始化事件、Glacite Commission Macro、Powder Macro、渲染、配置、网络和 native/JNIC 仍有未恢复或未验收项。真实服务器登录、交互、断开、重连未验证。

### 最新交接与证据

- [当前短交接](.analysis/reports/RESUME.md)
- [R1956–R1961 双仓同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1956-R1961.json)
- [R1956 碰撞 gate 静态复核](.analysis/evidence/mining/r1956-pathfinder-collision-gate/manifest.json)
- [R1962 `isWalkable` / A* 有界差分](.analysis/evidence/mining/r1962-pathfinder-walkability-astar-diff/manifest.json)
- [R1963 路线 API gate 修复与实体起点静态复核](.analysis/evidence/mining/r1963-pathfinder-route-api-bridge/manifest.json)
- [R1957 `normalizeState` 全 byte 域差分](.analysis/evidence/mining/r1957-pathfinder-normalize-state-exhaustive/manifest.json)
- [R1958 `processChunk` 边界差分](.analysis/evidence/mining/r1958-pathfinder-process-chunk-boundaries/manifest.json)
- [R1959 `loadCache` 边界差分](.analysis/evidence/mining/r1959-pathfinder-load-cache-boundaries/manifest.json)
- [R1960 `updateChunk` 边界差分](.analysis/evidence/mining/r1960-pathfinder-update-chunk-boundaries/manifest.json)
- [R1961 `updateHeights` 边界差分](.analysis/evidence/mining/r1961-pathfinder-height-cache-boundaries/manifest.json)
- [R1955 路线/高度 helper 修复](.analysis/evidence/mining/r1955-pathfinder-route-converter-nan-semantics/manifest.json)
- [R1954 路线入口与缓存写入](.analysis/evidence/mining/r1954-route-converter-cache-exception/manifest.json)
- [R1951 NativePathFinder 初始方法对照](.analysis/evidence/mining/r1951-native-pathfinder-implementation-audit/manifest.json)

源码库存可用 `python -B .analysis/stats.py` 复算；库存计数不代表功能等价。原始 JAR SHA-256 为 `d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`，不发布；完整 `javap` 转储留在本地分析目录。
- [R1952 Pathfinder 实际 invoke 与 method-handle 扫描](.analysis/evidence/mining/r1952-pathfinder-call-graph/manifest.json)
- [R1953 Pathfinder 包装层静态复核](.analysis/evidence/mining/r1953-pathfinder-wrapper-audit/manifest.json)

当前源码库存：**1,602** 个 Java 文件、**1,158,787** 行、**569** 行 / **581** 处 `PXDyn`、**7,029** 个 `PX-FIX` 标记、**219** 个 native 声明。可用 `python -B .analysis/stats.py` 复算；这些数值只描述源码库存，不代表恢复完成度。

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
