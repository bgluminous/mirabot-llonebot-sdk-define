package ink.on.central.bot;

/**
 * API接口存放类
 * <br>
 * <a href="https://llonebot.apifox.cn/">查看LLOneBot文档</a>
 * <br>
 * <a href="https://github.com/botuniverse/onebot-11/blob/master/api/README.md">查看OneBot文档</a>
 *
 * @author BGLuminous
 * @version 1.0.0-20250711
 * @since 1.0.0-20250711
 */
public class LLOBAPIConstant {

  public static class User {
    /** 发送好友赞 */
    public static final String SEND_LIKE = "send_like";
    /** 获取好友列表 LLOneBot扩展 */
    public static final String GET_FRIEND_LIST = "get_friend_list";
    /** 获取好友列表（带分组） LLOneBot扩展 */
    public static final String GET_FRIENDS_WITH_CATEGORY = "get_friends_with_category";
    /** 删除好友 LLOneBot扩展 */
    public static final String DELETE_FRIEND = "delete_friend";
    /** 处理加好友请求 */
    public static final String SET_FRIEND_ADD_REQUEST = "set_friend_add_request";
    /** 设置好友备注 LLOneBot扩展 */
    public static final String SET_FRIEND_REMARK = "set_friend_remark";
    /** 获取好友或群友信息 LLOneBot扩展 */
    public static final String GET_STRANGER_INFO = "get_stranger_info";
    /** 设置QQ头像 LLOneBot扩展 */
    public static final String SET_QQ_AVATAR = "set_qq_avatar";
    /** 好友戳一戳（双击头像） LLOneBot扩展 */
    public static final String FRIEND_POKE = "friend_poke";
    /** 上传私聊文件 LLOneBot扩展 */
    public static final String UPLOAD_PRIVATE_FILE = "upload_private_file";
    /** 获取我赞过谁列表 LLOneBot扩展 */
    public static final String GET_PROFILE_LIKE = "get_profile_like";
    /** 获取谁赞过我列表 LLOneBot扩展 */
    public static final String GET_PROFILE_LIKE_ME = "get_profile_like_me";
    /** 获取官方机器人QQ号范围 LLOneBot扩展 */
    public static final String GET_ROBOT_UIN_RANGE = "get_robot_uin_range";
    /** 移动好友分组 LLOneBot扩展 */
    public static final String SET_FRIEND_CATEGORY = "set_friend_category";
    /** 获取QQ头像 LLOneBot扩展 */
    public static final String GET_QQ_AVATAR = "get_qq_avatar";
    /** 获取私聊文件资源链接 LLOneBot扩展 */
    public static final String GET_PRIVATE_FILE_URL = "get_private_file_url";

    private User() {
    }
  }

