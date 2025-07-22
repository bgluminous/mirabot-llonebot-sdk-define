package ink.on.central.bot.entity.request;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 目标为群成员的请求
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBGroupMemberBase {
  /** 群号 */
  private Long groupId;
  /** QQ号 */
  private Long userId;
}
