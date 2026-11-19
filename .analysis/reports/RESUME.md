# OpenPolinex 当前交接

> 更新：2026-11-19 22:01 UTC。R1984 源码、机器证据及中英文 README 已同步至两个仓库；内容提交 refs 和列出的共享文件 blobs 已核验。详见 [R1984 sync](SYNC-20261119-PATHFINDER-R1984.json)。两个仓库保留各自历史 tree，不声称整棵 tree 相同。

## 当前基线

- 私有 `openpolinex`：`codex/handoff-progress-2026-11-15`，R1984 内容提交 `28200605e1b7b33830dd8f48b399e3024bfb747e`。
- 公开 `PolinexClient-Reborn`：`main`，R1984 内容提交 `918e8c17438e66ce1ba4ce2edfc35088a1560da1`。
- 源文件最终 blob `d40f2d2f5ee15ae32dc1081895383a55d7fb1e2d`，内容 SHA-256 `a393e377de1d371992a0a321f86c3b3aa11951da3aa153136a6375a530053393`。

## 当前唯一切片：R1984 Pathfinder `h():double`

恢复原版 gate-null 分支用 `backward` 而非 `forward` 决定轴向结果。完整核对 `h()/i()` descriptor、输入 getter、原版异常处理和直接调用路径；原版部分分支会重复取键，托管代码仍按每个按键一次读取，因此只确认稳定输入快照下的返回分支，不声称 getter 调用次数完全一致。`j()` 路径没有已证明的 gate-null 排除条件，但真实普通路径差异尚未验证。

JDK 25 全树 Gradle `build --rerun-tasks --no-daemon` exit 0，18 条警告，测试 `NO-SOURCE`。无 direct probe、客户端、有效玩家/世界、正常用户路径或兼容服务器验收。机器证据：[manifest](../evidence/mining/r1984-pathfinder-forward-input-gate-null/manifest.json)、[静态复核](../evidence/mining/r1984-pathfinder-forward-input-gate-null/static-review.txt)、[构建摘要](../evidence/mining/r1984-pathfinder-forward-input-gate-null/build-summary.txt)。

## 最近有效证据

- R1982 `p():boolean`：修复非空 gate 下 `forward` 条件反向；完整 descriptor/控制流和 `d(List)` 调用点静态复核、JDK 25 全树构建通过。[manifest](../evidence/mining/r1982-pathfinder-forward-predicate/manifest.json)
- R1983 `n():boolean`：恢复 gate getter 与 gate-null 分支；唯一普通调用点 `d(List)` 在 null gate 时提前返回；静态/构建证据，不证明常规路径有差异。[manifest](../evidence/mining/r1983-pathfinder-dual-input-predicate/manifest.json)
- R1984 `h():double`：修复 gate-null 方向键选择；静态/构建证据，不证明正常游戏或服务器等价。[manifest](../evidence/mining/r1984-pathfinder-forward-input-gate-null/manifest.json)

## 已排除假设与开放缺陷

- R1982–R1984 没有客户端、有效玩家/世界、正常用户路径或兼容服务器验收；不得将静态/构建通过写成功能等价。
- Pathfinder：有效世界寻路、碰撞、缓存生命周期、正常玩家入口及兼容服务器行为未验收；源码方法重建继续进行。
- ClickGUI：鼠标分类/Draw 命中、模块开关、设置列表与保存/重载闭环仍开放。
- Powder Macro、Glacite Commission Macro、Route editor、渲染、配置、网络、native/JNIC 仍有恢复或验证缺口。
- 真实兼容服务器登录、交互、断开和重连未验证；地址或授权账号缺失只挂起服务器验收，不停止其他恢复。

## 下一步

1. 继续 Pathfinder：按原版完整 descriptor 与直接调用图选一个边界清楚的方法切片；不凭相邻方法或计数推断缺陷。若同一假设/手段连续两次无新增证据，改用调用图、分支探针或可靠输入。
2. 每个小批次记录静态还原、构建回归及未做的运行时/用户路径/服务器维度；阶段同步源码、机器证据、README 和 RESUME 到两个仓库。
3. 不上传原始受保护二进制、完整 javap dump、含本机路径的原始日志或构建产物。
