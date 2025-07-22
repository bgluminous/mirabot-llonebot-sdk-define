package ink.on.central.bot.entity.request.msg.part;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgBase;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * QQ音乐卡片片段 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @since 1.0.0-20250722
 */
public class LLOBMsgNode extends LLOBMsgPart {
  private final LLOBMsgNodeData data;

  /**
   * 构造方法
   *
   * @param uin     伪造QQ号，可不填
   * @param name    伪造昵称，可不填
   * @param content 内容
   */
  public LLOBMsgNode(
    @Nullable Integer uin, @Nullable String name, @NotNull List<LLOBMsgPart> content
  ) {
    super("node");
    this.data = new LLOBMsgNodeData().setUin(uin).setName(name).setContent(content);
  }

  @Override
  public LLOBMsgNodeData getData() {
    return this.data;
  }

  @Accessors(chain = true)
  @Data
  @EqualsAndHashCode(callSuper = true)
  public static class LLOBMsgNodeData extends LLOBMsgBase {
    /** 伪造QQ号，可不填 */
    private Integer uin;
    /** 伪造昵称，可不填 */
    private String name;
    /** 消息片段 */
    private List<LLOBMsgPart> content;
  }
}

