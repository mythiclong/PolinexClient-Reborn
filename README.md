# Polinex-Reconstruction

这是我给 Polinex 做的 Minecraft 26.1.2 Fabric 源码重建工程。目标是把托管源码补齐，让它可以自行构建、修改和运行，并按原版行为逐项恢复功能。

我决定停止亲自推进源码还原，把剩余源码恢复与验证交给愿意接手的社区成员。前前后后在这件事上烧了我 **30B+ DeepSeek V4.1 Flash tokens**。这里记录目前的真实进度；项目并未完成。

## 目前进度

- **ClickGUI**：五个列表页的布局边界和文本绘制路径已有静态修复与全树编译记录。最近一次无探针 UI 验收作废：测试脚本未到 F4 输入阶段，且隔离启动影响了前台窗口/光标状态。五页实际画面、Draw/叶控件、设置保存重载仍待验证。
- **OpenGL FBO 状态恢复**：完整原版/编译字节码对照确认了 framebuffer、program、VAO、buffer 与像素存储状态的错配并修复；全树编译和编译后语义断言通过，尚无客户端运行验收。详见 [FBO 状态复核](.analysis/reports/FBO-STATE-RESTORE.md)。
- **Glacite Commission Macro**：六个注册入口已有静态恢复；部分方法已经逐字节码核对。`aC()` 仍有成员引用差异，`bs()` 尚缺完整控制流、异常和副作用比对，整个宏没有通过正常用户路径验收。
- **Powder Macro / Pathfinder**：已经恢复若干源码片段；仍需要对照完整原版方法，并在有效世界/实体状态下验证。
- **项目整体**：真实兼容服务器登录、交互、断开、重连没有验证；干净 checkout 的发布构建也没有闭合。项目未完成。

源码库存数字只用来定位工作量，不代表功能完成数量。最新交接和实验边界见：

- [当前短交接](.analysis/reports/RESUME.md)
- [详细交接报告](.analysis/reports/HANDOFF-20261115.md)
- [R1871 去标识化机器记录](.analysis/evidence/clickgui/r1871-five-pages-no-probe/runtime-public.json)
- [FBO 状态恢复方法级记录](.analysis/reports/FBO-STATE-RESTORE.md)

## 构建

需要 JDK 25。构建入口在 `polinex-src/`：

```powershell
cd polinex-src
.\gradlew.bat build --no-daemon --console=plain
```

当前工作树有全树离线编译通过记录；干净 checkout、空缓存和正式发布构建仍待复核。不要把本机 Gradle 缓存或运行目录当成项目输入。

## 接手时请注意

1. 原版行为依据是 `.analysis/cracked.jar`，但原始 jar 没有放进本仓库。需要行为对照的开发者必须自行具备合法、获授权的原版文件。
2. 本仓库不包含原始受保护 class 或 JNI 载荷。需要恢复的逻辑应由提交源码实现。
3. 每个方法按完整类名、方法名和 JVM descriptor 对照原版字节码；核查字段、调用目标、分支、默认参数、异常和副作用。编译、启动或计数变化不等于功能等价。
4. 用真实 Minecraft 世界/实体验证依赖游戏状态的逻辑；null、普通 Java 对象等无效夹具不能代替实机输入。
5. UI 验收前先确保不会改变使用者桌面的前台窗口或鼠标状态。R1871 使用的隔离输入路径没有做到这一点，不要照搬。
6. 临时探针要标明用途和注册状态；功能验收完成后移除，再用无探针构建复核。

当前没有添加 `LICENSE`。

公开快照的二进制检查发现，原包的 META-INF/jars/occlusionculling-0.0.8-SNAPSHOT.jar 实际含 7 个 me/octo/client 类；其中 6 个有托管源码对应项，另 1 个尚无源码。该原始嵌套 JAR 与 dev/jnic/lib/*.dat 载荷均未纳入公开仓库，避免用受保护 class 或未恢复 JNI 载荷代替源码。fabric.mod.json 仍引用该嵌套 JAR，因此当前快照的客户端加载状态未验证；请先还原缺失逻辑并生成源码构建产物，再做运行验收。
这个仓库是重建进度与协作交接，不代表原始 Polinex 的授权或再分发许可。

## 感谢

感谢鲨鱼神（QQ：1127367472）破解 Polinex。

感谢猪圈中转站。如果你也想使用，可以用我的邀请码注册：[猪圈中转站注册链接](https://api.pigcode.org/register?invite=N9SM4PWP)。

这一路用过的模型：DeepSeek V4 Flash、DeepSeek V4.1 Flash、DeepSeek V4 Pro、Kimi K3、Kimi K3.1 Pro、Opus 5.5、Opus 4.8、**GPT-6 Luna**、GPT-6 Sol、GPT-6.1 Sol、GPT-6.1 Terra。

如果你愿意接着做，先读短交接，再从 ClickGUI 页面显示、Commission Macro、Powder Macro 或 Pathfinder 中挑一个边界清楚的小切片。请把静态还原和真实行为证据一起留下。