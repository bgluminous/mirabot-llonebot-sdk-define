package ink.on.central.bot.entity.request.msg.part;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgBase;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

/**
 * 自定义音乐卡片片段 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @since 1.0.0-20250722
 */
public class LLOBMsgMusicCustom extends LLOBMsgPart {
  private final LLOBMsgMusicCustomData data;

  /**
   * 构造方法
   *
   * @param data 自定义音乐卡片片段数据
   */
  public LLOBMsgMusicCustom(@NotNull LLOBMsgMusicCustomData data) {
    super("music");
    this.data = data;
  }

  @Override
  public LLOBMsgMusicCustomData getData() {
    return this.data;
  }

  @Accessors(chain = true)
  @Data
  @EqualsAndHashCode(callSuper = true)
  public static class LLOBMsgMusicCustomData extends LLOBMsgBase {
    /** 类型 */
    private final String type = "custom";
    /** URL */
    private String url;
    /** 音频文件 */
    private String audio;
    /** 标题 */
    private String title;
    /** 图片 */
    private String image;
  }
}

