package ink.on.central.bot.entity.request.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 群文件转永久 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.8.0-20251117
 * @see LLOBAPIType.File#SET_GROUP_FILE_FOREVER
 * @since 1.8.0-20251117
 */
@Accessors(chain = true)
@Data
@Deprecated(since = "开发中")
public class LLOBSendFileGroupSetForever {
  /** 群号 */
  private Long groupId;
  /** 文件 ID */
  private String fileId;
}
