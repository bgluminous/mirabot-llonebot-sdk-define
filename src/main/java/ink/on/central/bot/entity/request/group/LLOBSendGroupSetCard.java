package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIConstant;
import ink.on.central.bot.entity.request.LLOBGroupMemberBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 设置群名片（群备注） 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIConstant.Group#SET_GROUP_CARD
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendGroupSetCard extends LLOBGroupMemberBase {
  /** 群名片（群备注） */
  private String card;
}
