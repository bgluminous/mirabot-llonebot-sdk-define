package ink.on.central.bot.entity.event.notice;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 群名片事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventNoticeGroupCard extends LLOBEventRoot {
  /**  */
  private String noticeType;
  /** 群号 */
  private Long groupId;
  /** 名片被修改的用户ID */
  private Long userId;
  /** 新群名片/昵称 */
  private String cardNew;
  /** 旧群名片/昵称 */
  private String cardOld;
}
