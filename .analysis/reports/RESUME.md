# OpenPolinex 当前交接

> 更新：2026-11-20 UTC（芝加哥当地日期 2026-11-19）。R1990 完成 Pathfinder 外层事件处理器的完整 descriptor 静态复核与 Temurin JDK 25 全树构建；未做客户端、有效世界或正常寻路验收。R1990 双仓同步进行中，完成后补入同步记录与远端提交号。

## 当前基线

- 集成工作树：`C:\Users\AutoB\.codex\worktrees\bootstrap-eclientinit\OpenPoli`；分支 `codex/bootstrap-eclientinit-2026-11-15`。
- R1990 修改基于 `6bc0d1c727016f6715439e3ccad9912b49b67eac`；目标托管源码 SHA-256：`1abd41550641105bad39b7f7c0cc50e58ba50c38739607a0f9cce0a74b1e1b22`。
- 双仓目标：私有 `openpolinex` 的 `codex/handoff-progress-2026-11-15`；公开 `PolinexClient-Reborn` 的 `main`。开始同步前分别核验的远端 refs：私有 `6bc0d1c727016f6715439e3ccad9912b49b67eac`，公开 `0df3382d7049427eae421d335f30216be1bfdc29`。

## 当前唯一切片：Pathfinder 路线生命周期

- R1990 已恢复外层事件处理器 `a(event):void` 的 gate/null 分支、volatile 读取次序与空值契约。完整静态对照、限制和编译器差异见 [R1990 静态复核](../evidence/mining/r1990-pathfinder-event-handler/static-review.txt)及[机器证据](../evidence/mining/r1990-pathfinder-event-handler/manifest.json)。
- 下一步沿真实调用链检查路线结果写入 → 执行状态 → 停止/清理 → 磁盘缓存读取/失效，先锁定有原版证据且可独立复核的方法，再修改并全树构建。
- 不重做已排除的全量渲染普查、坐标倍率盲扫、旧 ClickGUI 无目的点按及已确认的 R1989 差异。

## 有效证据与开放验收

- [R1990 机器记录](../evidence/mining/r1990-pathfinder-event-handler/manifest.json)、[静态复核](../evidence/mining/r1990-pathfinder-event-handler/static-review.txt)、[构建摘要](../evidence/mining/r1990-pathfinder-event-handler/build-summary.txt)。完整原版/编译 javap dump、protected archive、原始构建日志与构建产物仅保留本机。
- Pathfinder 正常玩家路径、有效世界中的路线与碰撞、停止/取消和磁盘缓存生命周期仍未验收；R1990 不能证明运行时等价或 Pathfinder 闭环。
- ClickGUI 输入/设置持久化、Powder Macro、Glacite Commission Macro 及其他未恢复功能仍开放；真实兼容服务器登录、交互、断开和重连也未验证。
- 编译、启动、计数、静态引用匹配均不单独作为功能等价证据。需要 MC 世界/实体的方法只用有效世界正常入口验证，不以 null 或 plain object 猜实现。

## 同步纪律

- 每个通过静态复核和全树构建的功能批次更新双语 README、机器证据和双仓同步记录；分别验证私有/公开 refs 与共享文件 blobs，不强推。
- 只在本工作树提交本切片；保留其他 worktree、未跟踪调查工具和证据。目标路径的新增或未解释异常阻断通过。
