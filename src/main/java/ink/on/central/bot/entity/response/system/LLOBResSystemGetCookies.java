package ink.on.central.bot.entity.response.system;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取cookies 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see LLOBAPIType#GET_COOKIES
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResSystemGetCookies {
  /**  */
  private String bkn;
  /** 获取的Cookie */
  private String cookies;
}
