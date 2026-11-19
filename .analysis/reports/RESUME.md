# OpenPolinex 当前交接

> 更新：2026-11-19。R1955 工作树基于提交 `d0a2cfba076c654a4dec80e86170ba921360a572`；Java 源树内容指纹 `5b100dce3522ab30f86262d3657b96bf21a4d68d87c25b16e9b2aeb795e5b3da`（1,602 个文件）。原版 JAR SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`，不发布。

## 当前唯一切片：Pathfinder 直接 helper `g(BlockPos)` gate 可达性

- R1955 已按完整 descriptor 复核路线转换器 `a([JDDLnet/minecraft/client/multiplayer/ClientLevel;)Ljava/util/List;`，并修复两处 `0.5625` 条件。原版对高度差直接使用 `dcmpl`；旧源码先减阈值并按 Kotlin 比较语义处理，NaN 时会走不同分支。源码现为直接 `heightDelta > 0.5625D`，六组边界探针与原版一致。
- R1955 Temurin 25.0.4.1 下从 `polinex-src` 执行 `gradlew.bat build --no-daemon --console=plain` 退出码 0，`compileJava` 和 `jar` 实际执行；测试源为 `NO-SOURCE`。构建不证明游戏内行为等价。
- 直接 helper `g(BlockPos)` 另有原版 gate/fallback 与当前源码的静态差异；其状态是否能经正常更新到达关键值仍未确定，尚未修改。
- R1954 路线入口与缓存写入完整方法对照未发现确认的源码差异；早先缓存目录误判已撤回，见 [R1954 manifest](../evidence/mining/r1954-route-converter-cache-exception/manifest.json)。

## 当前有效证据

- [R1955 路线阈值语义与边界探针](../evidence/mining/r1955-pathfinder-route-converter-nan-semantics/manifest.json)
- [R1954 路线入口与缓存写入](../evidence/mining/r1954-route-converter-cache-exception/manifest.json)
- [R1953 wrapper gate/空路径复核](../evidence/mining/r1953-pathfinder-wrapper-audit/manifest.json)
- [R1952 调用图扫描](../evidence/mining/r1952-pathfinder-call-graph/manifest.json)、[R1951 NativePathFinder 对照](../evidence/mining/r1951-native-pathfinder-implementation-audit/manifest.json)

`python -B .analysis/stats.py` 最近退出码 0：1,602 个 Java 文件、1,158,785 行、219 native 声明、0 stub throws、0 decompiler-artifact throws。库存计数不代表功能完成。

## 已排除的假设

- `category2.a(...)` 五参数签名与原版一致；不是 ClickGUI 输入问题证据。
- wrapper gate 不存在已确认的分支反转；R1954 缓存路径目录差异来自 JVM 操作数栈误读，当前源码与原版相符。
- 空壳、标记、计数和编译结果均不能单独证明功能等价；无效 JAR 子集输出已标 VOID。

## 未关闭验收

- Pathfinder 的 `g(BlockPos)` gate/fallback 可达性、有效世界路线/碰撞、缓存读写生命周期与正常入口尚未验收；没有真实兼容服务器登录/交互/断开/重连证据。
- ClickGUI 鼠标命中、模块切换、设置保存/重载仍未闭环；其他模块、配置、命令、渲染、网络及 native/JNIC 仍需按正常用户路径逐项验证。

## 下一步

完成 `g(BlockPos)` gate 的初始化、全部写入和正常调用链核对；仅在确认行为差异后修源码。之后用有效 Minecraft 世界和正常入口验收路线/碰撞，再选择下一片 Pathfinder 依赖链。
