package ink.on.central.bot.entity.request.other;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取推荐表情 LLOneBot扩展
 *
 * @author BGLuminous
 * @version 1.0.0-20250721
 * @see LLOBAPIType#GET_RECOMMEND_FACE
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendOtherGetRecommendFace {
  /** 搜索关键词 */
  private String word;
}
