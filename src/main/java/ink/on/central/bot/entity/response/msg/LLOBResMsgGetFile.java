package ink.on.central.bot.entity.response.msg;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取消息文件详情 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see LLOBAPIType.Msg#GET_FILE
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResMsgGetFile {
  /** 文件位置 */
  private String file;
  /** 文件链接 */
  private String url;
  /** 文件大小 */
  private String fileSize;
  /** 文件名 */
  private String fileName;
}
