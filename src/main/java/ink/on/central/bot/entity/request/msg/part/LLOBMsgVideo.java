package ink.on.central.bot.entity.request.msg.part;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgBase;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

/**
 * 视频片段 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @since 1.0.0-20250722
 */
public class LLOBMsgVideo extends LLOBMsgPart {
  private final LLOBMsgVideoData data;

  /**
   * 构造方法
   *
   * @param file 视频文件
   */
  public LLOBMsgVideo(@NotNull String file) {
    super("video");
    this.data = new LLOBMsgVideoData().setFile(file);
  }

  @Override
  public LLOBMsgVideoData getData() {
    return this.data;
  }


  @Accessors(chain = true)
  @Data
  @EqualsAndHashCode(callSuper = true)
  public static class LLOBMsgVideoData extends LLOBMsgBase {
    /**
     * 图片
     *
     * <p>file://d:/1.png
     * <p>https://???
     * <p>base64://xxx
     */
    private String file;
  }
}

