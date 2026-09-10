package ink.on.central.bot.entity.request.system;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 扫描二维码 实体类（此 API 需要需要7.2.0及以上版本）
 *
 * @author BGLuminous
 * @see LLOBAPIType.System#SCAN_QRCODE
 * @since 1.9.0-20260326
 */
@Accessors(chain = true)
@Data
public class LLOBSendSystemScanQrcode {
  /**
   * 文件,支持三种格式:
   *
   * <p>file://d:/1.png
   * <p>https://???
   * <p>base64://xxx
   */
  private String file;
}
