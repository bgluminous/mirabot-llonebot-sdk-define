package ink.on.central.bot.entity.response.system;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取登录号信息 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see LLOBAPIConstant.System#GET_LOGIN_INFO
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResSystemGetLoginInfo {
  /** QQ号 */
  private Long userid;
  /** 昵称 */
  private String nickname;
}
