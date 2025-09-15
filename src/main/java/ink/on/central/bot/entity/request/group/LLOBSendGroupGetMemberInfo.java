package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIConstant;
import ink.on.central.bot.entity.request.LLOBGroupMemberBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 获取群成员信息 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIConstant.Group#GET_GROUP_MEMBER_INFO
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendGroupGetMemberInfo extends LLOBGroupMemberBase {
}
