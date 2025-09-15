package ink.on.central.bot.entity.request.user;

import ink.on.central.bot.LLOBAPIConstant;
import ink.on.central.bot.entity.request.LLOBCacheable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 获取好友列表 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250717
 * @see LLOBAPIConstant.User#GET_FRIEND_LIST
 * @since 1.0.0-20250717
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendUserGetFriendList extends LLOBCacheable {
  // EMPTY
}
