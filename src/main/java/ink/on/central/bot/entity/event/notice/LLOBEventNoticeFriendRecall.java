package ink.on.central.bot.entity.event.notice;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 好友消息撤回事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventNoticeFriendRecall extends LLOBEventRoot {
  /**  */
  private String noticeType;
  /** 用户ID */
  private Long userId;
  /** 消息ID */
  private Long messageId;
}
