package ink.on.central.bot.entity.request.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 设置群头像 LLOneBot扩展
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Group#SET_GROUP_PORTRAIT
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBSendGroupSetPortrait {
  /** 群号 */
  private Long groupId;
  /**
   * 头像文件 URI
   *
   * <p>file://d:/1.png
   * <p>https://???
   * <p>base64://xxx
   */
  private String file;
}
