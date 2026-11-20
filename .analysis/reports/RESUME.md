# OpenPolinex 当前交接

> 更新：2026-11-19（America/Chicago；2026-11-20 UTC）。R1989 修复 Pathfinder 所用玩家路径/输入辅助方法 `a(Vec3,Vec3,boolean,double):void` 的两个原版控制流偏差；完整 descriptor 静态复核及 Temurin JDK 25 全树构建通过。客户端、有效世界与正常寻路尚未验收，不代表 Pathfinder 闭环。

## 当前基线

- 工作树：`C:\Users\AutoB\.codex\worktrees\bootstrap-eclientinit\OpenPoli`
- 分支：`codex/bootstrap-eclientinit-2026-11-15`；R1989 内容基于 `13ddb50abb5404c01cf4ef96457a5f736d873b08`。
- 双仓目标：私有 `openpolinex` 的 `codex/handoff-progress-2026-11-15`；公开 `PolinexClient-Reborn` 的 `main`。
- R1989 本地内容正在整理并准备阶段性同步；同步完成后以机器记录中的远端 refs 与 blobs 为准。

## 当前唯一切片：Pathfinder 路线生命周期

- 沿真实调用链追踪路线结果写入 → 执行状态 → 停止/清理 → 磁盘缓存读取/失效，定位下一个可独立静态复核的方法后再修改。
- R1989 两个已确认差异不再重复调查：option 100 应直接调用 `a(Number):boolean`；方向门控应按原版使用 primitive boolean 与 gate-null 分支，不得将 Boolean/Integer 强转 Byte。
- 每个修改方法仍须按完整原版类名、名称及 JVM descriptor 核对分支、调用目标/接收者、默认参数、异常和状态副作用；需要有效世界的方法留给受控客户端验收，不用空对象猜实现。

## 有效证据与开放项

- [R1989 机器证据](../evidence/mining/r1989-pathfinder-player-input-helper/manifest.json)：原版 archive SHA、完整 javap 摘要、源文件内容 SHA、R1989 最终编译 class 与构建/JAR SHA；原始 archive、dump、日志与构建产物不发布。
- R1989 Temurin JDK 25 全树构建 exit 0（18 条既有 `Unsafe` 警告，测试 `NO-SOURCE`）；只有静态与构建验收，正常 Pathfinder 路径、有效世界、停止/缓存生命周期、客户端及兼容服务器均未运行。
- Pathfinder 路线与碰撞的正常玩家路径、取消/清理及缓存仍开放；Powder Macro、Glacite Commission Macro 和 ClickGUI 相关入口/持久化仍未整体验收。
- 真实兼容服务器登录、交互、断开、重连仍未通过；缺地址或授权账号只暂停服务器验收，不停止其他源码恢复。

## 下一步与同步纪律

- 先完成 R1989 阶段性同步：更新双语 README、提交源码/证据/交接到两个目标 refs，核对远端 refs 及共享文件 Git blobs，并保存同步机器记录。
- 随后继续唯一 Pathfinder 路线生命周期切片。只按明确源码或字节码证据修复；一个依赖闭合的小切片后做全树构建和相关运行验收。
- 不覆盖或清理其他 worktree 的源码、调查脚本和证据；不强推；README 与本交接须随每个同步批次更新。
