# OpenPolinex 当前交接

> 更新：2026-11-19 20:45 UTC。R1981 源码、证据和中英文 README 已同步至两个仓库；远端 refs 与本批共享文件 blob 已复核，详见 [同步记录](SYNC-20261119-PATHFINDER-R1981.json)。两个仓库保留各自历史内容，不宣称整棵 Git tree 相同。

## 当前基线

- 私有 `openpolinex`：`codex/handoff-progress-2026-11-15`，内容提交 `d1cdb48c895f8c8ce9d8256a73150f7e6e773b1a`。
- 公开 `PolinexClient-Reborn`：`main`，内容提交 `8bc902f584422cbde80ef177e7e39a780e2747b8`。
- Pathfinder owner 源文件 blob：`5a6a325ce33d76923e8fb6ee550ddc09d166d1be`；LF SHA-256：`df35bceb16519c35cc9ab516ffdc382704223b46de5e194a3ad24aa95e73bce0`。

## 当前唯一下一切片：R1982 Pathfinder `p():boolean`

先核对原版与当前完整 descriptor/字节码、调用点、gate/player/world 读取、分支及副作用；确认差异后再改源码，并执行编译产物对照和全树构建。R1982 尚未开始，不能据方法相邻或被同一调用者使用推断存在缺陷。

## 最近有效证据

- R1979 `a(ArrayList<Vec3>,Vec3,Vec3)`：完整 descriptor 调用目标复核与 JDK 25 全树构建；[manifest](../evidence/mining/r1979-pathfinder-collision-route-wrapper/manifest.json)。
- R1980 `b(Vec3):boolean`：恢复 gate-null 时读取 player/level 前的 false 早退；完整 descriptor 对照、JDK 25 全树构建通过；[manifest](../evidence/mining/r1980-pathfinder-collision-gate/manifest.json)。
- R1981 `o():boolean`：恢复 gate-null 早退、Collection 空集合快路径和 `Iterable.iterator()` 接收者；17 个调用目标、6 个字段引用按序匹配；JDK 25 全树构建通过。首次编译失败的字段拼写错误已修正并记入 attempts；[manifest](../evidence/mining/r1981-pathfinder-obstacle-check/manifest.json)。
- 以上均未做有效 Minecraft 玩家/世界、正常用户路径或兼容服务器验收，不宣称运行时等价。

## 已知开放项

- Pathfinder：真实玩家入口、有效世界寻路/碰撞、缓存生命周期及兼容服务器行为未验收。
- ClickGUI：鼠标分类/Draw 命中、模块开关、设置列表和保存/重载闭环仍开放。
- Powder Macro、Glacite Commission Macro、Route editor、渲染、配置、网络、native/JNIC 仍有恢复或验证缺口。
- 真实兼容服务器登录、交互、断开及重连未验证；需要地址/授权账号时只挂起该验收，不停止其他恢复。
