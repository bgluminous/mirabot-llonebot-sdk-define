package ink.on.central.bot.entity.response.friend;

import com.fasterxml.jackson.annotation.JsonProperty;
import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.types.LLOBUserSex;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 获取好友列表（带分组） LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see LLOBAPIType.Friend#GET_FRIENDS_WITH_CATEGORY
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResUserGetFriendsWithCategory {
  /** 分组ID */
  @JsonProperty("categoryId")
  private Integer categoryId;
  /** 分组排序 */
  @JsonProperty("categorySortId")
  private Integer categorySortId;
  /** 分组名称 */
  @JsonProperty("categoryName")
  private String categoryName;
  /** 分组内好友数量 */
  @JsonProperty("categoryMbCount")
  private Integer categoryMbCount;
  /** 在线数量 */
  @JsonProperty("onlineCount")
  private Integer onlineCount;
  /** 好友列表 */
  @JsonProperty("buddyList")
  private List<LLOBResUserGetFriendsWithCategoryBuddy> buddyList;

  @Accessors(chain = true)
  @Data
  public static class LLOBResUserGetFriendsWithCategoryBuddy {
    /** 好友ID */
    private String uid;
    /** QQ号 */
    private Long userId;
    /** QID */
    private String qid;
    /** 唯一ID / uin */
    private String uin;
    /** 昵称（文档字段） */
    private String nickname;
    /** 昵称（旧 NT 字段） */
    private String nick;
    /** 备注 */
    private String remark;
    /** 年龄 */
    private Integer age;
    /** 等级 */
    private Integer level;
    /** 邮箱 */
    @JsonProperty("eMail")
    private String eMail;
    /**  */
    @JsonProperty("richTime")
    private Integer richTime;
    /** 长昵称 */
    @JsonProperty("longNick")
    private String longNick;
    /** 头像URL */
    @JsonProperty("avatarUrl")
    private String avatarUrl;
    /** 生日年 */
    private Integer birthdayYear;
    /** 生日月 */
    private Integer birthdayMonth;
    /** 生日日 */
    private Integer birthdayDay;
    /** 性别，male / female / unknown */
    private String sex;
    /**  */
    @JsonProperty("topTime")
    private String topTime;
    /** 是否被屏蔽 */
    @JsonProperty("isBlock")
    private Boolean isBlock;
    /** 是否开启消息免打扰 */
    @JsonProperty("isMsgDisturb")
    private Boolean isMsgDisturb;
    /** 是否开启特别关心 */
    @JsonProperty("isSpecialCareOpen")
    private Boolean isSpecialCareOpen;
    /** 是否开启特别关心区域 */
    @JsonProperty("isSpecialCareZone")
    private Boolean isSpecialCareZone;
    /** 铃声 */
    @JsonProperty("ringId")
    private String ringId;
    /** 状态 */
    private Integer status;
    /**  */
    @JsonProperty("qidianMasterFlag")
    private Integer qidianMasterFlag;
    /**  */
    @JsonProperty("qidianCrewFlag")
    private Integer qidianCrewFlag;
    /**  */
    @JsonProperty("qidianCrewFlag2")
    private Integer qidianCrewFlag2;
    /**  */
    @JsonProperty("extStatus")
    private Integer extStatus;
    /** 分类ID */
    @JsonProperty("categoryId")
    private Integer categoryId;
    /**  */
    @JsonProperty("onlyChat")
    private Boolean onlyChat;
    /**  */
    @JsonProperty("qzoneNotWatch")
    private Boolean qzoneNotWatch;
    /**  */
    @JsonProperty("qzoneNotWatched")
    private Boolean qzoneNotWatched;
    /** 是否为会员 */
    @JsonProperty("vipFlag")
    private Boolean vipFlag;
    /** 是否为年度会员 */
    @JsonProperty("yearVipFlag")
    private Boolean yearVipFlag;
    /** 是否为超级会员 */
    @JsonProperty("svipFlag")
    private Boolean svipFlag;
    /** 会员等级 */
    @JsonProperty("vipLevel")
    private Integer vipLevel;
    /**  */
    @JsonProperty("isZPlanCoupleOpen")
    private Boolean isZPlanCoupleOpen;
    /**  */
    @JsonProperty("zplanCoupleSceneId")
    private Integer zplanCoupleSceneId;
    /**  */
    @JsonProperty("teenagerFlag")
    private Integer teenagerFlag;
    /**  */
    @JsonProperty("studyFlag")
    private Boolean studyFlag;
    /**  */
    @JsonProperty("pendantId")
    private String pendantId;
    /**  */
    @JsonProperty("vipNameColorId")
    private String vipNameColorId;

    public LLOBUserSex getSex() {
      return LLOBUserSex.strOf(this.sex);
    }
  }

}