  public static class Group {
    /** 获取群列表 */
    public static final String GET_GROUP_LIST = "get_group_list";
    /** 获取群信息 */
    public static final String GET_GROUP_INFO = "get_group_info";
    /** 获取群成员列表 */
    public static final String GET_GROUP_MEMBER_LIST = "get_group_member_list";
    /** 获取群成员信息 */
    public static final String GET_GROUP_MEMBER_INFO = "get_group_member_info";
    /** 群员戳一戳（双击头像） LLOneBot扩展 */
    public static final String GROUP_POKE = "group_poke";
    /** 获取群系统消息 LLOneBot扩展 */
    public static final String GET_GROUP_SYSTEM_MSG = "get_group_system_msg";
    /** 处理加群请求／邀请 */
    public static final String SET_GROUP_ADD_REQUEST = "set_group_add_request";
    /** 退出群组 */
    public static final String SET_GROUP_LEAVE = "set_group_leave";
    /** 群组设置管理员 */
    public static final String SET_GROUP_ADMIN = "set_group_admin";
    /** 设置群名片（群备注） */
    public static final String SET_GROUP_CARD = "set_group_card";
    /** 群组单人禁言 */
    public static final String SET_GROUP_BAN = "set_group_ban";
    /** 群组全员禁言 */
    public static final String SET_GROUP_WHOLE_BAN = "set_group_whole_ban";
    /** 获取被禁言群员列表 LLOneBot扩展 */
    public static final String GET_GROUP_SHUT_LIST = "get_group_shut_list";
    /** 设置群名 */
    public static final String SET_GROUP_NAME = "set_group_name";
    /** 群组踢人 */
    public static final String SET_GROUP_KICK = "set_group_kick";
    /** 设置群组专属头衔 */
    public static final String SET_GROUP_SPECIAL_TITLE = "set_group_special_title";
    /** 获取群荣誉信息 */
    public static final String GET_GROUP_HONOR_INFO = "get_group_honor_info";
    /** 获取群精华消息 LLOneBot扩展 */
    public static final String GET_ESSENCE_MSG_LIST = "get_essence_msg_list";
    /** 设置群精华消息 LLOneBot扩展 */
    public static final String SET_ESSENCE_MSG = "set_essence_msg";
    /** 删除群精华消息 LLOneBot扩展 */
    public static final String DELETE_ESSENCE_MSG = "delete_essence_msg";
    /** 获取群根目录文件列表 LLOneBot扩展 */
    public static final String GET_GROUP_ROOT_FILES = "get_group_root_files";
    /** 上传群文件 LLOneBot扩展 */
    public static final String UPLOAD_GROUP_FILE = "upload_group_file";
    /** 删除群文件 LLOneBot扩展 */
    public static final String DELETE_GROUP_FILE = "delete_group_file";
    /** 创建群文件文件夹 LLOneBot扩展 */
    public static final String CREATE_GROUP_FILE_FOLDER = "create_group_file_folder";
    /** 删除群文件文件夹 LLOneBot扩展 */
    public static final String DELETE_GROUP_FOLDER = "delete_group_folder";
    /** 获取群文件资源链接 LLOneBot扩展 */
    public static final String GET_GROUP_FILE_URL = "get_group_file_url";
    /** 获取群 @全体成员 剩余次数 LLOneBot扩展 */
    public static final String GET_GROUP_AT_ALL_REMAIN = "get_group_at_all_remain";
    /** 发送群公告 LLOneBot扩展 */
    public static final String SEND_GROUP_NOTICE = "_send_group_notice";
    /** 获取群公告 LLOneBot扩展 */
    public static final String GET_GROUP_NOTICE = "_get_group_notice";
    /** 群打卡 LLOneBot扩展 */
    public static final String SEND_GROUP_SIGN = "send_group_sign";
    /** 设置群消息接受方式 LLOneBot扩展 */
    public static final String SET_GROUP_MSG_MASK = "set_group_msg_mask";
    /** 设置群备注 LLOneBot扩展 */
    public static final String SET_GROUP_REMARK = "set_group_remark";
    /** 获取已过滤的加群通知 LLOneBot扩展 */
    public static final String GET_GROUP_IGNORE_ADD_REQUEST = "get_group_ignore_add_request";
    /** 获取群子目录文件列表 LLOneBot扩展 */
    public static final String GET_GROUP_FILES_BY_FOLDER = "get_group_files_by_folder";
    /** 重命名群文件文件夹名 LLOneBot扩展 */
    public static final String RENAME_GROUP_FILE_FOLDER = "rename_group_file_folder";

    private Group() {
    }
  }

  public static class Message {
    /** 发送消息 合并了 [send_private_msg 发送私聊消息] 和 [send_group_msg 发送群消息] */
    @Deprecated(since = "OneBot-11协议兼容，推荐使用 SEND_PRIVATE_MSG 和 SEND_GROUP_MSG")
    public static final String SEND_MSG = "send_msg";
    /** 发送私聊消息 */
    public static final String SEND_PRIVATE_MSG = "send_private_msg";
    /** 发送群消息 */
    public static final String SEND_GROUP_MSG = "send_group_msg";
    /** 转发单条好友消息 LLOneBot扩展 */
    public static final String FORWARD_FRIEND_SINGLE_MSG = "forward_friend_single_msg";
    /** 转发单条群消息 LLOneBot扩展 */
    public static final String FORWARD_GROUP_SINGLE_MSG = "forward_group_single_msg";
    /** 获取消息 */
    public static final String GET_MSG = "get_msg";
    /** 撤回消息 */
    public static final String DELETE_MSG = "delete_msg";
    /** 获取消息文件详情 */
    public static final String GET_FILE = "get_file";
    /** 获取图片 */
    public static final String GET_IMAGE = "get_image";
    /** 获取语音 */
    public static final String GET_RECORD = "get_record";
    /** 表情回应消息 LLOneBot扩展 */
    public static final String SET_MSG_EMOJI_LIKE = "set_msg_emoji_like";
    /** 取消表情回应消息 LLOneBot扩展 */
    public static final String UNSET_MSG_EMOJI_LIKE = "unset_msg_emoji_like";
    /** 获取好友历史消息记录 */
    public static final String GET_FRIEND_MSG_HISTORY = "get_friend_msg_history";
    /** 获取群历史消息记录 */
    public static final String GET_GROUP_MSG_HISTORY = "get_group_msg_history";
    /** 获取转发消息详情 */
    public static final String GET_FORWARD_MSG = "get_forward_msg";
    /** 标记消息为已读 LLOneBot扩展 */
    public static final String MARK_MSG_AS_READ = "mark_msg_as_read";
    /** 语音消息转文字 LLOneBot扩展 @开发中 */
    public static final String VOICE_MSG_TO_TEXT = "voice_msg_to_text";
    /** 发送群 AI 语音消息 LLOneBot扩展 */
    public static final String SEND_GROUP_AI_RECORD = "send_group_ai_record";

