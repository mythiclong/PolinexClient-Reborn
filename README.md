# Polinex Source Restoration

这是 Minecraft 26.1.2 Fabric 模组的托管源码重建工程。目标是恢复原有功能，让开发者能够自行构建、修改和运行。项目仍在进行中；源码库存、编译成功和静态匹配都不等于功能已经完整或行为等价。

<p align="center">
  <a href="README.md"><img src="https://img.shields.io/badge/语言-简体中文-lightgrey?style=for-the-badge" alt="简体中文"></a>
  <a href="README_EN.md"><img src="https://img.shields.io/badge/Language-English-blue?style=for-the-badge" alt="切换至英文"></a>
</p>

## 当前进度（2026-11-19 UTC；芝加哥当地日期为 2026-11-19）

R1979 完成 Pathfinder 碰撞位移路线包装器 `a(ArrayList<Vec3>, Vec3, Vec3):ArrayList<Vec3>` 的完整原版 descriptor 审计（offset 0–173、4 个异常表项），将迭代器与输出集合的真实调用 receiver 对齐到原版 `Iterable.iterator()` / `Collection.add()`，保留 gate、空列表、碰撞偏移为空时返回原列表及成功时新建列表的顺序。最终编译 owner 的 9 个 invoke 目标和 13 个规范化引用与原版一致；唯一已记录差异是 Java 编译器对同一 `private final g(...)` 调用使用 `invokevirtual` 而非 Kotlin 的 `invokespecial`。Temurin JDK 25 全树 `build --rerun-tasks` exit 0。未做有效世界、正常游戏路径或兼容服务器验收，不宣称运行时等价。详见 [R1979 证据](.analysis/evidence/mining/r1979-pathfinder-collision-route-wrapper/manifest.json)。

R1980 完成 Pathfinder 二段 AABB 碰撞谓词 `b(Vec3):boolean` 的完整原版 descriptor 审计（offset 0–293、5 个异常表项），修复遗漏的 gate-null 早退，使其在读取 player/level 前返回 false。原版与最终编译产物的 14 个非异常 helper 调用、16 个字段引用、9 个行为数值常量和 2 个 Kotlin 空值检查消息按序一致；Java 因 `LocalPlayer` 静态子类型省略了两处冗余 `Entity` checkcast。Temurin JDK 25 全树 `build --rerun-tasks --no-daemon` exit 0（18 条既有警告，测试任务为 `NO-SOURCE`）。未做有效世界、正常玩家路径或兼容服务器验收；不宣称运行时等价。详见 [R1980 证据](.analysis/evidence/mining/r1980-pathfinder-collision-gate/manifest.json)。

