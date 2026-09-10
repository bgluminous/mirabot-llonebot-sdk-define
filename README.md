<h1 align="center">MiraBot LLOneBot SDK Define</h1>
<p align="center">
  LLOneBot / OneBot 11 的 Java 协议定义包<br/>
  请求 · 响应 · 事件 · 消息段，开箱即可按 action 映射
</p>

<p align="center">
  <img alt="Version" src="https://img.shields.io/badge/version-1.9.0-brightgreen"/>
  <img alt="Java" src="https://img.shields.io/badge/Java-21-orange"/>
  <img alt="OneBot" src="https://img.shields.io/badge/OneBot-11-informational"/>
  <img alt="License" src="https://img.shields.io/badge/license-Apache%202.0-blue"/>
  <a href="https://github.com/bgluminous/mirabot-llonebot-sdk-define">
    <img alt="GitHub stars" src="https://img.shields.io/github/stars/bgluminous/mirabot-llonebot-sdk-define?style=social"/>
  </a>
</p>

<p align="center">
  <a href="#安装">安装</a> ·
  <a href="#快速开始">快速开始</a> ·
  <a href="#协议映射">协议映射</a> ·
  <a href="https://llonebot.apifox.cn">LLOneBot 文档</a> ·
  <a href="https://github.com/botuniverse/onebot-11">OneBot 11</a>
</p>

---

## 简介

