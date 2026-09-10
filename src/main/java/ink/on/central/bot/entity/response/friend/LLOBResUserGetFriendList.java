package ink.on.central.bot.entity.response.friend;

import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.types.LLOBUserSex;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取好友列表 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Friend#GET_FRIEND_LIST
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResUserGetFriendList {
  /** QQ号 */
  private Long userId;
  /** 昵称 */
  private String nickname;
  /** 备注 */
  private String remark;
  /** 性别，male / female / unknown */
  private String sex;
  /** 出生年份 */
  private Integer birthdayYear;
  /** 出生月份 */
  private Integer birthdayMonth;
  /** 出生日 */
  private Integer birthdayDay;
  /** 年龄 */
  private Integer age;
  /** QID */
  private String qid;
  /** 个性签名 */
  private String longNick;
  /** 等级（文档未列出，兼容旧响应） */
  private Integer level;

  public LLOBUserSex getSex() {
    return LLOBUserSex.strOf(this.sex);
  }
}
