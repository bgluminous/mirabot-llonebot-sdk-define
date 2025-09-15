package ink.on.central.bot.entity.response.group;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群公告 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIConstant.Group#GET_GROUP_NOTICE
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResGroupGetNotice {
  /** 公告id */
  private Long senderId;
  /** 公告内容 */
  private Message message;
  /** 发布时间 */
  private Long publishTime;

  @Accessors(chain = true)
  @Data
  public static class Message {
    /** 文本 */
    private String text;
    /** 图片 */
    private Images[] images;
  }

  /** 图片 */
  @Accessors(chain = true)
  @Data
  public static class Images {
    /** 图片id */
    private String id;
    /** 图片宽度 */
    private String width;
    /** 图片高度 */
    private String height;
  }
}
