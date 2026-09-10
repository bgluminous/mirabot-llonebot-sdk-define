package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 批量踢出群成员 LLOneBot扩展（需要 5.6.0 及以上版本）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Group#BATCH_DELETE_GROUP_MEMBER
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupBatchDeleteMember {
  /** 群号 */
  private Long groupId;
  /** QQ 号列表 */
  private Long[] userIds;
}
