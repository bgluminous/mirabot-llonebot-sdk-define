package ink.on.central.bot.entity.request.msg.part;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgBase;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 转发消息片段 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250923
 * @since 1.0.0-20250923
 */
public class LLOBMsgForward extends LLOBMsgPart {
  private final LLOBMsgForwardData data;

  /**
   * 构造方法
   *
   * @param id ID
   */
  public LLOBMsgForward(String id) {
    super("forward");
    this.data = new LLOBMsgForwardData().setId(id);
  }

  @Override
  public LLOBMsgBase getData() {
    return this.data;
  }

  @Accessors(chain = true)
  @Data
  @EqualsAndHashCode(callSuper = true)
  public static class LLOBMsgForwardData extends LLOBMsgBase {
    /** ID */
    private String id;
  }
}
