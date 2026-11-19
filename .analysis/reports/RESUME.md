# OpenPolinex 当前交接

> 更新：2026-11-19 20:31 UTC。R1979/R1980 源码、证据和中英文 README 已分别快进同步至两个仓库；远端 refs 已复核，详见 [同步记录](SYNC-20261119-PATHFINDER-R1979-R1980.json)。两个仓库保留各自历史内容，**本批列出的共享文件 blob 一致**，不宣称整棵 Git tree 相同。

## 当前基线

- 私有 `openpolinex`：`codex/handoff-progress-2026-11-15`，内容提交 `0feaf958091239bb5dea4bfa34b20a07768aca55`。
- 公开 `PolinexClient-Reborn`：`main`，内容提交 `9e6d9fac0f1484d9e5a309c304d67e9df2e3edcd`。
- 当前 Pathfinder owner 源文件 blob：`689f71330ff91a7b8e5d08aafe6d9bdaae63ef4c`；LF SHA-256：`e8d1ee632e16d1ffc81dbf747d3e91ff4f8ca6a6fccff57382907f954073ca17`。

## 当前唯一下一切片：R1981 Pathfinder `o():boolean`

先读取原版与当前完整 descriptor/字节码和调用点，逐项对齐 gate、player/world 状态读取、调用顺序、分支及副作用；确认差异后再修改。随后做精确编译产物对照和全树构建。不要把构建通过当成运行等价。

## 本批有效证据

- R1979 路线包装器：完整原版 descriptor 对照与 Temurin 25 全树构建；[manifest](../evidence/mining/r1979-pathfinder-collision-route-wrapper/manifest.json)。
- R1980 `b(Vec3):boolean`：补回 gate-null 时 player/level 读取前的 false 早退；完整 descriptor 静态对照，JDK 25 全树 `build --rerun-tasks --no-daemon` exit 0，18 条既有警告，tests `NO-SOURCE`；[manifest](../evidence/mining/r1980-pathfinder-collision-gate/manifest.json)。
- 上述均未做有效 Minecraft 世界/正常玩家路径或兼容服务器验收，不宣称运行时等价。

## 已知开放项

- Pathfinder：真实玩家入口、有效世界寻路/碰撞、缓存生命周期及兼容服务器行为未验收。
- ClickGUI：鼠标分类/Draw 命中、模块开关、设置列表和保存/重载闭环仍开放。
- Powder Macro、Glacite Commission Macro、Route editor、渲染、配置、网络、native/JNIC 仍有恢复或验证缺口。
- 真实兼容服务器登录、交互、断开及重连未验证；需要地址/授权账号时单独挂起该验收，不停止其他恢复。
