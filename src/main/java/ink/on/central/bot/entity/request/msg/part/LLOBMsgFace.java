package ink.on.central.bot.entity.request.msg.part;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgBase;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

/**
 * 系统表情片段 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @since 1.0.0-20250722
 */
@EqualsAndHashCode(callSuper = true)
public class LLOBMsgFace extends LLOBMsgPart {
  private final LLOBMsgFaceData data;

  /**
   * 构造方法
   *
   * @param id 表情id
   */
  public LLOBMsgFace(@NotNull Integer id) {
    super("face");
    this.data = new LLOBMsgFaceData().setId(id);
  }

  @Override
  public LLOBMsgFaceData getData() {
    return this.data;
  }

  @Accessors(chain = true)
  @Data
  @EqualsAndHashCode(callSuper = true)
  public static class LLOBMsgFaceData extends LLOBMsgBase {
    /** 表情id <a href="https://bot.q.qq.com/wiki/develop/api-v2/openapi/emoji/model.html#EmojiType">参考</a> */
    private Integer id;
  }

}
