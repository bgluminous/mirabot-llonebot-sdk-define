package ink.on.central.bot.entity.event.notice;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 群精华事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventNoticeEssence extends LLOBEventRoot {
  /**  */
  private String noticeType;
  /** 子类型 */
  private String subType;
  /** 群号 */
  private Long groupId;
  /** 用户ID */
  private Long userId;
  /** 消息发送者 ID（与 user_id 重复） */
  private Long senderId;
  /** 操作用户ID */
  private Long operatorId;
  /** 消息ID */
  private Long messageId;

  public SubType getSubType() {
    for (SubType value : SubType.values()) {
      if (value.name().equalsIgnoreCase(this.subType)) {
        return value;
      }
    }
    throw new IllegalArgumentException("未知的群精华事件子类型! [%s]".formatted(this.subType));
  }

  /** 子类型 */
  public enum SubType {
    /** 添加 */
    ADD,
    /** 删除 */
    DELETE,
  }
}
