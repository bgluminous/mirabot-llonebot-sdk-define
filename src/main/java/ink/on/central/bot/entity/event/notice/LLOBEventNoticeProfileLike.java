package ink.on.central.bot.entity.event.notice;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 名片点赞事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventNoticeProfileLike extends LLOBEventRoot {
  /**  */
  private String noticeType;
  /** 子类型 */
  private String subType;
  /** 点赞用户QQ号 */
  private Long operatorId;
  /** 点赞用户的昵称 */
  private String operatorNick;
  /** 点赞次数 */
  private Integer times;

  public SubType getSubType() {
    for (SubType value : SubType.values()) {
      if (value.name().equalsIgnoreCase(this.subType)) {
        return value;
      }
    }
    throw new IllegalArgumentException("未知的名片点赞事件子类型! [%s]".formatted(this.subType));
  }

  /** 子类型 */
  public enum SubType {
    /** 名片点赞 */
    PROFILE_LIKE,
  }

}
