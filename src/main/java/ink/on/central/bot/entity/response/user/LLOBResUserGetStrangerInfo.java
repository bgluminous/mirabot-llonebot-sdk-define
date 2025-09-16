package ink.on.central.bot.entity.response.user;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取好友或群友信息 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see ink.on.central.bot.LLOBAPIEntityMapper#GET_STRANGER_INFO
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResUserGetStrangerInfo {
  /** QQ号 */
  private Long userId;
  /** 昵称 */
  private String nickname;
  /** 备注 */
  private String sex;
  /** 年龄 */
  private Integer age;
  /** QID */
  private String qid;
  /** 等级 */
  private Integer level;
  /** 登录天数 */
  private Integer loginDays;
}

