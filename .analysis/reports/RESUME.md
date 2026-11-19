# OpenPolinex 当前交接

> 更新：2026-11-19 19:25 UTC。R1976 源码、机器证据及中英文 README 已分别快进推送到私有 `openpolinex` 与公开 `PolinexClient-Reborn`；内容提交的远端 refs 已核验。本交接和本切片同步记录随后的元数据提交会再次核验。

## 当前唯一切片：R1977 Pathfinder `a(Vec3):boolean`

完整审计当前路线位置谓词的原版 owner、精确 JVM descriptor 与字节码，核对字段/调用接收者、分支、常量、异常、副作用及设置/路线状态依赖。只按明确原版证据修复。该链路可能依赖有效玩家和世界；不使用 null/plain-object/worldless fixture 猜行为。完成后全树构建，并把本批证据和双语 README 快进同步到两仓。

## 最近完成：R1976 Pathfinder `a(Vec3,double):boolean`

完整原版 descriptor（offset 0–169、4 个异常表项）已复核；补回 `ClientLevel.getBlockCollisions` 后缺失的 Kotlin 非空检查及原始消息。最终编译方法与原版的有序核心字段/方法/类引用 18 项一致。Temurin JDK 25 全树 `build --rerun-tasks` exit 0。没有直接探针、客户端、有效世界/玩家、正常用户路径或兼容服务器验收。

证据：[manifest](../evidence/mining/r1976-pathfinder-block-collision-predicate/manifest.json)、[静态复核](../evidence/mining/r1976-pathfinder-block-collision-predicate/static-review.txt)、[构建摘要](../evidence/mining/r1976-pathfinder-block-collision-predicate/build-jdk25-final.log)、[尝试记录](../evidence/mining/r1976-pathfinder-block-collision-predicate/attempts.json)、[双仓同步记录](SYNC-20261119-PATHFINDER-R1976.json)。

代码内容提交：私有 `openpolinex` / `codex/handoff-progress-2026-11-15`：`5e083edcb4cb9460e7d1c351cf0e5643e5c0fa08`；公开 `PolinexClient-Reborn` / `main`：`d8f364ce4e7b456382b4fb10aa1393b0a00d38db`。两者各自为 fast-forward 提交。

## 仍开放的用户功能 / 验收

- Pathfinder 正常玩家路线、有效世界碰撞、磁盘缓存生命周期和兼容服务器行为仍未验收。
- ClickGUI 鼠标命中、模块开关、设置列表及保存/重载闭环仍开放。
- Powder Macro、Glacite Commission Macro、Route editor JSON 导入，以及渲染、配置、网络、native/JNIC 仍有未恢复或未验收项。
- 真实兼容服务器登录、交互、断开和重连未测试。静态复核、构建、进入世界或无崩溃都不单独证明功能等价。

## 证据与边界

- 源码库存：1,602 个 Java 文件、1,158,474 行；计数不代表功能完成。
- 不发布原始受保护 JAR/class、完整 javap dump、编译产物、Gradle 缓存或带本机路径的原始构建日志。
- 不重做全量渲染普查、坐标倍率盲扫或无明确判定点的鼠标实验；输入工具故障仅让对应实验 VOID。
- 两仓只进行 fast-forward，不 force-push；本地无关改动和调查工具均保留。
