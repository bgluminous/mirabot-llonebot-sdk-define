package ink.on.central.bot.entity.event.notice;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ValueDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

/**
 * 戳一戳 / 撤回戳一戳事件实体类
 *
 * @author BGLuminous
 * @version 1.9.2-20260910
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventNoticePokeRecall extends LLOBEventRoot {
  /**  */
  private String noticeType;
  /** 子类型 */
  private String subType;
  /** 群号 */
  private Long groupId;
  /** 用户ID */
  private Long userId;
  /** 被戳的目标用户 */
  private Long targetId;
  /** 原始戳一戳信息（QQ 灰条 items） */
  @JsonDeserialize(using = RawInfoDeserializer.class)
  private RawInfo[] rawInfo;

  public SubType getSubType() {
    for (SubType value : SubType.values()) {
      if (value.name().equalsIgnoreCase(this.subType)) {
        return value;
      }
    }
    throw new IllegalArgumentException("未知的戳一戳事件子类型! [%s]".formatted(this.subType));
  }

  /** 戳一戳灰条片段 */
  @Accessors(chain = true)
  @Data
  public static class RawInfo {
    /** 片段类型，如 qq / nor / img */
    private String type;
    /** 用户 UID（type=qq） */
    private String uid;
    /** 颜色 */
    private String col;
    /** 跳转链接 */
    private String jp;
    /** 昵称 */
    private String nm;
    /** 类型附加参数 */
    private String tp;
    /** 文本（type=nor） */
    private String txt;
    /** 图片地址（type=img） */
    private String src;
  }

  /**
   * LLOneBot 戳一戳上报 raw_info 为 items 数组；撤回戳一戳可能是带 items 的对象；文档示例则为 XML 字符串。
   */
  public static class RawInfoDeserializer extends ValueDeserializer<RawInfo[]> {
    @Override
    public RawInfo[] deserialize(JsonParser p, DeserializationContext ctxt) {
      JsonNode node = ctxt.readTree(p);
      if (node == null || node.isNull() || node.isMissingNode()) {
        return null;
      }
      if (node.isArray()) {
        return ctxt.readTreeAsValue(node, RawInfo[].class);
      }
      JsonNode items = node.get("items");
      if (items != null && items.isArray()) {
        return ctxt.readTreeAsValue(items, RawInfo[].class);
      }
      return new RawInfo[0];
    }
  }

  /** 子类型 */
  public enum SubType {
    /** 戳一戳 */
    POKE,
    /** 撤回戳一戳 */
    POKE_RECALL
  }

}
