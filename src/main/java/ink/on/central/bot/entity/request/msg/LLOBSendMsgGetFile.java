package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取消息文件详情 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see LLOBAPIConstant.Message#GET_FILE
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgGetFile {
  /** 文件名 */
  private String file;
}
