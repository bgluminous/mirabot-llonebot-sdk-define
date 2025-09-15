package ink.on.central.bot.entity.response.msg;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 获取消息图片详情 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIConstant.Message#GET_IMAGE
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBResMsgGetImage extends LLOBResMsgGetFile {

}
