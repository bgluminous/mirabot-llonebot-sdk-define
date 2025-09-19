package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.request.LLOBGroupMemberBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 设置群组专属头衔 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIType#SET_GROUP_SPECIAL_TITLE
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendGroupSetSpecialTitle extends LLOBGroupMemberBase {
  /** 头衔 为空则表示去掉群头衔 */
  private String specialTitle;
}
