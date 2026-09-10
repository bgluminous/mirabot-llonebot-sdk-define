package ink.on.central.bot.entity.response.friend;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取名片赞数量 LLOneBot扩展 返回实体类（此 API 需要 LLBot 8.0.3 及以上版本）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Friend#GET_PROFILE_LIKE_COUNT
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBResUserGetProfileLikeCount {
  /** 名片赞数量 */
  private Integer count;
}
