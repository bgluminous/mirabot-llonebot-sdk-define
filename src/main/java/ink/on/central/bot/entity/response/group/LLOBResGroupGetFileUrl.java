package ink.on.central.bot.entity.response.group;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群文件资源链接 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see ink.on.central.bot.LLOBAPIEntityMapper#GET_GROUP_FILE_URL
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResGroupGetFileUrl {
  /** 文件下载地址 */
  private String url;
}
