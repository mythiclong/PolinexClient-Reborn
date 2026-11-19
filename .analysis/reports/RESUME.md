# OpenPolinex 当前交接

> 更新：2026-11-19 19:14 UTC。R1975 源码、机器证据和中英文 README 已分别快进推送到私有 `openpolinex` 与公开 `PolinexClient-Reborn`；两个内容提交的远端 refs 已核验。README 所链接的本记录及本交接随后作为元数据快进同步。

## 当前唯一切片：R1976 Pathfinder `a(Vec3,double):boolean`

静态审计 `f(Vec3,Vec3,Vec3):boolean` 直接调用的半径/碰撞谓词。按原版完整 owner、精确 JVM descriptor 和方法字节码复核接收者、字段/方法目标、分支、常量、异常和副作用；只修复有明确原版依据的差异。需要有效世界或实体的行为留待有效客户端路径验收，不用 null/plain-object/worldless fixture 猜测。完成后全树构建并更新双语 README、RESUME 与两仓证据。

## 最近完成：R1975 Pathfinder `f(Vec3,Vec3,Vec3):boolean`

完整原版 descriptor（offset 0–345、8 个异常表项）已复核。恢复两处 `Vec3.add` 后缺失的 Kotlin 非空表达式检查；原版与最终编译方法有序核心字段/方法/类引用 29 项一致。Temurin JDK 25 全树 `build --rerun-tasks` exit 0。没有直接探针、客户端、有效世界/玩家、正常用户路径或兼容服务器验收。

证据：[manifest](../evidence/mining/r1975-pathfinder-geometry-probe/manifest.json)、[静态复核](../evidence/mining/r1975-pathfinder-geometry-probe/static-review.txt)、[构建摘要](../evidence/mining/r1975-pathfinder-geometry-probe/build-jdk25-final.log)、[尝试记录](../evidence/mining/r1975-pathfinder-geometry-probe/attempts.json)、[双仓同步记录](SYNC-20261119-PATHFINDER-R1975.json)。

代码内容提交：私有 `openpolinex` / `codex/handoff-progress-2026-11-15`：`0092e2816e79ea0c8e2cf5d5820e7def685734ea`；公开 `PolinexClient-Reborn` / `main`：`9bd709dc8c8da1bd0289573122f52e9ecbdaa103`。两者是各自仓库内独立的 fast-forward 提交。

## 仍开放的用户功能 / 验收

- Pathfinder 正常玩家路线、有效世界碰撞、磁盘缓存生命周期和兼容服务器行为仍未验收。
- ClickGUI 鼠标命中、模块开关、设置列表及保存/重载闭环仍开放。
- Powder Macro、Glacite Commission Macro、Route editor JSON 导入，以及渲染、配置、网络、native/JNIC 仍有未恢复或未验收项。
- 真实兼容服务器登录、交互、断开和重连未测试；不以构建成功或静态复核通过宣称行为等价。

## 证据与边界

- 源码库存：1,602 个 Java 文件、1,158,472 行；计数不代表功能完成。
- 不发布原始受保护 JAR/class、完整 javap dump、编译产物、Gradle 缓存或带本机路径的原始构建日志。
- 不重做全量渲染普查、坐标倍率盲扫或无明确判定点的鼠标实验；输入工具故障只让该实验 VOID，不形成模组结论。
- 两仓只进行 fast-forward，不 force-push；本地无关改动和调查工具均保留。
