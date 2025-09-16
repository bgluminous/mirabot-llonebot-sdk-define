package ink.on.central.bot.entity.event.notice;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 群管理员事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventNoticeGroupAdmin extends LLOBEventRoot {
  /**  */
  private String noticeType;
  /** 子类型 */
  private String subType;
  /** 群号 */
  private Long groupId;
  /** 用户ID */
  private Long userId;

  public SubType getSubType() {
    for (SubType value : SubType.values()) {
      if (value.name().equalsIgnoreCase(this.subType)) {
        return value;
      }
    }
    throw new IllegalArgumentException("未知的群管理员事件事件子类型! [%s]".formatted(this.subType));
  }

  /** 子类型 */
  public enum SubType {
    /** 设置管理员 */
    SET,
    /** 取消管理员 */
    UNSET,
  }
}
