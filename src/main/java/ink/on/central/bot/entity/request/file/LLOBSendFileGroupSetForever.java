package ink.on.central.bot.entity.request.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 群文件转永久 LLOneBot扩展（需要 6.5.0 之后的版本）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.File#SET_GROUP_FILE_FOREVER
 * @since 1.8.0-20251117
 */
@Accessors(chain = true)
@Data
public class LLOBSendFileGroupSetForever {
  /** 群号 */
  private Long groupId;
  /** 文件 ID */
  private String fileId;
}
