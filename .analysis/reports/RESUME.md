# OpenPolinex 当前交接

> 更新：2026-11-20 UTC（芝加哥当地日期 2026-11-19）。R1993 Pathfinder 路线入口 gate 切片已完成完整 descriptor 静态复核与 Temurin JDK 25 全树构建；尚无客户端/有效世界/正常路线运行验收，暂不宣称运行时等价或 Pathfinder 闭环。双仓内容提交和 README 进度同步待本次发布后核验。

## 当前基线

- 集成分支：`codex/bootstrap-eclientinit-2026-11-15`；R1993 开始提交 `3c84be1cfafa7c8e3142298620ade36f20f5e875`。当前待提交范围为 Pathfinder controller 一个源码文件、R1993 最小证据及本 README/RESUME 更新。
- R1992 最近完整同步 refs：私有 `openpolinex` 进度分支 `3c84be1cfafa7c8e3142298620ade36f20f5e875`；公开 `PolinexClient-Reborn/main` `a5e2c2eedc5e7ad73d279574a766825d879ae6a6`。R1992 内容提交为 `220f2c0` / `946bdd5`；两个远端 refs、9 个共享 blobs 和双语 README 已核验。见 `.analysis/reports/SYNC-20261120-COMMISSION-R1992.json`。
- R1993 源文件 SHA-256 `d86d66b455519a575e6b85b8b5ec7ff74fa0bcaacfb29338b3d2c2ef3a893f18`，Git blob `16ec8dcf9e608621df4547c69f5423c6a0b67967`。证据目录：`.analysis/evidence/mining/r1993-pathfinder-route-entry-gate/`。

## 当前切片 R1993：Pathfinder 路线入口 gate

- Owner：`me.octo.client.IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll`；descriptor：`(Ljava/lang/Object;Lnet/minecraft/world/phys/Vec3;ZZ)Z`。
- 原版 gate 非空时才读取 Minecraft.player/玩家位置，并且只在同一 gate 非空时做目标校验和 target/start 字段写入；空 gate 使用带 Kotlin `ZERO` 空值检查的 `Vec3.ZERO`，跳过这两组操作并继续后续流程。完整原版/编译方法 184/145 条指令；22 个有序字段引用与 14 个业务调用事件匹配（排除 11 个 identity 异常转发）；原版异常表 13 项、编译后保留 2 项监视器清理。外层真实字节码中 3 个 synthetic bridge invoke 点已核对。
- JDK 25 全树 Gradle build exit 0；命令、警告及构建后 daemon teardown 的已知签名记在 `build-summary.txt`/`manifest.json`。此前 Java 17 被 Loom 在编译前拒绝；另一 2 GiB C2 尝试因 native memory allocation 失败；降为 1.5 GiB、SerialGC、C1 单编译器后成功。
- 未运行客户端、有效实体/世界、正常寻路、停止/取消/缓存生命周期或兼容服务器。直接运行/用户路径仍开放；无 null/plain-object 伪探针。

## 下一步与仍开放验收

1. 完成 R1993 快进发布到私有 `openpolinex` 进度分支和公开 `PolinexClient-Reborn/main`；更新中文/英文 README 与双仓同步 JSON，核验 refs 和共享文件 Git blobs。
2. 继续 Pathfinder 正常玩家路线、执行进度、停止/取消/清理、缓存读写/失效及有效世界验收；再按优先级继续 Powder Macro 与 Commission Macro。R1992 只恢复 Commission 一个 inventory scan 方法，未闭环。
3. ClickGUI、客户端全功能等价、真实兼容服务器登录/交互/断开/重连仍开放；不得因编译、启动、计数或静态一致宣布完成。

R1992 证据见 `.analysis/reports/SYNC-20261120-COMMISSION-R1992.json`；本切片静态/构建/调用点证据分别见 `r1993-pathfinder-route-entry-gate/static-review.txt`、`build-summary.txt`、`manifest.json`。原始受保护 JAR/class、全量 javap、raw logs、编译产物和绝对本机路径不发布。
