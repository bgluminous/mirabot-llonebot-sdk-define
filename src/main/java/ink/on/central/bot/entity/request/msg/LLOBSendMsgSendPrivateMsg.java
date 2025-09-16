package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.entity.request.msg.part.hal.LLOBMsgPart;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 发送私聊消息 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see ink.on.central.bot.LLOBAPIEntityMapper#SEND_PRIVATE_MSG
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgSendPrivateMsg {
  /** QQ号（消息类型为 private 时需要） */
  private Long userId;
  /** 要发送的内容 */
  private List<LLOBMsgPart> message;
  /** 消息内容是否作为纯文本发送（即不解析 CQ 码），只在 message 字段是字符串时有效 */
  @Deprecated(since = "OneBot-11协议兼容")
  private Boolean autoEscape;
}
