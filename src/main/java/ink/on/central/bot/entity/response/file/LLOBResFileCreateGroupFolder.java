package ink.on.central.bot.entity.response.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 创建群文件文件夹 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.File#CREATE_GROUP_FILE_FOLDER
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBResFileCreateGroupFolder {
  /** 文件夹 ID */
  private String folderId;
}
