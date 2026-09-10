package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 删除群相册 LLOneBot扩展
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Group#DELETE_GROUP_ALBUM
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupDeleteAlbum {
  /** 群号 */
  private Long groupId;
  /** 相册 ID */
  private String albumId;
}
