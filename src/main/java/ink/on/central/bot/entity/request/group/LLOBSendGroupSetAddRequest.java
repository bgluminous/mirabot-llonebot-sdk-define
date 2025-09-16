package ink.on.central.bot.entity.request.group;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 处理加群请求／邀请 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see ink.on.central.bot.LLOBAPIEntityMapper#SET_GROUP_ADD_REQUEST
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupSetAddRequest {
  /** 加群请求/邀请的 flag（需从事件中获取） */
  private String flag;
  /** 是否同意请求/邀请 */
  private Boolean approve;
  /** 拒绝理由（仅在拒绝时有效） */
  private String reason;
}
