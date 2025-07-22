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
public class LLOBMsgAt extends LLOBMsgPart {
  private final LLOBMsgAtData data;

  /**
   * 构造方法
   *
   * @param qq QQ号 ALL代表@全体成员
   */
  public LLOBMsgAt(@NotNull String qq) {
    super("at");
    this.data = new LLOBMsgAtData().setQq(qq);
  }

  @Override
  public LLOBMsgAtData getData() {
    return this.data;
  }

  @Accessors(chain = true)
  @Data
  @EqualsAndHashCode(callSuper = true)
  public static class LLOBMsgAtData extends LLOBMsgBase {
    /** QQ号 ALL代表@全体成员 */
    private String qq;
  }

}
