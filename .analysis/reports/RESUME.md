# OpenPolinex 当前交接

> 更新：2026-11-19 16:40 UTC。当前源码基线为 R1968；本批次尚待提交并同步至私有 `openpolinex` 与公开 `PolinexClient-Reborn`。不要覆盖其他工作树或清理未跟踪调查工具。原版 JAR SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`，仅本机使用、不发布。

## 当前唯一切片：R1969 Pathfinder `d(List): void`

R1968 已从完整原版 `(Entity,List,Vec3)V` 字节码恢复实体路线处理：guard/player 早退、状态标志触发计数清零、水平碰撞或四步预测的短路计数、配置阈值与计时 gate、调用精确私有路线请求 overload `(false,true)`，成功后重置 timer/counter 并按标志显示提示。原版异常 wrapper 调用 `a(Throwable):Throwable` 的 identity helper；源码不吞异常。完整 Temurin JDK 25.0.4.1 全树 `build --rerun-tasks` 通过。方法需要有效 Minecraft player/world collision；没有使用 null/plain-object 假探针，也没有启动客户端、正常玩家路线或兼容服务器验收。静态与构建证据见 [R1968 manifest](../evidence/mining/r1968-pathfinder-entity-route/manifest.json)。

## 已映射的 R1969 调用边界

原版 `d(List):void` 当前编译为空返回。完整 owner dump 确认共三个调用点：路线事件 consumer `a(RouteEvent):void` 的 offset 1180 和 1420；私有 `a(List,boolean):void` 的 offset 98。正常路线主分支在 offset 1415 调用刚恢复的 `a(Entity,List,Vec3):void`，随后 offset 1420 调用 `d(List)`。下一步读取 `d(List)` 完整 CFG、字段/调用接收者、分支、输入副作用和异常，再决定独立小切片边界。

## 有效进度与未关闭验收

- R1967 `q():boolean` 的完整静态恢复、65,536 组纯方法差分及 Temurin 25 全树构建见 [manifest](../evidence/mining/r1967-pathfinder-history-predicate/manifest.json)。
- R1968 静态 descriptor/CFG 复核和全树构建通过；直接运行、有效世界、正常用户路径及服务器仍未测试。构建 warnings 为现有 Unsafe/deprecation/unchecked warnings；构建成功。
- R1968 后源码库存：1,602 个 Java 文件、1,158,598 行。库存数不是功能完成度。原始 jar、完整 `javap`、编译 class 和本地缓存均不发布。
- Pathfinder 正常玩家入口、有效世界路径/碰撞、缓存生命周期仍开放；真实兼容服务器登录、交互、断开、重连仍未验收。ClickGUI 鼠标命中/模块与设置闭环、Powder Macro、Commission Macro、配置、渲染、网络及 native/JNIC 也仍开放。
- 双仓同步完成后，在 README 与 `.analysis/reports/SYNC-20261119-PATHFINDER-R1968.json` 记录并核验两端 refs；当前唯一代码任务仍为 R1969，不因同步暂停恢复工作。

下一步：完整还原 `d(List):void`，对照原版与编译字节码；全树构建后继续按有效客户端世界与正常玩家入口验证。不要将静态恢复或编译成功等同于功能完成。