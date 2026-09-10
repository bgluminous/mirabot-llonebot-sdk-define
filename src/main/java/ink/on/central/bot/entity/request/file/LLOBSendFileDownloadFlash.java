package ink.on.central.bot.entity.request.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 下载闪传文件 LLOneBot扩展（此 API 需要 LLOneBot 5.3.0 以上版本）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.File#DOWNLOAD_FLASH_FILE
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendFileDownloadFlash {
  /** 分享链接，和 fileSetId 二选一 */
  private String shareLink;
  /** 文件集 ID */
  private String fileSetId;
}
