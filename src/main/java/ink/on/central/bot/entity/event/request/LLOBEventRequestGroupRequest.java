package ink.on.central.bot.entity.event.request;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 申请加群事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventRequestGroupRequest extends LLOBEventRoot {
  /**  */
  private String requestType;
  /** 子类型 */
  private String subType;
  /** 请求消息 */
  private String comment;
  /** 请求标识，用于处理请求 */
  private String flag;
  /** 群号 */
  private Long groupId;
  /** 用户ID */
  private Long userId;
  /** 邀请者ID */
  private Long invitorId;

  public SubType getSubType() {
    for (SubType value : SubType.values()) {
      if (value.name().equalsIgnoreCase(this.subType)) {
        return value;
      }
    }
    throw new IllegalArgumentException("未知的申请加群事件子类型! [%s]".formatted(this.subType));
  }

  /** 子类型 */
  public enum SubType {
    /** 加群请求 */
    ADD,
    /** 邀请机器人入群 */
    INVITE,
  }

}
