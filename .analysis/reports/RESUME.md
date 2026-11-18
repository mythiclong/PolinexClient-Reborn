# 当前交接

> 更新：2026-11-18。代码/证据基线：`bbea9b6cad5bc8d1e67fbce4b4b9c8c8f4ec0c71`；当前 Java 源树 SHA-256 聚合：`a23ce38f1eb037f6042e457e2910423fd00efcc98790fe1d07e85fdf501099d8`（1,602 个文件，按 POSIX 路径和内容 SHA-256 聚合）。原版 JAR SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`。R1951/R1952 的入库提交、README 快照和双仓同步位置见最新同步索引。

同步索引：[SYNC-20261118-PATHFINDER-R1951-R1952.json](SYNC-20261118-PATHFINDER-R1951-R1952.json)。

## 当前唯一切片：Pathfinder API 消费者、路线转换和有效世界入口

- **R1947/R1948**：按完整字节码恢复候选节点 gate/空值契约和 A* 核心节点分配顺序；修正 `Function2` 回调编译形式。Temurin 25 全树编译记录退出码 0。证据：`.analysis/evidence/mining/r1947-pathfinder-candidate-null-contract/`、`.analysis/evidence/mining/r1948-pathfinder-a-star-core-audit/`。
- **R1949**：完整对照缓存加载器；扫描原版 JAR 5,475 个 class、0 个解析错误，确认 gate setter 调用点。缓存文件实读写未验证。证据：`.analysis/evidence/mining/r1949-pathfinder-cache-loader/`。
- **R1951**：`NativePathFinder` 原版和当前源码编译产物均含 25 个 name+descriptor 方法；18 个归一化指令序列相同，7 个方法控制流形状不同。隔离 classloader 下 31 组输出和缓存副作用全部匹配，语义断言通过。该样本集不证明所有输入或 Minecraft 实机等价。证据：`.analysis/evidence/mining/r1951-native-pathfinder-implementation-audit/`。
- **R1952**：实际 invoke 扫描原版 JAR 5,475 个 class、当前编译产物 2,823 个 class，均 0 个解析错误。外部事件消费者 `a(Event):void` 对 `b(BlockPos):List`、`a(BlockPos):List`、`a(BlockPos, boolean):List` 的直接调用目标与原版一致；包外无 Pathfinder method-handle 入口。没有执行游戏内事件。证据与可重跑扫描器：`.analysis/evidence/mining/r1952-pathfinder-call-graph/`。

## 未验收项

- Pathfinder 尚未经有效客户端世界、玩家/实体和正常用户入口验证路线、碰撞、目标转换或缓存生命周期；真实兼容服务器登录、交互、断开和重连也未验证。
- ClickGUI 原版 Options 对照下键盘/滚轮有效，分类图标和 Draw 控件没有可观察鼠标反馈；Screen 事件转发、控件命中、模块开关和设置保存/重载未闭环。
- 干净 checkout/空缓存发布构建及其他初始化、渲染、配置、命令、网络和用户功能仍未完成逐项验收。

## 下一步

完整核对 R1952 的事件消费者及三个 Pathfinder 包装方法、路线转换器和缓存消费者的原版/当前全方法字节码，重点检查字段、调用接收者、参数、分支、空值、异常和副作用。发现确定差异才修改；随后全树编译。需要 Minecraft 世界或实体的路径只排入有效客户端正常入口验证，不以合成 null/plain-object 结果代替。