`mirabot-llonebot-sdk-define` 为 [LLOneBot](https://github.com/LLOneBot/LLOneBot) 的 **OneBot 11** 接口提供 Java 实体与枚举映射。

它**不是**完整的机器人框架：不含 WebSocket / HTTP 连接、事件循环或插件系统。把它接到自己的传输层，或作为 [MiraBot LLOneBot SDK](https://github.com/bgluminous/mirabot-llonebot-sdk) 的定义依赖使用。

| 本仓库提供 | 本仓库不提供 |
| --- | --- |
| API `action` ↔ 请求 / 响应类型 | 正向 / 反向 WebSocket |
| 事件 `post_type` ↔ 事件实体 | HTTP 调用封装 |
| 消息段（text / at / image 等） | 监听器、定时任务、启动器 |
| Jackson 3 友好的 camelCase 字段 | OneBot 12 / Milky / Satori |

字段命名遵循 Java 惯例（`userId`），配合 Jackson `SNAKE_CASE` 即可对接协议里的 `user_id`。

## 特性

- **按 action 索引**：`LLOBAPIType` 按文件 / 好友 / 群 / 消息 / 系统等分类，每种接口绑定 `apiUrl`、请求类、响应类
- **按上报分流**：`LLOBEventType.analyze(JsonNode)` 识别 `message` / `message_sent` / `request` / `notice` / `meta_event`；`notify` 再按 `sub_type` 区分戳一戳与群头衔
- **链式构建**：请求与响应实体使用 Lombok `@Data` + `@Accessors(chain = true)`
- **对齐官方文档**：1.9.0 对照 [LLOneBot Apifox](https://llonebot.apifox.cn) 的 OneBot 11 目录补齐接口与字段

## 环境要求

| 项目 | 版本 |
| --- | --- |
| JDK | 21+ |
| Jackson Databind | 3.1.x（`provided`，需自行引入） |
| Lombok | 1.18.38（编译期） |

> 1.9.0 将 Jackson 从 `com.fasterxml.jackson.core` 2.x 迁移到 `tools.jackson.core` 3.x。`JsonNode`、`ObjectMapper` 的包名已变更。

## 安装

构件发布在私有 Maven 仓库。公开克隆可走 GitHub / JitPack。

### Maven

```xml
<repositories>
  <repository>
    <id>luminous-nexus</id>
    <url>https://nexus.kiiiv.com/repository/maven-private/</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>ink.on.central.bot</groupId>
    <artifactId>mirabot-llonebot-sdk-define</artifactId>
    <version>1.9.0</version>
  </dependency>
  <dependency>
    <groupId>tools.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>3.1.0</version>
  </dependency>
</dependencies>
```

### Gradle

```kotlin
repositories {
    maven("https://nexus.kiiiv.com/repository/maven-private/")
}

dependencies {
    implementation("ink.on.central.bot:mirabot-llonebot-sdk-define:1.9.0")
    implementation("tools.jackson.core:jackson-databind:3.1.0")
}
```

### JitPack（GitHub）

```xml
<repository>
  <id>jitpack.io</id>
  <url>https://jitpack.io</url>
</repository>

<dependency>
  <groupId>com.github.bgluminous</groupId>
  <artifactId>mirabot-llonebot-sdk-define</artifactId>
  <version>release-1.9.0</version>
</dependency>
```

## 快速开始

### 1. 配置 Jackson

协议字段为 snake_case，实体为 camelCase：

```java
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.json.JsonMapper;

JsonMapper mapper = JsonMapper.builder()
    .propertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
    .build();
```

### 2. 按枚举取 action 并组包

```java
import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.request.msg.LLOBSendMsgGroup;
import ink.on.central.bot.entity.request.msg.part.LLOBMsgAt;
import ink.on.central.bot.entity.request.msg.part.LLOBMsgText;

import java.util.List;

var api = LLOBAPIType.Msg.SEND_GROUP_MSG;

var body = new LLOBSendMsgGroup()
    .setGroupId(123456L)
    .setMessage(List.of(
        new LLOBMsgAt("987654321"),
        new LLOBMsgText(" hello")
    ));

String action = api.getApiUrl();                 // send_group_msg
String params = mapper.writeValueAsString(body); // {"group_id":123456,"message":[...]}
Class<?> resType = api.getResEntityClass();      // LLOBResMsgSendGroupMsg
```

调用方自行把 `action` + `params` 发到 OneBot 实现；`status` / `retcode` / `message` / `wording` / `echo` 属于包装层，本库不建模，只解析 `data`。

### 3. 解析事件

```java
import ink.on.central.bot.LLOBEventType;
import tools.jackson.databind.JsonNode;

JsonNode node = mapper.readTree(rawJson);
LLOBEventType type = LLOBEventType.analyze(node);
Object event = mapper.treeToValue(node, type.getEventEntityClass());
```

`notice_type = notify` 时会继续读 `sub_type`：`poke`、`poke_recall`、`title`。

## 协议映射

### API（`LLOBAPIType`）

| 分类 | 枚举 | 覆盖范围 |
| --- | --- | --- |
| 文件 | `LLOBAPIType.File` | 群文件 / 私聊文件 / 闪传 |
| 好友 | `LLOBAPIType.Friend` | 好友列表、资料、点赞、过滤请求、输入状态 |
| 群 | `LLOBAPIType.Group` | 成员、禁言、精华、公告、相册、打卡 |
| 消息 | `LLOBAPIType.Msg` | 收发、撤回、历史、表情回应、AI 语音、戳一戳 |
| 系统 | `LLOBAPIType.System` | 登录信息、状态、Cookies、扫码 |
| 其他 | `LLOBAPIType.Other` | OCR、rkey、推荐表情、Protobuf |
| 兼容 | `LLOBAPIType.Unclassified` | OneBot 11 遗留接口（多数已 `@Deprecated`） |

数组型 `data`（如好友列表、群列表）的 `resEntityClass` 是**元素类型**，不是 `List` 包装类。

### 事件（`LLOBEventType`）

| `post_type` | 匹配字段 | 示例 |
| --- | --- | --- |
| `message` / `message_sent` | `message_type` | `private`、`group` |
| `request` | `request_type` | `friend`、`group` |
| `notice` | `notice_type`；若为 `notify` 则用 `sub_type` | `group_recall`、`poke`、`title` |
| `meta_event` | `meta_event_type` | `heartbeat`、`lifecycle` |

无法识别时返回 `LLOBEventType.RAW`。

### 消息段

| 类 | `type` |
| --- | --- |
| `LLOBMsgText` | `text` |
| `LLOBMsgAt` | `at` |
| `LLOBMsgFace` | `face` |
| `LLOBMsgImage` | `image` |
| `LLOBMsgRecord` | `record` |
| `LLOBMsgVideo` | `video` |
| `LLOBMsgReply` | `reply` |
| `LLOBMsgJsonCard` | `json` |
| `LLOBMsgMusic` / `LLOBMsgMusicCustom` | `music` |
| `LLOBMsgDice` | `dice` |
| `LLOBMsgRps` | `rps` |
| `LLOBMsgForward` | `forward` |
| `LLOBMsgNode` | `node` |

`file`、`flash_file`、`mface`、`markdown`、`keyboard` 等段尚未建模。

## 约定

1. **Java camelCase ↔ 协议 snake_case** 视为同一字段，不要在实体里再写 `user_id`。
2. 个别接口文档本身就是 camelCase（如带分组好友、表情回应详情），这些字段已加 `@JsonProperty`。
3. 响应包装 `status` / `retcode` / `message` / `wording` / `echo` 不进入实体；需要原始报文时用 `LLOBResWrapper`。
4. 若干 LLOneBot 扩展 API 有最低版本要求，见对应枚举注释。

## 目录结构

```
ink.on.central.bot
├── LLOBAPIType.java              # action 映射
├── LLOBEventType.java            # 事件映射
└── entity
    ├── request/                  # 请求（file / friend / group / msg / system / ...）
    │   └── msg/part/             # 消息段
    ├── response/                 # 响应 data
    ├── event/                    # 上报事件
    └── types/                    # 枚举（群角色、性别等）
```

## 版本说明（1.9.0）

相对 1.8.0 的主要变化：

- 对照官方文档补齐接口（相册、批量踢人、戳一戳、输入状态、扫码等）
- 修正与文档不一致的字段（如 `mask`、`paths`、`userId`、群角色 `admin`）
- `notify` 事件按 `sub_type` 分流
- Jackson 升级到 3.1.0（**破坏性**）

完整列表见 Git 提交 `4916926`。

## 相关项目

- [LLOneBot](https://github.com/LLOneBot/LLOneBot) — 协议实现
- [OneBot 11](https://github.com/botuniverse/onebot-11) — 标准协议
- [LLOneBot 接口文档](https://llonebot.apifox.cn)
- [MiraBot LLOneBot SDK](https://github.com/bgluminous/mirabot-llonebot-sdk) — 基于本定义包的开发框架

## 许可证

[Apache License 2.0](LICENSE)
