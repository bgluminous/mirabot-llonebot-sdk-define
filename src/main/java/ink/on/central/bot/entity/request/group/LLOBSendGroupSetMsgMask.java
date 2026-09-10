package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 设置群消息接受方式 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIType.Group#SET_GROUP_MSG_MASK
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupSetMsgMask {
  /** 群号 */
  private Long groupId;
  /** 1接收并提醒 2收进群助手 3屏蔽 4接收不提醒 */
  private Integer mask;

  public LLOBSendGroupSetMsgMask setMask(Integer mask) {
    if (mask < 1 || mask > 4) {
      throw new IllegalArgumentException("mask must be between 1 and 4!");
    }
    this.mask = mask;
    return this;
  }
}
