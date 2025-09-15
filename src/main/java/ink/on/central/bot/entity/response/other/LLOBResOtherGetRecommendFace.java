package ink.on.central.bot.entity.response.other;

import ink.on.central.bot.LLOBAPIConstant;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 获取推荐表情 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250724
 * @see LLOBAPIConstant.Other#GET_RECOMMEND_FACE
 * @since 1.0.0-20250724
 */
@Accessors(chain = true)
@Data
public class LLOBResOtherGetRecommendFace {
  /** 表情链接列表 */
  private List<String> url;
}
