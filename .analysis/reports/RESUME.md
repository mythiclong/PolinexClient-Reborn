# OpenPolinex 当前交接

> 更新：2026-11-19 18:45 UTC。R1973 源码、证据和双语 README 已分别快进推送到私有 `openpolinex` 与公开 `PolinexClient-Reborn`，内容 refs 已核验；本交接与同步记录作为元数据提交补入。

## 当前唯一切片：R1974 Pathfinder `a(Vec3,Vec3,List,Vec3):Pair<Vec3,Vec3>`

完整读取此方法的原版 owner/descriptor/字节码及异常表，核对接收者、调用顺序、分支、默认参数、异常与副作用；只修有确定证据的差异。它位于路线平滑/几何路径，真实世界碰撞及正常玩家入口留到有效客户端状态验收，不用 null、plain-object 或无世界 fixture 推断。

## 最近完成：R1973 Pathfinder `e(Vec3,Vec3,Vec3):ArrayList<String>`

原版 descriptor offset 0–438、11 个异常表项完整静态复核。恢复 `Vec3.add` 非空检查、gate 后单次 player 读取、player/速度向量为空时的零速回退，以及原版 `NaN` 方向比较行为。最终 compiled method 43 项字段/调用/分配/字符串和 double 常量事件流无未匹配；Temurin JDK 25 全树 `build --rerun-tasks` exit 0。一次 Java 17 构建只在配置阶段失败；更早的成功构建在完整字节码复核发现 NaN 差异后作废，只有修正后的最终构建计入通过。

证据：[R1973 manifest](../evidence/mining/r1973-pathfinder-direction/manifest.json)、[静态复核](../evidence/mining/r1973-pathfinder-direction/static-review.txt)、[构建摘要](../evidence/mining/r1973-pathfinder-direction/build-jdk25-final.log)、[构建尝试](../evidence/mining/r1973-pathfinder-direction/attempts.json)、[双仓同步记录](SYNC-20261119-PATHFINDER-R1973.json)。source Git blob `445c75fa755b91f86fe6bbb014a87c7a716a75c2`，LF SHA-256 `a7f906ec3082801e32c0a60e964ff446384fe0e0e87e9d3e00c9a00e596adfc5`；构建时工作树字节 SHA-256 `0cfa71f7298281f4de998dd17537156769a101a5c07bc823f76caae830e9c64e`。原 JAR、class 与完整 javap dump 为本机只读证据，未加入本批次。

## 仍开放的验收 / 已知缺口

- Pathfinder：正常玩家路线、有效世界碰撞、磁盘缓存生命周期及兼容服务器行为仍未通过实机/服务器验收。静态与构建通过不代表用户功能等价。
- ClickGUI：同进程原版 Options 对照之外，分类图标和 Draw 控件仍无可观察鼠标反馈；事件转发/命中、模块开关、设置列表与保存/重载闭环开放。
- Powder Macro、Glacite Commission Macro、Route editor JSON 导入，以及渲染、配置、网络、native/JNIC 仍有未恢复或未验收内容。
- 兼容服务器登录、交互、断开、重连未测试；R1973 没有启动客户端或操控桌面输入。

## 约束与下一步

- 私有目标分支 `codex/handoff-progress-2026-11-15` 的 R1973 内容提交：`bba9a5c5ef101a460b1aacf4259380dbfd47d460`；公开 `PolinexClient-Reborn/main` 内容提交：`365e59065a6d234edeac51dda4a6d2bab1ccae71`。两端只做 fast-forward，无 force-push。
- 不重复全量渲染普查、坐标倍率盲扫或没有明确判定点的点击实验；已撤回假设不重新排队。
- 不发布原始 protected JAR/class、完整 javap dump、编译产物、Gradle 缓存或含本机路径的原始日志。
- 完成本次元数据同步后，继续唯一切片 R1974；通过的功能批次再同步至两个仓库。

当前统计：1,602 个 Java 文件、1,158,466 行（`python -B .analysis/stats.py`）；计数仅描述源码库存，不代表功能完成度。
