# OpenPolinex 当前交接

> 更新：2026-11-19 15:49 UTC。私有 `openpolinex/codex/handoff-progress-2026-11-15` 的 R1966 内容提交为 `21ec44f8ea9e0a70ef8573ac0fffa5c173b18443`；公开 `PolinexClient-Reborn/main` 内容提交为 `624128bad193bdb9e8c4e7fc7b424eff529f3f80`，推送后 refs 均已核验。R1966 证据代码基线为 `063fc5807d5d9e61bb4af04acb6c3f742601a724`。原版 JAR SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`，仅本地使用，不发布。

## 当前唯一切片：R1967 Pathfinder `q(): boolean` 历史输入判定

**确认的执行阻断，尚未修复：**当前源码的 `q()` 因 CFR/Vineflower switch 反编译失败而无条件抛 `IllegalStateException("Decompilation failed")`；当前编译方法确实构造并抛出该异常。正常 `@SubscribeEvent` 路线处理会调用它；原版调用偏移 590、当前偏移 306。原版完整 descriptor `()Z` 实现遍历最近八个移动记录，对记录方法 `a()`、`d()`、gate 状态分支计数并返回 boolean。必须按完整 CFG、字段与嵌套记录方法恢复，不能凭 “stuck check” 名称猜语义。

## 最近完成：R1966 `a(PathNode, List): void`

恢复此前编译为单一 `return` 的 per-tick executor。完整静态复核和独立只读复核通过；最终精确源码 Temurin 25 全树 `build --rerun-tasks` 退出码 0。最终源码 SHA-256：`dd141e4cdcfa4b7d2d60aae810e666d5c6db4b6bc1a8c57c3ab3eaa1ec24cff7`；规范 LF Git blob：`7fb114d4a806a3f9f95bfee6bb9dca44ab7b733f`。

## 有效证据与同步

- [R1966 静态复核、构建及验收边界](../evidence/mining/r1966-pathfinder-executor-reconstruction/manifest.json)
- [R1966 双仓同步索引](SYNC-20261119-PATHFINDER-R1966.json)
- 进一步确认的后续执行缺口：同 handler 中 `a(Entity, List, Vec3): void` 和 `d(List): void` 当前编译为空返回、原版有实现并被事件路径调用。应先恢复 q()，再按调用顺序继续。
- R1966 未直接探针、未启动/操控 Minecraft、未验证正常玩家路线、有效世界或兼容服务器；源码恢复和构建不等于寻路行为验收。

## 仍未关闭

Pathfinder 正常命令/玩家入口、历史输入判定、实体路线处理、节点输入、有效世界路线/碰撞、缓存生命周期、停止/取消及兼容服务器行为仍需按正常入口验证。ClickGUI 鼠标命中/开关/设置保存重载、Powder Macro、Commission Macro，以及配置、渲染、网络与 native/JNIC 仍有开放恢复/验收项。当前全树构建复用本机依赖缓存；空缓存网络构建与发布构建未验证。

## 下一步

按完整原版和当前 `q():Z` descriptor 对照字段、接收者、每个分支、数组判空、`a()`/`d()` 调用目标、计数器写入和最终比较；恢复源码后全树构建并核对编译产物。随后继续 `a(Entity, List, Vec3):void`、`d(List):void` 及实际 9-Object overload 调用点，不把初始静态发现当作验证完成。游戏内和服务器验收只用有效实体/世界与正常用户入口，服务器步骤保留脱敏证据。
