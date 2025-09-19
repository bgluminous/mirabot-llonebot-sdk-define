package ink.on.central.bot.entity.response.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import ink.on.central.bot.LLOBAPIType;
import ink.on.central.bot.entity.types.LLOBUserSex;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 获取我赞过谁列表 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see LLOBAPIType#GET_PROFILE_LIKE
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResUserGetProfileLike {
  /** 下一页的start，-1表示没有下一页了 */
  @JsonProperty("nextStart")
  private Integer nextStart;
  private List<LLOBResUserGetProfileLikeUser> users;

  @Accessors(chain = true)
  @Data
  public static class LLOBResUserGetProfileLikeUser {
    /** 唯一ID */
    private String uid;
    /**  */
    private Integer src;
    /** 最后时间 */
    @JsonProperty("latestTime")
    private Long latestTime;
    /** 点赞数量 */
    private Integer count;
    /** 礼物数量 */
    @JsonProperty("giftCount")
    private Integer giftCount;
    /**  */
    @JsonProperty("customId")
    private Integer customId;
    /**  */
    @JsonProperty("lastCharged")
    private Long lastCharged;
    /**  */
    @JsonProperty("bAvailableCnt")
    private Integer bAvailableCnt;
    /**  */
    @JsonProperty("bTodayVotedCnt")
    private Integer bTodayVotedCnt;
    /** 昵称 */
    private String nick;
    /** 性别 */
    private Integer gender;
    /** 年龄 */
    private Integer age;
    /** 是否好友 */
    @JsonProperty("isFriend")
    private boolean isFriend;
    /** 是否会员 */
    @JsonProperty("isvip")
    private boolean isVip;
    /** 是否超级会员 */
    @JsonProperty("isSvip")
    private boolean isSvip;
    /** 联合ID */
    private Long uin;

    public LLOBUserSex getGender() {
      return LLOBUserSex.codeOf(gender);
    }
  }
}
