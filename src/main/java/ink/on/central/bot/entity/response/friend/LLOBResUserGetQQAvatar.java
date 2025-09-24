package ink.on.central.bot.entity.response.friend;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取QQ头像 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see LLOBAPIType.Friend#GET_QQ_AVATAR
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResUserGetQQAvatar {
  /** 头像地址 */
  private String url;
}
