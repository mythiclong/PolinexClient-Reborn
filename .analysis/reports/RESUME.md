# OpenPolinex 当前交接

> 更新：2026-11-19 UTC（America/Chicago 当地日期 2026-11-18）。集成分支 `codex/bootstrap-eclientinit-2026-11-15`；本批次源码证据基线 `02cde705b791fd4d0d78d4e1734831d165d47f50`。Pathfinder route API 文件 SHA-256（修复后）：`8b35c8dcb9f3f7f70765ae4436e167cd90be9c467fdf61957847a2a6638393de`。原版 JAR SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`，不发布。

## 当前唯一切片：R1964 Pathfinder 路线 API 的正常调用者与执行路径

R1962 已完成限定的字节码复核与 98,304 组隔离 classloader A* 差分；R1963 修复并构建验证了 route API 的 gate/空路线分支，并静态复核 `b(Entity): BlockPos`。下一步追踪返回路线进入 Pathfinder 调用者后的执行、缓存及停止分支。有效世界不可用时继续可验证的静态调用链，不以无效实体夹具猜测行为。

## 最近有效证据

- [R1963 Pathfinder route API bridge](../evidence/mining/r1963-pathfinder-route-api-bridge/manifest.json)：修复原版 gate 语义偏差；Temurin 25 全树 `build --rerun-tasks` 成功。`b(Entity): BlockPos` 的独立完整静态复核未发现其他确认差异。此批次未运行游戏或服务器。
- [R1962 `isWalkable` / A* 差分](../evidence/mining/r1962-pathfinder-walkability-astar-diff/manifest.json)：98,304 个有界网格/参数组合的结果数组与选定路径不变量匹配。保留日志未包含原始命令和退出码，故该证据记录保留此限制。
- [R1956 碰撞 gate 静态复核](../evidence/mining/r1956-pathfinder-collision-gate/manifest.json)：原版 `$llII…` 与源码 `$PXEvMid` 是同一状态 holder 的名称差异；完整比较未发现确认偏差。真实世界碰撞仍未测。
- [R1957 `normalizeState(B)B`](../evidence/mining/r1957-pathfinder-normalize-state-exhaustive/manifest.json)：256 个 byte 输入全部匹配。
- [R1958 `processChunk`](../evidence/mining/r1958-pathfinder-process-chunk-boundaries/manifest.json)：剩余长度 0–2048 共 2,049 个样本；缓存 map 与 buffer cursor 断言匹配。
- [R1959 `loadCache`](../evidence/mining/r1959-pathfinder-load-cache-boundaries/manifest.json)：数组长度 0–2048 共 2,049 个样本，覆盖 9-byte 记录分支和回退分支；缓存副作用匹配。
- [R1960 `updateChunk`](../evidence/mining/r1960-pathfinder-update-chunk-boundaries/manifest.json)：34,324 组长度、计数、空索引、极值索引与坐标组合匹配。
- [R1961 `updateHeights`](../evidence/mining/r1961-pathfinder-height-cache-boundaries/manifest.json)：384 组边界样本；长数组包含 45,432 种不同的 16 位模式（非完整 16 位域穷举），并覆盖长度截断、null 与坐标极值；缓存副作用匹配。
- [R1955 路线转换与高度 helper 修复](../evidence/mining/r1955-pathfinder-route-converter-nan-semantics/manifest.json)：Temurin 25 全树 `build` 通过；当前生产源码树与该构建基线相同。本批次未修改生产 Java，也未重跑 Gradle。
- [R1954 路线入口/缓存写入](../evidence/mining/r1954-route-converter-cache-exception/manifest.json)、[R1953 wrapper](../evidence/mining/r1953-pathfinder-wrapper-audit/manifest.json)、[R1952 调用图](../evidence/mining/r1952-pathfinder-call-graph/manifest.json)。

R1956–R1963 的游戏外证据只关闭各自限定方法的静态/输入域问题，不关闭 Pathfinder 用户路径。R1963 全树构建成功，但没有启动 Minecraft、有效世界或兼容服务器。

## 未关闭验收与边界

- Pathfinder 正常玩家入口、有效世界路线/碰撞（含障碍、楼梯、雪层）、磁盘缓存生命周期尚未验证；真实兼容服务器登录、交互、断开、重连无证据。
- ClickGUI 鼠标事件转发/命中、模块切换、设置保存与重载尚未闭环。
- 初始化、Commission/Powder Macro、渲染、配置、命令、网络和其余 native/JNIC 均须按功能调用路径恢复与验收。
- `python -B .analysis/stats.py` 仅统计源码库存，不表示功能等价。任何世界依赖测试必须使用有效世界和正常入口；不得用无效对象夹具推断实现。
- 原始受保护 JAR/class 与完整 javap 转储不上传；证据 manifest 区分生成基线、命令/退出码和运行验收范围。

## 下一步

沿正常调用链复核 R1964 路线消费者、执行状态与缓存写入；每个生产修改均以原版完整 descriptor 字节码为依据，并在切片结束时全树构建和做有区分能力的针对性验证。有效世界/真实服务器验收缺口持续保留。
