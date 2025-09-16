package ink.on.central.bot.entity.request.other;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取闪传文件详情 LLOneBot扩展 开发中暂未实现（此 API 需要 LLOneBot 5.3.0 以上版本） 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250721
 * @see ink.on.central.bot.LLOBAPIEntityMapper#GET_FLASH_FILE_INFO
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendOtherGetFlashFileInfo {
  /**  */
  private String shareLink;
  /**  */
  private String fileSetId;
}
