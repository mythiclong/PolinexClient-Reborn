# OpenPolinex 当前交接

> 更新：2026-11-19 20:52 UTC。R1982 Pathfinder `p():boolean` 已完成源码修复、完整 descriptor/控制流静态复核及 JDK 25 全树构建。双仓 README 已在本地更新；本批源码、证据和 README 的 GitHub 同步待完成。

## 当前基线

- 私有 `openpolinex`：`codex/handoff-progress-2026-11-15`，当前远端基线 `1ffe1bfd8e121156f9e0c3fd31a602a0fa48e1ba`。
- 公开 `PolinexClient-Reborn`：`main`，当前远端基线 `54e967e4f4ae9ee254d349103f8c2bb4c873e966`。
- R1982 Pathfinder owner 源文件当前 Git blob：`5e0d3aa7b7193145c7960b99a969e45d4d34f92d`；工作树内容 SHA-256：`7dd09117edebe0e067056232e994763881c7f2c8b6f15ee43e3f081ef603efd7`。

## 当前唯一切片：R1982 Pathfinder `p():boolean`

修复 `forward` 输入取反导致的 gate 非空分支反转。原版完整 descriptor 和正常调用点 `d(List)` 均已对照；JDK 25 全树 `build --rerun-tasks --no-daemon` exit 0。机器记录：[manifest](../evidence/mining/r1982-pathfinder-forward-predicate/manifest.json)、[静态复核](../evidence/mining/r1982-pathfinder-forward-predicate/static-review.txt)、[构建摘要](../evidence/mining/r1982-pathfinder-forward-predicate/build-summary.txt)。

无 direct probe、客户端、有效玩家/世界、正常用户路径或兼容服务器验收；不得将此切片描述为运行时等价。双仓发布复核完成后，下一步继续 Pathfinder：按完整原版调用图和当前未复核方法选择一个边界明确的 descriptor 切片。

## 最近有效证据

- R1980 `b(Vec3):boolean`：恢复 gate-null 早退；完整 descriptor 对照及 JDK 25 全树构建通过；[manifest](../evidence/mining/r1980-pathfinder-collision-gate/manifest.json)。
- R1981 `o():boolean`：恢复 gate-null 早退、空集合快路径和 `Iterable.iterator()` 接收者；完整 descriptor 对照及 JDK 25 全树构建通过；[manifest](../evidence/mining/r1981-pathfinder-obstacle-check/manifest.json)。
- R1982 `p():boolean`：恢复 gate 非空时 `forward` 输入为真的分支；完整 descriptor/控制流及 `d(List)` 调用点复核，全树构建通过；[manifest](../evidence/mining/r1982-pathfinder-forward-predicate/manifest.json)。
- R1980–R1982 均未做有效玩家/世界、正常路线或兼容服务器验收。

## 已知开放项

- Pathfinder：真实玩家入口、有效世界寻路/碰撞、缓存生命周期和兼容服务器行为未验收；逐方法源码重建仍在继续。
- ClickGUI：鼠标分类/Draw 命中、模块开关、设置列表及保存/重载闭环仍开放。
- Powder Macro、Glacite Commission Macro、Route editor、渲染、配置、网络、native/JNIC 仍有恢复或验证缺口。
- 真实兼容服务器登录、交互、断开及重连未验证；缺地址/授权时只挂起该项，不停止其他恢复。
