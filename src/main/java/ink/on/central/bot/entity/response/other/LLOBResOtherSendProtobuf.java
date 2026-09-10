package ink.on.central.bot.entity.response.other;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 发送Protobuf数据包 返回实体类
 *
 * @author BGLuminous
 * @version 1.8.0-20251117
 * @see LLOBAPIType.Other#SEND_PROTOBUF
 * @since 1.8.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBResOtherSendProtobuf {
  /** 命令 */
  private String cmd;
  /** 16进制数据 */
  private String hex;
  /**  */
  private String echo;
}
