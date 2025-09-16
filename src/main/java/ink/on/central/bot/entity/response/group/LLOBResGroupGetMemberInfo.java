package ink.on.central.bot.entity.response.group;

import ink.on.central.bot.entity.types.LLOBGroupRole;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 群成员列表 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see ink.on.central.bot.LLOBAPIEntityMapper#GET_GROUP_MEMBER_INFO
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResGroupGetMemberInfo {
  /** 年龄 */
  private Long age;
  /** 地区 */
  private String area;
  /** 群名片 */
  private String card;
  /** 是否允许修改群名片 */
  private Boolean cardChangeable;
  /** 没有群名片时显示为昵称 */
  private String cardOrNickname;
  /** 创建时间 */
  private Long groupId;
  /** 加群时间 */
  private Long joinTime;
  /** 最后发言时间 */
  private Long lastSentTime;
  /** 等级 */
  private String level;
  /** 昵称 */
  private String nickname;
  /** 角色 */
  private String role;
  /** 性别 */
  private String sex;
  /** 禁言到期时间 */
  private Long shutUpTimestamp;
  /** 群头衔 */
  private String title;
  /** 群头衔到期时间 */
  private Long titleExpireTime;
  /** 是否不良记录成员 */
  private Boolean unfriendly;
  /** 用户id */
  private Long userId;

  public LLOBGroupRole getRole() {
    return LLOBGroupRole.strOf(this.role);
  }
}
