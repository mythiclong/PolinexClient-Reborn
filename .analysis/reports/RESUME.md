# OpenPolinex 当前交接

> 更新：2026-11-19 17:19 UTC。R1969 内容/证据已同步：私有 `openpolinex` 内容提交 `16b2a70`、公开 `PolinexClient-Reborn/main` 内容提交 `b993352`；远端 refs 已核验，记录见 [R1969 双仓同步](SYNC-20261119-PATHFINDER-R1969.json)。不要覆盖其他工作树或清理未跟踪调查工具。原版 JAR 和完整 `javap` 转储仅本机使用、不发布。

## 当前唯一切片：R1970 Pathfinder `b(List, boolean)`

直接审计 `d(List)` 的两个依赖入口：`d(List)` 调 `b(list,false)`，`e(List)` 调 `b(list,true)`。先按完整原版 descriptor 复核当前源码/编译产物的字段、接收者、分支、异常、默认值与副作用；只修有确定字节码证据的差异。

## 已完成且有效的本阶段证据

- R1969 `d(List):void` 已恢复完整原版 CFG（offset 0–410，19 个异常表项），含 gate/player 早退、`b(list,false)` 空结果分支、option 700、route predicates、距离阈值/friction 条件和 `jump` 状态写入。异常 helper 是 identity。完整证据：[R1969 manifest](../evidence/mining/r1969-pathfinder-d-list/manifest.json)；静态映射：[static-review](../evidence/mining/r1969-pathfinder-d-list/static-review.txt)。
- R1969 最终 Temurin JDK 25.0.4.1 全树 `build --rerun-tasks` exit code 0；18 条现有 Unsafe/deprecation/unchecked warnings。此前两次 HotSpot C2 native-memory 构建失败，另有一次成功输出未保留退出码；这些均列于 [attempts.json](../evidence/mining/r1969-pathfinder-d-list/attempts.json)，最终成功构建使用受限编译/GC 参数。无需重跑该已验证切片。
- 直接探针、Minecraft 启动/有效世界、正常 Pathfinder 玩家路径、兼容服务器均未执行；不以静态恢复或构建通过代替运行验收。
- 当前源码库存：1,602 个 Java 文件、1,158,427 行；`python -B .analysis/stats.py` 可复算。计数不等于功能完成度。
- R1968 `a(Entity,List,Vec3):void` 静态与构建证据见 [manifest](../evidence/mining/r1968-pathfinder-entity-route/manifest.json)；世界/碰撞依赖路径仍待有效游戏验证。

## 仍开放的验收与已排除

- Pathfinder 正常玩家路线、有效世界碰撞、缓存生命周期及兼容服务器行为仍开放；ClickGUI 鼠标命中/模块开关/设置保存重载、Powder Macro、Commission Macro、配置、渲染、网络和 native/JNIC 亦未整体验收。
- 已排除：R1968 中 `d(List)` 的三个调用点已完整定位，当前不再重复扫描；原版输入窗口焦点故障由 vanilla Options 对照排除；不以 null/plain-object/worldless fixture 推断世界/实体逻辑。
- 不发布原始 JAR、受保护 class、完整 javap dump、编译 class、Gradle 缓存或包含本机路径的原始构建/崩溃日志。源码 Git blob、规范化 SHA 与工作树 SHA 分开记录。

下一步只做 R1970 `b(List,boolean)` 完整静态审计；取得确定差异后先按原版修复，再全树构建。随后继续 Pathfinder 其余依赖链，并把有效客户端/服务器路径保留为独立未关闭验收。
