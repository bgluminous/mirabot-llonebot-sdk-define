package ink.on.central.bot.entity.event.notice;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 撤回戳一戳事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventNoticePokeRecall extends LLOBEventRoot {
  /**  */
  private String noticeType;
  /** 子类型 */
  private String subType;
  /** 群号 */
  private Long groupId;
  /** 用户ID */
  private Long userId;
  /** 被戳的目标用户 */
  private Long targetId;
  /** 原始信息 */
  private String rawInfo;

  public SubType getSubType() {
    for (SubType value : SubType.values()) {
      if (value.name().equalsIgnoreCase(this.subType)) {
        return value;
      }
    }
    throw new IllegalArgumentException("未知的戳一戳事件子类型! [%s]".formatted(this.subType));
  }

  /** 子类型 */
  public enum SubType {
    /** 戳一戳 */
    POKE,
    /** 撤回戳一戳 */
    POKE_RECALL
  }

}
