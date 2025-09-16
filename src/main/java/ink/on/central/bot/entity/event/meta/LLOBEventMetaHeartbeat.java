package ink.on.central.bot.entity.event.meta;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 心跳事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventMetaHeartbeat extends LLOBEventRoot {
  /**  */
  private String metaEventType;
  /** 状态 */
  private Status status;
  /** 心跳间隔 */
  private Integer interval;

  /** 状态 */
  @Accessors(chain = true)
  @Data
  public static class Status {
    /** 是否在线 */
    private Boolean online;
    /** 是否正常 */
    private Boolean good;
  }

}
