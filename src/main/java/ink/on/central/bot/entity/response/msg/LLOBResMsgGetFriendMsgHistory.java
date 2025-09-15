package ink.on.central.bot.entity.response.msg;

import ink.on.central.bot.LLOBAPIConstant;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 获取好友历史消息记录 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIConstant.Message#GET_FRIEND_MSG_HISTORY
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResMsgGetFriendMsgHistory {
  /** 消息列表 */
  private LLOBResMsgGetFriendMsgHistoryMessage[] messages;

  @Accessors(chain = true)
  @Data
  public static class LLOBResMsgGetFriendMsgHistoryMessage {
    /**  */
    private Long selfId;
    /** QQ号 */
    private Long userId;
    /** 发送时间 */
    private Long time;
    /** 消息ID */
    private Long messageId;
    /**  */
    private Long realId;
    /** 消息序列 */
    private Long messageSeq;
    /** 消息类型 */
    private String messageType;
    /** 发送人信息 */
    private LLOBResMsgGetFriendMsgHistorySender sender;
    /** 消息内容RAW */
    private String rawMessage;
    /** 字体大小 */
    private Integer font;
    /** 消息子类型 */
    private String subType;
    /** 消息列表 */
    private List<? extends LLOBMsgPart> message;
    /** 消息格式 */
    private String messageFormat;
    /** 操作类型 */
    private String postType;
  }

  @Accessors(chain = true)
  @Data
  public static class LLOBResMsgGetFriendMsgHistorySender {
    /** QQ号 */
    private Long userid;
    /** 昵称 */
    private String nickname;
    /** 群名片 */
    private String card;
  }

}
