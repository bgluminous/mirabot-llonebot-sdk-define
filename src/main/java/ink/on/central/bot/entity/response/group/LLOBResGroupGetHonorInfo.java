package ink.on.central.bot.entity.response.group;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 群详情 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see ink.on.central.bot.LLOBAPIEntityMapper#GET_GROUP_HONOR_INFO
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResGroupGetHonorInfo {
  /** 群ID */
  private String groupId;
  /** 快乐之源 */
  private String[] emotionList;
  /** 群聊炽焰 */
  private String[] legendList;
  /** 冒尖小春笋 */
  private String[] strongNewbieList;
  /** 当前龙王 */
  private Talkative currentTalkative;
  /** 群聊之火 */
  private PerformerList[] performerList;
  /** 历史龙王 */
  private Talkative[] talkativeList;

  /** 龙王 */
  @Accessors(chain = true)
  @Data
  public static class Talkative {
    private String avatar;
    private Integer dayCount;
    private String description;
    private String nickname;
    private Long userid;
  }

  /** 群聊之火 */
  @Accessors(chain = true)
  @Data
  public static class PerformerList {
    private String avatar;
    private String description;
    private String nickname;
    private Long userid;
  }

}
