package ink.on.central.bot.entity.response.msg;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 发送消息 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIType.Msg#SEND_MSG
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
@Deprecated(since = "OneBot-11协议兼容，推荐使用 SEND_PRIVATE_MSG 和 SEND_GROUP_MSG")
public class LLOBResMsgSendMsg {
  /** 消息ID */
  private Integer messageId;
}
