package ink.on.central.bot.entity.request.unclassified;

import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.request.LLOBGroupBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 群组匿名 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see LLOBAPIType#SET_GROUP_ANONYMOUS
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
@Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
@EqualsAndHashCode(callSuper = true)
public class LLOBSendUnclassifiedSetGroupAnonymous extends LLOBGroupBase {
  /** 群号 */
  private Long groupId;
  /** 是否允许匿名聊天 */
  private Boolean enable;
}
