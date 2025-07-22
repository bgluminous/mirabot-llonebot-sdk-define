package ink.on.central.bot.entity.request.msg.part;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgBase;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

/**
 * QQ音乐卡片片段 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @since 1.0.0-20250722
 */
public class LLOBMsgMusic extends LLOBMsgPart {
  private final LLOBMsgMusicData data;

  /**
   * 构造方法
   *
   * @param type 类型
   * @param id   QQ音乐ID
   */
  public LLOBMsgMusic(@NotNull String type, @NotNull Integer id) {
    super("music");
    this.data = new LLOBMsgMusicData().setType(type).setId(id);
  }

  @Override
  public LLOBMsgMusicData getData() {
    return this.data;
  }

  @Accessors(chain = true)
  @Data
  @EqualsAndHashCode(callSuper = true)
  public static class LLOBMsgMusicData extends LLOBMsgBase {
    /** QQ / 163 */
    private String type;
    /** QQ音乐歌曲id */
    private Integer id;
  }
}

