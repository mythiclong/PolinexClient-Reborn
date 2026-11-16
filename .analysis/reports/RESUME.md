# OpenPolinex 当前交接

> 更新时间：2026-11-16 UTC  
> 集成 worktree：`<WORKTREE_ROOT>`  
> OpenPolinex 发布分支：`codex/handoff-progress-2026-11-15`  
> PolinexClient-Reborn 发布分支：`main`（独立快照）  
> Git HEAD（证据基线）：`cb4551747dfbe7d3e8fb5668b3ad088da30fa8df`  
> 原版行为事实源：`.analysis/cracked.jar`，SHA-256 `d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`

## 当前唯一切片：恢复 `Polinex.a(E_CLIENT_INITIALIZED)`

R1893 已用完整反汇编、JNI 调用映射、方法描述符、类解析器和 dispatcher 路由闭合状态 17/21 的局部控制流：

- 状态 17 调用 `RenderSystem.isOnRenderThread()Z`。无 JNI 异常时，true 进入状态 7，false 进入状态 8。
- 若出现 `RuntimeException`，原逻辑清除异常并转状态 21。其他异常按原分支保留待处理状态。
- 状态 21 调用 `Polinex.a(Exception):Exception`。R1904/R1904a 更正 null 返回分支：`ThrowNew(NullPointerException)` 后进入共同异常检查，`RuntimeException` 转状态 -9；不回到状态 8。
- 状态 7 已映射首段单例 `aL()V`、阶段日志、两个 `Identifier` 静态字段读取及后续 15 个无参构造器。构造后的 `lllIlII…f()[L…;` 由 R1908 映射到原/当前源码同一静态数组 getter；正常类初始化会创建长度 3 的数组。完整调用副作用仍待复核，-11 guard 路径保持开放。
- R1893 是静态分析，native 入口仍未恢复为托管源码。

R1909 对上述 15 个 `()V` 构造器逐个比较原 JAR 与当前编译输出的指令和异常表，15/15 均不匹配。当前源码内容哈希与 R1895 基线一致，编译 class 的记录时间晚于源码；这排除了“仅凭时间戳就认定输出更旧”的解释，但尚未证明这些 class 是由对应当前源码新鲜生成，也未排除比较器口径问题。静态重建验收暂记失败。证据：`.analysis/reports/R1909-state7-constructor-source-bytecode-comparison.json`；复核器：`.analysis/tools/verify_r1909_state7_constructors.py`。本切片没有源码改动、全树构建或客户端运行。

R1884 已确认入口先执行 `Intrinsics.checkNotNullParameter(event, "e")`；参数来自实际事件对象，成功后状态转到 17。Render-thread true 路径到状态 7。状态 7 的 15 个构造器、`aL()V` 和阶段日志均已映射；构造结束后调用工具类 `f()[L...;`，无异常且非 null 时状态 4 正常返回。

R1901 在 SHA 固定的原 JAR 全部 5,475 个 class 中检查该 `f()` 数组字段：只有一个 `putstatic`（setter 内）；137 个 setter 调用均传入 `anewarray`，包含静态初始化的长度 3 数组；没有 setter 方法句柄。由此正常 Java 初始化不会使状态 -11 的 null 分支成立。反射或其他 native 写入不在该静态扫描范围内。R1908 用原 JAR `javap` 核实 `f()` 为 `getstatic; areturn`，与当前源码返回同一字段一致。记录：`.analysis/reports/R1901-post-constructor-array-field-writes.json`、`.analysis/reports/R1908-post-constructor-array-getter.json`；复核器：`.analysis/tools/verify_r1901_array_field_writes.py`、`.analysis/tools/verify_r1908_post_constructor_array_getter.py`。

状态 7 随后构造日志字符串 `Initializing Polinex Rendering (pt2).`，通过 `CallStaticVoidMethod` 调用日志工具 `d(Ljava/lang/String;)V`；原 JAR 与当前编译类均确认其效果为 `Logger.info`。证据：`.analysis/reports/R1894-event-init-state7-progress-log.json`。

状态 17/21 证据：`.analysis/reports/R1893-client-initialized-state17-state21-control-flow.json`；可复核器：`.analysis/tools/verify_r1893_client_initialized_states.py`。R1881 已映射该入口范围内 186 个间接 JNI 调用，0 个未映射；R1885 已纠正状态 17/21 的 dispatcher 目标。

