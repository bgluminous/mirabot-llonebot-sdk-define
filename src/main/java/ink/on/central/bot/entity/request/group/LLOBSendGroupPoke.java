package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.request.LLOBGroupMemberBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 群员戳一戳（双击头像） LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIType#GROUP_POKE
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendGroupPoke extends LLOBGroupMemberBase {
  // EMPTY
}
