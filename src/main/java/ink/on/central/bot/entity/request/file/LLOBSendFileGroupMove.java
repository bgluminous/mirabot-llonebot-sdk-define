package ink.on.central.bot.entity.request.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 移动群文件 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250923
 * @see LLOBAPIType.File#MOVE_GROUP_FILE
 * @since 1.0.0-20250923
 */
@Accessors(chain = true)
@Data
public class LLOBSendFileGroupMove {
  /** 文件 ID */
  private String fileId;
  /** 群号 */
  private long groupId;
  /** 当前文件夹 ID */
  private String parentDirectory;
  /** 目标文件夹 ID */
  private String targetDirectory;
}
