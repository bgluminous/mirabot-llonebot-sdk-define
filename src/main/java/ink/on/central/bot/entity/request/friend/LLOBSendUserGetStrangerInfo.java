package ink.on.central.bot.entity.request.friend;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取好友或群友信息 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20240408
 * @see LLOBAPIType.Friend#GET_STRANGER_INFO
 * @since 1.0.0-20240408
 */
@Accessors(chain = true)
@Data
public class LLOBSendUserGetStrangerInfo {
  /** QQ号 */
  private Long userId;
}
