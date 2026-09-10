package ink.on.central.bot.entity.request.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 上传闪传文件 LLOneBot扩展（此 API 需要 LLOneBot 5.3.0 以上版本）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.File#UPLOAD_FLASH_FILE
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendFileUploadFlash {
  /** 标题 */
  private String title;
  /**
   * 文件路径列表，支持三种格式:
   *
   * <p>file://d:/1.png
   * <p>https://???
   * <p>base64://xxx
   */
  private List<String> paths;
}
