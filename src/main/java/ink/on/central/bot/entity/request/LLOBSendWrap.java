package ink.on.central.bot.entity.request;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Socket发送包装实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250917
 * @since 1.0.0-20250917
 */
@Accessors(chain = true)
@Data
public class LLOBSendWrap {
  /** 用于指定要调用的 API */
  private String action;
  /** 用于传入参数 */
  private Object params;
  /** 用于唯一标识一次请求 */
  private String echo;

  public static LLOBSendWrap from(String action, Object paramsJson, String echo) {
    return new LLOBSendWrap().setAction(action).setParams(paramsJson).setEcho(echo);
  }
}