    private Message() {
    }
  }

  public static class System {
    /** 获取登录号信息 */
    public static final String GET_LOGIN_INFO = "get_login_info";
    /** 获取版本信息 */
    public static final String GET_VERSION_INFO = "get_version_info";
    /** 获取运行状态 */
    public static final String GET_STATUS = "get_status";
    /** 清理缓存 （该 API 在 LLOneBot 5.0+ 之后失效） */
    @Deprecated(since = "LLOneBot 5.0+")
    public static final String CLEAN_CACHE = "clean_cache";
    /** 获取 Cookies */
    public static final String GET_COOKIES = "get_cookies";
    /** 设置在线状态 LLOneBot扩展 */
    public static final String SET_ONLINE_STATUS = "set_online_status";
    /** 重启 OneBot（该 API 在 LLOneBot 5.0+ 之后失效） */
    @Deprecated(since = "LLOneBot 5.0+")
    public static final String SET_RESTART = "set_restart";

    private System() {
    }
  }

  public static class Other {
    /** 图片OCR LLOneBot扩展 */
    public static final String OCR_IMAGE = "ocr_image";
    /** 上传闪传文件 LLOneBot扩展 开发中暂未实现（此 API 需要 LLOneBot 5.3.0 以上版本） */
    public static final String UPLOAD_FLASH_FILE = "upload_flash_file";
    /** 下载闪传文件 LLOneBot扩展 开发中暂未实现（此 API 需要 LLOneBot 5.3.0 以上版本） */
    public static final String DOWNLOAD_FLASH_FILE = "download_flash_file";
    /** 获取闪传文件详情 LLOneBot扩展 开发中暂未实现（此 API 需要 LLOneBot 5.3.0 以上版本） */
    public static final String GET_FLASH_FILE_INFO = "get_flash_file_info";
    /** 获取图片rkey LLOneBot扩展 */
    public static final String GET_RKEY = "get_rkey";
    /** 获取推荐表情 LLOneBot扩展 */
    public static final String GET_RECOMMEND_FACE = "get_recommend_face";
    /** 获取收藏表情 LLOneBot扩展 */
    public static final String FETCH_CUSTOM_FACE = "fetch_custom_face";
    /** 下载文件到bot所在 LLOneBot扩展 */
    public static final String DOWNLOAD_FILE = "download_file";
    /** 获取群 Ai 语音可用声色列表 LLOneBot扩展 */
    public static final String GET_AI_CHARACTERS = "get_ai_characters";

    private Other() {
    }
  }

  public static class UnClassified {
    /** 群组匿名 */
    @Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
    public static final String SET_GROUP_ANONYMOUS = "set_group_anonymous";
    /** 群组匿名用户禁言 */
    @Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
    public static final String SET_GROUP_ANONYMOUS_BAN = "set_group_anonymous_ban";
    /** 获取QQ相关接口凭证 */
    @Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
    public static final String GET_CREDENTIAL = "get_credentials";
    /** 获取 CSRF Token */
    @Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
    public static final String GET_CSRF_TOKEN = "get_csrf_token";
    /** 检查是否可以发送图片 */
    @Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
    public static final String CAN_SEND_IMAGE = "can_send_image";
    /** 检查是否可以发送语音 */
    @Deprecated(since = "OneBot-11协议兼容，不确定是否可用")
    public static final String CAN_SEND_VOICE = "can_send_voice";

    private UnClassified() {
    }
  }

  /** 私有构造方法 */
  private LLOBAPIConstant() {
  }
}
