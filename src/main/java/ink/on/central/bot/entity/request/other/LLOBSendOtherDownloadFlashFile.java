package ink.on.central.bot.entity.request.other;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 下载闪传文件 LLOneBot扩展 开发中暂未实现（此 API 需要 LLOneBot 5.3.0 以上版本） 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250721
 * @see LLOBAPIConstant.Other#DOWNLOAD_FLASH_FILE
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendOtherDownloadFlashFile {
  /**  */
  private String shareLink;
  /**  */
  private String fileSetId;
}
