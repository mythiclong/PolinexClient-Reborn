# OpenPolinex 当前交接

> 更新：2026-11-23 UTC。活动切片 R2001；证据生成于集成 HEAD `438ebdba2cffd1e971c52c05b527bc8fbbd043d4`，分支 `codex/pathfinder-cache-lifecycle`。生产源文件 SHA-256：`987cfd06a75cf98473a381c306ffe20eecb43d5a1728efad980563bcb8dadfea`。原版归档 SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`；归档不发布。

## 当前唯一切片：Pathfinder v2 cache generation / merge

- 已依完整原版 descriptor 恢复 `b()V` 的目录遍历、chunk 读取、合并聚合与文件写出，抽取仅供夹具调用的 `polinex$generateCacheFiles(File,String[])`；按原版修复 `a(ChunkKey,ByteBuffer):ByteBuffer` 的状态遍历/输出。删除原版不存在的 `impl()` 和返回 null 的伪 bridge。
- 静态依据及原版/编译后完整 javap：[原版](R2001-v2-generator-original.javap.txt)、[最终编译版](R2001-v2-generator-compiled-final.javap.txt)；简要复核：[R2001 static review](../evidence/mining/r2001-pathfinder-v2-cache-generation/static-review.txt)。
- Temurin JDK 25 `compileJava --rerun-tasks` + 双离线探针同批完成，Gradle exit 0。9-chunk 稀疏 merge 的原版/当前结果同为 1 条输出，SHA-256 `9280978275a7f4584556dee1d876c55ca411312c6bfc47abbaceada7a738f514`；聚合输出含 5 个状态、27 字节，SHA-256 `1a730df114f6a7aaec4e568eafe7d50c88198da2241584b3c5ad6fe05d8269f3`。机器记录与真实命令/退出码：[manifest](../evidence/mining/r2001-pathfinder-v2-cache-generation/manifest.json)、[run log](../evidence/mining/r2001-pathfinder-v2-cache-generation/run-r2001-combined.log)。
- 探针用精确复核的 `a(III)I` 坐标索引 test shim 绕过其宿主类的 Minecraft 单例静态初始化，并用日志 sink shim 捕获 `c(String)V`。shim 未进入生产源码；真实 Minecraft 执行路径尚未验收。合成字节夹具只证明被测边界，不代表真实世界缓存数据。

## 已知开放缺口

- 未启动客户端或有效世界；未验收真实 cache consumer 的读取/切换/失效、worker 生命周期、路线结果→执行→停止/清理闭环。
- Pathfinder 正常请求与路线执行仍开放；Powder Macro、Glacite Commission Macro 正常入口/状态机未闭合。
- 兼容服务器登录、交互、断开、重连未验收。
- R2001 双仓 README/证据同步尚待完成；原始 JAR/native、凭据及游戏日志不发布。

## 下一步

追踪真实路线消费者中的「路线结果写入 → 执行状态 → 停止/清理 → 缓存读取与失效」完整调用链。用完整类名/descriptor 对照原版，找到一个有具体静态依据、可隔离验收的小切片后直接修改并做全树构建/相关验证；需要世界或实体的路径留到单实例有效游戏验收。不回切 ClickGUI、全客户端普查或无关调查。