package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 设置群名片（群备注） 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIType#SET_GROUP_CARD
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupSetCard {
  /** 群号 */
  private Long groupId;
  /** QQ号 */
  private Long userId;
  /** 群名片（群备注） */
  private String card;
}
