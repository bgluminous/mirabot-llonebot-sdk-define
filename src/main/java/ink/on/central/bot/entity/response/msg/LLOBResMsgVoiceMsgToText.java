package ink.on.central.bot.entity.response.msg;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 语音消息转文字 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIConstant.Message#VOICE_MSG_TO_TEXT
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResMsgVoiceMsgToText {
  /** 文本内容 */
  private String text;
}
