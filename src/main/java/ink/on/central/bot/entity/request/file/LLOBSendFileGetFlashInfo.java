package ink.on.central.bot.entity.request.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取闪传文件详情 LLOneBot扩展（此 API 需要 LLOneBot 5.3.0 以上版本）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.File#GET_FLASH_FILE_INFO
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendFileGetFlashInfo {
  /** 分享链接，和 fileSetId 二选一 */
  private String shareLink;
  /** 文件集 ID */
  private String fileSetId;
}
