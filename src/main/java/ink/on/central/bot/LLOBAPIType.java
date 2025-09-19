package ink.on.central.bot;

import ink.on.central.bot.entity.request.group.*;
import ink.on.central.bot.entity.request.msg.*;
import ink.on.central.bot.entity.request.other.*;
import ink.on.central.bot.entity.request.system.*;
import ink.on.central.bot.entity.request.unclassified.*;
import ink.on.central.bot.entity.request.user.*;
import ink.on.central.bot.entity.response.group.*;
import ink.on.central.bot.entity.response.msg.*;
import ink.on.central.bot.entity.response.other.*;
import ink.on.central.bot.entity.response.system.LLOBResSystemGetCookies;
import ink.on.central.bot.entity.response.system.LLOBResSystemGetLoginInfo;
import ink.on.central.bot.entity.response.system.LLOBResSystemGetVersionInfo;
import ink.on.central.bot.entity.response.user.*;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

/**
 * API实体类映射枚举
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @since 1.0.0-20250912
 */
public enum LLOBAPIType {

  // Friend
  /** 发送好友赞 */
  SEND_LIKE("send_like", LLOBSendUserLike.class, String.class),
  /** 获取好友列表 LLOneBot扩展 */
  GET_FRIEND_LIST("get_friend_list", LLOBSendUserGetFriendList.class, LLOBResUserGetFriendList.class),
  /** 获取好友列表（带分组） LLOneBot扩展 */
  GET_FRIENDS_WITH_CATEGORY("get_friends_with_category", LLOBSendUserGetFriendsWithCategory.class, LLOBResUserGetFriendsWithCategory.class),
  /** 删除好友 LLOneBot扩展 */
  DELETE_FRIEND("delete_friend", LLOBSendUserDeleteFriend.class, String.class),
  /** 处理加好友请求 */
  SET_FRIEND_ADD_REQUEST("set_friend_add_request", LLOBSendUserSetFriendAddRequest.class, String.class),
  /** 设置好友备注 LLOneBot扩展 */
  SET_FRIEND_REMARK("set_friend_remark", LLOBSendUserSetFriendRemark.class, String.class),
  /** 获取好友或群友信息 LLOneBot扩展 */
  GET_STRANGER_INFO("get_stranger_info", LLOBSendUserGetStrangerInfo.class, LLOBResUserGetStrangerInfo.class),
  /** 设置QQ头像 LLOneBot扩展 */
  SET_QQ_AVATAR("set_qq_avatar", LLOBSendUserSetQQAvatar.class, LLOBResUserGetQQAvatar.class),
  /** 好友戳一戳（双击头像） LLOneBot扩展 */
  FRIEND_POKE("friend_poke", LLOBSendUserFriendPoke.class, String.class),
  /** 上传私聊文件 LLOneBot扩展 */
  UPLOAD_PRIVATE_FILE("upload_private_file", LLOBSendUserUploadPrivateFile.class, String.class),
  /** 获取我赞过谁列表 LLOneBot扩展 */
  GET_PROFILE_LIKE("get_profile_like", LLOBSendUserGetProfileLike.class, LLOBResUserGetProfileLike.class),
  /** 获取谁赞过我列表 LLOneBot扩展 */
  GET_PROFILE_LIKE_ME("get_profile_like_me", LLOBSendUserGetProfileLikeMe.class, LLOBResUserGetProfileLikeMe.class),
  /** 获取官方机器人QQ号范围 LLOneBot扩展 */
  GET_ROBOT_UIN_RANGE("get_robot_uin_range", LLOBSendUserGetRobotUinRange.class, LLOBResUserGetRobotUinRange.class),
  /** 移动好友分组 LLOneBot扩展 */
  SET_FRIEND_CATEGORY("set_friend_category", LLOBSendUserSetFriendCategory.class, String.class),
  /** 获取QQ头像 LLOneBot扩展 */
  GET_QQ_AVATAR("get_qq_avatar", LLOBSendUserGetQQAvatar.class, LLOBResUserGetQQAvatar.class),
  /** 获取私聊文件资源链接 LLOneBot扩展 */
  GET_PRIVATE_FILE_URL("get_private_file_url", LLOBSendUserGetPrivateFileUrl.class, LLOBResUserGetPrivateFileUrl.class),


