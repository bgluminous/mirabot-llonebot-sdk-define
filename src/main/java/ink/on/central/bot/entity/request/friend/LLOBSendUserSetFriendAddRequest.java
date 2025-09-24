package ink.on.central.bot.entity.request.friend;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 处理加好友请求 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20240408
 * @see LLOBAPIType.Friend#SET_FRIEND_ADD_REQUEST
 * @since 1.0.0-20240408
 */
@Accessors(chain = true)
@Data
public class LLOBSendUserSetFriendAddRequest {
  /** 加好友请求的 flag（需从上报的数据中获得） */
  private String flag;
  /** 是否同意请求 */
  private Boolean approve;
  /** 添加后的好友备注（仅在同意时有效） */
  private String remark;
}
