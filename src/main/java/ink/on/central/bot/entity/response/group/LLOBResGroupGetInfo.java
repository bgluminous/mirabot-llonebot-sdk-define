package ink.on.central.bot.entity.response.group;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 群详情 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIConstant.Group#GET_GROUP_INFO
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResGroupGetInfo {
  /** 群号 */
  private Long groupId;
  /** 群名称 */
  private String groupName;
  /** 群公告 */
  private String groupMemo;
  /** 群创建时间 */
  private Long groupCreateTime;
  /** 群成员数量 */
  private Long memberCount;
  /** 最大群成员数量 */
  private Long maxMemberCount;
  /** 更详细的群信息,非OneBot11字段 */
  private GroupAll groupAll;

  /**
   * 更详细的群信息,非OneBot11字段
   * TODO: 又没有注释还那么多字段，我真的是懒得整理了
   */
  @Accessors(chain = true)
  @Data
  public static class GroupAll {
    private String groupCode;
    private Long appealDeadline;
    private Long certType;
    private Long classExt;
    private Long cmdUinFlagEx2;
    private Long cmdUinJoinTime;
    private Long cmdUinMsgMask;
    private Long cmdUinMsgSeq;
    private Long cmdUinPrivilege;
    private Long cmdUinUinFlag;
    private String fingerMemo;
    private String groupAnswer;
    private Long groupFlag;
    private Long groupFlagExt;
    private Long groupFlagExt3;
    private Long groupFlagExt4;
    private String groupMemo;
    private String groupName;
    private Long groupOption;
    private String groupQuestion;
    private Long groupSecLevel;
    private Long groupSecLevelInfo;
    private Long groupTypeFlag;
    private Long isAllowModifyConfGroupName;
    private Long isConfGroup;
    private Long isModifyConfGroupFace;
    private Long isModifyConfGroupName;
    private boolean isTop;
    private String joinGroupAuth;
    private Long maxMemberNum;
    private Long memberNum;
    private Long noCodeFingerOpenFlag;
    private Long noFigerOpenFlag;
    private String ownerUid;
    private Long privilegeFlag;
    private String remarkName;
    private String richFingerMemo;
    private Long shutUpAllTimestamp;
    private Long shutUpMeTimestamp;
  }
}
