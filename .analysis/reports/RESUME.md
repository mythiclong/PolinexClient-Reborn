# OpenPolinex 当前交接

> 更新：2026-11-19 UTC（芝加哥当地日期：2026-11-19）。R1965 功能内容已同步：私有 `openpolinex` 提交 `b50247621878c1249d8a7ca695e5da646a609b47`，公开 `PolinexClient-Reborn` 提交 `2fff92a77840c845b5d0e96f92cf8c62f122dd64`；两个远端 refs 均已核验。原版 JAR SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`，只在本地使用，不发布。

## 当前唯一切片：R1965 Pathfinder 正常入口 → 执行状态、停止与缓存

本批按原版完整字节码恢复了 `/pathfind` 命令配置缺失的 executor：原版在 `a(): Config` 的 offset 127 捕获 provider 并绑定现有 `a(Self, RouteContext): Unit` helper；当前源码原先传 null，原版 builder 在无 executor、无 subcommand 时会抛 `IllegalArgumentException`。现源码注册非空闭包，Java 编译器生成的 adapter 调用同一 helper。Temurin 25 全树 `build --rerun-tasks` 成功。没有执行正常命令分发或进入有效世界，不能据此宣称寻路行为验收通过。

## 最近有效证据

- [R1965 `/pathfind` executor 静态复核与全树构建](../evidence/mining/r1965-pathfind-command-executor/manifest.json)：记录原版与修复后方法 descriptor、builder 契约、源码 SHA-256、编译产物 `javap` 哈希、命令/退出码及运行验收边界。首次构建误用继承的 Java 17，在 Gradle 配置阶段失败、未编译源码；显式使用 Temurin 25 后通过。
- [R1963–R1964 双仓同步索引](SYNC-20261119-PATHFINDER-R1963-R1964.json)：R1963 gate 完整操作数栈校正；R1964 路线事件消费者类型守卫修复和 Temurin 25 全树构建。
- [R1962 `isWalkable` / A* 有界差分](../evidence/mining/r1962-pathfinder-walkability-astar-diff/manifest.json)：98,304 个有界网格/参数用例；旧记录未保留精确命令及退出码，限制不变。
- [R1956–R1961 Pathfinder 证据索引](SYNC-20261119-PATHFINDER-R1956-R1961.json)：静态 gate 复核及缓存 helper 有界差分，限制见各 manifest。

## 未关闭验收与已知缺陷

- Pathfinder 正常命令分发及其七种模式、有效世界路线/碰撞（障碍、楼梯、雪层）、磁盘缓存生命周期、停止/取消逻辑未做实机验收；真实兼容服务器登录、交互、断开、重连无证据。
- ClickGUI 鼠标命中/切换、模块开关、设置保存/重载未闭环。Commission/Powder Macro、渲染、初始化、配置、命令、网络及其余 native/JNIC 仍需按功能路径恢复。
- 干净 checkout、空缓存网络构建和正式发布构建未验证；当前全树构建使用已缓存依赖。源码计数、编译成功和静态差分不代表功能等价。

## 下一步

沿已恢复的 Pathfinder 命令入口追踪 route helper 到执行状态、停止/取消和缓存读写的完整调用链；只有新的静态证据能区分行为时才启动客户端/有效世界验收。完成边界清楚的小切片后全树构建、更新中英文 README，并把同一内容分别快进同步到私有 `openpolinex` 与公开 `PolinexClient-Reborn`。不发布原版 JAR、受保护 class 或完整 `javap` 转储。
