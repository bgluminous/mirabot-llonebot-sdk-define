package ink.on.central.bot.entity.request;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 存在缓存的请求
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBCacheable {
  /** 是否不使用缓存 */
  private Boolean noCache;
}
