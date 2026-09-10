package ink.on.central.bot.entity.response.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 上传群相册 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Group#UPLOAD_GROUP_ALBUM
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBResGroupUploadAlbum {
  /** 成功数量 */
  private Integer successCount;
  /** 失败数量 */
  private Integer failCount;
  /** 失败下标 */
  private Integer[] failIndexes;
}
