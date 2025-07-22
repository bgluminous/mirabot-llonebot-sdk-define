package ink.on.central.bot.entity.request.msg.part;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgBase;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

/**
 * 引用消息片段 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @since 1.0.0-20250722
 */
public class LLOBMsgReply extends LLOBMsgPart {
  private final LLOBMsgReplyData data;

  /**
   * 构造方法
   *
   * @param id 消息id
   */
  public LLOBMsgReply(@NotNull Integer id) {
    super("reply");
    this.data = new LLOBMsgReplyData().setId(id);
  }

  @Override
  public LLOBMsgReplyData getData() {
    return this.data;
  }

  @Accessors(chain = true)
  @Data
  @EqualsAndHashCode(callSuper = true)
  public static class LLOBMsgReplyData extends LLOBMsgBase {
    /** 回复的消息id */
    private Integer id;
  }

}
