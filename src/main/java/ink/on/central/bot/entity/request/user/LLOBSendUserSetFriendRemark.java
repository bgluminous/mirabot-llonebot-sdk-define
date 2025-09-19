package ink.on.central.bot.entity.request.user;

import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.request.LLOBUserBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 设置好友备注 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250717
 * @see LLOBAPIType#SET_FRIEND_REMARK
 * @since 1.0.0-20250717
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendUserSetFriendRemark extends LLOBUserBase {
  /** 备注 */
  private String remark;
}
