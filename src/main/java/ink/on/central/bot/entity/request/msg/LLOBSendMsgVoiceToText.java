package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 上传私聊文件 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250721
 * @see LLOBAPIConstant.Message#VOICE_MSG_TO_TEXT
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgVoiceToText {
  /** 消息ID */
  private Integer messageId;
}
