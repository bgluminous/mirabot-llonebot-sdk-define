package ink.on.central.bot.entity.request.msg.part;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgBase;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 图片消息片段 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @since 1.0.0-20250722
 */
public class LLOBMsgImage extends LLOBMsgPart {
  private final LLOBMsgImageData data;

  /**
   * 构造方法
   *
   * @param file    图片
   * @param summary 图片预览文字
   */
  public LLOBMsgImage(@NotNull String file, @Nullable String summary) {
    super("image");
    this.data = new LLOBMsgImageData().setFile(file).setSummary(summary);
  }

  @Override
  public LLOBMsgImageData getData() {
    return data;
  }

  @Accessors(chain = true)
  @Data
  @EqualsAndHashCode(callSuper = true)
  public static class LLOBMsgImageData extends LLOBMsgBase {
    /**
     * 图片
     *
     * <p>file://d:/1.png
     * <p>https://???
     * <p>base64://xxx
     */
    private String file;
    /** 图片预览文字 LLOneBot扩展字段 */
    private String summary;
  }
}
