# OpenPolinex 当前交接

> 更新：2026-11-19 23:29 UTC。R1986 Pathfinder 有界步进调用契约静态恢复及 Temurin JDK 25 全树构建已通过；R1986 双仓发布与 blob 核验正在收尾。R1985 已同步记录见 [R1985 双仓记录](SYNC-20261119-PATHFINDER-R1985.json)。两个仓库保留各自历史 tree，不以共享文件一致冒充整棵 tree 相同。

## 当前基线

- 当前工作分支：`codex/bootstrap-eclientinit-2026-11-15`，R1986 修改基于文档提交 `9797f6c4b9cb16a09af1b9873e6028dc38ae361b`；远端在本切片开始时分别为私有 `openpolinex/codex/handoff-progress-2026-11-15`=`9797f6c4b9cb16a09af1b9873e6028dc38ae361b`、公开 `PolinexClient-Reborn/main`=`a9525960807b7602ac9b525371cf5ec5dc839462`。
- R1986 源码工作树 SHA-256：`15261162f52764653bb7a6049bd64c2ea58196c6e99ed5264aad67ea0ac283a6`；规范 Git blob：`325f035243955b3338f1a839c93b03e540b2e1cf`。双仓 R1986 发布完成后再补录内容提交和远端 blob 核验。

## 当前唯一切片：R1986 Pathfinder 有界步进默认桥调用

按完整 descriptor 恢复 `a(DDZI)Integer` 中 `param5 && index == 1` 的原版判断、默认参数桥调用、singleton 读取顺序以及显式 `true`、mask 32 和 `0.0` 默认值；修复原源码把判断写成 `index != 1` 且改走五参数直接重载的问题。完整对照原版目标方法与 bridge；直接 caller 为 `n()Z` 和 `o()Z`，后者确实含 `true` 的 alternate-step 调用点。

Temurin JDK 25 全树 `build --rerun-tasks --no-daemon` exit 0，18 条警告、测试 `NO-SOURCE`。静态复核和构建摘要见 [R1986 manifest](../evidence/mining/r1986-pathfinder-step-default-bridge/manifest.json)、[static review](../evidence/mining/r1986-pathfinder-step-default-bridge/static-review.txt)、[build summary](../evidence/mining/r1986-pathfinder-step-default-bridge/build-summary.txt)。未做直接运行差分、客户端、有效玩家/世界、正常寻路或兼容服务器验收；不宣称运行时等价。

## 最近有效证据

- R1986 Pathfinder 有界步进 helper 原版默认桥参数静态复核及全树构建：[manifest](../evidence/mining/r1986-pathfinder-step-default-bridge/manifest.json)。双仓发布尚在收尾。
- R1985 源码、证据和双语 README 的双仓发布及共享文件 blob 核验：[同步记录](SYNC-20261119-PATHFINDER-R1985.json)。两端列出的源码、README、RESUME 和证据 blobs 一致；仓库完整 Git tree 不同。

- R1984 `h():double`：恢复 gate-null 时按 `backward` 决定结果；静态与全树构建通过，按稳定输入快照限定结论。[manifest](../evidence/mining/r1984-pathfinder-forward-input-gate-null/manifest.json)
- R1983 `n():boolean`：恢复 gate-null 分支；静态与全树构建证据。[manifest](../evidence/mining/r1983-pathfinder-dual-input-predicate/manifest.json)
- R1982 `p():boolean`：修正非空 gate 下 `forward` 谓词取反；静态与全树构建证据。[manifest](../evidence/mining/r1982-pathfinder-forward-predicate/manifest.json)

## 开放验收与缺陷

- Pathfinder 有效世界碰撞/寻路、正常玩家入口、缓存生命周期和兼容服务器行为仍未验收。
- ClickGUI 分类/Draw 鼠标命中、模块开关、设置列表与保存/重载闭环仍开放。
- Powder Macro、Glacite Commission Macro、Route editor、渲染、配置、网络和 native/JNIC 仍有源码或行为验收缺口。
- 真实兼容服务器登录、交互、断开、重连未验证；地址/账号缺失只挂起服务器验收，不停止其他恢复。

## 下一步

1. 完成 R1986 内容提交的双仓同步和共享文件 blob 核验，并记录实际内容提交与远端 refs。
2. 取得有效玩家/世界后，对 R1986 alternate-step 正常路径做原版/编译产物差分；未取得有效世界前不以 null/plain-object 探针代替。
3. 继续 Pathfinder：按完整 descriptor 与直接调用图挑选下一处可证明差异；每个边界清晰的小切片跑全树构建并阶段性更新双语 README、RESUME 与机器证据。
4. 不发布受保护原始二进制、完整 javap dump、含本机路径的原始日志或构建产物；静态/构建通过不得替代正常用户路径或兼容服务器验收。
