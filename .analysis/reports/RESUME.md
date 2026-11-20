# OpenPolinex 当前交接

> 更新：2026-11-19（America/Chicago）。R1988 已恢复 Glacite Commission Macro 两个方法的静态控制流，Temurin JDK 25 全树构建通过，源码、机器证据和双语进度文档已同步到私有 `openpolinex` 与公开 `PolinexClient-Reborn`。静态复核和构建成功不代表正常用户路径等价；详见 [R1988 双仓同步记录](SYNC-20261120-COMMISSION-R1988.json)。

## 当前基线

- 集成工作树：`C:\Users\AutoB\.codex\worktrees\bootstrap-eclientinit\OpenPoli`
- 分支/当前提交：`codex/bootstrap-eclientinit-2026-11-15` / `4c90664d3400f16f8c63a3b326a6d0a3e67f6608`（R1988 源码与证据提交）
- 双仓目标：私有 `openpolinex` 的 `codex/handoff-progress-2026-11-15`；公开 `PolinexClient-Reborn` 的 `main`。
- 保留其他 worktree 的未提交源码、脚本和证据；不要对其 pull/reset、清理或覆盖。

## 最近闭合切片：R1988 Glacite Commission Macro

- 文件：`polinex-src/src/main/java/me/octo/client/IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.java`。按完整原版 descriptor 恢复 `aC()V` 的 Kotlin enum switch-map / `Number.intValue()` 数据流，以及 `bs()V` 的控制值门控、早退、目标扫描与调用接收者。
- 已核对字段写入及异常 identity pass-through；异常表布局与 Kotlin 原字节码不同，但所有相关 `NoSuchElementException` handler 都原样重抛。
- Temurin JDK 25 全树构建 exit 0（18 条既有 Unsafe 警告，测试 `NO-SOURCE`）。机器证据位于 `.analysis/evidence/mining/r1988-glacite-commission-tick-scan/`。
- R1988 源码、证据、双语 README 与交接状态已阶段性同步到两个仓库；同步记录列出提交、文件 blob 和验收边界。
- 未运行客户端、有效世界、Commission 正常入口或兼容服务器；不宣称宏功能等价或完成。

## 当前唯一切片：Pathfinder 路线生命周期调用链

- 只读追踪真实路线结果写入 → 执行状态 → 停止/清理 → 缓存读取/失效，确认可达调用链和下一个可独立静态复核的方法后再修改。
- 继续优先恢复 Pathfinder 寻路相关托管源码；每个方法按完整原版类名、方法名和 JVM descriptor 核对字段、接收者、分支、默认参数、异常和副作用。
- Powder Macro、Glacite Commission Macro 的正常入口、配置、状态推进和中断清理仍分别未验收；不把 R1988 当作任一宏整体闭合。

## 开放验收与纪律

- Pathfinder 正常玩家入口、有效世界路线/碰撞、停止与磁盘缓存生命周期、客户端和兼容服务器行为仍未通过；不得用空对象探针或单纯 build/启动替代。
- ClickGUI 鼠标事件、分类切换、Draw 控件、模块开关及设置保存/重载仍开放。
- 真实兼容服务器登录、交互、断开和重连未验证；缺地址或授权账号只暂停服务器验收，不停止其他恢复。
- 每个可审阅功能批次更新中英文 README、最小机器证据与双仓同步记录；保留仓库历史并核验远端 refs 和共享文件 blobs，不强推。
