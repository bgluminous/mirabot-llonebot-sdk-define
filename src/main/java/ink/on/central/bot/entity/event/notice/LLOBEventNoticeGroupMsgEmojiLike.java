package ink.on.central.bot.entity.event.notice;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 群消息贴表情事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventNoticeGroupMsgEmojiLike extends LLOBEventRoot {
  /**  */
  private String noticeType;
  /** 群号 */
  private Long groupId;
  /** 用户ID */
  private Long userId;
  /** 消息ID */
  private Long messageId;
  /** 群消息贴表情列表 */
  private Likes[] likes;

  /** 群消息贴表情 */
  @Accessors(chain = true)
  @Data
  public static class Likes {
    /** 表情ID */
    private String emojiId;
    /** 数量 */
    private Integer count;
  }

}
