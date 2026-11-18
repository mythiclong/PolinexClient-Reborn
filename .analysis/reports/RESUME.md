# 当前交接

> 更新：2026-11-18。证据产生基线：`d64b1816f27894ba59b443030f95e72a595e0f65`，分支 `codex/bootstrap-eclientinit-2026-11-15`。当前 Java 源树 SHA-256 聚合：`88c34439c3905f1300a0b09b561204ba4f40e3d852d8c87e037e89e52af1231b`（1,602 个文件，按路径、文件内容 SHA-256 聚合）。原版 JAR SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`。

## 当前唯一切片：Pathfinder A* 及其有效世界调用路径

- **R1947**：按完整原版字节码恢复 `a(BlockPos, Direction):Node` 的 gate、候选遍历、空值契约和调用顺序；Temurin 25 全树 `compileJava --rerun-tasks --no-daemon` 成功。证据：`.analysis/evidence/mining/r1947-pathfinder-candidate-null-contract/`。世界/实体路径未运行。
- **R1948**：A* `a(BlockPos, BlockPos, boolean):ArrayList` 的节点分配顺序与回调编译形式已按原版修正；当前源码 SHA-256 `96999423dcee2e4d78051b7b0c632cc39796b70c1801312575db3a39119dfe0e`。同一全树编译退出码 0。源树指纹和原版/编译后完整方法记录在 `.analysis/evidence/mining/r1948-pathfinder-a-star-core-audit/`。
- **R1949**：缓存加载器完整方法静态对照已完成。原版 JAR 5,475 个 class 的真实 `invokestatic` 扫描无解析错误，确认 gate setter 的类初始化调用与缓存构造器条件调用；此前怀疑的 gate owner/call target 不一致已排除。机器记录和可重跑脚本在 `.analysis/evidence/mining/r1949-pathfinder-cache-loader/`。没有对有效/损坏缓存文件做运行测试。

## 已知未验收项

- Pathfinder 没有通过有效客户端世界、玩家/实体和正常模块入口验证路线、碰撞结果或缓存行为；合成输入不替代实机结果。
- ClickGUI 的同进程原版 Options 对照确认键盘/滚轮有响应而分类图标和 Draw 鼠标控件没有可观察反馈；这不能单独证明模组内部没收到事件。已知有独立 Screen 鼠标事件入口，须继续核对基类/接口、Mixin 转发和 GLFW 轮询，不要预设只在 `extractRenderState` 处理输入。五页控件、模块开关和设置保存/重载仍未闭环。
- 真实兼容服务器登录、交互、断开和重连未验收。干净 checkout、空缓存与正式发布构建仍未闭环；其他自有模块、native 和网络功能也未完成。

## 下一步

继续 Pathfinder 消费者/调用者的完整字节码复核，再设计有效游戏世界中的最小正常入口验证；遇到首个确定差异就按原版修复并做切片全树构建。保持客户端和输入单实例，不以编译、启动或计数替代功能验收。
