package ink.on.central.bot.entity.response.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取闪传文件详情 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see LLOBAPIType.File#GET_FLASH_FILE_INFO
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResOtherGetFlashFileInfo {
  /** 文件id */
  private String fileSetId;
  /** 文件名 */
  private String title;
  /** 分享链接 */
  private String shareLink;
  /** bytes大小 */
  private String totalFileSize;
  /** 文件信息 */
  private LLOBResOtherGetFlashFileInfoFile[] files;

  @Accessors(chain = true)
  @Data
  public static class LLOBResOtherGetFlashFileInfoFile {
    /** 文件名 */
    private String name;
    /** bytes大小 */
    private Long size;
  }
}
