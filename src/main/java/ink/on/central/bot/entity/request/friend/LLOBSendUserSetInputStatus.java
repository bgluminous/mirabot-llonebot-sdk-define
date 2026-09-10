package ink.on.central.bot.entity.request.friend;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 设置输入状态 LLOneBot扩展（此 API 需要 LLBot 7.12.3 及以上版本）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Friend#SET_INPUT_STATUS
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBSendUserSetInputStatus {
  /** 对方 QQ 号 */
  private Long userId;
  /** 事件类型：0 对方正在说话，1 对方正在输入 */
  private Integer eventType;

  public LLOBSendUserSetInputStatus setEventType(Integer eventType) {
    if (eventType != 0 && eventType != 1) {
      throw new IllegalArgumentException("eventType must be 0 or 1");
    }
    this.eventType = eventType;
    return this;
  }
}
