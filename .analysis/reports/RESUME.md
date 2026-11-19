# OpenPolinex 当前交接

> 更新：2026-11-19 UTC（芝加哥当地日期 2026-11-18）。最近已发布基线：私有 openpolinex `88dfe47`；公开 PolinexClient-Reborn `97e5e7e`。本轮以这些发布点的共同源码内容为基线；当前待同步的托管 Java 修改有两个。原版 JAR SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`，仅本地使用，不发布。

## 当前唯一切片：R1965 Pathfinder 执行状态与缓存调用链

R1964 已完成正常路线事件消费者的静态类型守卫修复和全树构建；R1963 的路线 gate 结论也按原版完整操作数栈重新校正。下一步沿七种模式分支追踪路线结果写入后的执行、停止与缓存状态，不用无效实体或空世界夹具推断行为。

## 最近有效证据

- [R1964 正常路线消费者](../evidence/mining/r1964-pathfinder-route-consumer/manifest.json)：完整 owner/name/descriptor 字节码复核；x/y/z 的 `Integer` 与 `option` 的 `String` 均先 `instanceof` 再 cast，修复此前 cast-to-`String[]` 的异常路径；7 个模式调用目标和 8 个状态写入未因该修复改变。Temurin 25 全树 `build --rerun-tasks` 成功。只做静态和构建验收，未运行客户端/世界/服务器。
- [R1963 路线 gate 字节码校正](../evidence/mining/r1963-pathfinder-route-api-bridge/manifest.json)：原版保留 `arraylength` 值跨越 gate 分支；`gate=0 && length>0` 或 `gate!=0 && length=0` 返回 null，其余组合调用 converter。早先“非零 gate 空路线会进入 converter”的发布说明已撤回。
- [R1962 `isWalkable` / A* 有界差分](../evidence/mining/r1962-pathfinder-walkability-astar-diff/manifest.json)：98,304 个有界网格/参数用例；旧记录未保留精确命令及退出码，限制不变。
- [R1956–R1961 Pathfinder 证据](SYNC-20261119-PATHFINDER-R1956-R1961.json)：静态 gate 复核及缓存 helper 有界差分，限制见各 manifest。

## 未关闭验收与已知缺陷

- Pathfinder 正常玩家入口、有效世界路线/碰撞（障碍、楼梯、雪层）、磁盘缓存生命周期和停止逻辑未做实机验收；真实兼容服务器登录、交互、断开、重连无证据。
- ClickGUI 鼠标命中/切换、模块开关、设置保存/重载未闭环。Commission/Powder Macro、渲染、初始化、配置、命令、网络及其余 native/JNIC 仍需按功能路径恢复。
- 干净 checkout、空缓存网络构建和正式发布构建未验证；当前全树构建使用已缓存依赖。统计数量、编译成功和静态差分不代表功能完成。

## 下一步

继续 R1965：核对路线事件后续状态消费者与 stop/cache 路径的完整字节码及正常调用者；完成一个边界清楚的静态切片后全树构建并按批次同步两个仓库。有效世界和兼容服务器暂不可用时，明确保留对应验收缺口。
