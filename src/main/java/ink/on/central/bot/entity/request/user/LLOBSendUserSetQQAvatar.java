package ink.on.central.bot.entity.request.user;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 设置QQ头像 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250717
 * @see LLOBAPIConstant.User#SET_QQ_AVATAR
 * @since 1.0.0-20250717
 */
@Accessors(chain = true)
@Data
public class LLOBSendUserSetQQAvatar {

  /**
   * 文件,支持三种格式:
   *
   * <p>file://d:/1.png
   * <p>https://???
   * <p>base64://xxx
   */
  private String file;
}
