package ink.on.central.bot.entity.response.file;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 重新分享闪传文件返回实体 LLOneBot扩展 (此 API 需要 LLBot 7.11.0 以上版本)
 *
 * @author BGLuminous
 * @see LLOBAPIType.File#RESHARE_FLASH_FILE
 * @since 1.9.0-20260326
 */
@Accessors(chain = true)
@Data
public class LLOBResFileReshareFlash {
  /** 文件集合ID */
  private String fileSetId;
  /** 分享链接 */
  private String shareLink;
  /** 过期时间 */
  private Long expireTime;
}
