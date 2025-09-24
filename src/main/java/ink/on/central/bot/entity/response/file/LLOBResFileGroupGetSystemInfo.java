package ink.on.central.bot.entity.response.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 上传群文件 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIType.File#UPLOAD_GROUP_FILE
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResFileGroupGetSystemInfo {
  /** 文件数量 */
  private Integer fileCount;
  /** 文件系统剩余空间 */
  private Integer limitCount;
  /** 文件系统已用空间 */
  private Integer usedSpace;
  /** 文件系统总空间 */
  private Integer totalSpace;
}
