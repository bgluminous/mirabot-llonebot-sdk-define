package ink.on.central.bot.entity.request.user;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 移动好友分组 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250717
 * @see LLOBAPIType#SET_FRIEND_CATEGORY
 * @since 1.0.0-20250717
 */
@Accessors(chain = true)
@Data
public class LLOBSendUserSetFriendCategory {
  /** QQ号 */
  private Long userId;
  /** 分组ID */
  private Long categoryId;
}
