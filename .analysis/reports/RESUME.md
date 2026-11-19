# OpenPolinex 当前交接

> 更新：2026-11-19 16:23 UTC。当前工作分支 `codex/bootstrap-eclientinit-2026-11-15`，R1967 证据基线为 `fa3152eaed42b497368f781737a72c241e97a5b4`；本批次源码/证据正在准备提交并同步到私有 `openpolinex` 与公开 `PolinexClient-Reborn`。原版 JAR SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`，仅本地使用、不发布。

## 当前唯一切片：R1968 Pathfinder `a(Entity, List, Vec3): void`

R1967 已恢复 `q(): boolean`（完整 descriptor `()Z`）。原版完整 CFG 对最近八条记录计算正/负分类及非零分类之间的方向变化；gate-null、索引范围、列表空值检查和 getter 调用目标均按字节码复核。首次原版差分发现“第一条非零分类”被误算成变化；已按原版局部变量分支修正，并完成最终 65,536 组布尔输入差分及 gate-null/non-null 的 0–9 条记录边界对照，零差异。R1967 Temurin 25 全树 `build --rerun-tasks` 与直接方法差分均退出码 0。未启动 Minecraft、未调用正常玩家路线、未进入有效世界或兼容服务器。

R1967 代码内容 SHA-256（LF）：`b4e6e531b6b93533b1c0e868cb28e78de82e41e053b594560edfcf78fd94747e`；Windows 构建时的精确工作文件 SHA-256：`cdec84fd5c718d79bd629733a8bc18e8221389e628151fb6d88e56cf93edd944`。完整证据见 [R1967 manifest](../evidence/mining/r1967-pathfinder-history-predicate/manifest.json)。

## 已确认的下一项与缺陷

- 正常路线事件主分支调用 `a(Entity, List, Vec3): void`；当前编译为单一 `return`，原版有实现。本切片需先按完整 descriptor 还原其字段读写、实体/世界分支、helper 接收者及副作用。
- 同一 handler 的 `d(List): void` 也编译为空返回；原版有实现，且被多个分支调用。先映射每个 invoke 和分支，再决定与实体路线方法能否组成同一个可验证切片。
- R1967 的独立差分是无 Minecraft 世界的纯方法输入验证，不代表正常玩家路线行为等价。Pathfinder 用户入口、有效世界路线/碰撞、缓存生命周期、停止/取消和兼容服务器验收仍开放。

## 交接与验收边界

- R1966 已恢复 `a(PathNode, List): void`；证据见 [R1966 manifest](../evidence/mining/r1966-pathfinder-executor-reconstruction/manifest.json)。
- R1967 证据目录还保留了构建/差分日志、原版对照 SHA-256、可复运行的隔离 classloader harness 和静态复核说明；原始 JAR、完整字节码转储、编译 class 和本地缓存均不发布。
- `python -B .analysis/stats.py` 当前统计为 1,602 个 Java 文件、1,158,700 行；库存数字不是功能完成度。空缓存网络构建、发布构建、正常游戏路径、真实兼容服务器登录/交互/断开/重连仍未验收。
- ClickGUI 命中/开关/设置保存重载、Powder Macro、Commission Macro，以及配置、渲染、网络和 native/JNIC 仍有开放恢复/验收工作。

下一步：完整还原 `a(Entity, List, Vec3):void`，按同一 handler 的全部分支复核 `d(List):void` 调用顺序；完成源码改动后全树构建、编译字节码核对和对应直接探针，再同步双仓。真实世界和服务器步骤只通过有效游戏状态及正常用户入口完成并留存脱敏证据。
