package ink.on.central.bot.entity.response.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群精华消息 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Group#GET_ESSENCE_MSG_LIST
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBResGroupGetEssenceMsgList {
  /** 发送者 QQ */
  private Long senderId;
  /** 发送者昵称 */
  private String senderNick;
  /** 发送时间 */
  private Long senderTime;
  /** 操作者 QQ */
  private Long operatorId;
  /** 操作者昵称 */
  private String operatorNick;
  /** 操作时间 */
  private Long operatorTime;
  /** 消息 ID */
  private Long messageId;
}
