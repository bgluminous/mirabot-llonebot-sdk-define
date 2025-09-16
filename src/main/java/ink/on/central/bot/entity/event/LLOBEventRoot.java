package ink.on.central.bot.entity.event;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 事件根（通用）实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
public class LLOBEventRoot {
  /** 时间戳 秒戳 */
  private Long time;
  /** 机器人的 QQ 号 */
  private Long selfId;
  /** 事件类型 */
  private String postType;
}
