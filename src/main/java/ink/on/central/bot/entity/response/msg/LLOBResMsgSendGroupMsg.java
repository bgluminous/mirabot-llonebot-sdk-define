package ink.on.central.bot.entity.response.msg;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 发送群聊文本消息 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIType.Msg#SEND_GROUP_MSG
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResMsgSendGroupMsg {
  /** 消息ID */
  private Integer messageId;
}
