package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.entity.request.LLOBGroupBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 获取群历史消息记录 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see ink.on.central.bot.APIConstant.Message#GET_GROUP_MSG_HISTORY
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendMsgGetGroupHistory extends LLOBGroupBase {
  /**  */
  private Long messageSeq;
  /** 数量 默认20 */
  private Integer count;
}
