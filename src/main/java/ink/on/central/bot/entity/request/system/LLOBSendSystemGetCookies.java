package ink.on.central.bot.entity.request.system;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取 Cookies 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250721
 * @see ink.on.central.bot.APIConstant.System#GET_COOKIES
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendSystemGetCookies {
  /** domain */
  private String domain;
}
