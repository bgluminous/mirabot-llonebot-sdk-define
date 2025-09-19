package ink.on.central.bot.entity.response.system;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取版本信息 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see LLOBAPIType#GET_VERSION_INFO
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResSystemGetVersionInfo {
  /** 名称 */
  private String appName;
  /** 版本 */
  private String appVersion;
  /** 协议版本 */
  private String protocolVersion;
}
