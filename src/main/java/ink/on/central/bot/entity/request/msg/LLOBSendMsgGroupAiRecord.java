package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 发送群Ai语音 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIType#SEND_GROUP_AI_RECORD
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgGroupAiRecord {
  /** 群号（消息类型为 group 时需要） */
  private Long groupId;
  /** 要发送的内容 */
  private String text;
  /** 语音声色 */
  private String character;
  /** 语音类型 */
  private Integer chatType;

  public void setChatType(Integer chatType) {
    if (chatType != 1 && chatType != 2) {
      throw new IllegalArgumentException("chatType must be 1 or 2");
    }
  }
}
