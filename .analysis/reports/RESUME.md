# 当前交接

> 更新：2026-11-18。证据产生基线：`d64b1816f27894ba59b443030f95e72a595e0f65`；入库提交与两个仓库的同步提交见[同步索引](SYNC-20261118-PATHFINDER.json)。当前 Java 源树 SHA-256 聚合：`a23ce38f1eb037f6042e457e2910423fd00efcc98790fe1d07e85fdf501099d8`（1,602 个文件，按路径及内容 SHA-256 聚合）。原版 JAR SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`。

## 当前唯一切片：Pathfinder A* 与有效世界调用路径

- **R1947**：按完整原版字节码恢复 `a(BlockPos, Direction):Node` 的 gate、候选遍历、空值契约和调用顺序；Temurin 25 全树编译退出码 0。证据：`.analysis/evidence/mining/r1947-pathfinder-candidate-null-contract/`。没有世界/实体运行验收。
- **R1948**：修正 `a(BlockPos, BlockPos, boolean):ArrayList` 的节点分配顺序和 `Function2` 回调编译形式；完整方法对照、源码哈希和构建记录见 `.analysis/evidence/mining/r1948-pathfinder-a-star-core-audit/`。全树编译退出码 0。源树聚合旧值 `88c344…` 已独立复算并更正为 `a23ce3…`，依据见 `source-tree-fingerprint-correction.json`。
- **R1949**：完整对照缓存加载器并扫描原版 JAR 的 5,475 个 class，0 个解析错误；gate setter 的初始化与缓存构造器调用点已确认。证据和可复跑脚本见 `.analysis/evidence/mining/r1949-pathfinder-cache-loader/`。没有有效/损坏缓存文件的运行测试。

## 未验收项

- Pathfinder 尚未通过有效客户端世界、玩家/实体和正常模块入口验证路线、碰撞或缓存读写；合成输入不替代实机结果。
- ClickGUI 同进程 vanilla Options 对照显示键盘和滚轮有效，分类图标及 Draw 控件没有可观察鼠标反馈。内部 Screen 事件转发和控件命中仍需核对；模块开关及设置保存/重载未闭环。
- 真实兼容服务器登录、交互、断开、重连，干净 checkout/空缓存发布构建，以及其他模块、native、渲染、配置和网络功能均未完整验收。

## 下一步

从原版 JAR 的真实 invoke 调用点继续核对 Pathfinder API 消费者及 chunk/cache 事件路径的完整字节码，再设计有效游戏世界中的最小正常入口验证。遇到确定差异后按原版修复，并在切片边界做全树构建；客户端和输入保持单实例。
