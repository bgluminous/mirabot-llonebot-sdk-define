package ink.on.central.bot.entity.request;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 目标为用户的请求
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBUserBase {
  /** QQ号 */
  private Long userId;
}
