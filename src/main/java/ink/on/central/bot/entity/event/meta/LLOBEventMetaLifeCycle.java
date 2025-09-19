package ink.on.central.bot.entity.event.meta;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 生命周期事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventMetaLifeCycle extends LLOBEventRoot {
  /**  */
  private String metaEventType;
  /** 子类型 */
  private String subType;

  public SubType getSubType() {
    for (SubType value : SubType.values()) {
      if (value.name().equalsIgnoreCase(this.subType)) {
        return value;
      }
    }
    throw new IllegalArgumentException("生命周期事件子类型! [%s]".formatted(this.subType));
  }

  /** 子类型 */
  public enum SubType {
    /** 启用 */
    ENABLE,
    /** 禁用 */
    DISABLE,
    /** 连接 */
    CONNECT
  }

}
