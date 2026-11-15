# Polinex-Reconstruction 当前交接

> 更新：2026-11-15 09:01 UTC（America/Chicago 03:01）。原版行为事实源 `.analysis/cracked.jar` SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`。原版文件没有随公开快照发布。

## 基线与仓库状态

- R1851–R1871 证据产生时 HEAD=`32f4664fc008b9ac76859c48e45d8e3a63bec083`；当时工作树有源码改动。证据记录中的源文件哈希描述当时实际内容，证据入库提交另行记录。
- 本仓库是独立的社区交接快照，来源于 2026-11-15 的私有 WIP 源码状态，源码快照提交 45e463c；源码与历史证据均明确为未完成。
- 其他未跟踪调查工具、运行目录和未提交调试探针仍保留在原工作区，未纳入快照；没有清理或覆盖。
- 最新 `python -B .analysis/stats.py` 退出码 0：1602 Java 文件、1,159,472 行、PXDyn 622 处、PX-FIX 7075；stub/artifact throw 0；native 声明 220。只作源码库存索引。
- “OpenPolinex 每小时进度” heartbeat 已 ACTIVE；不要重复创建。

## 当前主线：ClickGUI 五页显示

- R1823 修复前截图记录 GUI、Elements、FailSafes、Addons、Rotations 五页存在行/卡片文字重叠；R1825 原版/当前完整方法对照定位到共享模块网格边界分支，WIP 源码中已有修复和全树编译记录。
- R1869 对 page、draw utility、font bridge 的完整原版/编译字节码进行了复核。R1870 按原版恢复文本宽度/测量 helper 的默认参数条件；全树编译和编译后 typed descriptor/分支核验通过。ClickGUI 输入调试 Mixin 未注册。
- R1871 无探针 UI 尝试为 **VOID**：启动日志是 `No config file found, using defaults`，驱动脚本等待不存在的 `Loaded config successfully` 标记，所以 F4/分类点击均未执行、没有截图或页面断言。启动事件回调报告 `UnsatisfiedLinkError: Polinex.a(event)`。去标识化机器摘要在 `evidence/clickgui/r1871-five-pages-no-probe/runtime-public.json`。
- R1871 桌面保护检查发现前台窗口/光标状态变化；该隔离输入方法不安全，不再复用。VOID 不是 UI 修复通过或失败的证据。
- 下一步先静态恢复 `Polinex.a(event)` 自有启动逻辑并构建，再决定不会影响用户桌面的 UI 验收方法。五页实际画面、Draw/叶控件 hover/click、设置保存/重载都仍开放。

## 最近完成：OpenGL FBO 状态恢复

- `FBO-STATE-RESTORE-20261114` 按原版完整方法字节码映射并修正 framebuffer/program、VAO/array buffer、pixel-pack/unpack buffer 的保存与恢复；失败早退和 finally 清理路径补齐状态恢复。
- 全树离线 `compileJava` 与编译后字节码语义断言通过；没有客户端运行或截图证据，动态渲染状态仍待验证。详细记录见 [FBO 状态复核](FBO-STATE-RESTORE.md)。

## Mining 源码恢复

- **Glacite Commission Macro**：R1851 六个注册入口（travel、pigeon、area route、vein route、mining、completion）的接收者、descriptor、lambda/state 参数与 mask 有静态断言并通过编译；只覆盖注册/回调入口。R1865 的 `aC()V` 编译通过但成员引用仍为 REVIEW（3 个原版引用缺失、1 个额外引用）。R1866 的 `M()V` 编译和 40/40 成员引用匹配；`bs()V` 有候选源码，但仍缺完整控制流、异常与副作用等价结论。
- **Powder Macro**：已有 R1825–R1834 源码片段和 R1852 callback capture 调查；没有正常路径及原版对照通过证据。
- **Pathfinder**：已有区块扫描、BFS/flood-fill 等恢复；R1868 保存了相关原版 helper 的完整 javap。需要真实世界/实体输入，null/plain-object 夹具无效，不重跑。
- 全树编译记录不等于模块等价；三个模块都未完成。

- 公开快照审计：原包 META-INF/jars/occlusionculling-0.0.8-SNAPSHOT.jar 含 7 个 first-party me/octo/client class，其中 1 个尚无托管源码；该 JAR 和 dev/jnic/lib/*.dat 载荷已排除。fabric.mod.json 仍有嵌套 JAR 声明，公开快照的客户端加载尚未验证。
## 继续顺序与开放项

1. 按原版调用链恢复启动事件 native `Polinex.a(event)`；不得用空实现或吞异常绕过。
2. 继续 ClickGUI 五页与控件/设置闭环，前提是 UI 输入不会改变用户桌面状态；无法保证时继续静态源码恢复。
3. 完成 Commission `aC`、`bs` 的完整方法级比对；随后逐依赖边界推进 Powder Macro、Pathfinder，并对有效游戏状态做原版同条件验证。
4. 干净 checkout 发布构建、所有用户功能正常入口/原版对照、真实兼容服务器登录/交互/断开/重连仍未满足。服务器条件缺失只暂停服务器项，项目未完成。

## 交接

- 私有代码快照分支：`codex/handoff-progress-2026-11-15`（`60d587f`，明确 WIP）。
- 本仓库：[Polinex-Reconstruction](https://github.com/mythiclong/Polinex-Reconstruction)。
- 原始 jar、JNI 载荷、运行目录和未去标识化桌面信息不随公开仓库发布。