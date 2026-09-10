package ink.on.central.bot.entity.response.system;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 扫描二维码 返回实体类（此 API 需要需要7.2.0及以上版本）
 *
 * @author BGLuminous
 * @see LLOBAPIType.System#SCAN_QRCODE
 * @since 1.9.0-20260326
 */
@Accessors(chain = true)
@Data
public class LLOBResSystemScanQrcode {
  /** 二维码内容 */
  private String text;
}
