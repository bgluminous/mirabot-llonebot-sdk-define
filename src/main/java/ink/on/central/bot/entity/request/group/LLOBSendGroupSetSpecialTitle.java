package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 设置群组专属头衔 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIType.Group#SET_GROUP_SPECIAL_TITLE
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupSetSpecialTitle {
  /** 群号 */
  private Long groupId;
  /** QQ号 */
  private Long userId;
  /** 头衔 为空则表示去掉群头衔 */
  private String specialTitle;
}
