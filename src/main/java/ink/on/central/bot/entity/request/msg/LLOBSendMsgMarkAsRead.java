package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 标记消息为已读 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see LLOBAPIConstant.Message#MARK_MSG_AS_READ
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgMarkAsRead {
  /** 消息ID */
  private Integer messageId;
}
