package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.request.LLOBUserBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 获取好友历史消息记录 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see LLOBAPIType#GET_FRIEND_MSG_HISTORY
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendMsgGetFriendHistory extends LLOBUserBase {
  /**  */
  private Long messageSeq;
  /** 数量 默认20 */
  private Integer count;
  /** 是否逆序 */
  private Boolean reverseOrder;
}
