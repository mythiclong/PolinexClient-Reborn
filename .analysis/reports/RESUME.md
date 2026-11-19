# OpenPolinex 当前交接

> 更新：2026-11-19 21:12 UTC。R1982、R1983 源码、证据及中英文 README 已同步至两个仓库；本批 content refs 和共享 blob 已核验。详见 [R1982](SYNC-20261119-PATHFINDER-R1982.json) 与 [R1983](SYNC-20261119-PATHFINDER-R1983.json) 双仓同步记录。两个仓库保留各自历史 tree，不声称整棵 tree 相同。

## 当前基线

- 私有 `openpolinex`：`codex/handoff-progress-2026-11-15`，R1983 内容提交 `821ff21e43fa0b32f3f9dbcfc9306d1d9654a499`。
- 公开 `PolinexClient-Reborn`：`main`，R1983 内容提交 `10a4d72e94c1f04c69297d234627e32e58e16f5d`。
- R1983 源码基线为私有内容提交 `323895762b59911d7a81b3568e25ff7406c7f689`，owner 源文件切片前 blob `5e0d3aa7b7193145c7960b99a969e45d4d34f92d`；最终 blob `b24cb6c2a73b66ac52a53be240dfcca0ce1d68ca`，内容 SHA-256 `b371c1dea596d86f949bbb12ee6b6dee3ee702af6495c928d52da74a7b862024`。

## 当前唯一切片：R1983 Pathfinder `n():boolean`

恢复原源码遗漏的 gate 读取和 gate-null 分支。原版完整 descriptor、调用顺序及唯一正常调用点 `d(List)` 已对照；该 caller 在 gate-null 时先返回，因此没有证明普通游戏路径存在行为差异。JDK 25 全树 build exit 0。机器记录：[manifest](../evidence/mining/r1983-pathfinder-dual-input-predicate/manifest.json)、[静态复核](../evidence/mining/r1983-pathfinder-dual-input-predicate/static-review.txt)、[构建摘要](../evidence/mining/r1983-pathfinder-dual-input-predicate/build-summary.txt)。

无 direct probe、客户端、有效玩家/世界、正常用户路径或兼容服务器验收；不得将此切片描述为运行时等价。R1983 已双仓同步。下一步继续 Pathfinder：按完整调用图盘点尚未复核的方法，再选一个边界明确的 descriptor 切片，不因方法相邻或计数推断缺陷。

## 最近有效证据

- R1980 `b(Vec3):boolean`：恢复 gate-null 早退；完整 descriptor 对照及 JDK 25 全树构建通过；[manifest](../evidence/mining/r1980-pathfinder-collision-gate/manifest.json)。
- R1981 `o():boolean`：恢复 gate-null 早退、空集合快路径和 `Iterable.iterator()` 接收者；完整 descriptor 对照及 JDK 25 全树构建通过；[manifest](../evidence/mining/r1981-pathfinder-obstacle-check/manifest.json)。
- R1982 `p():boolean`：恢复 gate 非空时 `forward` 输入为真的分支；完整 descriptor/控制流及 `d(List)` 调用点复核，全树构建通过；[manifest](../evidence/mining/r1982-pathfinder-forward-predicate/manifest.json)。
- R1982 双仓发布记录：[SYNC](SYNC-20261119-PATHFINDER-R1982.json)。
- R1983 `n():boolean`：恢复 gate getter 和 gate-null 分支；完整 descriptor/CFG、单一调用点复核及全树构建通过；[manifest](../evidence/mining/r1983-pathfinder-dual-input-predicate/manifest.json)。
- R1980–R1983 均未做有效玩家/世界、正常路线或兼容服务器验收。

## 已知开放项

- Pathfinder：真实玩家入口、有效世界寻路/碰撞、缓存生命周期和兼容服务器行为未验收；逐方法源码重建仍在继续。
- ClickGUI：鼠标分类/Draw 命中、模块开关、设置列表及保存/重载闭环仍开放。
- Powder Macro、Glacite Commission Macro、Route editor、渲染、配置、网络、native/JNIC 仍有恢复或验证缺口。
- 真实兼容服务器登录、交互、断开及重连未验证；缺地址/授权时只挂起该项，不停止其他恢复。
