package ink.on.central.bot.entity.request.user;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取我赞过谁列表 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250717
 * @see LLOBAPIType#GET_PROFILE_LIKE
 * @since 1.0.0-20250717
 */
@Accessors(chain = true)
@Data
public class LLOBSendUserGetProfileLike {
  /** 从0开始，-1表示获取全部，获取全部的时候非好友nick可能为空 */
  private Integer start;
  /** 一页的数量 默认20 最多30 */
  private Integer count;
}
