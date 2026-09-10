package ink.on.central.bot.entity.response.system;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取运行状态 返回实体类
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.System#GET_STATUS
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBResSystemGetStatus {
  /** 是否在线 */
  private Boolean online;
  /** 状态是否良好 */
  private Boolean good;
  /** 运行统计 */
  private Stat stat;

  @Accessors(chain = true)
  @Data
  public static class Stat {
    /** 接收信息总数 */
    private Long messageReceived;
    /** 发送信息总数 */
    private Long messageSent;
    /** 最后一条消息时间 */
    private Long lastMessageTime;
    /** 启动时间 */
    private Long startupTime;
  }
}
