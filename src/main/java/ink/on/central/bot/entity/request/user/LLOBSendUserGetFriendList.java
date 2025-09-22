package ink.on.central.bot.entity.request.user;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取好友列表 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250717
 * @see LLOBAPIType#GET_FRIEND_LIST
 * @since 1.0.0-20250717
 */
@Accessors(chain = true)
@Data
public class LLOBSendUserGetFriendList {
  /** 是否不使用缓存 */
  private Boolean noCache;
}