  // Group
  /** 获取群列表 */
  GET_GROUP_LIST("get_group_list", LLOBSendGroupGetList.class, String.class),
  /** 获取群信息 */
  GET_GROUP_INFO("get_group_info", LLOBSendGroupGetInfo.class, LLOBResGroupGetInfo.class),
  /** 获取群成员列表 */
  GET_GROUP_MEMBER_LIST("get_group_member_list", LLOBSendGroupGetMemberList.class, String.class),
  /** 获取群成员信息 */
  GET_GROUP_MEMBER_INFO("get_group_member_info", LLOBSendGroupGetMemberInfo.class, LLOBResGroupGetMemberInfo.class),
  /** 群员戳一戳（双击头像） LLOneBot扩展 */
  GROUP_POKE("group_poke", LLOBSendGroupPoke.class, String.class),
  /** 获取群系统消息 LLOneBot扩展 */
  GET_GROUP_SYSTEM_MSG("get_group_system_msg", LLOBSendGroupGetSystemMsg.class, LLOBResGroupGetSystemMsg.class),
  /** 处理加群请求／邀请 */
  SET_GROUP_ADD_REQUEST("set_group_add_request", LLOBSendGroupSetAddRequest.class, String.class),
  /** 退出群组 */
  SET_GROUP_LEAVE("set_group_leave", LLOBSendGroupSetLeave.class, String.class),
  /** 群组设置管理员 */
  SET_GROUP_ADMIN("set_group_admin", LLOBSendGroupSetAdmin.class, String.class),
  /** 设置群名片（群备注） */
  SET_GROUP_CARD("set_group_card", LLOBSendGroupSetCard.class, String.class),
  /** 群组单人禁言 */
  SET_GROUP_BAN("set_group_ban", LLOBSendGroupSetBan.class, String.class),
  /** 群组全员禁言 */
  SET_GROUP_WHOLE_BAN("set_group_whole_ban", LLOBSendGroupSetWholeBan.class, String.class),
  /** 获取被禁言群员列表 LLOneBot扩展 */
  GET_GROUP_SHUT_LIST("get_group_shut_list", LLOBSendGroupGetGroupShutList.class, String.class),
  /** 设置群名 */
  SET_GROUP_NAME("set_group_name", LLOBSendGroupSetName.class, String.class),
  /** 群组踢人 */
  SET_GROUP_KICK("set_group_kick", LLOBSendGroupSetKick.class, String.class),
  /** 设置群组专属头衔 */
  SET_GROUP_SPECIAL_TITLE("set_group_special_title", LLOBSendGroupSetSpecialTitle.class, String.class),
  /** 获取群荣誉信息 */
  GET_GROUP_HONOR_INFO("get_group_honor_info", LLOBSendGroupGetHonorInfo.class, LLOBResGroupGetHonorInfo.class),
  /** 获取群精华消息 LLOneBot扩展 */
  GET_ESSENCE_MSG_LIST("get_essence_msg_list", LLOBSendGroupGetEssenceMsgList.class, String.class),
  /** 设置群精华消息 LLOneBot扩展 */
  SET_ESSENCE_MSG("set_essence_msg", LLOBSendGroupSetEssenceMsg.class, String.class),
  /** 删除群精华消息 LLOneBot扩展 */
  DELETE_ESSENCE_MSG("delete_essence_msg", LLOBSendGroupDeleteEssenceMsg.class, String.class),
  /** 获取群根目录文件列表 LLOneBot扩展 */
  GET_GROUP_ROOT_FILES("get_group_root_files", LLOBSendGroupGetRootFiles.class, LLOBResGroupGetRootFiles.class),
  /** 上传群文件 LLOneBot扩展 */
  UPLOAD_GROUP_FILE("upload_group_file", LLOBSendGroupUploadFile.class, LLOBResGroupUploadFile.class),
  /** 删除群文件 LLOneBot扩展 */
  DELETE_GROUP_FILE("delete_group_file", LLOBSendGroupDeleteFile.class, String.class),
  /** 创建群文件文件夹 LLOneBot扩展 */
  CREATE_GROUP_FILE_FOLDER("create_group_file_folder", LLOBSendGroupCreateFileFolder.class, String.class),
  /** 删除群文件文件夹 LLOneBot扩展 */
  DELETE_GROUP_FOLDER("delete_group_folder", LLOBSendGroupDeleteFileFolder.class, String.class),
  /** 获取群文件资源链接 LLOneBot扩展 */
  GET_GROUP_FILE_URL("get_group_file_url", LLOBSendGroupGetFileUrl.class, LLOBResGroupGetFileUrl.class),
  /** 获取群 @全体成员 剩余次数 LLOneBot扩展 */
  GET_GROUP_AT_ALL_REMAIN("get_group_at_all_remain", LLOBSendGroupGetAtAllRemain.class, LLOBResGroupGetAtAllRemain.class),
  /** 发送群公告 LLOneBot扩展 */
  SEND_GROUP_NOTICE("_send_group_notice", LLOBSendGroupNotice.class, String.class),
  /** 获取群公告 LLOneBot扩展 */
  GET_GROUP_NOTICE("_get_group_notice", LLOBSendGroupGetNotice.class, LLOBResGroupGetNotice.class),
  /** 群打卡 LLOneBot扩展 */
  SEND_GROUP_SIGN("send_group_sign", LLOBSendGroupSign.class, String.class),
  /** 设置群消息接受方式 LLOneBot扩展 */
  SET_GROUP_MSG_MASK("set_group_msg_mask", LLOBSendGroupSetMsgMask.class, String.class),
  /** 设置群备注 LLOneBot扩展 */
  SET_GROUP_REMARK("set_group_remark", LLOBSendGroupSetRemark.class, String.class),
  /** 获取已过滤的加群通知 LLOneBot扩展 */
  GET_GROUP_IGNORE_ADD_REQUEST("get_group_ignore_add_request", LLOBSendGroupGetIgnoreAddRequest.class, String.class),
  /** 获取群子目录文件列表 LLOneBot扩展 */
  GET_GROUP_FILES_BY_FOLDER("get_group_files_by_folder", LLOBSendGroupGetFilesByFolder.class, LLOBResGroupGetFilesByFolder.class),
  /** 重命名群文件文件夹名 LLOneBot扩展 */
  RENAME_GROUP_FILE_FOLDER("rename_group_file_folder", LLOBSendGroupRenameFilesFolder.class, String.class),

