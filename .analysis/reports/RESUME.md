# OpenPolinex 当前交接

> 更新：2026-11-19。R1954 证据产生于代码提交 `cd805c46ce4c16912bb12d3441ff927c06decf31`；Java 源树内容指纹 `a23ce38f1eb037f6042e457e2910423fd00efcc98790fe1d07e85fdf501099d8`（1,602 个文件）。本地原版 JAR SHA-256：`d85398cfd774781e888a3f36cfbfa87a4cf04235f8459bb6a00437a5d3c48a26`，不发布 双仓同步索引：[SYNC-20261119-PATHFINDER-R1954.json](SYNC-20261119-PATHFINDER-R1954.json)。

## 当前唯一切片：R1955 Pathfinder 路线转换核心

- 完整对照 `a(long[], double, double, ClientLevel): List` 与其直接步进/碰撞 helper；核对所有分支、字段、调用目标、异常和副作用。仅在找到可确认差异时改源码。
- R1954 已对照 `a(long[], double, double, boolean): List` 与缓存写入 `(int, int, ByteBuffer): void`。没有确认到源码差异或生产 Java 修改；完整记录见 [R1954 manifest](../evidence/mining/r1954-route-converter-cache-exception/manifest.json)。
- R1954 对缓存目录分支的早期判断因 JVM 操作数栈顺序误读而撤回。gate 为零时使用维度子目录，gate 非零时使用缓存根目录；当前源码与原版相符。错误 JAR 子集生成的转储已标为 VOID，未用作结论。
- R1954 `python -B .analysis/stats.py` 退出码 0；Temurin 25.0.4.1 下 `.\gradlew.bat build --no-daemon --console=plain` 退出码 0，Java 源树未改变。`compileJava` 为 UP-TO-DATE；这不是路线运行等价证据。

## 当前有效证据

- [R1954 路线入口与缓存写入静态复核](../evidence/mining/r1954-route-converter-cache-exception/manifest.json)：原版 JAR 哈希已现场复核；原版/当前完整类转储命令均退出 0。未运行 Minecraft、有效世界、文件系统故障注入或服务器。
- [R1953 包装方法分支复核](../evidence/mining/r1953-pathfinder-wrapper-audit/manifest.json)：四种 gate/路径长度组合与原版一致；此前“分支反转”判断已撤回。
- [R1952 调用图与 method-handle 扫描](../evidence/mining/r1952-pathfinder-call-graph/manifest.json)、[R1951 NativePathFinder 对照](../evidence/mining/r1951-native-pathfinder-implementation-audit/manifest.json)：静态与有限离线样本有效，不代表游戏内全域等价。

## 已排除的假设

- `category2.a(...)` 五参数签名与原版一致；不是 ClickGUI 输入问题的证据。
- 计数、全局布尔和空壳扫描不证明功能等价；R257 的 IFC0/IFC1 未调用不能单独证明渲染请求未发出。
- 原版路线 wrapper 和当前源码编译结果不存在已确认的 gate 反转；R1954 缓存路径也不存在已确认的 gate 目录差异。

## 未关闭的功能与验收

- Pathfinder 有效路线、碰撞、实体落脚点、缓存读写生命周期及正常事件入口未在有效 Minecraft 世界验证；兼容服务器登录/交互/断开/重连未验收。
- ClickGUI 鼠标命中、模块开关、设置保存/重载未闭环。
- 干净 checkout/空缓存发布构建、其他模块和 native/JNIC 功能仍需按正常用户路径及原版同条件对照逐项关闭。

## 下一步

完成 R1955 的完整方法复核，保存源内容哈希、原版/编译字节码证据与明确断言；若无差异，转向 Pathfinder 上游调用入口或仍未闭合的功能族，不重复无目的扫描。只有具备隔离的游戏窗口/世界时才做正常路径验收。
