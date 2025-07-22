package ink.on.central.bot.entity.request.msg.part;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgBase;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

/**
 * 卡片(json)消息片段 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @since 1.0.0-20250722
 */
public class LLOBMsgJsonCard extends LLOBMsgPart {
  private final LLOBMsgJsonCardData data;

  /**
   * 构造方法
   *
   * @param data Json数据
   */
  public LLOBMsgJsonCard(@NotNull String data) {
    super("json");
    this.data = new LLOBMsgJsonCardData().setData(data);
  }

  @Override
  public LLOBMsgJsonCardData getData() {
    return this.data;
  }

  @Accessors(chain = true)
  @Data
  @EqualsAndHashCode(callSuper = true)
  public static class LLOBMsgJsonCardData extends LLOBMsgBase {
    /** Json Data */
    private String data;
  }
}

