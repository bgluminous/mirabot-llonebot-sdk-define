package ink.on.central.bot.entity.response.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群组今日打卡列表 LLOneBot扩展 返回实体类（此 API 需要 LLBot 8.0.0 及以上版本）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Group#GET_GROUP_SIGNED_LIST
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBResGroupGetSignedList {
  /** 打卡者 QQ */
  private Long userId;
  /** 打卡者昵称 */
  private String nick;
  /** 打卡时间 */
  private Long time;
  /** 打卡排名 */
  private Integer rank;
}
