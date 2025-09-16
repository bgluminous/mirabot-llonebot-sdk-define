package ink.on.central.bot.entity.request.user;

import ink.on.central.bot.entity.request.LLOBUserBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 获取私聊文件资源链接 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see ink.on.central.bot.LLOBAPIEntityMapper#GET_PRIVATE_FILE_URL
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendUserGetPrivateFileUrl extends LLOBUserBase {
  /** 文件 ID */
  private String fileId;
}
