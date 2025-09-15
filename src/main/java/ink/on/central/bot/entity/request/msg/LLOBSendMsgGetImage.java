package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取图片 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see LLOBAPIConstant.Message#GET_IMAGE
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgGetImage {
  /** 图片文件名 */
  private String file;
}
