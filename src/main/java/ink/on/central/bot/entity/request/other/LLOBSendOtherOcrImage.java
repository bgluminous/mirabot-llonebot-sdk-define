package ink.on.central.bot.entity.request.other;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 图片OCR LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250721
 * @see ink.on.central.bot.APIConstant.Other#OCR_IMAGE
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendOtherOcrImage {
  /**
   * 文件,支持三种格式:
   *
   * <p>file://d:/1.png
   * <p>https://???
   * <p>base64://xxx
   */
  private String image;
}
