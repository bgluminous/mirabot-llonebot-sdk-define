package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 删除群文件 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIType#DELETE_GROUP_FILE
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupDeleteFile {
  /** 群号 */
  private Long groupId;
  /** 文件ID 在上报的上传文件消息中可以拿到 */
  private String fileId;
}
