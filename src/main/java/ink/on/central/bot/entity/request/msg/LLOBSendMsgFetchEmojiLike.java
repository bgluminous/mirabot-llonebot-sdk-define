package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取表情回应详情 LLOneBot扩展
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Msg#FETCH_EMOJI_LIKE
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgFetchEmojiLike {
  /** 消息 ID */
  private Long messageId;
  /** 表情 ID */
  private Integer emojiId;
  /** 获取数量，默认 20 */
  private Integer count;
  /** 分页游标 */
  private String cookie;
}
