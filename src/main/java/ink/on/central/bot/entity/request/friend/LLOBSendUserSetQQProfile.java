package ink.on.central.bot.entity.request.friend;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 设置登录号资料 LLOneBot扩展
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Friend#SET_QQ_PROFILE
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBSendUserSetQQProfile {
  /** 名称 */
  private String nickname;
  /** 个人说明 */
  private String personalNote;
}
