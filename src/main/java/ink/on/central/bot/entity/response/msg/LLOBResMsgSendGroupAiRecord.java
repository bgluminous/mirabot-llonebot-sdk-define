package ink.on.central.bot.entity.response.msg;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 发送群Ai语音 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see ink.on.central.bot.LLOBAPIEntityMapper#SEND_GROUP_AI_RECORD
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResMsgSendGroupAiRecord {
  /** 消息ID */
  private Integer messageId;
}
