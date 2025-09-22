package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 转发单条群消息 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see LLOBAPIType#FORWARD_GROUP_SINGLE_MSG
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgForwardGroupSingle {
  /** 群号 */
  private Long groupId;
  /** 消息ID */
  private String messageId;
}
