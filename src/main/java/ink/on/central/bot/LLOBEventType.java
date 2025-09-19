package ink.on.central.bot;

import ink.on.central.bot.entity.event.meta.LLOBEventMetaHeartbeat;
import ink.on.central.bot.entity.event.meta.LLOBEventMetaLifeCycle;
import ink.on.central.bot.entity.event.msg.LLOBEventGroupMessage;
import ink.on.central.bot.entity.event.msg.LLOBEventPrivateMessage;
import ink.on.central.bot.entity.event.notice.*;
import ink.on.central.bot.entity.event.request.LLOBEventRequestFriendAdd;
import ink.on.central.bot.entity.event.request.LLOBEventRequestGroupAdd;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * 事件实体类映射枚举
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
public enum LLOBEventType {
  // message
  /** 消息事件 */
  MESSAGE_PRIVATE("message", "private", LLOBEventPrivateMessage.class),
  MESSAGE_GROUP("message", "group", LLOBEventGroupMessage.class),

  // request
  /** 好友申请事件 */
  REQUEST_FRIEND("request", "friend", LLOBEventRequestFriendAdd.class),
  /** 申请加群事件 */
  REQUEST_GROUP("request", "group_request", LLOBEventRequestGroupAdd.class),

  // notice
  /** 撤回戳一戳事件 */
  NOTICE_POKE_RECALL("notice", "poke_recall", LLOBEventNoticePokeRecall.class),
  /** 好友消息撤回事件 */
  NOTICE_FRIEND_RECALL("notice", "friend_recall", LLOBEventNoticeFriendRecall.class),
  /** 好友添加事件 */
  NOTICE_FRIEND_ADD("notice", "friend_add", LLOBEventNoticeFriendAdd.class),
  /** 名片点赞事件 */
  NOTICE_PROFILE_LIKE("notice", "profile_like", LLOBEventNoticeProfileLike.class),
  /** 群文件上传事件 */
  NOTICE_GROUP_UPLOAD("notice", "group_upload", LLOBEventNoticeGroupUpload.class),
  /** 群解散事件 */
  NOTICE_GROUP_DISMISS("notice", "group_dismiss", LLOBEventNoticeGroupDismiss.class),
  /** 群成员新增事件 */
  NOTICE_GROUP_INCREASE("notice", "group_increase", LLOBEventNoticeGroupIncrease.class),
  /** 群成员减少事件 */
  NOTICE_GROUP_DECREASE("notice", "group_decrease", LLOBEventNoticeGroupDecrease.class),
  /** 群头衔事件 */
  NOTICE_GROUP_TITLE("notice", "notify", LLOBEventNoticeGroupTitle.class),
  /** 群名片事件 */
  NOTICE_GROUP_CARD("notice", "group_card", LLOBEventNoticeGroupCard.class),
  /** 群消息贴表情事件 */
  NOTICE_GROUP_MSG_EMOJI_LIKE("notice", "group_msg_emoji_like", LLOBEventNoticeGroupMsgEmojiLike.class),
  /** 群消息撤回事件 */
  NOTICE_GROUP_RECALL("notice", "group_recall", LLOBEventNoticeGroupRecall.class),
  /** 群管理员事件 */
  NOTICE_GROUP_ADMIN("notice", "group_admin", LLOBEventNoticeGroupAdmin.class),
  /** 群禁言事件 */
  NOTICE_GROUP_BAN("notice", "group_ban", LLOBEventNoticeGroupBan.class),
  /** 群精华事件 */
  NOTICE_ESSENCE("notice", "essence", LLOBEventNoticeEssence.class),
  /** 闪传文件事件 */
  NOTICE_FLASH_FILE("notice", "flash_file", LLOBEventNoticeFlashFile.class),

  // meta_event
  /** 心跳事件 */
  META_EVENT_HEARTBEAT("meta_event", "heartbeat", LLOBEventMetaHeartbeat.class),
  /** 生命周期事件 */
  META_EVENT_LIFECYCLE("meta_event", "lifecycle", LLOBEventMetaLifeCycle.class),

  /** 未知事件 */
  RAW("unknown", "unknown", String.class);


  /** 事件类型事件 */
  @Getter
  public final String postType;
  /** 事件子类型事件 */
  @Getter
  public final String postSpType;
  /** 事件实体类事件 */
  @Getter
  public final Class<?> eventEntityClass;

  /** 构造函数 */
  LLOBEventType(String postType, String postSpType, Class<?> eventEntityClass) {
    this.postType = postType;
    this.postSpType = postSpType;
    this.eventEntityClass = eventEntityClass;
  }

  /** 根据子类型获取枚举 */
  public static LLOBEventType spTypeOf(String postSpType) {
    for (LLOBEventType value : LLOBEventType.values()) {
      if (value.postSpType.equals(postSpType)) {
        return value;
      }
    }
    return RAW;
  }

  /**
   * 解析事件Json数据到事件实体类
   *
   * @param node 数据Map
   *
   * @return 解析后的事件实体类
   */
  public static LLOBEventType analyze(@NotNull Map<String, Object> node) {
    String postType = node.get("post_type").toString();
    String postSpType;
    switch (postType) {
      case "message" -> postSpType = node.get("message_type").toString();
      case "request" -> postSpType = node.get("request_type").toString();
      case "notice" -> postSpType = node.get("notice_type").toString();
      case "meta_event" -> postSpType = node.get("meta_event_type").toString();
      default -> postSpType = "unknown";
    }
    return LLOBEventType.spTypeOf(postSpType);
  }

}
