package ink.on.central.bot.entity.request.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 重命名群文件文件夹名 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIType.File#RENAME_GROUP_FILE_FOLDER
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBSendFileGroupRenameFolder {
  /** 群号 */
  private Long groupId;
  /** 文件夹 ID */
  private String folderId;
  /** 新的文件夹名 */
  private String newFolderName;
}
