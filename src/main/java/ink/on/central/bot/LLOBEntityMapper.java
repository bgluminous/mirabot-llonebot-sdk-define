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
import ink.on.central.bot.entity.response.system.*;
import ink.on.central.bot.entity.response.user.*;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

/**
 * 实体类映射枚举
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @since 1.0.0-20250912
 */
@SuppressWarnings("deprecation")
public enum LLOBEntityMapper {
  /** Friend */
  SEND_LIKE("send_like", LLOBSendUserLike.class, String.class),
  GET_FRIEND_LIST("get_friend_list", LLOBSendUserGetFriendList.class, LLOBResUserGetFriendList.class),
  GET_FRIENDS_WITH_CATEGORY("get_friends_with_category", LLOBSendUserGetFriendsWithCategory.class, LLOBResUserGetFriendsWithCategory.class),
  DELETE_FRIEND("delete_friend", LLOBSendUserDeleteFriend.class, String.class),
  SET_FRIEND_ADD_REQUEST("set_friend_add_request", LLOBSendUserSetFriendAddRequest.class, String.class),
  SET_FRIEND_REMARK("set_friend_remark", LLOBSendUserSetFriendRemark.class, String.class),
  GET_STRANGER_INFO("get_stranger_info", LLOBSendUserGetStrangerInfo.class, LLOBResUserGetStrangerInfo.class),
  SET_QQ_AVATAR("set_qq_avatar", LLOBSendUserSetQQAvatar.class, LLOBResUserGetQQAvatar.class),
  FRIEND_POKE("friend_poke", LLOBSendUserFriendPoke.class, String.class),
  UPLOAD_PRIVATE_FILE("upload_private_file", LLOBSendUserUploadPrivateFile.class, String.class),
  GET_PROFILE_LIKE("get_profile_like", LLOBSendUserGetProfileLike.class, LLOBResUserGetProfileLike.class),
  GET_PROFILE_LIKE_ME("get_profile_like_me", LLOBSendUserGetProfileLikeMe.class, LLOBResUserGetProfileLikeMe.class),
  GET_ROBOT_UIN_RANGE("get_robot_uin_range", LLOBSendUserGetRobotUinRange.class, LLOBResUserGetRobotUinRange.class),
  SET_FRIEND_CATEGORY("set_friend_category", LLOBSendUserSetFriendCategory.class, String.class),
  GET_QQ_AVATAR("get_qq_avatar", LLOBSendUserGetQQAvatar.class, LLOBResUserGetQQAvatar.class),
  GET_PRIVATE_FILE_URL("get_private_file_url", LLOBSendUserGetPrivateFileUrl.class, LLOBResUserGetPrivateFileUrl.class),

