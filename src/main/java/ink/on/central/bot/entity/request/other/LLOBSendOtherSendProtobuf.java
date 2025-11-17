package ink.on.central.bot.entity.request.other;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 发送Protobuf数据包 实体类
 *
 * @author BGLuminous
 * @version 1.8.0-20251117
 * @see LLOBAPIType.Other#SEND_PROTOBUF
 * @since 1.8.0-20250721
 */
@Accessors(chain = true)
@Data
@Deprecated(since = "开发中")
public class LLOBSendOtherSendProtobuf {
  /** 命令 */
  private String cmd;
  /** Protobuf的16进制字符串 */
  private String hex;
}