  // Message
  /** 发送消息 合并了 [send_private_msg 发送私聊消息] 和 [send_group_msg 发送群消息] */
  @Deprecated(since = "OneBot-11协议兼容，推荐使用 SEND_PRIVATE_MSG 和 SEND_GROUP_MSG")
  SEND_MSG("send_msg", LLOBSendMsgSendMsg.class, LLOBResMsgSendMsg.class),
  /** 发送私聊消息 */
  SEND_PRIVATE_MSG("send_private_msg", LLOBSendMsgSendPrivateMsg.class, LLOBResMsgSendPrivateMsg.class),
  /** 发送群消息 */
  SEND_GROUP_MSG("send_group_msg", LLOBSendMsgSendGroupMsg.class, LLOBResMsgSendGroupMsg.class),
  /** 转发单条好友消息 LLOneBot扩展 */
  FORWARD_FRIEND_SINGLE_MSG("forward_friend_single_msg", LLOBSendMsgForwardFriendSingle.class, String.class),
  /** 转发单条群消息 LLOneBot扩展 */
  FORWARD_GROUP_SINGLE_MSG("forward_group_single_msg", LLOBSendMsgForwardGroupSingle.class, String.class),
  /** 获取消息 */
  GET_MSG("get_msg", LLOBSendMsgGet.class, LLOBResMsgGetMsg.class),
  /** 撤回消息 */
  DELETE_MSG("delete_msg", LLOBSendMsgDelete.class, String.class),
  /** 获取消息文件详情 */
  GET_FILE("get_file", LLOBSendMsgGetFile.class, LLOBResMsgGetFile.class),
  /** 获取图片 */
  GET_IMAGE("get_image", LLOBSendMsgGetImage.class, LLOBResMsgGetImage.class),
  /** 获取语音 */
  GET_RECORD("get_record", LLOBSendMsgGetRecord.class, LLOBResMsgGetRecord.class),
  /** 表情回应消息 LLOneBot扩展 */
  SET_MSG_EMOJI_LIKE("set_msg_emoji_like", LLOBSendMsgSetEmojiLike.class, String.class),
  /** 取消表情回应消息 LLOneBot扩展 */
  UNSET_MSG_EMOJI_LIKE("unset_msg_emoji_like", LLOBSendMsgUnsetEmojiLike.class, String.class),
  /** 获取好友历史消息记录 */
  GET_FRIEND_MSG_HISTORY("get_friend_msg_history", LLOBSendMsgGetFriendHistory.class, LLOBResMsgGetFriendMsgHistory.class),
  /** 获取群历史消息记录 */
  GET_GROUP_MSG_HISTORY("get_group_msg_history", LLOBSendMsgGetGroupHistory.class, LLOBResMsgGetGroupMsgHistory.class),
  /** 获取转发消息详情 */
  GET_FORWARD_MSG("get_forward_msg", LLOBSendMsgGetForwardMsg.class, LLOBResMsgGetForwardMsg.class),
  /** 标记消息为已读 LLOneBot扩展 */
  MARK_MSG_AS_READ("mark_msg_as_read", LLOBSendMsgMarkAsRead.class, String.class),
  /** 语音消息转文字 LLOneBot扩展 @开发中 */
  VOICE_MSG_TO_TEXT("voice_msg_to_text", LLOBSendMsgVoiceToText.class, LLOBResMsgVoiceMsgToText.class),
  /** 发送群 AI 语音消息 LLOneBot扩展 */
  SEND_GROUP_AI_RECORD("send_group_ai_record", LLOBSendMsgGroupAiRecord.class, LLOBResMsgSendGroupAiRecord.class),

