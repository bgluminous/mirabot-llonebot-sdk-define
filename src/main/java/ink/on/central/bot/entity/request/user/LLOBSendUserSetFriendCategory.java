package ink.on.central.bot.entity.request.user;

import ink.on.central.bot.entity.request.LLOBUserBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 移动好友分组 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250717
 * @see ink.on.central.bot.LLOBAPIEntityMapper#SET_FRIEND_CATEGORY
 * @since 1.0.0-20250717
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendUserSetFriendCategory extends LLOBUserBase {
  /** 分组ID */
  private Integer categoryId;
}
