package ink.on.central.bot.entity.response.msg;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 发送群Ai语音 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIConstant.Message#SEND_GROUP_AI_RECORD
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResMsgSendGroupAiRecord {
  /** 消息ID */
  private Integer messageId;
}
