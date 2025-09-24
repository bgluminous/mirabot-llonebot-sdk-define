package ink.on.central.bot.entity.request.friend;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 发送好友赞 实体类
 *
 * @see LLOBAPIType.Friend#SEND_LIKE
 * @author BGLuminous
 * @since 1.0.0-20240407
 * @version 1.0.0-20240407
 */
@Accessors(chain = true)
@Data
public class LLOBSendUserLike {
  /** QQ号 */
  private Long userId;
  /** 赞的次数，每个好友每天最多 10 次 */
  private Integer times;
}

