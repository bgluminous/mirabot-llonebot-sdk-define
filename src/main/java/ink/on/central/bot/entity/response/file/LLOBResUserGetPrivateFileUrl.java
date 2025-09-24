package ink.on.central.bot.entity.response.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取私聊文件资源链接 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIType.File#GET_PRIVATE_FILE_URL
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResUserGetPrivateFileUrl {
  /** 头像地址 */
  private String url;
}
