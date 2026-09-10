package ink.on.central.bot.entity.response.friend;

import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.types.LLOBUserSex;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取陌生人信息 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Friend#GET_STRANGER_INFO
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResUserGetStrangerInfo {
  /** QQ号 */
  private Long userId;
  /** 昵称 */
  private String nickname;
  /** 性别，male / female / unknown */
  private String sex;
  /** 年龄 */
  private Integer age;
  /** QID */
  private String qid;
  /** 等级 */
  private Integer level;
  /** 登录天数 */
  private Integer loginDays;
  /** 注册时间 */
  private Long regTime;
  /** 个性签名 */
  private String longNick;
  /** 城市 */
  private String city;
  /** 国家 */
  private String country;
  /** 出生年份 */
  private Integer birthdayYear;
  /** 出生月份 */
  private Integer birthdayMonth;
  /** 出生日 */
  private Integer birthdayDay;
  /** 个性标签 */
  private String[] labels;
  /** 是否会员 */
  private Boolean isVip;
  /** 是否年费会员 */
  private Boolean isYearsVip;
  /** 会员等级 */
  private Integer vipLevel;
  /** 备注 */
  private String remark;
  /** 是否超级会员 */
  private Boolean isSvip;

  public LLOBUserSex getSex() {
    return LLOBUserSex.strOf(this.sex);
  }
}
