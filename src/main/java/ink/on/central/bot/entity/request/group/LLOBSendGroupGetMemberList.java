package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群成员列表 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIType#GET_GROUP_MEMBER_LIST
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupGetMemberList {
  /** 群号 */
  private Long groupId;
  /** 是否不使用缓存 */
  private Boolean noCache;
}
