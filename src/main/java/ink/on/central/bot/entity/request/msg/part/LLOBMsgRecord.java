package ink.on.central.bot.entity.request.msg.part;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgBase;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

/**
 * 语音片段 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @since 1.0.0-20250722
 */

public class LLOBMsgRecord extends LLOBMsgPart {
  private final LLOBMsgRecordData data;

  /**
   * 构造方法
   *
   * @param file 录音文件
   */
  public LLOBMsgRecord(@NotNull String file) {
    super("record");
    this.data = new LLOBMsgRecordData().setFile(file);
  }

  @Override
  public LLOBMsgRecordData getData() {
    return this.data;
  }

  @Accessors(chain = true)
  @Data
  @EqualsAndHashCode(callSuper = true)
  public static class LLOBMsgRecordData extends LLOBMsgBase {
    /**
     * 录音文件
     *
     * <p>file://d:/1.png
     * <p>https://???
     * <p>base64://xxx
     */
    private String file;
  }

}
