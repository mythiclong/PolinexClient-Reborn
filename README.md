# Polinex Source Restoration

这是 Minecraft 26.1.2 Fabric 模组的托管源码重建工程。目标是恢复原有功能，让开发者能够自行构建、修改和运行。项目仍在进行中；源码库存、编译成功和静态匹配都不等于功能已经完整或行为等价。

<p align="center">
  <a href="README.md"><img src="https://img.shields.io/badge/语言-简体中文-lightgrey?style=for-the-badge" alt="简体中文"></a>
  <a href="README_EN.md"><img src="https://img.shields.io/badge/Language-English-blue?style=for-the-badge" alt="切换至英文"></a>
</p>

## 当前进度（2026-11-19 UTC；芝加哥当地日期为 2026-11-19）

当前唯一切片：**R1970：Pathfinder `b(List, boolean)`**。R1969 的 `d(List): void` 已按完整原版字节码恢复，并通过最终 Temurin JDK 25 全树构建；有效玩家/世界路径和真实服务器验收尚未进行。下一步审计它直接调用的 `b(List, boolean)` 完整 descriptor、分支、异常和副作用。

- **A* 主搜索与候选节点**：R1947 按完整原版字节码恢复候选节点 gate、遍历及空值契约；R1948 修正节点分配顺序和 `Function2` 回调编译形式。
- **路线与碰撞 helper**：R1955 修复路线转换器两处 `0.5625`/NaN 分支，并恢复 `g(BlockPos)` 的 gate、调用顺序及 fallback；Temurin 25 全树 Gradle `build` 通过。
- **R1956 碰撞 gate 静态复核**：确认原版 `$llII…` 与当前 `$PXEvMid` 是同一状态持有者的源码重命名；getter、setter、初始化及 `a(BlockPos, ClientLevel): boolean` 的分支语义未发现确认差异。有效世界碰撞仍未验收。
- **R1957–R1961 `NativePathFinder` 差分**：原版与当前编译产物在隔离 classloader 中通过 `normalizeState(B)B` 的 256 个输入、`processChunk` 的 2,049 个长度、`loadCache` 的 2,049 个长度、`updateChunk` 的 34,324 组边界组合，以及 `updateHeights` 的 384 组边界/短整型样本。各测试检查真实缓存副作用；完整范围与限制见每份 manifest。
- **R1962 `isWalkable` / `findPath`**：完整 descriptor 静态对照未发现确认偏差；隔离 classloader 对 3×3 网格的 512 种障碍掩码、移动类型、12 个节点上限和 8 个浮点参数完成 98,304 组差分。保存的结果日志为 PASS，但未保留精确启动命令和进程退出码；详情及限制见 manifest。
- **R1963 路线 API gate 字节码校正**：完整操作数栈显示原版保留 `arraylength` 跨越 gate 分支；当 `gate=0 && route.length>0` 或 `gate!=0 && route.length=0` 时返回 null，其余组合才调用 converter。早先“非零 gate 的空路线会进入 converter”的说明已撤回；当前源码和编译字节码匹配原版。`b(Entity): BlockPos` 的独立静态复核未发现其他确认差异。
- **R1964 正常路线事件消费者**：修复 x/y/z 和 `option` 配置值先强转 `String[]`、后做 `instanceof` 的异常路径；现在对 `Object` 先做原版 `Integer`/`String` 类型检查，再转换。七种模式的 Pathfinder 调用目标、八处状态写入顺序保持不变。该结论为静态字节码核对，未在游戏事件中复现。
- **R1965 Pathfinder `/pathfind` 命令入口**：原版配置方法的完整字节码在 offset 127 捕获当前 provider，并把 `Function1` 绑定到已有的 `a(Self, RouteContext): Unit` 路线处理 helper。当前源码此前传入 null；原版 builder 会在 executor 和 subcommand 都缺失时抛 `IllegalArgumentException`。现已恢复可调用闭包。最终 Java 编译产物通过 synthetic adapter 调用同一 helper；没有宣称 bootstrap 字节码形状与 Kotlin 原版完全相同。详情见 [R1965 静态复核与构建证据](.analysis/evidence/mining/r1965-pathfind-command-executor/manifest.json)。
- **本批次边界**：修复 1 个 Pathfinder 命令 provider 源文件；Temurin 25 全树 `build --rerun-tasks` 成功。第一次构建因继承的 `JAVA_HOME` 指向 Java 17，在 Gradle 配置阶段失败、未编译源码；显式选择 Temurin 25 后成功。未启动 Minecraft、未从正常入口分发命令、未进入有效世界或兼容服务器。
- **R1966 Pathfinder tick 执行器**：恢复 1 个 `a(PathNode, List): void` 方法。完整原版 CFG 显示筛选节点后，满足条件时调用 `a(List,false)`；若 sentinel 非空则跳过目标朝向输入；除 player-null 早退外始终查询 option 150，再按 sentinel 决定 sneak。最终源码全树 build `--rerun-tasks` 通过。两次中间构建曾通过，但完整分支复核后发现并修正了求值顺序/门控分支，故它们不作为最终验证。未做直接探针、正常玩家路径、有效世界或兼容服务器测试。详见 [R1966 证据](.analysis/evidence/mining/r1966-pathfinder-executor-reconstruction/manifest.json)。
- **R1967 Pathfinder 历史输入判定 `q(): boolean`**：按完整原版 `()Z` CFG 恢复最近八条记录的分类与计数；正/负分类各至少两次，且只在已有非零分类后遇到方向变化时累加变化数，三项阈值均满足才返回 true。保留了 gate-null 的索引/早退分支、列表取值空值检查及 `a()`/`d()` getter 调用目标。首次原版差分暴露“首个非零值不算方向变化”的误读，已据原始 CFG 修正；最终隔离 classloader 对全部 **65,536** 组八条布尔记录、gate-null/非空的 0–9 条边界比较均 PASS。Temurin 25 全树 build `--rerun-tasks` 通过。此探针不使用 Minecraft 世界；正常玩家路径、有效世界和服务器仍未验收。详见 [R1967 证据](.analysis/evidence/mining/r1967-pathfinder-history-predicate/manifest.json)。
- **R1968 Pathfinder 实体路线处理**：按原版完整 descriptor/CFG 恢复 `a(Entity, List, Vec3): void` 的碰撞/卡滞计数、配置阈值与计时门控、精确路线请求 overload `(false, true)`、成功后的计时器/计数器副作用及可选 GhostPath 提示。完整 Temurin 25 `build --rerun-tasks` 成功；该方法依赖实际玩家与世界碰撞，未做无效空对象探针，也未进行客户端/正常玩家路径/服务器验收。`d(List)` 的三个 invoke 点已在原版字节码中全部映射，详见 [R1968 静态复核与构建证据](.analysis/evidence/mining/r1968-pathfinder-entity-route/manifest.json)。
- **R1969 Pathfinder `d(List): void`**：从完整原版 descriptor/CFG（偏移 0–410、19 个异常表项）恢复 gate/player 早退、`b(list,false)` 空结果处理、option 700 与 `e/n/p/o/a(ID)` 判定、距离阈值、friction flag 及最终 `jump` 键写入；确认异常 helper 为 identity，没有吞异常。全树 Temurin 25 构建最终以 exit code 0 通过（18 条现有 Unsafe/deprecation/unchecked warnings）。两次 C2 native-memory 失败及一次未记录退出码的成功输出均如实保留，最终成功构建使用受限 JVM 编译/GC 参数。未做直接探针、游戏内正常路径或兼容服务器验收。详见 [R1969 静态复核与构建证据](.analysis/evidence/mining/r1969-pathfinder-d-list/manifest.json)。下一切片为 `b(List, boolean)` 完整静态审计。
- **尚未通过的验收**：Pathfinder 正常玩家入口、有效世界路线/碰撞、磁盘缓存生命周期及兼容服务器行为仍开放。离线差分不能替代游戏内验证。
- **ClickGUI**：同进程原版 Options 对照显示键盘和滚轮有效，但分类图标与 Draw 控件无可观察鼠标反馈；事件转发、命中、模块开关及设置保存/重载仍未闭环。
- **其他功能**：初始化事件、Glacite Commission Macro、Powder Macro、渲染、配置、网络和 native/JNIC 仍有未恢复或未验收项。真实服务器登录、交互、断开、重连未验证。

