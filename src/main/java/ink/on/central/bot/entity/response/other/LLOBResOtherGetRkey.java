package ink.on.central.bot.entity.response.other;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取获取图片rkey LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see LLOBAPIConstant.Other#GET_RKEY
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResOtherGetRkey {
  /** 私钥 */
  private String privateKey;
  /** 公钥 */
  private String groupKey;
  /** 过期时间 */
  private Long expiredTime;
  /** 更新时间 */
  private String updatedTime;
}
