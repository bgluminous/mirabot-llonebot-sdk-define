package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群相册列表 LLOneBot扩展
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Group#GET_GROUP_ALBUM_LIST
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupGetAlbumList {
  /** 群号 */
  private Long groupId;
}
