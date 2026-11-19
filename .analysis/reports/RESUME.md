# OpenPolinex 当前交接

> 更新：2026-11-19 19:59 UTC。R1977/R1978 源码、证据和中英文 README 已分别快进推送到两个仓库，且内容提交 refs 已复核。工作树基线：私有 `openpolinex` 内容提交 `ba9f2a722ffb5592bfa42c30b44dd1ca261ca83a`；公开 `PolinexClient-Reborn` 内容提交 `b46a521f074b7718ccb6c2c6efe3224454334852`。元数据（本交接和同步记录）随后单独提交。

## 当前唯一切片：R1979 Pathfinder 碰撞偏移路线包装器

直接调用刚复核的碰撞推力 helper 的方法：`a(ArrayList<Vec3>, Vec3, Vec3): ArrayList<Vec3>`。下一步先从原始 owner 确认精确 JVM descriptor，再完整复核 gate、空/非空列表、首元素读取、`g(...)` 调用、偏移向量应用及 fallback 顺序；只按完整原版字节码修复。完成后全树构建并同步两仓。客户端正常寻路、有效玩家/世界和兼容服务器仍须另外验收。

## 最近完成

- **R1978**：修复 `g(Vec3,Vec3,Vec3):Vec3` 的 gate 与 Kotlin 空值检查、半径外碰撞跳过、聚合碰撞向量后统一缩放；完整静态对照与 Temurin JDK 25 全树 `build --rerun-tasks` 通过。
- **R1977**：完整静态审计 `a(Vec3):boolean`，将 `size()` 调用 owner 对齐原版 `Collection.size()I`；仅保留 Java 对冗余 widening cast 的编译降低差异。与 R1978 共用最终全树构建。
- 证据：[R1977](../evidence/mining/r1977-pathfinder-position-predicate/manifest.json)、[R1978](../evidence/mining/r1978-pathfinder-collision-push/manifest.json)、[两仓同步记录](SYNC-20261119-PATHFINDER-R1977-R1978.json)。

## 仍开放 / 禁止推断为通过

- Pathfinder 正常玩家路线、有效世界碰撞与缓存生命周期仍未验收；R1977/R1978 均没有直接探针、客户端或真实服务器测试。
- ClickGUI 鼠标命中、模块开关、设置列表及保存/重载闭环仍开放。
- Powder Macro、Glacite Commission Macro、Route editor JSON 导入，以及配置、渲染、网络、native/JNIC 均仍有恢复或验收缺口。
- 真实兼容服务器登录、交互、断开和重连未测试。无地址/授权账号时只暂停服务器验收，不代表项目完成。

不发布原始受保护 JAR/class、完整 javap dump、带本机路径的原始日志或构建缓存。源码与证据指纹对应内容提交；同步只允许 fast-forward，不 force-push。
