package ink.on.central.bot.entity.response.user;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 获取谁赞过我列表 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see LLOBAPIConstant.User#GET_PROFILE_LIKE_ME
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBResUserGetProfileLikeMe extends LLOBResUserGetProfileLike {
  // EMPTY
}
