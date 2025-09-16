package ink.on.central.bot.entity.response.other;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群Ai语音可用声色列表 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see ink.on.central.bot.LLOBAPIEntityMapper#GET_AI_CHARACTERS
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResOtherGetAiCharacters {
  /** 类型 */
  private String type;
  /** 角色列表 */
  private Characters[] characters;

  /** 角色列表 */
  @Accessors(chain = true)
  @Data
  public static class Characters {
    private String characterId;
    private String characterName;
    private String previewUrl;
  }
}
