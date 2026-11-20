# OpenPolinex 当前交接

> 更新：2026-11-20 UTC。R1987 Pathfinder trajectory-check helper 与真实路线键调用者已静态恢复，Temurin JDK 25 全树构建通过；源码、证据及双语 README 已阶段性同步至私有 `openpolinex` 和公开 `PolinexClient-Reborn`，提交 refs 与所列共享文件 blobs 已核验。同步记录见 [R1987 sync](SYNC-20261120-PATHFINDER-R1987.json)。无运行时等价或完整寻路闭环声明。

## 当前基线

- 集成工作树：`C:\Users\AutoB\.codex\worktrees\bootstrap-eclientinit\OpenPoli`
- 集成分支/源码内容提交：`codex/bootstrap-eclientinit-2026-11-15` / `3671f5e3b8079e5fd700e34a8c57c1b5293076eb`
- 双仓 R1987 内容提交：私有 `openpolinex/codex/handoff-progress-2026-11-15`=`3671f5e3b8079e5fd700e34a8c57c1b5293076eb`；公开 `PolinexClient-Reborn/main`=`52610dde1819b37781cfba2ab26079a621e1b7dd`。
- 保留其他 worktree 的未提交工作；不要对其 pull/reset 或清理。
- 本切片涉及两个 Java 源文件、双语 README 和三份机器证据；证据/双仓核验记录已入库。

## 当前唯一切片：R1987 Pathfinder trajectory check

- 恢复 `a(Vec3,Vec3,Vec3,IZDZZD):boolean` 的原版调用顺序、状态构造、包含上限循环、guard/`k()`/碰撞及垂直阈值分支。
- 修复真实 `a(List,int)` 路线键调用者：改调 typed Kotlin default bridge，使用原版 mask 508，避免命中返回 null 的泛型 Object 占位重载。
- 完整 descriptor 静态复核、构建后目标调用核对：通过；Temurin JDK 25 `build --rerun-tasks --no-daemon --console=plain` exit 0（18 条既有 Unsafe 警告，测试 `NO-SOURCE`）。证据位于 `.analysis/evidence/mining/r1987-pathfinder-trajectory-helper/`。
- 未运行有效世界差分、客户端正常寻路、玩家/碰撞/路线执行、停止/缓存生命周期或兼容服务器测试；不宣称 Pathfinder 闭环或功能等价。

## 开放缺口与下一步

- 优先追踪真实路线消费者链：路线结果写入 → 执行状态 → 停止/清理 → 缓存读取与失效；优先找 Pathfinder 与 Powder/Commission Macro 共用缺口。沿完整原版 descriptor 和调用点逐方法恢复，不做泛化批量修改。
- Powder Macro、Glacite Commission Macro 的正常入口、配置、事件状态机和结束/中断清理仍需分别闭合；共享寻路能力完成后接入并分别验收。
- 继续推进路线结果写入、执行状态、停止/清理与缓存读取/失效的真实调用链；优先选择 Pathfinder、Powder Macro、Commission Macro 的共享缺口。每个可审阅且已构建的功能批次更新双语 README、RESUME、最小证据并同步两个仓库。
- 有效世界/客户端与兼容服务器验收仍开放；缺服务器地址或授权账号不能作为停止其他恢复的理由。
