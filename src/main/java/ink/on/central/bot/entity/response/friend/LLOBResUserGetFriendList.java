package ink.on.central.bot.entity.response.friend;

import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.types.LLOBUserSex;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取好友列表 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see LLOBAPIType.Friend#GET_FRIEND_LIST
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResUserGetFriendList {
  private Long userId;
  /** 昵称 */
  private String nickname;
  /** 备注 */
  private String remark;
  /** 性别 */
  private String sex;
  /** 等级 */
  private Integer level;

  public LLOBUserSex getSex() {
    return LLOBUserSex.strOf(this.sex);
  }

}
