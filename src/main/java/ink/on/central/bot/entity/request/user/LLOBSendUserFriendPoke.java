package ink.on.central.bot.entity.request.user;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 好友戳一戳（双击头像） LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250717
 * @see LLOBAPIType#FRIEND_POKE
 * @since 1.0.0-20250717
 */
@Accessors(chain = true)
@Data
public class LLOBSendUserFriendPoke {
  /** QQ号 */
  private Long userId;
}
