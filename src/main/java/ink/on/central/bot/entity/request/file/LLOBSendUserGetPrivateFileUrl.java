package ink.on.central.bot.entity.request.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取私聊文件资源链接 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIType.File#GET_PRIVATE_FILE_URL
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBSendUserGetPrivateFileUrl {
  /** QQ号 */
  private Long userId;
  /** 文件 ID */
  private String fileId;
}
