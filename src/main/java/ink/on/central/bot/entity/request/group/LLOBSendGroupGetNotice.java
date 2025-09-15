package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIConstant;
import ink.on.central.bot.entity.request.LLOBGroupBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 获取群公告 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIConstant.Group#GET_GROUP_NOTICE
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendGroupGetNotice extends LLOBGroupBase {
  // EMPTY
}