R1981 完成 Pathfinder 障碍/前进可行性谓词 `o():boolean` 的完整 descriptor 审计（offset 0–507、25 个异常表项），恢复 gate-null 时先于 player 读取返回 false、空 Collection 的 `isEmpty()` 快路径，以及实际 `Iterable.iterator()` 调用接收者。原版与最终编译产物 17 个非异常 helper 调用和 6 个字段引用按序一致；7 个私有 helper 仅有 Kotlin/Javac invoke opcode lowering 差异，原版冗余 Iterable checkcast 被安全省略。Temurin JDK 25 全树 `build --rerun-tasks --no-daemon` exit 0（18 条既有警告，测试 `NO-SOURCE`）。无有效玩家/世界、正常路线或兼容服务器验收，不宣称运行时等价。详见 [R1981 证据](.analysis/evidence/mining/r1981-pathfinder-obstacle-check/manifest.json)。

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
- **R1969 Pathfinder `d(List): void`**：从完整原版 descriptor/CFG（偏移 0–410、19 个异常表项）恢复 gate/player 早退、`b(list,false)` 空结果处理、option 700 与 `e/n/p/o/a(ID)` 判定、距离阈值、friction flag 及最终 `jump` 键写入；确认异常 helper 为 identity，没有吞异常。全树 Temurin 25 构建最终以 exit code 0 通过（18 条现有 Unsafe/deprecation/unchecked warnings）。两次 C2 native-memory 失败及一次未记录退出码的成功输出均如实保留，最终成功构建使用受限 JVM 编译/GC 参数。未做直接探针、游戏内正常路径或兼容服务器验收。详见 [R1969 静态复核与构建证据](.analysis/evidence/mining/r1969-pathfinder-d-list/manifest.json)。
- **R1970 Pathfinder `b(List, boolean)`**：复核完整原版 descriptor/CFG（偏移 0–347、14 个异常表项），发现原源码在循环条件中每轮重新获取列表末索引，而原版在循环前缓存一次；现已按原版调用时序恢复固定的 inclusive 上界。核对 guard/player/空列表分支、起始索引 clamp、位置及距离 helper、累计距离/垂直阈值、布尔模式、枚举身份比较、返回和异常传播；identity 异常 helper 未吞异常。Temurin JDK 25 全树 `build --rerun-tasks` exit code 0，18 条既有 Unsafe/deprecation/unchecked warnings。没有直接探针、游戏内玩家/世界路径或兼容服务器验收。详见 [R1970 静态复核与构建证据](.analysis/evidence/mining/r1970-pathfinder-route-boundary/manifest.json)。
- **R1971 Pathfinder `b(List): ArrayList`**：完整复核原版 descriptor/CFG（偏移 0–1230、51 个异常表项），发现并修复 gate array 被忽略导致的分支差异：原版 gate 为 null 时不读取 `Minecraft.player`，fallback 迭代最多消费并强转首个列表元素，但不访问节点坐标、不添加点，最后以 mode 1 调用 smoother；非空 gate 且 player-null 则映射全部节点位置。非空 gate/player 路径的路线缓存、move-key、Pair、几何调用和转向状态副作用按原版顺序保留。JDK 25 全树 `build --rerun-tasks` 最终 exit code 0；首个 Java 17 尝试只在 Gradle 配置阶段失败，未编译源码。未做游戏、有效世界、正常玩家路径或服务器验收。详见 [R1971 静态复核与构建证据](.analysis/evidence/mining/r1971-pathfinder-movement-intent/manifest.json)。
- **R1972 Pathfinder `c(List): ArrayList` + `b(List)` fallback-order follow-up**：完整复核原版 `b`（offset 0–1230、51 个异常表项）和 `c`（offset 0–2237、84 个异常表项）；修复 `c` 的 guard-null fallback、单次 player 捕获、list 容量与 receiver/迭代顺序，并恢复 6 个 Kotlin non-null 检查；同时将 `b` 的 smoother receiver field read 移至原版位置。最终编译产物的有序字段/非异常 helper 调用流分别 61/115 项，均无未匹配；复核的 double/float/string 常量序列分别 9/26 项匹配。Temurin JDK 25 全树 `build --rerun-tasks` exit 0。没有 direct probe、Minecraft/有效世界/玩家/正常用户路径或兼容服务器验收。详见 [R1972 manifest](.analysis/evidence/mining/r1972-pathfinder-list-control-output/manifest.json) 与 [静态复核](.analysis/evidence/mining/r1972-pathfinder-list-control-output/static-review.txt)。
- **R1973 Pathfinder `e(Vec3,Vec3,Vec3): ArrayList`:** 完整原版 descriptor/CFG（offset 0–438、11 个异常表项）复核后补回 `Vec3.add` 非空检查、gate 后单次 player 读取及 player/速度向量 null 回退；并修复 `NaN` 角度被错误归为 forward 的分支。最终 compiled event stream 43 项无未匹配；Temurin JDK 25 全树构建 exit 0。第一次 Java 17 尝试只在配置阶段失败；一次 JDK 25 成功构建在发现 NaN 差异后作废，修正后的全树构建才是最终通过。没有直接探针、客户端、有效世界/玩家、正常路径或服务器验收。详见 [R1973 静态复核](.analysis/evidence/mining/r1973-pathfinder-direction/static-review.txt)。
- **R1974 Pathfinder `a(Vec3,Vec3,List,Vec3): Pair`:** 完整原版 descriptor/CFG（offset 0–170、8 个异常表项）复核后，修正原源码的比较方向和 gate-null 短路：gate 非空时为 `distance <= f()+0.75`，gate 为空时按原始 comparator 非零判定（NaN 也为真），且绕过第二几何谓词；距离和阈值无论 gate 状态均按原版先求值。最终字段/方法目标流 13 项匹配；3 处私有调用 opcode 仅因 Kotlin/Javac lowering 不同而变化，target/receiver 相同。Temurin JDK 25 全树构建 exit 0。未做直接探针、游戏或服务器验收。详见 [R1974 静态复核](.analysis/evidence/mining/r1974-pathfinder-conditional-pair/static-review.txt)。
- **R1975 Pathfinder `f(Vec3,Vec3,Vec3): boolean`:** 完整原版 descriptor/CFG（offset 0–345、8 个异常表项）复核后补回两处 `Vec3.add` 之后缺失的 Kotlin `Intrinsics.checkNotNullExpressionValue`。最终编译方法与原版的有序核心字段/方法/类引用 29 项一致；已复核 gate/player、水平距离门限、采样器、构造参数、三次几何谓词、两侧偏移、重复宽度读取、`2.0`/`0.03` 常量和短路返回。8 个原版异常处理器只经 identity rethrow helper 重新抛出；源码未吞异常。Temurin JDK 25 全树 build exit 0，18 条既有 Unsafe/deprecation/unchecked warnings。未做有效世界、正常玩家路径或兼容服务器验收。详见 [R1975 静态复核与构建证据](.analysis/evidence/mining/r1975-pathfinder-geometry-probe/manifest.json)。
- **R1976 Pathfinder `a(Vec3,double): boolean`:** 完整原版 descriptor/CFG（offset 0–169、4 个异常表项）复核后补回 `ClientLevel.getBlockCollisions` 后缺失的 Kotlin `Intrinsics.checkNotNullExpressionValue` 与原始消息。最终编译方法与原版的有序核心字段/方法/类引用 18 项一致；原版 `Entity` checkcast 因 Java 中 LocalPlayer 静态子类型而安全省略。复核 gate/player/level 顺序、`RangesKt.coerceAtLeast`、AABB 六坐标、玩家高度、碰撞调用和 `CollectionsKt.any`。原版 4 个异常处理器只经 identity helper 重新抛出；源码未吞异常。Temurin JDK 25 全树 build exit 0，18 条既有 warnings。未做有效世界、正常玩家路径或兼容服务器验收。详见 [R1976 静态复核与构建证据](.analysis/evidence/mining/r1976-pathfinder-block-collision-predicate/manifest.json)。
- **R1977 Pathfinder `a(Vec3): boolean`**：完整原版 descriptor（offset 0–347、17 个异常表项）审计并与最终编译 owner 对照。gate/list 空值、索引边界、当前/前一节点、`getOrNull`、枚举排除、距离阈值和几何短路均核对；将原版 `Collection.size()I` 调用目标显式对齐（Java 省略其冗余 widening cast）。24 个规范化有序引用和 `0.75` 常量一致。此为静态审计，未做正常游戏路径验收。见 [R1977 manifest](.analysis/evidence/mining/r1977-pathfinder-position-predicate/manifest.json)。
- **R1978 Pathfinder 碰撞推力 `g(Vec3,Vec3,Vec3): Vec3`**：完整原版 descriptor（offset 0–933、18 个异常表项）复核后恢复 gate/player/level 早退、`next(...)`/`bounds(...)` 非空检查、半径边界跳过，以及先聚合再投影、最后统一应用 `0.28` 与最大推力上限。最终编译方法的 73 个规范化有序引用、10 个数值常量和 3 个字符串常量与原版相符。Temurin JDK 25 全树 build exit 0；未测试有效世界、正常路线或服务器。见 [R1978 manifest](.analysis/evidence/mining/r1978-pathfinder-collision-push/manifest.json)。
- **R1979 Pathfinder 碰撞偏移路线包装器 `a(ArrayList<Vec3>,Vec3,Vec3)`**：完整原版 descriptor（offset 0–173、4 个异常表项）复核后，将实际 iterator/add 调用 receiver 分别设为原版的 `Iterable` 和 `Collection`，并核对 gate、首点空值、`g(...)` 返回为空时原列表 fallback、成功时按迭代顺序构造新列表。9 个有序 invoke 目标及 13 个规范化引用一致；唯一编译降低差异为私有 `g(...)` 的 invokespecial/invokevirtual。Temurin JDK 25 全树 build exit 0；未做有效世界或服务器验收。见 [R1979 manifest](.analysis/evidence/mining/r1979-pathfinder-collision-route-wrapper/manifest.json)。
- **R1980 Pathfinder `b(Vec3): boolean`**：完整原版 descriptor（offset 0–293、5 个异常表项）对照后，补回 gate-null 时在读取 player/level 前返回 false 的分支。最终编译产物的 14 个非异常 helper 调用、16 个字段引用、9 个行为数值常量和 2 个空值检查消息按序匹配；Java 安全省略两处冗余 `Entity` checkcast。Temurin JDK 25 全树 `build --rerun-tasks --no-daemon` exit 0，18 条既有警告，测试为 `NO-SOURCE`。未运行客户端、有效世界或服务器。详见 [R1980 manifest](.analysis/evidence/mining/r1980-pathfinder-collision-gate/manifest.json)。
- **R1981 Pathfinder `o(): boolean`**：完整原版 descriptor（offset 0–507、25 个异常表项）复核后恢复 gate-null 早退、空集合快路径及 `Iterable.iterator()` 接收者。17 个非异常 helper 调用和 6 个字段引用按序匹配；7 个私有调用仅有 Javac lowering opcode 差异，25 个异常 handler 均通过 identity helper 原样重抛。Temurin JDK 25 全树 build exit 0；未做有效玩家/世界、正常路线或服务器测试。见 [R1981 manifest](.analysis/evidence/mining/r1981-pathfinder-obstacle-check/manifest.json)。
- **尚未通过的验收**：Pathfinder 正常玩家入口、有效世界路线/碰撞、磁盘缓存生命周期及兼容服务器行为仍开放。离线差分不能替代游戏内验证。
- **ClickGUI**：同进程原版 Options 对照显示键盘和滚轮有效，但分类图标与 Draw 控件无可观察鼠标反馈；事件转发、命中、模块开关及设置保存/重载仍未闭环。
- **其他功能**：初始化事件、Glacite Commission Macro、Powder Macro、渲染、配置、网络和 native/JNIC 仍有未恢复或未验收项。真实服务器登录、交互、断开、重连未验证。

