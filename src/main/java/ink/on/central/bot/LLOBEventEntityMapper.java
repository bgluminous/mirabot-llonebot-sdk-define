package ink.on.central.bot;

import ink.on.central.bot.entity.event.meta.LLOBEventMetaHeartbeat;
import ink.on.central.bot.entity.event.meta.LLOBEventMetaLifeCycle;
import ink.on.central.bot.entity.event.msg.LLOBEventMessage;
import ink.on.central.bot.entity.event.notice.*;
import ink.on.central.bot.entity.event.request.LLOBEventRequestFriendAdd;
import ink.on.central.bot.entity.event.request.LLOBEventRequestGroupRequest;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 事件实体类映射枚举
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
public class LLOBEventEntityMapper {
  /** 事件映射表 */
  private static final ConcurrentHashMap<String, Class<?>> mapperEntity = new ConcurrentHashMap<>();

  static {
    // 未知事件
    mapperEntity.put("raw", String.class);

    // 消息事件
    mapperEntity.put("message", LLOBEventMessage.class);

    // 好友申请事件
    mapperEntity.put("friend", LLOBEventRequestFriendAdd.class);
    // 申请加群事件
    mapperEntity.put("group_request", LLOBEventRequestGroupRequest.class);

    // 撤回戳一戳事件
    mapperEntity.put("poke_recall", LLOBEventNoticePokeRecall.class);
    // 好友消息撤回事件
    mapperEntity.put("friend_recall", LLOBEventNoticeFriendRecall.class);
    // 好友添加事件
    mapperEntity.put("friend_add", LLOBEventNoticeFriendAdd.class);
    // 名片点赞事件
    mapperEntity.put("profile_like", LLOBEventNoticeProfileLike.class);
    // 群文件上传事件
    mapperEntity.put("group_upload", LLOBEventNoticeGroupUpload.class);
    // 群解散事件
    mapperEntity.put("group_dismiss", LLOBEventNoticeGroupDismiss.class);
    // 群成员新增事件
    mapperEntity.put("group_increase", LLOBEventNoticeGroupIncrease.class);
    // 群成员减少事件
    mapperEntity.put("group_decrease", LLOBEventNoticeGroupDecrease.class);
    // 群头衔事件
    mapperEntity.put("notify", LLOBEventNoticeGroupTitle.class);
    // 群名片事件
    mapperEntity.put("group_card", LLOBEventNoticeGroupCard.class);
    // 群消息贴表情事件
    mapperEntity.put("group_msg_emoji_like", LLOBEventNoticeGroupMsgEmojiLike.class);
    // 群消息撤回事件
    mapperEntity.put("group_recall", LLOBEventNoticeGroupRecall.class);
    // 群管理员事件
    mapperEntity.put("group_admin", LLOBEventNoticeGroupAdmin.class);
    // 群禁言事件
    mapperEntity.put("group_ban", LLOBEventNoticeGroupBan.class);
    // 群精华事件
    mapperEntity.put("essence", LLOBEventNoticeEssence.class);
    // 闪传文件事件
    mapperEntity.put("flash_file", LLOBEventNoticeFlashFile.class);

    // 心跳事件
    mapperEntity.put("heartbeat", LLOBEventMetaHeartbeat.class);
    // 生命周期事件
    mapperEntity.put("lifecycle", LLOBEventMetaLifeCycle.class);
  }

  /**
   * 解析事件Json数据到事件实体类
   *
   * @param node 数据Map
   *
   * @return 解析后的事件实体类
   */
  public static Class<?> analyze(@NotNull Map<String, String> node) {
    String postType = node.get("post_type");
    String postSpType;
    switch (postType) {
      case "message" -> postSpType = node.get("message_type");
      case "request" -> postSpType = node.get("request_type");
      case "notice" -> postSpType = node.get("notice_type");
      case "meta_event" -> postSpType = node.get("meta_event_type");
      default -> postSpType = "raw";
    }
    return mapperEntity.get(postSpType);
  }

}
