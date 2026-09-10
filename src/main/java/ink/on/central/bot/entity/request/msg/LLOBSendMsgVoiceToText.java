package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 语音消息转文字 LLOneBot扩展（llonebot 5.1 版本才支持此 api）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Msg#VOICE_MSG_TO_TEXT
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgVoiceToText {
  /** 消息ID */
  private Integer messageId;
}
