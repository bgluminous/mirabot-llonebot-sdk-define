package ink.on.central.bot.entity.response.group;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群子目录文件列表 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250912
 * @see ink.on.central.bot.LLOBAPIEntityMapper#GET_GROUP_FILES_BY_FOLDER
 * @since 1.0.0-20250912
 */
@Accessors(chain = true)
@Data
public class LLOBResGroupGetFilesByFolder {
  /** 文件列表 */
  private FileEntity[] files;
  /** 文件夹列表 */
  private FolderEntity[] folders;

  /** 文件信息 */
  @Accessors(chain = true)
  @Data
  public static class FileEntity {
    /** 文件类型 */
    private Integer busid;
    /** 过期时间，永久文件恒为0 */
    private Integer deadTime;
    /** 下载次数 */
    private Integer downloadTimes;
    /** 文件 ID */
    private String fileId;
    /** 文件名 */
    private String fileName;
    /** 文件大小 */
    private Integer fileSize;
    /** 群号 */
    private Long groupId;
    /** 最后修改时间 */
    private Long modifyTime;
    /** 上传时间 */
    private Long uploadTime;
    /** 上传者 ID */
    private Long uploader;
    /** 上传者名字 */
    private String uploaderName;
  }

  /** 文件夹信息 */
  @Accessors(chain = true)
  @Data
  public static class FolderEntity {
    /** 创建时间 */
    private Long createTime;
    /** 创建者 */
    private Long creator;
    /** 创建者名字 */
    private String creatorName;
    /** 文件夹 ID */
    private String folderId;
    /** 文件名 */
    private String folderName;
    /** 群号 */
    private Long groupId;
    /** 子文件数量 */
    private Integer totalFileCount;
  }
}
