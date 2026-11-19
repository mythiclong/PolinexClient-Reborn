# OpenPolinex 当前交接

> 更新：2026-11-19。当前工作树沿用 R1955 双仓快照，Java 源树内容指纹 `e6046434ad4042f76978110757a85cdc733f80de492ce11775cc3ee11efbfb48`（1,602 个文件）。原版 JAR SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`，不发布。

## 当前唯一切片：Pathfinder 有效世界路线与碰撞验收

- R1955 已按完整 descriptor 复核路线转换器和直接高度 helper `g(BlockPos)`，修复两处 `0.5625` 比较的 NaN 分支，并恢复原版 `d()` gate、参数校验/世界读取顺序及 centered/top fallback。完整证据见 [R1955 manifest](../evidence/mining/r1955-pathfinder-route-converter-nan-semantics/manifest.json)。
- gate 的原版 JAR 扫描覆盖 5,475 个 class：模组内部初始化为 104；唯一非初始化 setter 调用受 `helper.f() == null` 条件保护，而 helper 返回已初始化的三元素数组，未发现正常内部路径将值改为 0。public setter 和动态反射属于外部边界；fallback 已按原版保留。
- Temurin 25.0.4.1 下全树 Gradle `build` 退出码 0，`compileJava` 与 `jar` 实际执行；测试源为 `NO-SOURCE`。未启动 Minecraft，编译和谓词微探针不证明游戏内等价。
- R1954 路线入口与缓存写入完整方法未发现确认差异；错误的缓存目录判断已撤回，见 [R1954 manifest](../evidence/mining/r1954-route-converter-cache-exception/manifest.json)。

## 当前有效证据

- [R1955 双仓同步索引](SYNC-20261119-PATHFINDER-R1955.json)
- [R1955 路线/高度 helper 复核](../evidence/mining/r1955-pathfinder-route-converter-nan-semantics/manifest.json)
- [R1954 路线入口与缓存写入](../evidence/mining/r1954-route-converter-cache-exception/manifest.json)
- [R1953 wrapper gate/空路径复核](../evidence/mining/r1953-pathfinder-wrapper-audit/manifest.json)
- [R1952 调用图扫描](../evidence/mining/r1952-pathfinder-call-graph/manifest.json)、[R1951 NativePathFinder 对照](../evidence/mining/r1951-native-pathfinder-implementation-audit/manifest.json)

`python -B .analysis/stats.py` 最近退出码 0：1,602 个 Java 文件、1,158,790 行、219 native 声明、0 stub throws、0 decompiler-artifact throws。库存计数不代表功能完成。

## 已排除的假设

- `category2.a(...)` 五参数签名与原版一致；不是 ClickGUI 输入问题证据。
- wrapper gate 不存在已确认的分支反转；R1954 缓存目录差异来自 JVM 操作数栈误读，当前源码与原版相符。
- 空壳、标记、计数和编译结果均不能单独证明功能等价；错误 JAR 子集的输出为 VOID。

## 未关闭验收

- Pathfinder 有效世界路线、障碍/楼梯/雪层碰撞与缓存读写生命周期尚未走正常入口验收；没有兼容服务器登录/交互/断开/重连证据。
- ClickGUI 鼠标命中、模块切换、设置保存/重载仍未闭环；其他模块、配置、命令、渲染、网络及 native/JNIC 仍须按用户路径逐项验证。

## 下一步

在有效 Minecraft 世界中经正常 Pathfinder 入口运行，记录路线/碰撞/缓存断言；然后选择尚未恢复的 Pathfinder 依赖链继续源码复核。
