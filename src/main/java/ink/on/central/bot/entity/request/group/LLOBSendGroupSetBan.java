package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 设群组单人禁言 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIType.Group#SET_GROUP_BAN
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupSetBan {
  /** 群号 */
  private Long groupId;
  /** QQ号 */
  private Long userId;
  /** 禁言时长，单位秒，0 表示取消禁言 */
  private Integer duration;
}
