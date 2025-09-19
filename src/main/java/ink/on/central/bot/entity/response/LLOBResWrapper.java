package ink.on.central.bot.entity.response;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * API请求返回值包装实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250916
 * @since 1.0.0-20250916
 */
@Accessors(chain = true)
@Data
public class LLOBResWrapper {
  /** 时间戳 */
  private Long timestamp;
  /** 响应数据 */
  private String raw;
}
