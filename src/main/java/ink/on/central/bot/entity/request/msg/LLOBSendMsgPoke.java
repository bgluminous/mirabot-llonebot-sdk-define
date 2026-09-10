package ink.on.central.bot.entity.request.msg;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 发送戳一戳（双击头像） LLOneBot扩展（此 API 需要 LLBot 7.11.3 及以上版本）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Msg#SEND_POKE
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgPoke {
  /** 群号，不填则为私聊戳一戳 */
  private Long groupId;
  /** 用户 QQ 号 */
  private Long userId;
  /** 目标 QQ 号，仅在私聊生效 */
  private Long targetId;
}
