package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.request.LLOBGroupMemberBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 群组设置管理员 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIType#SET_GROUP_ADMIN
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendGroupSetAdmin extends LLOBGroupMemberBase {
  /** 是否启用 */
  private Boolean enable;
}
