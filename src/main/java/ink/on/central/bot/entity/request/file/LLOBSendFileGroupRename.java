package ink.on.central.bot.entity.request.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 重命名群文件名 LLOneBot扩展（此 API 需要 LLBot 7.10.1 及以上版本）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.File#RENAME_GROUP_FILE
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBSendFileGroupRename {
  /** 群号 */
  private Long groupId;
  /** 文件 ID */
  private String fileId;
  /** 当前父目录 */
  private String currentParentDirectory;
  /** 新文件名 */
  private String newName;
}