  /** Group */
  GET_GROUP_LIST("get_group_list", LLOBSendGroupGetList.class, String.class),
  GET_GROUP_INFO("get_group_info", LLOBSendGroupGetInfo.class, LLOBResGroupGetInfo.class),
  GET_GROUP_MEMBER_LIST("get_group_member_list", LLOBSendGroupGetMemberList.class, String.class),
  GET_GROUP_MEMBER_INFO("get_group_member_info", LLOBSendGroupGetMemberInfo.class, LLOBResGroupGetMemberInfo.class),
  GROUP_POKE("group_poke", LLOBSendGroupPoke.class, String.class),
  GET_GROUP_SYSTEM_MSG("get_group_system_msg", LLOBSendGroupGetSystemMsg.class, LLOBResGroupGetSystemMsg.class),
  SET_GROUP_ADD_REQUEST("set_group_add_request", LLOBSendGroupSetAddRequest.class, String.class),
  SET_GROUP_LEAVE("set_group_leave", LLOBSendGroupSetLeave.class, String.class),
  SET_GROUP_ADMIN("set_group_admin", LLOBSendGroupSetAdmin.class, String.class),
  SET_GROUP_CARD("set_group_card", LLOBSendGroupSetCard.class, String.class),
  SET_GROUP_BAN("set_group_ban", LLOBSendGroupSetBan.class, String.class),
  SET_GROUP_WHOLE_BAN("set_group_whole_ban", LLOBSendGroupSetWholeBan.class, String.class),
  GET_GROUP_SHUT_LIST("get_group_shut_list", LLOBSendGroupGetGroupShutList.class, String.class),
  SET_GROUP_NAME("set_group_name", LLOBSendGroupSetName.class, String.class),
  SET_GROUP_KICK("set_group_kick", LLOBSendGroupSetKick.class, String.class),
  SET_GROUP_SPECIAL_TITLE("set_group_special_title", LLOBSendGroupSetSpecialTitle.class, String.class),
  GET_GROUP_HONOR_INFO("get_group_honor_info", LLOBSendGroupGetHonorInfo.class, LLOBResGroupGetHonorInfo.class),
  GET_ESSENCE_MSG_LIST("get_essence_msg_list", LLOBSendGroupGetEssenceMsgList.class, String.class),
  SET_ESSENCE_MSG("set_essence_msg", LLOBSendGroupSetEssenceMsg.class, String.class),
  DELETE_ESSENCE_MSG("delete_essence_msg", LLOBSendGroupDeleteEssenceMsg.class, String.class),
  GET_GROUP_ROOT_FILES("get_group_root_files", LLOBSendGroupGetRootFiles.class, LLOBResGroupGetRootFiles.class),
  UPLOAD_GROUP_FILE("upload_group_file", LLOBSendGroupUploadFile.class, LLOBResGroupUploadFile.class),
  DELETE_GROUP_FILE("delete_group_file", LLOBSendGroupDeleteFile.class, String.class),
  CREATE_GROUP_FILE_FOLDER("create_group_file_folder", LLOBSendGroupCreateFileFolder.class, String.class),
  DELETE_GROUP_FOLDER("delete_group_folder", LLOBSendGroupDeleteFileFolder.class, String.class),
  GET_GROUP_FILE_URL("get_group_file_url", LLOBSendGroupGetFileUrl.class, LLOBResGroupGetFileUrl.class),
  GET_GROUP_AT_ALL_REMAIN("get_group_at_all_remain", LLOBSendGroupGetAtAllRemain.class, LLOBResGroupGetAtAllRemain.class),
  SEND_GROUP_NOTICE("_send_group_notice", LLOBSendGroupNotice.class, String.class),
  GET_GROUP_NOTICE("_get_group_notice", LLOBSendGroupGetNotice.class, LLOBResGroupGetNotice.class),
  SEND_GROUP_SIGN("send_group_sign", LLOBSendGroupSign.class, String.class),
  SET_GROUP_MSG_MASK("set_group_msg_mask", LLOBSendGroupSetMsgMask.class, String.class),
  SET_GROUP_REMARK("set_group_remark", LLOBSendGroupSetRemark.class, String.class),
  GET_GROUP_IGNORE_ADD_REQUEST("get_group_ignore_add_request", LLOBSendGroupGetIgnoreAddRequest.class, String.class),
  GET_GROUP_FILES_BY_FOLDER("get_group_files_by_folder", LLOBSendGroupGetFilesByFolder.class, LLOBResGroupGetFilesByFolder.class),
  RENAME_GROUP_FILE_FOLDER("rename_group_file_folder", LLOBSendGroupRenameFilesFolder.class, String.class),

  /** Message */
  SEND_MSG("send_msg", LLOBSendMsgSendMsg.class, LLOBResMsgSendMsg.class),
  SEND_PRIVATE_MSG("send_private_msg", LLOBSendMsgSendPrivateMsg.class, LLOBResMsgSendPrivateMsg.class),
  SEND_GROUP_MSG("send_group_msg", LLOBSendMsgSendGroupMsg.class, LLOBResMsgSendGroupMsg.class),
  FORWARD_FRIEND_SINGLE_MSG("forward_friend_single_msg", LLOBSendMsgForwardFriendSingle.class, String.class),
  FORWARD_GROUP_SINGLE_MSG("forward_group_single_msg", LLOBSendMsgForwardGroupSingle.class, String.class),
  GET_MSG("get_msg", LLOBSendMsgGet.class, LLOBResMsgGetMsg.class),
  DELETE_MSG("delete_msg", LLOBSendMsgDelete.class, String.class),
  GET_FILE("get_file", LLOBSendMsgGetFile.class, LLOBResMsgGetFile.class),
  GET_IMAGE("get_image", LLOBSendMsgGetImage.class, LLOBResMsgGetImage.class),
  GET_RECORD("get_record", LLOBSendMsgGetRecord.class, LLOBResMsgGetRecord.class),
  SET_MSG_EMOJI_LIKE("set_msg_emoji_like", LLOBSendMsgSetEmojiLike.class, String.class),
  UNSET_MSG_EMOJI_LIKE("unset_msg_emoji_like", LLOBSendMsgUnsetEmojiLike.class, String.class),
  GET_FRIEND_MSG_HISTORY("get_friend_msg_history", LLOBSendMsgGetFriendHistory.class, LLOBResMsgGetFriendMsgHistory.class),
  GET_GROUP_MSG_HISTORY("get_group_msg_history", LLOBSendMsgGetGroupHistory.class, LLOBResMsgGetGroupMsgHistory.class),
  GET_FORWARD_MSG("get_forward_msg", LLOBSendMsgGetForwardMsg.class, LLOBResMsgGetForwardMsg.class),
  MARK_MSG_AS_READ("mark_msg_as_read", LLOBSendMsgMarkAsRead.class, String.class),
  VOICE_MSG_TO_TEXT("voice_msg_to_text", LLOBSendMsgVoiceToText.class, LLOBResMsgVoiceMsgToText.class),
  SEND_GROUP_AI_RECORD("send_group_ai_record", LLOBSendMsgGroupAiRecord.class, LLOBResMsgSendGroupAiRecord.class),

