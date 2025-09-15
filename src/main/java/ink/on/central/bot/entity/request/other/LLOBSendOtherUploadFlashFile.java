package ink.on.central.bot.entity.request.other;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 上传闪传文件 LLOneBot扩展 开发中暂未实现（此 API 需要 LLOneBot 5.3.0 以上版本） 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250721
 * @see LLOBAPIConstant.Other#UPLOAD_FLASH_FILE
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendOtherUploadFlashFile {
  /** 标题 */
  private String title;
  /**
   * 文件,支持三种格式:
   *
   * <p>file://d:/1.png
   * <p>https://???
   * <p>base64://xxx
   */
  private String file;
}

