package ink.on.central.bot.entity.request.user;

import ink.on.central.bot.entity.request.LLOBUserBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 好友戳一戳（双击头像） LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250717
 * @see ink.on.central.bot.APIConstant.User#FRIEND_POKE
 * @since 1.0.0-20250717
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendUserFriendPoke extends LLOBUserBase {
}
