package ink.on.central.bot.entity.request.other;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群Ai语音可用声色列表 LLOneBot扩展
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIType#GET_AI_CHARACTERS
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBSendOtherGetAiCharacters {
  /** 文件下载链接 */
  private Long groupId;
  /** 语音类型  */
  private Integer chatType;
}