  //System
  /** 获取登录号信息 */
  GET_LOGIN_INFO("get_login_info", LLOBSendSystemGetLoginInfo.class, LLOBResSystemGetLoginInfo.class),
  /** 获取版本信息 */
  GET_VERSION_INFO("get_version_info", LLOBSendSystemGetVersionInfo.class, LLOBResSystemGetVersionInfo.class),
  /** 获取运行状态 */
  GET_STATUS("get_status", LLOBSendSystemGetStatus.class, String.class),
  /** 清理缓存 （该 API 在 LLOneBot 5.0+ 之后失效） */
  @Deprecated(since = "LLOneBot 5.0+")
  CLEAN_CACHE("clean_cache", LLOBSendSystemCleanCache.class, String.class),
  /** 获取 Cookies */
  GET_COOKIES("get_cookies", LLOBSendSystemGetCookies.class, LLOBResSystemGetCookies.class),
  /** 设置在线状态 LLOneBot扩展 */
  SET_ONLINE_STATUS("set_online_status", LLOBSendSystemSetOnlineStatus.class, String.class),
  /** 重启 OneBot（该 API 在 LLOneBot 5.0+ 之后失效） */
  @Deprecated(since = "LLOneBot 5.0+")
  SET_RESTART("set_restart", LLOBSendSystemSetRestart.class, String.class),

