package ink.on.central.bot.entity.request.msg.part;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgBase;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

/**
 * 超级表情骰子片段 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @since 1.0.0-20250722
 */
public class LLOBMsgDice extends LLOBMsgPart {
  private final LLOBMsgDiceData data;

  /**
   * 构造方法
   *
   * @param result 控制骰子点数，目前只有拉格兰支持此参数
   */
  public LLOBMsgDice(@NotNull Integer result) {
    super("dice");
    this.data = new LLOBMsgDiceData().setResult(result);
  }

  @Override
  public LLOBMsgDiceData getData() {
    return this.data;
  }


  @Accessors(chain = true)
  @Data
  @EqualsAndHashCode(callSuper = true)
  public static class LLOBMsgDiceData extends LLOBMsgBase {
    /** 控制骰子点数，目前只有拉格兰支持此参数 */
    private Integer result;
  }
}

