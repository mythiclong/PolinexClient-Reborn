# OpenPolinex 当前交接

> 更新：2026-11-20 UTC（芝加哥当地日期 2026-11-19）。R1991 源码、双语 README 和最小证据已同步到私有 `openpolinex` 与公开 `PolinexClient-Reborn`；两边内容提交分别为 `bc6afcdb6ee75900778a9cad4d52ac958d347d32` 与 `fea1a45f7d7be6760e14e10684815271f2f31d67`，共享文件 blobs 已核验。只通过完整 descriptor 静态复核和全树构建，未运行客户端或有效世界。详见 [R1991 双仓同步记录](SYNC-20261120-PATHFINDER-R1991.json)。

## 当前基线

- 集成分支：`codex/bootstrap-eclientinit-2026-11-15`，R1991 内容提交 `bc6afcdb6ee75900778a9cad4d52ac958d347d32`。
- R1991 源码/README/证据内容提交：私有 `codex/handoff-progress-2026-11-15`=`bc6afcdb6ee75900778a9cad4d52ac958d347d32`；公开 `main`=`fea1a45f7d7be6760e14e10684815271f2f31d67`。后续交接/同步元数据快进提交：私有 `a6a7ab7b45def15df392166aa1624eeb77587529`；公开 `e6be402899ab923e168ef55fd7c88c4a924fcfd2`。两端 README、英文 README、交接文件和 R1991 同步记录的文件 blobs 相同。
- Pathfinder 托管源码 SHA-256：`0703e1b3d0323ec856ab88ce97ec252f7e1e8712343fc674f19cc64475869266`；R1991 全树构建的 owner class SHA-256：`3e0fc8421075f840dce7da4ec12ee876ecf537604601b163da0d2855ed64ae76`。

## 当前唯一切片：Pathfinder 路线生命周期

- R1991 修复 `h(List):boolean` 的路线完成分支，以及 `g():void` 的 gate/null/异步待处理结果保护。完整 descriptor 对照、编译器差异与限制见 [静态复核](../evidence/mining/r1991-pathfinder-route-lifecycle/static-review.txt)、[机器证据](../evidence/mining/r1991-pathfinder-route-lifecycle/manifest.json)和[构建摘要](../evidence/mining/r1991-pathfinder-route-lifecycle/build-summary.txt)。
- 构建通过不代表正常路线等价。已观察到现有 Minecraft 1.8.9 多人游戏进程；未置前窗口、未发送键鼠/游戏输入，也未启动第二客户端。它不是受控的 26.1.2 验收实例，因此 R1991 运行时仍未测试。继续静态源码还原；待获得不干扰现有游戏的受控客户端与有效世界后，验收正常入口、路线节点推进、碰撞、停止/取消和磁盘缓存生命周期。
- 不重做已排除的全量渲染普查、坐标倍率盲扫、旧 ClickGUI 无目的点按或已确认的 R1989 差异。

## 有效证据与开放缺口

- [R1991 双仓同步记录](SYNC-20261120-PATHFINDER-R1991.json)：两个远端 refs 与共享文件 blobs 已核验。
- Pathfinder 的 `NativePathFinder` 纯 Java 方法已有原版对照及有限 golden/cache 边界证据（R1936、R1938、R1951、R1959）；这些样本不证明全域或有效世界等价。
- Pathfinder 正常玩家入口、有效世界寻路与碰撞、停止/取消和实际磁盘缓存读写仍未验收；R1991 不构成 Pathfinder 闭环。
- Powder Macro、Glacite Commission Macro 的完整正常流程仍开放。ClickGUI 和兼容服务器验收不属于当前三个模块切片；全项目仍未完成。
- 需要 MC 世界/实体的方法只用有效世界正常入口验证，不用 null/plain object 推测；构建、启动、计数或无崩溃都不单独作为功能等价证据。
