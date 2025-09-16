package ink.on.central.bot.entity.response.msg;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 获取转发消息详情 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see ink.on.central.bot.LLOBAPIEntityMapper#GET_FORWARD_MSG
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResMsgGetForwardMsg {
  /** 消息列表 */
  private LLOBResMsgGetForwardMsgMessage[] messages;

  @Accessors(chain = true)
  @Data
  public static class LLOBResMsgGetForwardMsgMessage {
    /** 消息内容 */
    private List<? extends LLOBMsgPart> content;
    /** 消息格式 */
    private String messageFormat;
    /** 消息id */
    private String messageType;
    /** 消息发送者 */
    private LLOBResMsgGetForwardMsgSender sender;
    /** 消息发送时间 */
    private Long time;
  }

  @Accessors(chain = true)
  @Data
  public static class LLOBResMsgGetForwardMsgSender {
    /** QQ号 */
    private Long userid;
    /** 昵称 */
    private String nickname;
  }

}
