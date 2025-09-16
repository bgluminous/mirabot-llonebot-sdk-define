package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.entity.request.LLOBGroupBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 群打卡 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see ink.on.central.bot.LLOBAPIEntityMapper#SEND_GROUP_SIGN
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendGroupSign extends LLOBGroupBase {
  // EMPTY
}
