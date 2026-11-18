# OpenPolinex 当前交接

> 更新：2026-11-18。当前代码/文档基线：`66b50d82efc88231492c226bf9c28bfc7bc8011c`。Java 源树内容指纹：`a23ce38f1eb037f6042e457e2910423fd00efcc98790fe1d07e85fdf501099d8`（1,602 个文件；相对路径按 POSIX 排序并与每个文件内容 SHA-256 聚合）。R1951/R1952 的原证据在 `bbea9b6` 生成；该源树指纹在当前基线复算一致。原版 JAR SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`，不随公开仓库发布。

最新双仓同步索引：[SYNC-20261118-PATHFINDER-R1953.json](SYNC-20261118-PATHFINDER-R1953.json)。索引中的证据产生基线与文档入库提交分别记录。

## 当前唯一切片：R1954 Pathfinder 路线转换器与缓存写入异常路径

- **R1954 目标**：逐 descriptor 对照路线转换器 `a(long[], double, double, boolean): List` 与 Pathfinder 缓存写入方法的完整原版/当前字节码、异常表、接收者、字段、分支和副作用；只修复确认的差异。
- **R1953 已完成静态复核**：原版及当前编译产物的 `a(BlockPos, BlockPos, boolean): List` 四种 gate/路径长度结果一致。先前认为分支相反是 JVM 操作数栈顺序误读，已撤回。验证脚本：`python -B .analysis/evidence/mining/r1953-pathfinder-wrapper-audit/verify_pathfinder_wrapper.py`，退出码 0。
- **缓存异常路径仍未闭环**：原版私有 `a(Throwable): Throwable` 返回同一异常对象；当前 IOException helper 不包装 IOException，其他未捕获异常自然传播。异常表、文件系统故障及关闭异常尚未完成完整静态/动态验证。
- R1953 没有生产源码修改、构建或 Minecraft 运行；只新增静态证据。源树 SHA-256 与 R1951/R1952 基线一致。

## 已有 Pathfinder 证据

- **R1947/R1948**：按完整方法字节码恢复候选节点 gate/空值契约及 A* 核心分配顺序；Temurin 25 全树 `compileJava` 退出码 0。编译不是运行等价证明。
- **R1949**：完整复核缓存加载与 gate setter 调用点；原版 5,475 个 class 扫描无解析错误。缓存文件实读写未验证。
- **R1951**：`NativePathFinder` 25 个方法均存在于原版和当前源码编译产物；18 个归一化指令序列一致，7 个编译控制流形状不同。隔离 classloader 的 31 组输出/缓存副作用样本匹配，不能代表全输入域或 Minecraft 实机。
- **R1952**：原版 5,475 个 class、当前编译 2,823 个 class 扫描均无解析错误；同一事件消费者的三个直接 `BlockPos` API 目标一致；无包外 Pathfinder method-handle 入口。没有运行游戏内事件。

## 已知未验收项

- Pathfinder 有效世界路线、碰撞、实体落脚点、正常入口事件和缓存读写生命周期尚未通过 Minecraft 实机验证；真实兼容服务器的登录、交互、断开、重连未验证。
- ClickGUI：原版 Options 对照下键盘/滚轮有效，分类图标与 Draw 控件没有可观察鼠标反馈；鼠标事件转发、控件命中、模块开关、设置保存/重载未闭环。不要重复全量渲染普查、倍率盲扫或无目的点击。
- 干净 checkout/空缓存发布构建、初始化、配置、命令、渲染、网络、Powder Macro、Glacite Commission Macro 及其他用户功能仍未逐项完成正常入口与原版对照。

## 下一步

先完成 R1954 路线转换器与缓存写入完整方法比对；若找到确定差异，按原版修复并做全树构建。异常路径用隔离文件夹和可断言输入验证。后续有效路线/碰撞验证必须使用 Minecraft 世界、实体和正常入口，不以空对象夹具代替。
