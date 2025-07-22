package ink.on.central.bot.entity.request.msg.part;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgBase;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;

/**
 * 超级表情猜拳片段 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @since 1.0.0-20250722
 */
public class LLOBMsgRps extends LLOBMsgPart {
  private final LLOBMsgBase data;

  /**
   * 构造方法
   */
  public LLOBMsgRps() {
    super("dice");
    this.data = null;
  }

  @Override
  public LLOBMsgBase getData() {
    return this.data;
  }

}

