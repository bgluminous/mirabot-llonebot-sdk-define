package ink.on.central.bot.entity.request.user;

import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.request.LLOBUserBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 发送好友赞载体 实体类
 *
 * @see LLOBAPIType#SEND_LIKE
 * @author BGLuminous
 * @since 1.0.0-20240407
 * @version 1.0.0-20240407
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendUserLike extends LLOBUserBase {
  /** 赞的次数，每个好友每天最多 10 次 */
  private Integer times;
}

