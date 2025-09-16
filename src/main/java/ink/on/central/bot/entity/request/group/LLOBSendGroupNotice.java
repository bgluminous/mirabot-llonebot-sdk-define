package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.entity.request.LLOBGroupBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 发送群公告 LLOneBot扩展 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250718
 * @see ink.on.central.bot.LLOBAPIEntityMapper#SEND_GROUP_NOTICE
 * @since 1.0.0-20250718
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBSendGroupNotice extends LLOBGroupBase {
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
}
