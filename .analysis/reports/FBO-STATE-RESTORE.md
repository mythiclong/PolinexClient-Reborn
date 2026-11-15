# FBO 状态保存/恢复偏差复核

## 记录

- 实验：`FBO-STATE-RESTORE-20261114`
- worktree：`<local worktree>`
- 基线：`1db1aee027ea049885af6f08fb15e74cd0eefe84`，detached HEAD；开始时工作树干净。
- 原版行为依据：`.analysis/cracked.jar`，SHA-256 `D85398CFD774781E888A3F36CFBFA87A4CF04235F8459BB6A00437A5D3C48A26`（只读）。
- 源码 SHA-256：修改前 `560EA262BF8789406D5E86E016D50D6BA71F8FB46A3041A51E67CE93C48576BA`；修改后 `B93C45D8C495D99471CDF52B5F91A75AC4CD2CDF0D4C8E8D7C12CF6FBF3EAC37`。
- 编译 class SHA-256：`4567EBEC805F2979306CA071E4FFAE714A4B534AFF33DA1AD2D7B0F061A7F5D6`。
- 目标外层类：`me.octo.client.utils.IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl`
- 方法 `private final a` 的完整 JVM descriptor：

```text
(Lme/octo/client/utils/IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;IIIIFFFFF)Lme/octo/client/utils/IIlllllIIlllIllIIlllIIIlIllIIllllIIIlIIlIIIIIlIIIlIlllllIIlIIIllllIIIIlIIIIlIIlIlllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
```

## 原版完整字节码映射

原版读取命令：`javap -p -c -s -classpath .analysis/cracked.jar <目标外层类>`，退出码 0。方法 descriptor 与重建 class 一致。原版偏移 9–79 的保存查询给出下列槽位；恢复调用在同一方法的失败分支和 finally 中：

| 原版局部槽 | 查询值 | OpenGL 状态 | 恢复 API / 参数 |
|---:|---:|---|---|
| 12 | 36006 | `GL_FRAMEBUFFER_BINDING` | `GL30.glBindFramebuffer(36160, savedFramebuffer)` |
| 13 | 3074 | `GL_READ_BUFFER` | `GL11.glReadBuffer(savedReadBuffer)` |
| 14 | 35725 | `GL_CURRENT_PROGRAM` | `GL20.glUseProgram(savedProgram)` |
| 15 | 34229 | `GL_VERTEX_ARRAY_BINDING` | `GL30.glBindVertexArray(savedVao)` |
| 16 | 34964 | `GL_ARRAY_BUFFER_BINDING` | `GL15.glBindBuffer(34962, savedArrayBuffer)` |
| 17 | 35053 | `GL_PIXEL_PACK_BUFFER_BINDING` | `GL15.glBindBuffer(35051, savedPixelPackBuffer)` |
| 18 | 35055 | `GL_PIXEL_UNPACK_BUFFER_BINDING` | `GL15.glBindBuffer(35052, savedPixelUnpackBuffer)` |
| 19 | 34016 | `GL_ACTIVE_TEXTURE` | `GL13.glActiveTexture(savedActiveTexture)` |
| 20 | 32873 | active unit 的 `GL_TEXTURE_BINDING_2D` | `GL11.glBindTexture(3553, savedTexture)` |
| 21 | 3042 | blend enable | 对 3042 调 `glEnable` / `glDisable` |
| 22 / 23 | 3041 / 3040 | blend source / destination | `GL11.glBlendFunc(savedBlendSrc, savedBlendDst)` |
| 24 | 2884 | cull-face enable | 对 2884 调 `glEnable` / `glDisable` |
| 25 | 2929 | depth-test enable | 对 2929 调 `glEnable` / `glDisable` |
| 26 | 3089 | scissor-test enable | 对 3089 调 `glEnable` / `glDisable` |
| 27 | 2960 | stencil-test enable | 对 2960 调 `glEnable` / `glDisable` |
| 28 | 2968 | stencil write mask | `GL11.glStencilMask(savedStencilMask)` |
| 29–32 | 3330–3333 | `GL_PACK_*` 参数 | 对应值逐项 `GL11.glPixelStorei` |
| 33–36 | 3314–3317 | `GL_UNPACK_*` 参数 | 对应值逐项 `GL11.glPixelStorei` |

