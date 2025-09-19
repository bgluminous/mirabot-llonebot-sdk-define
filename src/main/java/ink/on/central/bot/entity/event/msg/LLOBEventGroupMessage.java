package ink.on.central.bot.entity.event.msg;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import ink.on.central.bot.entity.types.LLOBGroupRole;
import ink.on.central.bot.entity.types.LLOBUserSex;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

/**
 * 消息事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventGroupMessage extends LLOBEventRoot {
  /** 消息id */
  private Long messageId;
  /** 消息序列号 */
  private Long messageSeq;
  /** 真实消息ID（仅在 get_msg 接口存在） */
  private Long realId;
  /** 群ID */
  private Long groupId;
  /** 消息发送者id */
  private Long userId;
  /** 消息类型 */
  private String messageType;
  /** 消息子类型 */
  private String subType;
  /** 消息发送者 */
  private Sender sender;
  /** 消息列表 */
  private List<Map<String, Object>> message;
  /** 消息格式 */
  private String messageFormat;
  /** 原始消息内容（CQ 码格式） */
  private String rawMessage;
  /** 字体 */
  private Integer font;
  /** 目标 ID（仅发送的消息） */
  private Integer targetId;
  /** 临时会话来源 */
  private Integer tempSource;

  public SubType getSubType() {
    for (SubType value : SubType.values()) {
      if (value.name().equalsIgnoreCase(this.subType)) {
        return value;
      }
    }
    throw new IllegalArgumentException("未知的消息事件子类型! [%s]".formatted(this.subType));
  }

  public MessageType getMessageType() {
    for (MessageType value : MessageType.values()) {
      if (value.name().equalsIgnoreCase(this.messageType)) {
        return value;
      }
    }
    throw new IllegalArgumentException("未知的消息事件消息类型! [%s]".formatted(this.messageType));
  }

  public enum MessageType {
    /** 私聊 */
    PRIVATE,
    /** 群聊 */
    GROUP
  }

  public enum SubType {
    FRIEND,
    GROUP,
    NORMAL
  }

  /** 消息发送者 */
  @Accessors(chain = true)
  @Data
  public static class Sender {
    /** 消息发送者id */
    private Long userId;
    /** 昵称 */
    private String nickname;
    /** 群名片 */
    private String card;
    /** 性别 */
    private String sex;
    /** 年龄 */
    private Integer age;
    /** 等级 */
    private Integer level;
    /** 角色 */
    private String role;
    /** 专属头衔 */
    private String title;
    /** 群号（来自群的临时聊天） */
    private Long groupId;

    public LLOBUserSex getSex() {
      return LLOBUserSex.strOf(this.sex);
    }

    public LLOBGroupRole getRole() {
      return LLOBGroupRole.strOf(this.role);
    }
  }

}
