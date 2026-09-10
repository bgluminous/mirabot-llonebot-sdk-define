package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群相册媒体列表 LLOneBot扩展（此 API 需要 LLBot 7.12.3 及以上版本）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Group#GET_GROUP_ALBUM_MEDIA_LIST
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupGetAlbumMediaList {
  /** 群号 */
  private Long groupId;
  /** 相册 ID */
  private String albumId;
  /** 分页附加信息 */
  private String attachInfo;
}
