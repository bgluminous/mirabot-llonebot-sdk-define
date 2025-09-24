package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 删除群文件文件夹 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIType.File#DELETE_GROUP_FOLDER
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupDeleteFileFolder {
  /** 群号 */
  private Long groupId;
  /** 文件夹ID */
  private String folderId;
}
