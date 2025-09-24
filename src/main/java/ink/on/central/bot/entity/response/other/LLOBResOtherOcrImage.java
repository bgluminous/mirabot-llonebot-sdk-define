package ink.on.central.bot.entity.response.other;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 图片OCR LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see LLOBAPIType.Other#OCR_IMAGE
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResOtherOcrImage {
  /** 语言 */
  private String language;
  /** 文本 */
  private LLOBResOtherOcrImageText[] texts;

  @Accessors(chain = true)
  @Data
  public static class LLOBResOtherOcrImageText {
    /** 置信度 */
    private Long confidence;
    /** 文本坐标 */
    private LLOBResOtherOcrImageCoordinate[] coordinates;
    /** 文本 */
    private String text;
  }

  @Accessors(chain = true)
  @Data
  public static class LLOBResOtherOcrImageCoordinate {
    /** 坐标X */
    private Long x;
    /** 坐标Y */
    private Long y;
  }

}
