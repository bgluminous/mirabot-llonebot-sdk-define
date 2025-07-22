package ink.on.central.bot.entity.request.user;

import ink.on.central.bot.entity.request.LLOBUserBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 删除好友 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250717
 * @see ink.on.central.bot.APIConstant.User#DELETE_FRIEND
 * @since 1.0.0-20250717
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendUserDeleteFriend extends LLOBUserBase {
}
