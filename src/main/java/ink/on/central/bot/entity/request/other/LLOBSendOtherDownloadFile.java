package ink.on.central.bot.entity.request.other;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 下载文件到bot所在 LLOneBot扩展
 *
 * @author BGLuminous
 * @version 1.0.0-20250721
 * @see LLOBAPIConstant.Other#DOWNLOAD_FILE
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendOtherDownloadFile {
  /** 文件下载链接 */
  private String url;
  /** 文件下载链接的 Base64 编码 */
  private String base64;
  /** 文件名 */
  private String name;
  /** 请求头 */
  private List<String> headers;
}
