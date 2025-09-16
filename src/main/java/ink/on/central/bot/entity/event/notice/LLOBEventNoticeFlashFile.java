package ink.on.central.bot.entity.event.notice;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 闪传文件事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventNoticeFlashFile extends LLOBEventRoot {
  /**  */
  private String noticeType;
  /** 子类型 */
  private String subType;
  /** 闪传文件标题 */
  private String title;
  /** 分享链接 */
  private String shareLink;
  /** 文件集 ID */
  private String fileSetId;
  /** 已下载大小（字节） */
  private Integer downloadedSize;
  /** 已上传大小（字节） */
  private Integer uploadedSize;
  /** 总大小（字节） */
  private Integer totalSize;
  /** 传输速度（字节/秒） */
  private Integer speed;
  /** 剩余时间（秒） */
  private Integer remainSeconds;
  /** 文件列表 */
  private Files[] files;

  public SubType getSubType() {
    for (SubType value : SubType.values()) {
      if (value.name().equalsIgnoreCase(this.subType)) {
        return value;
      }
    }
    throw new IllegalArgumentException("未知的闪传文件事件子类型! [%s]".formatted(this.subType));
  }

  /** 文件属性 */
  @Accessors(chain = true)
  @Data
  public static class Files {
    /** 文件名 */
    private String name;
    /** 文件大小 */
    private Integer size;
    /** 本地文件路径 */
    private String path;
  }

  /** 子类型 */
  public enum SubType {
    /** 已下载 */
    DOWNLOADED,
    /** 下载中 */
    DOWNLOADING,
    /** 文件上传完成 */
    UPLOADED,
    /** 文件上传中 */
    UPLOADING,
  }

}
