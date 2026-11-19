# OpenPolinex 当前交接

> 更新：2026-11-19 15:39 UTC。工作分支 `codex/bootstrap-eclientinit-2026-11-15`；R1966 证据所用源码基线为 `063fc5807d5d9e61bb4af04acb6c3f742601a724`。原版 JAR SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`，仅本地使用，不发布。

## 当前唯一切片：R1966 Pathfinder tick 路线执行器

恢复原来被编译为单一 `return` 的 `a(PathNode, List): void`。按原版完整 descriptor 字节码保留路线后缀筛选、sentinel gate、player-null 早退、列表 helper / 朝向调用分支、jump 清理及 option 150 对 sneak 的影响。完整原版 CFG 与当前编译产物已复核；Temurin 25 全树 Gradle `build --rerun-tasks` 对最终源码通过。原版/编译后完整 `javap` 转储只保留在本机临时目录。

## 有效证据

- [R1966 静态复核、源内容哈希、构建命令/退出码及验收边界](../evidence/mining/r1966-pathfinder-executor-reconstruction/manifest.json)
- 最终本地源码 SHA-256：`dd141e4cdcfa4b7d2d60aae810e666d5c6db4b6bc1a8c57c3ab3eaa1ec24cff7`；规范 LF Git blob：`7fb114d4a806a3f9f95bfee6bb9dca44ab7b733f`。
- 最终完整构建：Temurin 25.0.4.1，2026-11-19 15:36:03–15:36:49 UTC，退出码 0。更早两次中间构建在完整 CFG 复核发现分支/求值顺序问题后不作为最终验证；相关记录保留并标明。
- 本切片未直接探针、未启动/操控 Minecraft、未测试正常玩家路线、有效世界或兼容服务器。编译和静态恢复不等于游戏功能验收。

## 已排除假设

- R1965 `/pathfind` callback 修复仍只有静态构建证据，不能视为正常命令或寻路行为已验收。
- R1966 原版异常表调用的 `a(Throwable):Throwable` 经完整字节码核对仅 `aload_0; areturn`；省略其无效果的捕获/原样重抛不会转换异常或产生副作用。

## 已知未关闭项

Pathfinder 正常玩家入口、有效世界路线/碰撞、缓存生命周期、停止/取消及兼容服务器行为仍无运行证据。ClickGUI 鼠标命中/开关/设置保存重载、Powder Macro、Commission Macro，以及配置、渲染、网络和 native/JNIC 仍有开放恢复或验收项。构建使用本机缓存；空缓存网络构建与发布构建未验证。

## 下一步

继续沿 Pathfinder 正常 tick 的实际调用链，逐一对照原版与当前源码/编译类的完整 owner、方法名和 descriptor；先确认下一个具体缺口及所有相关调用/状态，再定边界。切片完成后全树构建、更新本文件与双语 README，并分别快进同步私有 `openpolinex` 和公开 `PolinexClient-Reborn`；运行验收只使用有效世界/正常入口，服务器测试仍需保留脱敏证据。