  // Other
  /** 图片OCR LLOneBot扩展 */
  OCR_IMAGE("ocr_image", LLOBSendOtherOcrImage.class, LLOBResOtherOcrImage.class),
  /** 上传闪传文件 LLOneBot扩展 开发中暂未实现（此 API 需要 LLOneBot 5.3.0 以上版本） */
  UPLOAD_FLASH_FILE("upload_flash_file", LLOBSendOtherUploadFlashFile.class, LLOBResOtherUploadFlashFile.class),
  /** 下载闪传文件 LLOneBot扩展 开发中暂未实现（此 API 需要 LLOneBot 5.3.0 以上版本） */
  DOWNLOAD_FLASH_FILE("download_flash_file", LLOBSendOtherDownloadFlashFile.class, String.class),
  /** 获取闪传文件详情 LLOneBot扩展 开发中暂未实现（此 API 需要 LLOneBot 5.3.0 以上版本） */
  GET_FLASH_FILE_INFO("get_flash_file_info", LLOBSendOtherGetFlashFileInfo.class, LLOBResOtherGetFlashFileInfo.class),
  /** 获取图片rkey LLOneBot扩展 */
  GET_RKEY("get_rkey", LLOBSendOtherGetRkey.class, LLOBResOtherGetRkey.class),
  /** 获取推荐表情 LLOneBot扩展 */
  GET_RECOMMEND_FACE("get_recommend_face", LLOBSendOtherGetRecommendFace.class, LLOBResOtherGetRecommendFace.class),
  /** 获取收藏表情 LLOneBot扩展 */
  FETCH_CUSTOM_FACE("fetch_custom_face", LLOBSendOtherFetchCustomFace.class, String.class),
  /** 下载文件到bot所在 LLOneBot扩展 */
  DOWNLOAD_FILE("download_file", LLOBSendOtherDownloadFile.class, String.class),
  /** 获取群 Ai 语音可用声色列表 LLOneBot扩展 */
  GET_AI_CHARACTERS("get_ai_characters", LLOBSendOtherGetAiCharacters.class, LLOBResOtherGetAiCharacters.class),

  // UnClassified
  /** 群组匿名 */
  @Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
  SET_GROUP_ANONYMOUS("set_group_anonymous", LLOBSendUnclassifiedSetGroupAnonymous.class, String.class),
  /** 群组匿名用户禁言 */
  @Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
  SET_GROUP_ANONYMOUS_BAN("set_group_anonymous_ban", LLOBSendUnclassifiedSetGroupAnonymousBan.class, String.class),
  /** 获取QQ相关接口凭证 */
  @Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
  GET_CREDENTIAL("get_credentials", LLOBSendUnclassifiedGetCredential.class, String.class),
  /** 获取 CSRF Token */
  @Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
  GET_CSRF_TOKEN("get_csrf_token", LLOBSendUnclassifiedGetCsrfToken.class, String.class),
  /** 检查是否可以发送图片 */
  @Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
  CAN_SEND_IMAGE("can_send_image", LLOBSendUnclassifiedCanSendImage.class, String.class),
  /** 检查是否可以发送语音 */
  @Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
  CAN_SEND_VOICE("can_send_voice", LLOBSendUnclassifiedCanSendVoice.class, String.class);

  /** API URL */
  @Getter
  private final String apiUrl;
  /** 请求实体类 */
  @Getter
  private final Class<?> reqEntityClass;
  /** 响应实体类 */
  @Getter
  private final Class<?> resEntityClass;

  LLOBAPIType(String apiUrl, Class<?> reqEntityClass, Class<?> resEntityClass) {
    this.apiUrl = apiUrl;
    this.reqEntityClass = reqEntityClass;
    this.resEntityClass = resEntityClass;
  }

  @NotNull
  public static LLOBAPIType urlOf(@NotNull String apiUrl) {
    for (LLOBAPIType mapper : LLOBAPIType.values()) {
      if (mapper.getApiUrl().equals(apiUrl)) {
        return mapper;
      }
    }
    throw new IllegalArgumentException("未知的API: " + apiUrl);
  }

}
