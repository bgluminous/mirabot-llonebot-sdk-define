package ink.on.central.bot.entity.request.other;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取推荐表情 LLOneBot扩展
 *
 * @author BGLuminous
 * @version 1.0.0-20250721
 * @see ink.on.central.bot.APIConstant.Other#GET_RECOMMEND_FACE
 * @since 1.0.0-20250721
 */
@Accessors(chain = true)
@Data
public class LLOBSendOtherGetRecommendFace {
  /** 搜索关键词 */
  private String word;
}
