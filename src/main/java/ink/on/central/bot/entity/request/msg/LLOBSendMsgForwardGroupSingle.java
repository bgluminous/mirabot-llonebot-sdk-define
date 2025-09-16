package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.entity.request.LLOBGroupBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 转发单条群消息 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see ink.on.central.bot.LLOBAPIEntityMapper#FORWARD_GROUP_SINGLE_MSG
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendMsgForwardGroupSingle extends LLOBGroupBase {
    private String messageId;
}
