package ink.on.central.bot.entity.request.msg.part.hal;

import lombok.Getter;

/**
 * 消息片段 实体类超类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @since 1.0.0-20250722
 */
public abstract class LLOBMsgPart {
  /** 消息类型 */
  @Getter
  public final String type;

  /**
   * 构造方法
   *
   * @param type 消息类型
   */
  public LLOBMsgPart(String type) {
    this.type = type;
  }

  /**
   * 获取数据
   *
   * @return 数据
   */
  public abstract LLOBMsgBase getData();
}
