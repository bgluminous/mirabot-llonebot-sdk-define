package ink.on.central.bot.entity.response.friend;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取被过滤好友请求 LLOneBot扩展 返回实体类（此 API 需要 LLOneBot 6.2.0 及以上版本）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Friend#GET_DOUBT_FRIENDS_ADD_REQUEST
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBResUserGetDoubtFriendsAddRequest {
  /** 加好友请求 flag */
  private String flag;
  /** QQ 号 */
  private String uin;
  /** 昵称 */
  private String nick;
  /** 来源 */
  private String source;
  /** 原因 */
  private String reason;
  /** 附加消息 */
  private String msg;
  /** 群号 */
  private String groupCode;
  /** 时间 */
  private String time;
  /** 类型 */
  private String type;
}
