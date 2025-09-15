package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIConstant;
import ink.on.central.bot.entity.request.LLOBGroupBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 重命名群文件文件夹名 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIConstant.Group#RENAME_GROUP_FILE_FOLDER
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendGroupRenameFilesFolder extends LLOBGroupBase {
  /** 文件夹 ID */
  private String folderId;
  /** 新的文件夹名 */
  private String newFolderName;
}
