# OpenPolinex 当前交接

> 更新：2026-11-19（America/Chicago；2026-11-20 UTC）。R1989 修复 Pathfinder 所用玩家路径/输入辅助方法 `a(Vec3,Vec3,boolean,double):void` 的两个原版控制流偏差；完整 descriptor 静态复核及 Temurin JDK 25 全树构建通过。代码、证据及双语 README 已同步到两个仓库，详见 [R1989 同步记录](SYNC-20261120-PATHFINDER-R1989.json)。客户端、有效世界与正常寻路尚未验收，不代表 Pathfinder 闭环。

## 当前基线

- 工作树：`C:\Users\AutoB\.codex\worktrees\bootstrap-eclientinit\OpenPoli`
- 集成分支：`codex/bootstrap-eclientinit-2026-11-15`；R1989 私有内容提交 `41a9d50507f7afabfda2cc20253fda3226787056`，公开 `main` 内容提交 `b2f160e7186b79df9e020af850ab6f8a42760137`。
- 双仓目标：私有 `openpolinex` 的 `codex/handoff-progress-2026-11-15`；公开 `PolinexClient-Reborn` 的 `main`。
- 两个远端 refs 与 R1989 共享文件 Git blobs 已核验；完整仓库 tree 不同。同步记录标明证据生成基线与入库提交。

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

- 继续唯一 Pathfinder 路线生命周期切片：追踪真实路线结果写入 → 执行状态 → 停止/清理 → 缓存读取/失效，锁定下一个有证据的方法，再做有界源码恢复和全树构建。
- 每个通过检查的功能批次更新双语 README、机器证据与双仓同步记录；只按明确源码或字节码证据修复。
- 不覆盖或清理其他 worktree 的源码、调查脚本和证据；不强推；README 与本交接须随每个同步批次更新。
