# OpenPolinex 当前交接

> 更新：2026-11-19 19:00 UTC。R1974 源码、证据和双语 README 已分别快进推送到私有 `openpolinex` 与公开 `PolinexClient-Reborn`，内容 refs 已核验；本交接与同步记录作为元数据提交补入。

## 当前唯一切片：R1975 Pathfinder `f(Vec3,Vec3,Vec3):boolean`

完整审计此几何/碰撞 helper 的原版 owner、精确 descriptor、调用接收者、分支、常量、异常和副作用；只修改有明确字节码证据的差异。涉及真实世界/实体几何的路径留待有效客户端世界和正常玩家入口验证，不用 null/plain-object/worldless fixture 猜测。

## 最近完成：R1974 Pathfinder `a(Vec3,Vec3,List,Vec3):Pair`

完整原版 descriptor offset 0–170、8 个异常表项已复核。修复 gate 非空时 `distance <= f()+0.75`、gate 为空时原始 comparator 非零（包括 NaN）及 gate-null 绕过第二几何谓词；距离和阈值按原版在 gate 分支前求值。最终编译的字段/方法目标事件流 13 项无未匹配；3 处私有调用 opcode 因 Kotlin/Javac lowering 不同而变化，target/receiver 相同。Temurin JDK 25 全树构建 exit 0。没有直接探针、Minecraft 客户端、有效玩家/世界、正常用户路径或服务器验收。

证据：[R1974 manifest](../evidence/mining/r1974-pathfinder-conditional-pair/manifest.json)、[静态复核](../evidence/mining/r1974-pathfinder-conditional-pair/static-review.txt)、[构建摘要](../evidence/mining/r1974-pathfinder-conditional-pair/build-jdk25-final.log)、[构建尝试](../evidence/mining/r1974-pathfinder-conditional-pair/attempts.json)、[双仓同步记录](SYNC-20261119-PATHFINDER-R1974.json)。

## 仍开放的用户功能 / 验收

- Pathfinder 正常玩家路线、有效世界碰撞、磁盘缓存生命周期和兼容服务器行为仍未验收；静态与构建通过不代表功能等价。
- ClickGUI 鼠标命中、模块开关、设置列表与保存/重载闭环仍开放。
- Powder Macro、Glacite Commission Macro、Route editor JSON 导入，以及渲染、配置、网络、native/JNIC 仍有未恢复或未验收内容。
- 真实服务器登录、交互、断开和重连未测试；R1974 未启动游戏或桌面输入。

## 约束与下一步

- 私有目标分支 `codex/handoff-progress-2026-11-15` 的 R1974 内容提交：`94d2b3483ac4d0daeb84c87b9ce03f06b665de1d`；公开 `PolinexClient-Reborn/main` 内容提交：`90729b091f0ca70d55e612debaf47b424c1053bb`。两端只 fast-forward，无 force-push。
- 不重做全量渲染普查、坐标倍率盲扫或无明确判定点的点击实验；已撤回假设不重新排队。
- 不发布原始 protected JAR/class、完整 javap dump、编译产物、Gradle 缓存或含本机路径的原始日志。
- 完成本次元数据同步后，继续唯一切片 R1975。

当前统计：1,602 个 Java 文件、1,158,468 行（`python -B .analysis/stats.py`）；计数仅描述源码库存。
