package ink.on.central.bot.entity.response;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class LLOBResWrapper<T> {
  /** 状态 */
  private String status;
  /** 返回码 */
  private Integer retCode;
  /** 返回数据 */
  private T data;
  /** 错误信息 */
  private String message;
  /**  */
  private String wording;
  /** 其他数据 */
  private String echo;
}
