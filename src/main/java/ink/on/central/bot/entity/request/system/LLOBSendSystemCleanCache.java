package ink.on.central.bot.entity.request.system;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 清理缓存 （该 API 在 LLOneBot 5.0+ 之后失效） 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250721
 * @see LLOBAPIType.System#CLEAN_CACHE
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
@Deprecated(since = "LLOneBot 5.0+")
public class LLOBSendSystemCleanCache {
  // EMPTY
}
