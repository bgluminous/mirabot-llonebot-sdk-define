package ink.on.central.bot.entity.response.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取官方机器人QQ号范围 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see LLOBAPIConstant.User#GET_ROBOT_UIN_RANGE
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResUserGetRobotUinRange {
  /** 最小 */
  @JsonProperty("minUin")
  private String minUin;
  /** 最大 */
  @JsonProperty("maxUin")
  private String maxUin;
}
