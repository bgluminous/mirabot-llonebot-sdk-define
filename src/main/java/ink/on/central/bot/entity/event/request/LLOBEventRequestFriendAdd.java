package ink.on.central.bot.entity.event.request;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 好友申请事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventRequestFriendAdd extends LLOBEventRoot {
  /**  */
  private String requestType;
  /** 用户ID */
  private Long userId;
  /** 验证信息 */
  private String comment;
  /** 请求标识，用于处理请求 */
  private String flag;
}
