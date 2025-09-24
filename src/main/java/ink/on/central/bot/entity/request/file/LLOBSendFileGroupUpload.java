package ink.on.central.bot.entity.request.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 上传群文件 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIType.File#UPLOAD_GROUP_FILE
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBSendFileGroupUpload {
  /** 群号 */
  private Long groupId;
  /**
   * 文件,支持三种格式:
   *
   * <p>file://d:/1.png
   * <p>https://???
   * <p>base64://xxx
   */
  private String file;
  /** 文件名 */
  private String name;
  /** 文件夹id，可通过get_group_root_files获取 */
  private String folderId;
}
