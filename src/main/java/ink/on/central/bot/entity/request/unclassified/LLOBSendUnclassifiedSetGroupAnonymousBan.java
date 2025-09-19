package ink.on.central.bot.entity.request.unclassified;

import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.request.LLOBGroupBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 群组匿名用户禁言 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see LLOBAPIType#SET_GROUP_ANONYMOUS_BAN
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
@Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
@EqualsAndHashCode(callSuper = true)
public class LLOBSendUnclassifiedSetGroupAnonymousBan extends LLOBGroupBase {
  /** 要禁言的匿名用户的 flag（需从群消息上报的数据中获得） */
  private String flag;
  /** 禁言时长，单位秒，0 表示取消禁言 */
  private Integer duration;
}
