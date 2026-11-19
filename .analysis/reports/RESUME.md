# OpenPolinex 当前交接

> 更新：2026-11-19 18:32 UTC。R1973 的源码复核与 Temurin JDK 25 全树构建已通过；这批代码、证据及双语 README 正在同步到私有 `openpolinex` 与公开 `PolinexClient-Reborn`。同步记录在两端 refs 校验后补入。

## 当前唯一切片：R1974 Pathfinder `a(Vec3,Vec3,List,Vec3):Pair<Vec3,Vec3>`

完整读取此方法的原版 owner/descriptor/字节码及异常表，核对接收者、调用顺序、分支、默认参数、异常与副作用；仅修复有确定证据的差异。它和路线平滑/几何路径有关，真实世界碰撞与正常玩家入口留到有效客户端状态验收，不用 null、plain-object 或无世界 fixture 推断。

## 最近完成：R1973 Pathfinder `e(Vec3,Vec3,Vec3):ArrayList<String>`

原版 descriptor 偏移 0–438、11 个异常表项完整静态复核。恢复 `Vec3.add` 非空检查、gate 后单次 player 读取、player/速度向量为空时的零速回退，以及原版 `NaN` 方向比较行为。最终编译方法 43 项字段/调用/分配/字符串与 double 常量事件流无未匹配；Temurin JDK 25 全树 `build --rerun-tasks` exit 0。一次 Java 17 构建只在配置阶段失败；更早的成功构建在完整字节码复核发现 NaN 差异后作废，只有修正后的最终构建计入通过。

证据：[R1973 manifest](../evidence/mining/r1973-pathfinder-direction/manifest.json)、[静态复核](../evidence/mining/r1973-pathfinder-direction/static-review.txt)、[构建摘要](../evidence/mining/r1973-pathfinder-direction/build-jdk25-final.log)、[构建尝试记录](../evidence/mining/r1973-pathfinder-direction/attempts.json)。原 JAR、class 与完整 javap dump 仍为本机只读证据，未发布。

## 当前已知缺口 / 未关闭验收

- Pathfinder：正常玩家路线、有效世界碰撞、磁盘缓存生命周期及兼容服务器行为仍未通过实机/服务器验收。R1973 是静态与构建通过，不代表用户功能等价。
- ClickGUI：已有同进程原版 Options 对照，但分类图标和 Draw 控件无可观察鼠标反馈；事件转发/命中、模块开关、设置列表与保存/重载闭环仍开放。
- Powder Macro、Glacite Commission Macro、Route editor JSON 导入，以及渲染、配置、网络、native/JNIC 仍有未恢复或未验收内容。
- 兼容服务器登录、交互、断开、重连未测试。客户端与桌面输入本切片均未使用。

## 约束与下一步

- 本地目标分支：私有 `codex/handoff-progress-2026-11-15`，R1972 tip `ddc0f23`；公开仓库 `main` 的 R1972 tip `4b97440`。不要 force-push；分别提交后核验 GitHub refs 和内容 blob。
- 不重复全量渲染普查、坐标倍率盲扫或没有判定点的点击实验；已撤回假设不重新排队。
- 不发布原始 protected JAR/class、完整 javap dump、构建 class/JAR、Gradle 缓存或含本机路径的原始日志。
- 先完成并核验 R1973 双仓同步；随后只推进 R1974，不以静态匹配、编译或模块数量宣称整体完成。

`python -B .analysis/stats.py` 当前统计为 1,602 个 Java 文件、1,158,466 行；计数仅描述源码库存。
