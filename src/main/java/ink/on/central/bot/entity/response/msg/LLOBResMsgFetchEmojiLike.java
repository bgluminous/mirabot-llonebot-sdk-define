package ink.on.central.bot.entity.response.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取表情回应详情 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Msg#FETCH_EMOJI_LIKE
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBResMsgFetchEmojiLike {
  /** 表情回应列表 */
  @JsonProperty("emojiLikesList")
  private EmojiLike[] emojiLikesList;
  /** 分页游标 */
  private String cookie;
  /** 是否最后一页 */
  @JsonProperty("isLastPage")
  private Boolean isLastPage;
  /** 是否第一页 */
  @JsonProperty("isFirstPage")
  private Boolean isFirstPage;

  @Accessors(chain = true)
  @Data
  public static class EmojiLike {
    /** QQ 号 */
    @JsonProperty("tinyId")
    private String tinyId;
    /** 昵称 */
    @JsonProperty("nickName")
    private String nickName;
    /** 头像 URL */
    @JsonProperty("headUrl")
    private String headUrl;
  }
}
