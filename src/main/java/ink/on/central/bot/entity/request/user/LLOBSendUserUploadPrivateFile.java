package ink.on.central.bot.entity.request.user;

import ink.on.central.bot.LLOBAPIConstant;
import ink.on.central.bot.entity.request.LLOBUserBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 上传私聊文件 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250717
 * @see LLOBAPIConstant.User#UPLOAD_PRIVATE_FILE
 * @since 1.0.0-20250717
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendUserUploadPrivateFile extends LLOBUserBase {
  /**
   * 文件,支持三种格式:
   *
   * <p>file://d:/1.png
   * <p>https://???
   * <p>base64://xxx
   */
  private String file;
  /** 文件名 LLOneBot扩展字段 */
  private String name;
}
