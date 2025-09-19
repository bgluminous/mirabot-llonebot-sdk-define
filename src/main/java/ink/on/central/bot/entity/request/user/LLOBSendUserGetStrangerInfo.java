package ink.on.central.bot.entity.request.user;

import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.request.LLOBUserBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 获取好友或群友信息 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20240408
 * @see LLOBAPIType#GET_STRANGER_INFO
 * @since 1.0.0-20240408
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendUserGetStrangerInfo extends LLOBUserBase {
}
