package ink.on.central.bot.entity.request.msg;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取转发消息详情 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see ink.on.central.bot.APIConstant.Message#GET_FORWARD_MSG
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgGetForwardMsg {
  /** 消息ID */
  private String messageId;
}