R1902 对 state 8 的比较、state 5 构造及异常路径仍有效；其中“相等分支经 identity helper 返回 null 后回到 state 8”的推断已被 R1904/R1904a 推翻，不能再作为循环结论。R1903 静态 keystream 值不等于比较常量，因此静态预期走 state 5；运行时全局缓冲区仍未直接观测。

state 5 的正常构造路径创建 `RuntimeException("Cannot initialize client on render thread.")`，按原 JNI 异常检查清理后转入 state -9；非 `RuntimeException` 保持 pending 并返回。机器记录与复核器：`.analysis/reports/R1902-client-init-state8-state5-control-flow.json`、`.analysis/tools/verify_r1902_client_init_state8_state5.py`。该切片只做静态核对，没有源码改动、构建或运行验收。

R1903 将 `+0x8edb` 对到已恢复 keystream 的 little-endian 值 `0x16b31c06`，与比较常量不同；按 R1883 的 dispatcher 映射，预期走 state 5。R1875 的同一 keystream 在同一全局基址解出 state 5 使用的完整字串，作为独立交叉核对。尚未直接观察运行时全局缓冲区初始化。记录与复核器：`.analysis/reports/R1903-client-init-state8-guard-key.json`、`.analysis/tools/verify_r1903_state8_guard_key.py`。

R1904 静态闭合 state 21 的 null / nonnull helper 返回及异常检查。R1905/R1906 随后确认 11 个 -9/-10 转移共用 relay：调用 `Polinex.a(Exception):Exception`；原 native helper 返回原引用（包括 null），pending exception 原样返回，非 null 结果经 JNI `Throw`，null 结果 `ThrowNew(NullPointerException, …)`。消息字符串运行时值未观察；R1906 发现 state -11 的 guard-equality 边会带着 `int[]` 进入该 `Exception` relay，该边仍未解释。state -11 的正常可达性未证明。R1904a 保留早期报告的地址更正。证据：`.analysis/reports/R1904-client-init-exception-and-minus11-paths.json`、`.analysis/reports/R1904a-verifier-rerun.json`、`.analysis/reports/R1905-state7-exception-edges.json`、`.analysis/reports/R1906-negative-state-source-map.json`。

## 最近源码恢复与构建

本次同步包含两项源码恢复：`aL()V` sentinel 分支（R1886–R1887）和 Clipping 模式 setter（R1888–R1892）。R1892 的原版字节码对照与 Temurin 25 全树 `compileJava --rerun-tasks` 均通过，退出码 0。异常保护区布局仍与原版不同，尚未运行时验证。当前源文件内容指纹见 R1893 的 `source_worktree_sha256`。

未启动客户端、未使用键鼠、未进入世界、未连接服务器。编译通过只证明源码可编译，不证明功能等价。

## 已排除与仍开放

- R1883 对状态大于 `0x10` 的跳转表解释有误；后续以 R1885 的真实分支修正为准。
- R1871 UI 尝试为 VOID：入口抛 `UnsatisfiedLinkError`，不能记作 ClickGUI 通过或失败。ClickGUI 页面显示和输入仍未验收。
- `category2.a(...)` 的 5 参签名与原版一致；模块注册表 170 个模块、87 个有设置；已测全局布尔为 true。这些不再作为待查假设。
- `commission-ac-bs`、`fbo-state-restore` 与旧工作目录保留原状，尚未集成；不得清理或覆盖。

## 下一步

1. 检查 R1909 比较器，并对最简单构造器读取原版、当前源码和编译 class 的完整 `()V` 字节码；确认差异来源后再复核 15 个构造器的初始化副作用。随后完成 state 7 调用顺序及剩余 state 8 / -11 guard 和异常边；`+0x8edb` runtime buffer 尚无直接观测。
2. 完成全入口控制流、资源/配置/常量/异步任务及消费者核对后，恢复 `Polinex.a(E_CLIENT_INITIALIZED)` 托管源码并做全树构建回归。
3. 之后按正常入口验证 ClickGUI，并继续其他功能和真实服务器验收。
