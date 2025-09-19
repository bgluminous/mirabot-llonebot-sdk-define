package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 发送消息 合并了 [send_private_msg 发送私聊消息] 和 [send_group_msg 发送群消息] 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see LLOBAPIType#SEND_MSG
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
@Deprecated(since = "OneBot-11协议兼容，推荐使用 SEND_PRIVATE_MSG 和 SEND_GROUP_MSG")
public class LLOBSendMsgSendMsg {
  /** 消息类型，支持 private、group，分别对应私聊、群组，如不传入，则根据传入的 *_id 参数判断 */
  private String messageType;
  /** QQ号（消息类型为 private 时需要） */
  private Long userId;
  /** 群号（消息类型为 group 时需要） */
  private Long groupId;
  /** 要发送的内容 */
  private List<LLOBMsgPart> message;
  /** 消息内容是否作为纯文本发送（即不解析 CQ 码），只在 message 字段是字符串时有效 */
  private Boolean autoEscape;
}