### 最新交接与证据

- [当前短交接](.analysis/reports/RESUME.md)
- [R1980 Pathfinder 二段碰撞谓词静态复核与全树构建](.analysis/evidence/mining/r1980-pathfinder-collision-gate/manifest.json)
- [R1981 Pathfinder `o()` 静态复核与全树构建](.analysis/evidence/mining/r1981-pathfinder-obstacle-check/manifest.json)
- [R1981 双仓同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1981.json)
- [R1966 Pathfinder tick 执行器静态复核与全树构建](.analysis/evidence/mining/r1966-pathfinder-executor-reconstruction/manifest.json)
- [R1967 Pathfinder 历史输入判定字节码复核、差分与全树构建](.analysis/evidence/mining/r1967-pathfinder-history-predicate/manifest.json)
- [R1969 Pathfinder `d(List)` 静态复核与全树构建](.analysis/evidence/mining/r1969-pathfinder-d-list/manifest.json)
- [R1970 Pathfinder `b(List, boolean)` 静态复核与全树构建](.analysis/evidence/mining/r1970-pathfinder-route-boundary/manifest.json)
- [R1971 Pathfinder `b(List)` 静态复核与全树构建](.analysis/evidence/mining/r1971-pathfinder-movement-intent/manifest.json)
- [R1972 Pathfinder `c(List)` 静态复核与全树构建](.analysis/evidence/mining/r1972-pathfinder-list-control-output/manifest.json)
- [R1973 Pathfinder `e(Vec3,Vec3,Vec3)` 静态复核与全树构建](.analysis/evidence/mining/r1973-pathfinder-direction/manifest.json)
- [R1973 Pathfinder 静态复核细节](.analysis/evidence/mining/r1973-pathfinder-direction/static-review.txt)
- [R1974 Pathfinder `a(Vec3,Vec3,List,Vec3)` 静态复核与全树构建](.analysis/evidence/mining/r1974-pathfinder-conditional-pair/manifest.json)
- [R1974 Pathfinder 静态复核细节](.analysis/evidence/mining/r1974-pathfinder-conditional-pair/static-review.txt)
- [R1975 Pathfinder 静态复核细节](.analysis/evidence/mining/r1975-pathfinder-geometry-probe/static-review.txt)
- [R1976 Pathfinder `a(Vec3,double)` 静态复核与全树构建](.analysis/evidence/mining/r1976-pathfinder-block-collision-predicate/manifest.json)
- [R1975 Pathfinder `f(Vec3,Vec3,Vec3)` 静态复核与全树构建](.analysis/evidence/mining/r1975-pathfinder-geometry-probe/manifest.json)
- [R1976 Pathfinder 静态复核细节](.analysis/evidence/mining/r1976-pathfinder-block-collision-predicate/static-review.txt)
- [R1971 双仓同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1971.json)：私有 `openpolinex` 内容提交 `fb7f979`、公开 `PolinexClient-Reborn/main` 内容提交 `283a0d6`；远端 refs 已核验。
- [R1972 双仓同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1972.json)：含代码/evidence 内容提交、README/RESUME 元数据提交与两端 refs 校验。
- [R1973 双仓同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1973.json)：代码/证据、README/RESUME 与双端 refs 核验。
- [R1974 双仓同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1974.json)：代码/证据、README/RESUME 与双端 refs 核验。
- [R1975 双仓同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1975.json)：源码/证据、README/RESUME 与两端 refs 核验。
- [R1976 双仓同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1976.json)：源码/证据、README/RESUME 与两端 refs 核验。
- [R1970 双仓同步记录](.analysis/reports/SYNC-20261119-PATHFINDER-R1970.json)：私有 `openpolinex` 内容提交 `eaca820`、公开 `PolinexClient-Reborn/main` 内容提交 `500963e`；远端 refs 已核验。
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

当前源码库存：**1,602** 个 Java 文件、**1,158,492** 行、**569** 行 / **581** 处 `PXDyn`、**7,029** 个 `PX-FIX` 标记、**219** 个 native 声明。可用 `python -B .analysis/stats.py` 复算；这些数值只描述源码库存，不代表恢复完成度。

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
