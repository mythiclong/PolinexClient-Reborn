# OpenPolinex 当前交接

> 更新：2026-11-20 UTC。R1994 Pathfinder 预计算路线入口已完成完整 JVM descriptor 静态复核、真实 `bG()` 调用点复核、离线断言及 Temurin JDK 25 全树 Gradle 构建（exit 0）。源码、机器证据、双语 README 和本交接已推送：私有 `openpolinex/codex/handoff-progress-2026-11-15` 内容提交 `2ebdca1e2a8600daa0b1e428f0155b1bc59ab609`，公开 `PolinexClient-Reborn/main` 内容提交 `15f660df21e8ba98d3a43e69eddcf69be8cc9e55`；两端 refs 及 8 个共享文件 blobs 已核验。正在补入双仓同步机器记录。没有运行客户端、有效玩家/世界、路线或兼容服务器；不宣称运行时等价或 Pathfinder 闭环。

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

1. 沿 `bG()` 预计算路线调用点追踪异步请求和结果写入、pending route/target、路线接管及 `bG`/事件执行，再核对完成、失败、取消和缓存失效；基于完整 descriptor 找到确定偏差后再修复。打通可运行构建后集中安排有效世界正常入口验收。
2. 继续 Powder Macro 与 Glacite Commission Macro 的真实启停/事件/配置/清理链；R1992 只恢复了一个 Commission 库存目标扫描方法，不代表完整宏流程通过。
3. 按已具备条件继续客户端 GUI/输入/配置/native 等其他开放功能；不要把静态匹配、计数或构建成功等同功能等价。真实兼容服务器登录、交互、断开/重连仍需独立验收。

双仓阶段同步目标：私有 `openpolinex` 的 `codex/handoff-progress-2026-11-15` 与公开 `PolinexClient-Reborn` 的 `main`；本轮内容已快进发布并核验，R1994 机器同步记录随后补入。不要对 `D:\Work\OpenPoli` 做 pull/reset/清理；其修改不属于本工作树。
