package ink.on.central.bot.entity.response.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 上传私聊文件 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.File#UPLOAD_PRIVATE_FILE
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBResFileUploadPrivate {
  /** 文件 ID */
  private String fileId;
}
