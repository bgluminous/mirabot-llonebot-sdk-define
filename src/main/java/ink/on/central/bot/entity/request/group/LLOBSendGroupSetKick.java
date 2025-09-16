package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.entity.request.LLOBGroupMemberBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 群组踢人 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see ink.on.central.bot.LLOBAPIEntityMapper#SET_GROUP_KICK
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendGroupSetKick extends LLOBGroupMemberBase {
  /** 是否禁止再次加群 */
  private Boolean rejectAddRequest;
}