  /** System */
  GET_LOGIN_INFO("get_login_info", LLOBSendSystemGetLoginInfo.class, LLOBResSystemGetLoginInfo.class),
  GET_VERSION_INFO("get_version_info", LLOBSendSystemGetVersionInfo.class, LLOBResSystemGetVersionInfo.class),
  GET_STATUS("get_status", LLOBSendSystemGetStatus.class, String.class),
  CLEAN_CACHE("clean_cache", LLOBSendSystemCleanCache.class, String.class),
  GET_COOKIES("get_cookies", LLOBSendSystemGetCookies.class, LLOBResSystemGetCookies.class),
  SET_ONLINE_STATUS("set_online_status", LLOBSendSystemSetOnlineStatus.class, String.class),
  SET_RESTART("set_restart", LLOBSendSystemSetRestart.class, String.class),

  /** Other */
  OCR_IMAGE("ocr_image", LLOBSendOtherOcrImage.class, LLOBResOtherOcrImage.class),
  UPLOAD_FLASH_FILE("upload_flash_file", LLOBSendOtherUploadFlashFile.class, LLOBResOtherUploadFlashFile.class),
  DOWNLOAD_FLASH_FILE("download_flash_file", LLOBSendOtherDownloadFlashFile.class, String.class),
  GET_FLASH_FILE_INFO("get_flash_file_info", LLOBSendOtherGetFlashFileInfo.class, LLOBResOtherGetFlashFileInfo.class),
  GET_RKEY("get_rkey", LLOBSendOtherGetRkey.class, LLOBResOtherGetRkey.class),
  GET_RECOMMEND_FACE("get_recommend_face", LLOBSendOtherGetRecommendFace.class, LLOBResOtherGetRecommendFace.class),
  FETCH_CUSTOM_FACE("fetch_custom_face", LLOBSendOtherFetchCustomFace.class, String.class),
  DOWNLOAD_FILE("download_file", LLOBSendOtherDownloadFile.class, String.class),
  GET_AI_CHARACTERS("get_ai_characters", LLOBSendOtherGetAiCharacters.class, LLOBResOtherGetAiCharacters.class),

  /** UnClassified */
  SET_GROUP_ANONYMOUS("set_group_anonymous", LLOBSendUnclassifiedSetGroupAnonymous.class, String.class),
  SET_GROUP_ANONYMOUS_BAN("set_group_anonymous_ban", LLOBSendUnclassifiedSetGroupAnonymousBan.class, String.class),
  GET_CREDENTIAL("get_credentials", LLOBSendUnclassifiedGetCredential.class, String.class),
  GET_CSRF_TOKEN("get_csrf_token", LLOBSendUnclassifiedGetCsrfToken.class, String.class),
  CAN_SEND_IMAGE("can_send_image", LLOBSendUnclassifiedCanSendImage.class, String.class),
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

  LLOBEntityMapper(String apiUrl, Class<?> reqEntityClass, Class<?> resEntityClass) {
    this.apiUrl = apiUrl;
    this.reqEntityClass = reqEntityClass;
    this.resEntityClass = resEntityClass;
  }

  @NotNull
  public static LLOBEntityMapper urlOf(@NotNull String apiUrl) {
    for (LLOBEntityMapper mapper : LLOBEntityMapper.values()) {
      if (mapper.getApiUrl().equals(apiUrl)) {
        return mapper;
      }
    }
    throw new IllegalArgumentException("未知的API: " + apiUrl);
  }

}