### 最新交接与证据

- [当前短交接](.analysis/reports/RESUME.md)
- [R1966 Pathfinder tick 执行器静态复核与全树构建](.analysis/evidence/mining/r1966-pathfinder-executor-reconstruction/manifest.json)
- [R1967 Pathfinder 历史输入判定字节码复核、差分与全树构建](.analysis/evidence/mining/r1967-pathfinder-history-predicate/manifest.json)
- [R1969 Pathfinder `d(List)` 静态复核与全树构建](.analysis/evidence/mining/r1969-pathfinder-d-list/manifest.json)
- [R1968 Pathfinder 实体路线静态复核与全树构建](.analysis/evidence/mining/r1968-pathfinder-entity-route/manifest.json)
- [R1969 双仓同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1969.json)：私有 `openpolinex` 内容提交 `16b2a70`、公开 `PolinexClient-Reborn/main` 内容提交 `b993352`，两端 refs 于 2026-11-19 17:19:42 UTC 核验一致。
- [R1968 双仓同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1968.json)：私有 `openpolinex` 内容提交 `9f97de6`、公开 `PolinexClient-Reborn/main` 内容提交 `c8647ea`，两端 refs 于 2026-11-19 16:47:15 UTC 核验一致。
- [R1966 双仓同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1966.json)：私有分支内容提交 `21ec44f`、公开 `PolinexClient-Reborn/main` 内容提交 `624128b`，推送后远端 refs 已核验。
- [R1965 Pathfinder 命令 executor 回调修复](.analysis/evidence/mining/r1965-pathfind-command-executor/manifest.json)
- [R1965 双仓同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1965.json)：源码与证据提交已快进同步，私有 `openpolinex` 为 `b502476`，公开 `PolinexClient-Reborn` 为 `2fff92a`，远端 refs 已核验。
- [R1962–R1963 双仓同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1962-R1963.json)
- [R1963–R1964 当前阶段证据与双仓同步](.analysis/reports/SYNC-20261119-PATHFINDER-R1963-R1964.json)：私有 `67ded95` / 公开 `6d79cfd`。
- [R1964 正常路线消费者字节码复核与构建](.analysis/evidence/mining/r1964-pathfinder-route-consumer/manifest.json)
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

当前源码库存：**1,602** 个 Java 文件、**1,158,427** 行、**569** 行 / **581** 处 `PXDyn`、**7,029** 个 `PX-FIX` 标记、**219** 个 native 声明。可用 `python -B .analysis/stats.py` 复算；这些数值只描述源码库存，不代表恢复完成度。

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
