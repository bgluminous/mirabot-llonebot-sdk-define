package ink.on.central.bot.entity.response.msg;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 发送私聊文本消息 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see ink.on.central.bot.LLOBAPIEntityMapper#SEND_PRIVATE_MSG
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResMsgSendPrivateMsg {
  /** 消息ID */
  private Integer messageId;
}
