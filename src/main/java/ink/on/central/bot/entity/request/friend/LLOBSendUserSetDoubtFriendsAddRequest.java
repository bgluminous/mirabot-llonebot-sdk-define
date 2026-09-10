package ink.on.central.bot.entity.request.friend;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 处理被过滤好友请求 LLOneBot扩展（此 API 需要 LLOneBot 6.2.0 及以上版本）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Friend#SET_DOUBT_FRIENDS_ADD_REQUEST
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBSendUserSetDoubtFriendsAddRequest {
  /** 加好友请求的 flag（需从 get_doubt_friends_add_request 获得） */
  private String flag;
}
