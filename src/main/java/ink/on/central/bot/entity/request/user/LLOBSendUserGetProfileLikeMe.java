package ink.on.central.bot.entity.request.user;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取谁赞过我列表 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250717
 * @see ink.on.central.bot.LLOBAPIEntityMapper#GET_PROFILE_LIKE_ME
 * @since 1.0.0-20250717
 */
@Accessors(chain = true)
@Data
public class LLOBSendUserGetProfileLikeMe {
  /** 从0开始，-1表示获取全部，获取全部的时候非好友nick可能为空 */
  private Integer start;
  /** 一页的数量 默认20 最多30 */
  private Integer count;
}
