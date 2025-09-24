package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群历史消息记录 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see LLOBAPIType.Msg#GET_GROUP_MSG_HISTORY
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgGetGroupHistory {
  /** 群号 */
  private Long groupId;
  /**  */
  private Long messageSeq;
  /** 数量 默认20 */
  private Integer count;
}
