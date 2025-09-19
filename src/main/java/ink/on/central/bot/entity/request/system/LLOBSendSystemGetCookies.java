package ink.on.central.bot.entity.request.system;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取 Cookies 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250721
 * @see LLOBAPIType#GET_COOKIES
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendSystemGetCookies {
  /** domain */
  private String domain;
}
