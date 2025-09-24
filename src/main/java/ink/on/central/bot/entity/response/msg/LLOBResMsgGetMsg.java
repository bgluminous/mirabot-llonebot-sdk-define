package ink.on.central.bot.entity.response.msg;

import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.types.LLOBGroupRole;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

/**
 * 获取消息详情 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIType.Msg#GET_MSG
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResMsgGetMsg {
  /**  */
  private Long selfId;
  /** 群ID */
  private Long groupId;
  /** 消息发送者id */
  private Long userId;
  /** 消息发送时间 */
  private Long time;
  /** 消息id */
  private Long messageId;
  /** 真实消息ID */
  private Long realId;
  /** 消息序列号 */
  private Long messageSeq;
  /** 消息类型 */
  private String messageType;
  /** 消息元数据 */
  private String rawMessage;
  /** 字体 */
  private Integer font;
  /** 消息子类型 */
  private String subType;
  /** 消息格式 */
  private String messageFormat;
  /**  */
  private String postType;
  /** 消息发送者 */
  private Sender sender;
  /** 消息列表 */
  private List<Map<String, Object>> message;

  /** 消息发送者 */
  @Accessors(chain = true)
  @Data
  public static class Sender {
    /** 发送者id */
    private Long userId;
    /** 昵称 */
    private String nickname;
    /** 群名片 */
    private String card;
    /** 群角色 */
    private String role;
    /** 群头衔 */
    private String title;

    public LLOBGroupRole getRole() {
      return LLOBGroupRole.strOf(this.role);
    }
  }

}
