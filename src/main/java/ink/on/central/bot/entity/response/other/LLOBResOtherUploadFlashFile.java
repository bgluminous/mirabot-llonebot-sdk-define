package ink.on.central.bot.entity.response.other;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 上传闪传文件 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see LLOBAPIConstant.Other#UPLOAD_FLASH_FILE
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResOtherUploadFlashFile {
  /** 文件ID */
  private String fileSetId;
  /** 文件分享链接 */
  private String shareLink;
  /** 文件过期时间 */
  private double expireTime;
}
