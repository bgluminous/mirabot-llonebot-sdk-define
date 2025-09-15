package ink.on.central.bot.entity.response.user;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取私聊文件资源链接 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIConstant.User#GET_PRIVATE_FILE_URL
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResUserGetPrivateFileUrl {
  /** 头像地址 */
  private String url;
}
