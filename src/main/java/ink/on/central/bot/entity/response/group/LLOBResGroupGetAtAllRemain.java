package ink.on.central.bot.entity.response.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群 @全体成员 剩余次数 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIType.Group#GET_GROUP_AT_ALL_REMAIN
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResGroupGetAtAllRemain {
  /** 是否可以 @全体成员 */
  private Boolean canAtAll;
  /** 群内所有管理当天剩余 @全体成员 次数 */
  private Long remainAtAllCountForGroup;
  /** Bot 当天剩余 @全体成员 次数 */
  private Long remainAtAllCountForUin;
}
