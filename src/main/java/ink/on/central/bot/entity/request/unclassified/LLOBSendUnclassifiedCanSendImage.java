package ink.on.central.bot.entity.request.unclassified;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 检查是否可以发送图片 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see ink.on.central.bot.LLOBAPIEntityMapper#CAN_SEND_IMAGE
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
@Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
public class LLOBSendUnclassifiedCanSendImage {
  // EMPTY
}
