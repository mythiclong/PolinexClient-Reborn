# OpenPolinex 当前交接

> 更新：2026-11-19 22:29 UTC。R1985 Pathfinder 静态恢复及 Temurin JDK 25 全树构建已通过；本轮源码、证据和双语 README 的双仓同步待验证。两个仓库保留各自历史 tree，不以共享文件一致冒充整棵 tree 相同。

## 当前基线

- 工作分支基线：`d353e30ef8d11edc0292690bf0c037e4381fce68`；私有远端 `openpolinex/codex/handoff-progress-2026-11-15` 在本轮开始时位于同一提交。
- 公开远端 `PolinexClient-Reborn/main` 本轮开始时为 `788ed401d174b8560275ac0890f86fb73ccb5211`。
- 当前源码 SHA-256：`986be2d5536af63bd8152c3d85d25c98e33269ef54b87612b21fd41e08f06c77`；Git blob：`86b1697b16ed8176e3471011414029cefc4d814a`。

## 当前唯一切片：R1985 Pathfinder 方向轴与步进 helper

恢复 `a([Z)D`、`b([Z)D`、`a(ID)Z`、`a(DDID)Integer` 的 gate-null/非空分支；步进 helper 还修复 `newY - oldY > 0.05` 被错误写成绝对差值，以及 gate-null 时仍可能返回索引的问题。完整核对 `c(List)` 候选方向来源和默认参数桥的 mask/参数传递；原版轴方法在 gate-null 分支只使用首轴键，helper 仍按原版顺序调用 `k()` 再检查 gate。

Temurin JDK 25 全树 `build --rerun-tasks --no-daemon` exit 0，18 条警告、测试 `NO-SOURCE`。静态复核和构建摘要见 [R1985 manifest](../evidence/mining/r1985-pathfinder-axis-and-step-gates/manifest.json)、[static review](../evidence/mining/r1985-pathfinder-axis-and-step-gates/static-review.txt)、[build summary](../evidence/mining/r1985-pathfinder-axis-and-step-gates/build-summary.txt)。未做原版/编译产物运行差分、客户端、有效玩家/世界、正常寻路或兼容服务器验收；不宣称运行时等价。

## 最近有效证据

- R1984 `h():double`：恢复 gate-null 时按 `backward` 决定结果；静态与全树构建通过，按稳定输入快照限定结论。[manifest](../evidence/mining/r1984-pathfinder-forward-input-gate-null/manifest.json)
- R1983 `n():boolean`：恢复 gate-null 分支；静态与全树构建证据。[manifest](../evidence/mining/r1983-pathfinder-dual-input-predicate/manifest.json)
- R1982 `p():boolean`：修正非空 gate 下 `forward` 谓词取反；静态与全树构建证据。[manifest](../evidence/mining/r1982-pathfinder-forward-predicate/manifest.json)

## 开放验收与缺陷

- Pathfinder 有效世界碰撞/寻路、正常玩家入口、缓存生命周期和兼容服务器行为仍未验收。
- ClickGUI 分类/Draw 鼠标命中、模块开关、设置列表与保存/重载闭环仍开放。
- Powder Macro、Glacite Commission Macro、Route editor、渲染、配置、网络和 native/JNIC 仍有源码或行为验收缺口。
- 真实兼容服务器登录、交互、断开、重连未验证；地址/账号缺失只挂起服务器验收，不停止其他恢复。

## 下一步

1. 将 R1985 源码、机器证据、README 和本交接分别快进同步至私有 `openpolinex` 与公开 `PolinexClient-Reborn`，核对两端 refs 和共享文件 blobs，并记录仓库 tree 不同这一限制。
2. 继续 Pathfinder：按完整 descriptor 与直接调用图挑选下一处可证明的源码差异；到达清晰切片边界后跑全树构建及相关运行验收。
3. 不发布受保护原始二进制、完整 javap dump、含本机路径的原始日志或构建产物；静态/构建通过不得替代用户路径或服务器验收。
