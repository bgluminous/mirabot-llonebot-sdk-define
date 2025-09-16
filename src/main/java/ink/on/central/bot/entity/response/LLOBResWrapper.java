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
  /** 状态 */
  private String status;
  /** 返回码 */
  private Integer retCode;
  /** 返回数据 */
  private String data;
  /** 错误信息 */
  private String message;
  /**  */
  private String wording;
  /** 其他数据 */
  private String echo;
}
