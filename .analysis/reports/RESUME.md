# OpenPolinex 当前交接

> 更新：2026-11-20 UTC。R1995 Pathfinder 候选评分切片已提交 `49f77acc0bc5c6078aa333c954971fe2a4ee7a4e`，完成原版/编译 descriptor 静态复核、21 条离线断言和 Temurin JDK 25 全树构建（exit 0）。双仓 README/交接及推送核验仍待本次同步完成；未做客户端/有效世界验收。

## 当前基线

- 集成分支：`codex/bootstrap-eclientinit-2026-11-15`；基线提交：`49f77acc0bc5c6078aa333c954971fe2a4ee7a4e`。
- R1995 源文件 blob：`5cc747b66c0e37b95af281d6e93f692cd874e9b0`；SHA-256：`ac059acf5b0f01188b4f4081c9f952b47f4dd5add44f8e3b80f02f11524927f1`。
- 证据目录：`.analysis/evidence/mining/r1995-pathfinder-route-start-scoring/`；原版归档、完整字节码、构建产物与原始日志不在仓库中。

## 当前切片与有效证据

`b(BlockPos):BlockPos` 恢复了空 gate 早退、目标位置优先的评分起点及玩家位置回退、NaN 保真的范围条件，以及 mask=368 默认桥按 `c()I` 状态选择 0.0/1.0 的调用语义。原版/编译方法指令数 443/278；离线断言 21/21；全树 Gradle build exit 0（测试 `NO-SOURCE`）。这是静态、离线和构建证据，不代表游戏行为等价。

## 已知缺口

- Pathfinder 的真实玩家入口、有效世界路线、碰撞与路线执行/停止/取消、缓存生命周期仍未集中实机验收。
- Powder Macro 的完整启停/事件/配置/清理与真实寻路调用尚未闭合。
- Glacite Commission Macro 目前只有 R1992 库存目标扫描静态恢复；完整状态机及正常入口未闭合。
- 没有运行客户端、有效世界、正常宏流程或兼容服务器。

## 下一动作

沿真实 Pathfinder 消费者继续核对「路线结果发布 → 执行状态更新 → 完成/失败/取消 → 停止清理 → 缓存读取与失效」，优先选两个宏共用且能形成正常可达路径的缺口。每个修改按完整 JVM descriptor 和调用上下文取证，再作离线断言、全树构建；只有需要有效世界/事件时集中启动客户端。下一功能批次通过后再发布，不把静态恢复或构建成功描述为功能闭环。
