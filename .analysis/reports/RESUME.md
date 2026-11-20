# OpenPolinex 当前交接

> 更新：2026-11-20 UTC。当前唯一源码切片 R1987 已完成 Pathfinder trajectory-check helper 与其真实路线键调用者的静态恢复；Temurin JDK 25 全树构建通过。R1987 尚未提交、尚未同步到 GitHub 两仓。源码/构建静态证据不代表运行时等价。

## 当前基线

- 集成工作树：`C:\Users\AutoB\.codex\worktrees\bootstrap-eclientinit\OpenPoli`
- 分支/基线：`codex/bootstrap-eclientinit-2026-11-15` / `c744fcc55e1c558d3b3b7bfd2bca1226c2618a1c`
- 保留其他 worktree 的未提交工作；不要对其 pull/reset 或清理。
- R1987 工作树改动：两个 Java 源文件、双语 README、三份忽略规则下的机器证据；`.analysis/reports/RESUME.md` 已恢复并更新。

## 当前唯一切片：R1987 Pathfinder trajectory check

- 恢复 `a(Vec3,Vec3,Vec3,IZDZZD):boolean` 的原版调用顺序、状态构造、包含上限循环、guard/`k()`/碰撞及垂直阈值分支。
- 修复真实 `a(List,int)` 路线键调用者：改调 typed Kotlin default bridge，使用原版 mask 508，避免命中返回 null 的泛型 Object 占位重载。
- 完整 descriptor 静态复核、构建后目标调用核对：通过；Temurin JDK 25 `build --rerun-tasks --no-daemon --console=plain` exit 0（18 条既有 Unsafe 警告，测试 `NO-SOURCE`）。证据位于 `.analysis/evidence/mining/r1987-pathfinder-trajectory-helper/`。
- 未运行有效世界差分、客户端正常寻路、玩家/碰撞/路线执行、停止/缓存生命周期或兼容服务器测试；不宣称 Pathfinder 闭环或功能等价。

## 开放缺口与下一步

- 优先追踪真实路线消费者链：路线结果写入 → 执行状态 → 停止/清理 → 缓存读取与失效；优先找 Pathfinder 与 Powder/Commission Macro 共用缺口。沿完整原版 descriptor 和调用点逐方法恢复，不做泛化批量修改。
- Powder Macro、Glacite Commission Macro 的正常入口、配置、事件状态机和结束/中断清理仍需分别闭合；共享寻路能力完成后接入并分别验收。
- 先完成并核验 R1987 阶段性发布：更新私有 `openpolinex` 进度分支和公开 `PolinexClient-Reborn/main` 的源码、README 中英文、RESUME 与最小证据索引；独立保留各自 Git 历史，不强推。记录两端远端 ref 及共享文件 blob。
- 有效世界/客户端与兼容服务器验收仍开放；缺服务器地址或授权账号不能作为停止其他恢复的理由。
