# OpenPolinex 当前交接

> 更新：2026-11-19 17:33 UTC。R1970 Pathfinder `b(List, boolean)` 已按完整原版 descriptor 静态复核并修复一个循环上界差异；Temurin JDK 25 全树构建 exit code 0。此 R1970 批次尚未推送，阶段同步完成后在 [双仓记录](SYNC-20261119-PATHFINDER-R1970.json) 核验远端 refs。不要覆盖其他工作树或清理未跟踪调查工具。原版 JAR、protected class 和完整 `javap` 转储只在本机留存，不发布。

## 下一唯一切片：R1971 Pathfinder 距离 helper

审计 `me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c(Vec3, Vec3): double`，即 R1970 `b(List, boolean)` 的直接距离依赖。读取完整原版与当前 descriptor/调用点、核对字段/接收者/分支/异常/副作用；只有找到确定差异才修改，再做全树构建。不要用空世界、null 或 plain-object fixture 推断位置/碰撞行为。

## 最近已完成的有效证据

- R1970 源文件：`polinex-src/src/main/java/me/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll.java`。唯一修改是在循环前缓存 `CollectionsKt.getLastIndex(list)`；完整原版 `b(List, boolean)` descriptor 偏移 0–347、14 个异常表项已复核，最终编译产物有可执行同 descriptor。静态复核：[manifest](../evidence/mining/r1970-pathfinder-route-boundary/manifest.json)、[static review](../evidence/mining/r1970-pathfinder-route-boundary/static-review.txt)、[构建记录](../evidence/mining/r1970-pathfinder-route-boundary/build-jdk25-final.log)。最终 Temurin 25 `build --rerun-tasks` exit code 0，18 条现存 Unsafe/deprecation/unchecked warnings。
- R1970 源代码 Git blob `5b108bbfb08d64c0e4dca16ac34713f9adaa18ad`，LF SHA-256 `8a951e59565e8ba480624ae2a4619bd59ebc2fc345b0312f08593b4ed6a14a3b`，构建时工作树 SHA-256 `2b958276fb9f657985600835126458040559b64f0accfc96139b52a58215908b`。完整 javap 输出/raw build log 留在本机且不发布。
- R1970 没有执行直接差分探针、Minecraft 客户端、有效玩家/世界、正常用户入口或兼容服务器验收；桌面输入未使用。
- R1969 `d(List):void` 静态恢复/全树构建仍见 [manifest](../evidence/mining/r1969-pathfinder-d-list/manifest.json)。之前的有效证据见 README 链接和 `.analysis/evidence/mining/` 各 manifest。

## 仍开放的验收

- Pathfinder 正常玩家入口、实际路线/碰撞、磁盘缓存生命周期和真实兼容服务器行为仍未关闭。
- ClickGUI 鼠标命中、模块开关、设置列表和保存/重载闭环，以及 Powder Macro、Commission Macro、Route editor 导入、渲染、配置、网络、native/JNIC 仍有未恢复或未验收项。
- 真实服务器登录、交互、断开、重连未验证；缺授权账号/地址时暂停这项但继续源码工作，不得宣称项目整体完成。
- 不发布原始 JAR、protected class、完整 javap dump、编译 class、Gradle 缓存或带本机路径的原始日志。Git blob、LF 文本 SHA 与工作树字节 SHA 分开记录。

源码库存当前为 1,602 个 Java 文件、1,158,428 行，可用 `python -B .analysis/stats.py` 复算；计数不是功能进度或等价证明。
