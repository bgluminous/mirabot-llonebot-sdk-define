package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 表情回应消息 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see LLOBAPIType.Msg#SET_MSG_EMOJI_LIKE
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgSetEmojiLike {
  /** 消息ID */
  private Integer messageId;
  /** 表情ID */
  private String emojiId;
  /** 是否回应，false 表示取消回应 */
  private Boolean set;
}
