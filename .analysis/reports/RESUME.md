# OpenPolinex 当前交接

> 更新：2026-11-19 18:17 UTC。R1971 与 R1972 的代码/证据已同步至私有 `openpolinex` 和公开 `PolinexClient-Reborn` 并核验 refs；R1972 含 `c(List):ArrayList` 完整静态复核与 Temurin JDK 25 全树构建，以及对 `b(List)` smoother 读取时点的窄幅补正。记录见 [R1972 双仓同步](SYNC-20261119-PATHFINDER-R1972.json)。当前唯一源码切片为 R1973 `Pathfinder e(Vec3,Vec3,Vec3):ArrayList` 完整原版 descriptor 审计；正常玩家/世界/服务器验收仍开放。保护 JAR/class 与完整 `javap` dump 仅本机留存。

## 下一唯一切片：R1973 Pathfinder `e(Vec3,Vec3,Vec3):ArrayList`
这是 R1972 `c(List)` 的直接返回 helper。按完整原版 descriptor 核对字段/调用目标及接收者、分支、数值常量、异常和副作用；只修有确定字节码证据的差异，再做全树构建。其 world/geometry 分支留待有效游戏状态与正常用户路径验收，不用 null/plain-object/worldless fixture 推断。
这是 R1971 移动意图方法的直接控制生成依赖。按完整原版 descriptor 复核其字段、调用目标/接收者、分支、异常、列表操作及副作用；只修有确定字节码证据的差异，再做全树构建。它使用有效玩家、世界/几何和按键状态的路径留待真实运行验收，不用 null/plain-object/worldless fixture 推断。

## 最近已完成的有效证据

- **R1971 `b(List):ArrayList`**：源文件 `polinex-src/src/main/java/me/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll.java`。修复原版 gate-null 分支：短路避免读取 player，fallback 按原始迭代顺序至多取/强转首元素但不访问节点或添加点，最后以 mode `1` 调用 smoother；gate 非空且 player-null 时则映射全部路线坐标。完整原版 descriptor offset 0–1230、51 个异常表项；静态复核：[manifest](../evidence/mining/r1971-pathfinder-movement-intent/manifest.json)、[static review](../evidence/mining/r1971-pathfinder-movement-intent/static-review.txt)、[最终构建记录](../evidence/mining/r1971-pathfinder-movement-intent/build-jdk25-final.log)。JDK 25 全树 `build --rerun-tasks` exit 0，18 条既有 Unsafe/deprecation/unchecked warnings。Java 17 的初次尝试只在配置阶段失败，未编译源码，见 attempts。
- R1971 最终源 blob `874baec2161fa44a2f4580ac8b76294dcbbaf5e6`，LF SHA-256 `d91aef84f3ebee66bceae07d5d76393052ae6df6b8e60f3089c2f3d9b9bdace5`，构建时工作树 SHA-256 `61e5dd22a2734b94ab8ed0ad2d93db67ca9fe1f43cb5c9090b62f69b6c0c29bc`。完整 javap 与原始构建日志仅本机留存。
- **R1972 `c(List):ArrayList` + `b(List)` fallback evaluation order**：修复 guard-null iterator/no-accessor 分支、receiver/collection-size/player 读取顺序及六处 Kotlin non-null checks；完整复核 b/c offsets `0–1230`/`0–2237` 与 `51`/`84` 个原版 handler，最终字段/调用事件无未匹配。证据：[manifest](../evidence/mining/r1972-pathfinder-list-control-output/manifest.json)、[static review](../evidence/mining/r1972-pathfinder-list-control-output/static-review.txt)、[最终 JDK25 构建](../evidence/mining/r1972-pathfinder-list-control-output/build-jdk25-final.log)。源 blob `6a9b7e7d6fca665ab35a132945b22bd383a8dacd`，LF SHA `7cc8e15527f447892b1900fa32b0075cb5c9a8680b5a125a47c88e1b99cbe23a`，build 时工作树 SHA `a6e7578215271e7f849261296ba3a2fcb07ff717bbd0cd7c7d1842455fc5b3`。无游戏/有效玩家世界/正常入口/服务器验收。
- **R1970 `b(List,boolean)`**：循环末索引已在循环前缓存；完整静态及全树构建见 [manifest](../evidence/mining/r1970-pathfinder-route-boundary/manifest.json)。R1970 距离 helper `c(Vec3,Vec3):double` 和实体位置 `a(Entity):Vec3` 的完整 descriptor 静态对照未发现确认差异；世界/玩家运行路径未执行。
- R1971 没有直接探针、Minecraft 启动、有效玩家/世界、正常用户入口、兼容服务器或桌面输入验收；不以静态恢复或构建通过代替行为等价。

## 仍开放的验收

- Pathfinder 正常玩家路线、实际世界碰撞、磁盘缓存生命周期及兼容服务器行为仍未关闭。
- ClickGUI 鼠标命中、模块开关、设置列表及保存/重载闭环；Powder Macro、Commission Macro、Route editor 导入、渲染、配置、网络、native/JNIC 均仍有未恢复或未验收项。
- 真实服务器登录、交互、断开、重连未验证；缺授权账号/地址时暂停该验收但继续源码工作，不得宣布整体完成。
- 不发布原始 JAR、protected class、完整 javap dump、编译 class、Gradle 缓存或带机器路径的原始日志。Git blob、LF 文本 SHA 与工作树字节 SHA 分开记录。

源码库存：1,602 个 Java 文件、1,158,462 行。`python -B .analysis/stats.py` 可复算；计数不表示功能完成度。
