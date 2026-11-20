# OpenPolinex 当前交接

> 更新：2026-11-20 UTC。R1994 Pathfinder 预计算路线入口已完成完整 JVM descriptor 静态复核、真实 `bG()` 调用点复核、离线断言及 Temurin JDK 25 全树 Gradle 构建（exit 0）。源码、机器证据、双语 README、交接及双仓同步机器记录均已同步到私有 `openpolinex/codex/handoff-progress-2026-11-15` 与公开 `PolinexClient-Reborn/main`；内容提交、文档提交、源文件 SHA-256、共享 blobs 和远端 refs 见 `.analysis/reports/SYNC-20261120-PATHFINDER-R1994.json`。之后只做了此交接的刷新。未运行客户端、有效玩家/世界、正常路线或兼容服务器；不宣称运行时等价或 Pathfinder 闭环。

## 当前基线

- 集成分支：`codex/bootstrap-eclientinit-2026-11-15`；R1994 变更前 HEAD：`804e361798ca86bccfba4b2419aa2e1b4f6315a5`；本地源码/证据/双语文档提交：`2ebdca1e2a8600daa0b1e428f0155b1bc59ab609`。
- 唯一源码文件：`polinex-src/src/main/java/me/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll.java`。R1994 新 blob `efd51a79e1802a46260c8540a637b6fd0babf98f`；SHA-256 `17cd21d24cb4bffcb5563e793716d86c07e7947fa2131061ef30c1d9c4c3db8e`。
- 机器证据：`.analysis/evidence/mining/r1994-pathfinder-prefetched-route-contract/`。原始受保护字节、完整 javap、构建原始日志及产物不发布。

## 当前切片 R1994：预计算路线入口

- Owner：`me.octo.client.IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll`；descriptor：`(Ljava/lang/Object;Ljava/util/List;Lnet/minecraft/world/phys/Vec3;ZZ)Z`。
- 恢复原版 `prefetchedPath` 入口空值检查时序、gate 控制的玩家位置读取/目标分派与验证、null-gate 的特殊 cast/fallback/返回分支，以及相应状态写入顺序。
- 原版/最终编译方法 211/191 条指令；28 个有序字段引用、排除 11 个 identity throwable relay 后的 17 个业务调用及 3 个行为字符串匹配。原版两处 monitor cleanup 在编译版保留。实际 `bG()` caller 的 synthetic bridge 与参数生产者已静态核对。
- Temurin 25 全树 Gradle 构建 exit 0；4 个 actionable tasks；测试 `NO-SOURCE`；18 条既有 `Unsafe` 警告及既有 deprecation/unchecked 提示。该构建只证明编译。
- 未做有效玩家/世界、prefetched route 正常入口、停止/取消/缓存生命周期及兼容服务器验收。

## 下一步与开放项

1. 已定位预计算路径的实际链条：`a(BlockPos)` 发起带 generation/target 的异步请求，静态完成回调校验 generation/target 后发布或清除路线，`bG()` 再把路线传给 Pathfinder 入口；`bH()`递增 generation 并清除 pending/target/route。当前只完成定向字节码阅读，未作运行时闭环结论。下一步核对起点选择 helper `b(BlockPos)` 的完整 descriptor，并继续 central route executor、完成/失败/取消和缓存失效路径；确认偏差后再修复并跑全树构建，有效世界验收留待合适客户端窗口。
2. 继续 Powder Macro 与 Glacite Commission Macro 的真实启停/事件/配置/清理链；R1992 只恢复了一个 Commission 库存目标扫描方法，不代表完整宏流程通过。
3. 按已具备条件继续客户端 GUI/输入/配置/native 等其他开放功能；不要把静态匹配、计数或构建成功等同功能等价。真实兼容服务器登录、交互、断开/重连仍需独立验收。

双仓阶段同步目标：私有 `openpolinex` 的 `codex/handoff-progress-2026-11-15` 与公开 `PolinexClient-Reborn` 的 `main`；R1994 代码、证据、README 和交接机器记录均已快进发布并核验。不要对 `D:\Work\OpenPoli` 做 pull/reset/清理；其修改不属于本工作树。
