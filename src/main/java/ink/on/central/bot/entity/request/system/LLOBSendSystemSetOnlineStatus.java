package ink.on.central.bot.entity.request.system;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 设置在线状态 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250721
 * @see LLOBAPIType.System#SET_ONLINE_STATUS
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendSystemSetOnlineStatus {
  /**  */
  private Integer status;
  /**  */
  private Integer extStatus;
  /**  */
  private Integer batteryStatus;
}
