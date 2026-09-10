package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 上传群相册 LLOneBot扩展
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Group#UPLOAD_GROUP_ALBUM
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupUploadAlbum {
  /** 群号 */
  private Long groupId;
  /** 相册 ID */
  private String albumId;
  /**
   * 文件路径列表，支持 file://、http、base64://
   */
  private String[] files;
}
