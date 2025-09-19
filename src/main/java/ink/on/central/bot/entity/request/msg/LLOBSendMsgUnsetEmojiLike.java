package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 取消表情回应消息 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see LLOBAPIType#UNSET_MSG_EMOJI_LIKE
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgUnsetEmojiLike {
  /** 消息ID */
  private Integer messageId;
  /** 表情ID */
  private String emojiId;
}
