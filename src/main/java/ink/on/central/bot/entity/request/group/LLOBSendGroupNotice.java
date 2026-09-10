package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 发送群公告 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see LLOBAPIType.Group#SEND_GROUP_NOTICE
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupNotice {
  /** 群号 */
  private Long groupId;
  /** 群公告内容 */
  private String content;
  /**
   * 图片
   *
   * <p>file://d:/1.png
   * <p>https://???
   * <p>base64://xxx
   */
  private String image;
  /** 是否置顶 */
  private Boolean pinned;
  /** 是否需要确认 */
  private Boolean confirmRequired;
  /** 是否引导修改群名片 */
  private Boolean isShowEditCard;
  /** 是否弹出提示 */
  private Boolean tipWindow;
  /** 是否发送给新成员 */
  private Boolean sendNewMember;
}
