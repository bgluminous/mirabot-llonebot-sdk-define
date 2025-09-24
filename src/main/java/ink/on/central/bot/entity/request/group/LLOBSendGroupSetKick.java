package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 群组踢人 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIType.Group#SET_GROUP_KICK
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupSetKick {
  /** 群号 */
  private Long groupId;
  /** QQ号 */
  private Long userId;
  /** 是否禁止再次加群 */
  private Boolean rejectAddRequest;
}
