package ink.on.central.bot.entity.event.notice;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 群消息撤回事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventNoticeGroupRecall extends LLOBEventRoot {
  /**  */
  private String noticeType;
  /** 群号 */
  private Long groupId;
  /** 用户ID */
  private Long userId;
  /** 操作用户ID */
  private Long operatorId;
  /** 消息ID */
  private Long messageId;
}
