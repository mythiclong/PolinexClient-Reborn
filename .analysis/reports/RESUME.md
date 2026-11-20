# OpenPolinex 当前交接

> 更新：2026-11-20 UTC。当前 Pathfinder 生产源码基线为集成分支 `codex/bootstrap-eclientinit-2026-11-15` 的 `74918b54125a42da3d6d5d3d5e76ed840b3cb441`。R1997 对 `NativePathFinder` 纯 Java 助手完成原版归档类/当前编译类的 705 条 headless 差分断言；双语 README、证据和本交接随 R1997 批次同步至私有 `openpolinex` 与公开 `PolinexClient-Reborn/main`，核验记录为 [SYNC-20261120-PATHFINDER-R1997](SYNC-20261120-PATHFINDER-R1997.json)。本切片没有改生产源码或启动客户端。

## 当前唯一切片与有效证据

- Pathfinder 路线状态链此前 R1996 静态复核并修复 `g(List):boolean` 的活动路线完成游标和 `d(boolean):void` 第四计时器无条件重置；52 条离线断言与 Temurin JDK 25 全树构建 exit 0。证据：`.analysis/evidence/mining/r1996-pathfinder-route-completion-and-stop-reset/`。
- R1997 使用原版归档 SHA-256 `d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26` 和当前 `NativePathFinder.java` source SHA-256 `b0ae100d8ca2a393a2fb3519b9d73e1fc0fced6b8af83f00f79e94c93f1b887f`；705 条确定性差分断言输出完全一致，`javac` 与 Java runner 均 exit 0。证据：`.analysis/evidence/mining/r1997-native-pathfinder-extended-golden/`。
- R1997 只验证 world-independent helper 的有界直接行为；不代表完整原生助手语义、Minecraft 碰撞、正常入口或功能等价。原版归档、完整 javap 转储和 harness 编译产物不发布。

## 开放缺口

- Pathfinder 的真实玩家请求→求解结果发布→执行状态→完成/失败/取消→停止清理链尚未以有效世界及正常入口验收；磁盘路径缓存读取、写入、切换和失效的真实事件链仍开放。`s()` 是转向/输入清理，不能作为磁盘缓存已清理的证据。
- Powder Macro 正常启停/事件入口及与 Pathfinder 的共享调用链未验收。
- Glacite Commission Macro 完整状态机与正常入口未闭合；目前只有较早库存目标扫描的静态恢复。
- 没有有效世界/客户端正常路径或兼容服务器登录、交互、断开、重连证据。

## 下一动作

按完整 owner/name/JVM descriptor 追踪真实路线结果写入、执行状态与缓存读取/失效的 invoke caller 和字段副作用，挑一个两个宏共用且能推进正常路径的小缺口。若原版/当前静态对照不能定位偏差，则准备一次能区分路径状态的有效世界探针；不要用 null/plain-object 伪造 Minecraft 行为。下一代码切片再按原版完整字节码修复、做可区分的离线/直接探针和全树构建；只有具备真实世界条件时才集中单实例客户端验收。随后继续 Powder Macro 与 Commission Macro 正常入口及状态机。
