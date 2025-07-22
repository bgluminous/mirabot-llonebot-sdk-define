package ink.on.central.bot.entity.request.msg.part;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgBase;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

/**
 * 文本信息片段 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @since 1.0.0-20250722
 */
public class LLOBMsgText extends LLOBMsgPart {
  private final LLOBMsgTextData data;

  /**
   * 构造方法
   *
   * @param text 文本消息
   */
  public LLOBMsgText(@NotNull String text) {
    super("text");
    this.data = new LLOBMsgTextData().setText(text);
  }

  @Override
  public LLOBMsgTextData getData() {
    return this.data;
  }

  @Accessors(chain = true)
  @Data
  @EqualsAndHashCode(callSuper = true)
  public static class LLOBMsgTextData extends LLOBMsgBase {
    /** 文本消息 */
    private String text;
  }

}
