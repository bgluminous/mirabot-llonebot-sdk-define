package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 撤回消息 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see LLOBAPIConstant.Message#DELETE_MSG
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgDelete {
  /** 消息ID */
  private Integer messageId;
}
