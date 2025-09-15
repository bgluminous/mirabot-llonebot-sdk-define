package ink.on.central.bot.entity.response.msg;

import ink.on.central.bot.LLOBAPIConstant;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import ink.on.central.bot.entity.types.LLOBGroupRole;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 获取消息详情 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIConstant.Message#GET_MSG
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResMsgGetMsg {
  /**  */
  private Long selfId;
  /** 群ID */
  private long groupId;
  /** 消息发送者id */
  private Long userId;
  /** 消息发送时间 */
  private Long time;
  /** 消息id */
  private Long messageId;
  /**  */
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
  private List<? extends LLOBMsgPart> message;

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
