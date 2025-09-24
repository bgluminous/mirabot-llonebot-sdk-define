package ink.on.central.bot.entity.request.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群文件系统信息 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250923
 * @see LLOBAPIType.File#GET_GROUP_FILE_SYSTEM_INFO
 * @since 1.0.0-20250923
 */
@Accessors(chain = true)
@Data
public class LLOBSendFileGroupGetSystemInfo {
  /** 群号 */
  private Long groupId;
}
