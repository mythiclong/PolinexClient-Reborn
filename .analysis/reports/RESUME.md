# OpenPolinex 当前交接

> 更新：2026-11-20 UTC。当前源码基线为集成分支 `codex/bootstrap-eclientinit-2026-11-15`；R1998 本地内容提交及双仓同步记录见下文链接。

## 当前唯一切片与有效证据

- **R1998 Pathfinder chunk-capture worker 中断语义**：按原版归档完整 descriptor，确认原版 `Thread.sleep(J)V` 无异常表处理/`RuntimeException` 包装，修复 Java 重建代码曾把 `InterruptedException` 包装成新异常的偏差。编译 relay 为 `aload_0; athrow`，契约 verifier 通过；Temurin JDK 25 强制全树 Gradle 构建 exit 0。证据：[静态复核](../evidence/mining/r1998-pathfinder-worker-interrupt-propagation/static-review.txt)、[契约输出](../evidence/mining/r1998-pathfinder-worker-interrupt-propagation/contract-verification.json)、[构建摘要](../evidence/mining/r1998-pathfinder-worker-interrupt-propagation/build-summary.txt)、[机器记录](../evidence/mining/r1998-pathfinder-worker-interrupt-propagation/manifest.json)。无客户端/有效世界/中断时序探针，不代表运行时等价。
- **R1997 NativePathFinder**：705 条 world-independent headless differential assertions 两侧输出一致；未改源码。证据：[manifest](../evidence/mining/r1997-native-pathfinder-extended-golden/manifest.json)。
- **R1996 路线完成/停止**：52 条离线断言及全树构建通过；未做实机路线/停止验收。证据：[manifest](../evidence/mining/r1996-pathfinder-route-completion-and-stop-reset/manifest.json)。

## 开放缺口

- Pathfinder 有效玩家世界正常请求、路线执行、完成/失败/取消及 chunk worker/cache 实际生命周期未验收；纯 Java/headless 与静态字节码证据不能替代这些路径。
- Powder Macro 正常启停与事件入口、Glacite Commission Macro 完整状态机尚未闭环。
- ClickGUI 鼠标输入/设置持久化与兼容服务器登录、交互、断开、重连未完成验收。

## 下一步

继续沿原版调用图核对 Pathfinder cache-file 读写、失效与 chunk worker 状态发布，只选能区分具体状态偏差的实验；若静态对照无法定位，再规划一次具备有效世界的单实例探针。随后按用户影响与可验证性推进 Powder Macro、Commission Macro；禁止用空对象、客户端启动成功或计数代替功能证据。

双仓内容和 README 同步校验：[SYNC-20261120-PATHFINDER-R1998](SYNC-20261120-PATHFINDER-R1998.json)。
