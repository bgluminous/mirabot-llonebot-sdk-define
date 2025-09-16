package ink.on.central.bot.entity.request.group;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 删除群精华消息 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see ink.on.central.bot.LLOBAPIEntityMapper#DELETE_ESSENCE_MSG
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupDeleteEssenceMsg {
  /** 消息ID */
  private Integer messageId;
}