原版还通过数组保存 `GL_VIEWPORT`（2978）、`GL_COLOR_WRITEMASK`（3107）及 `GL_COLOR_CLEAR_VALUE`（3106），分别以 `glViewport`、`glColorMask`、`glClearColor` 恢复。原方法没有单独查询/恢复 `GL_ELEMENT_ARRAY_BUFFER_BINDING`；查询 34964 是 array-buffer binding。35053/35055 是 pixel-pack/unpack buffer binding，分别恢复到 35051/35052。

原版 FBO 不完整分支从 framebuffer-status 检查后进入清理（字节码偏移 435–978）：删除临时 texture，恢复上述 bindings、viewport/read-buffer/clear-color、blend/enable、mask 与全部 pack/unpack 像素存储状态，再返回 null。成功读回前绑定工作 FBO 是为了 `glReadPixels`；清理出口恢复进入函数前保存的 FBO。原版异常表把绘制/读回区间送往 catch-all finally（handler 偏移 3560），清理后于 4094 重新抛出异常。

## 修改内容

只修改目标方法所在 Java 文件：

1. 按原版槽位分别保存 framebuffer、program、VAO、array buffer、pixel-pack/unpack buffer；修正 FBO 被当 program、program 被当 VAO、VAO 被当 array buffer、array-buffer 值被当 pack PBO 的错配。
2. FBO 不完整早退路径补齐原版的完整状态恢复。
3. 不完整分支和 `finally` 恢复 `savedFramebuffer`；保留读回前绑定本帧 FBO 的行为。
4. cull/depth/scissor/stencil 保存变量改为与实际 GL 状态相符的名称，枚举及状态行为保持原版。

## 构建和字节码验收

构建命令及实际结果：

```text
JAVA_HOME=JDK 25.0.4.101 (JAVA_HOME configured locally)
.\gradlew.bat --no-daemon compileJava --offline --console=plain "-Dorg.gradle.jvmargs=-Xmx1g -XX:MaxMetaspaceSize=512m -XX:ReservedCodeCacheSize=96m -XX:+UseSerialGC"
START_UTC=2026-11-14T12:08:06Z
END_UTC=2026-11-14T12:08:53Z
EXIT_CODE=0
BUILD SUCCESSFUL; 18 条 Unsafe、过时 API、unchecked 警告；目标方法无编译错误。
```

重建字节码命令：`javap -p -c -s -classpath build/classes/java/main <目标外层类>`；`-l` 另用于关联本次编译的局部变量表。javap 退出码 0。机器断言 `JAVAP_SEMANTIC_CHECK=PASS`（退出码 0）：descriptor 一致，查询映射与上表一致；恢复 API 的实参来自正确保存槽。编译后 FBO 绑定按 bytecode 为：工作 FBO、saved FBO、工作 FBO、saved FBO、saved FBO，分别对应初次绘制、FBO 失败清理、读回、正常清理、异常清理。

FBO 失败路径断言通过：包含 program、VAO、array/PBO、active texture、2D texture、saved FBO、viewport/read-buffer/clear-color、blend、五类 enable、color/stencil mask 和 8 个 pack/unpack 参数的恢复调用。 辅助检查曾有一次从 worktree 根目录使用相对 classpath 的 `javap` 退出码 1，以及一次局部变量加载/存储解析器断言失败；分别修正工作目录和 `istore` 解析后，最终完整反汇编与语义断言退出码 0。它们是检查脚本/路径问题，不是构建或源码失败。重建异常表包含 catch-all `[777,1497) -> 1830`；handler 字节码恢复 saved FBO、program、VAO、buffers、viewport/read-buffer/clear-color、blend/masks、8 个 pack/unpack 参数，然后重新抛出异常。`git diff --check` 退出码 0。

未启动客户端或操作桌面。动态 OpenGL 状态和最终截图画面尚未实机验证；本切片结论限于原版静态字节码对应、重建字节码核验和编译通过。

## 工作区交付

仅有目标 Java 文件与本复核报告两项工作区修改。未创建 commit、未推送、未修改主工作区文件。
