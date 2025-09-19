package ink.on.central.bot.entity.response.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群系统消息 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIType#GET_GROUP_SYSTEM_MSG
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResGroupGetSystemMsg {
  /** 邀请加群申请 */
  private InvitedRequest[] invitedRequests;
  /** 加群申请 */
  private JoinRequest[] joinRequests;

  /** 邀请加群申请 */
  @Accessors(chain = true)
  @Data
  public static class InvitedRequest {
    private Long actor;
    private Boolean checked;
    private Long groupId;
    private String groupName;
    private String invitorNick;
    private Long invitorUin;
    private Long requestId;
  }

  /** 加群申请 */
  @Accessors(chain = true)
  @Data
  public static class JoinRequest {
    private Long actor;
    private Boolean checked;
    private Long groupId;
    private String groupName;
    private String message;
    private Long requestId;
    private String requesterNick;
    private Long requesterUin;
  }
}
