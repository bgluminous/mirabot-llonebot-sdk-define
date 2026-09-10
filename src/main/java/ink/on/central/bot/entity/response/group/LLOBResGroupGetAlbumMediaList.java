package ink.on.central.bot.entity.response.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取群相册媒体列表 LLOneBot扩展 返回实体类（此 API 需要 LLBot 7.12.3 及以上版本）
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Group#GET_GROUP_ALBUM_MEDIA_LIST
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBResGroupGetAlbumMediaList {
  /** 相册信息 */
  private LLOBResGroupAlbum album;
  /** 媒体列表 */
  private Media[] mediaList;
  /** 下一页附加信息 */
  private String nextAttachInfo;
  /** 是否还有下一页 */
  private Boolean nextHasMore;

  @Accessors(chain = true)
  @Data
  public static class Media {
    /** 媒体类型 */
    private Integer type;
    /** 描述 */
    private String desc;
    /** 上传者 */
    private String uploader;
    /** 批次 ID */
    private String batchId;
    /** 上传时间 */
    private String uploadTime;
    /** 上传顺序 */
    private Integer uploadOrder;
    /** 拍摄时间 */
    private String shootTime;
    /** 链接 ID */
    private String linkId;
    /** LBS 来源 */
    private Integer lbsSource;
  }
}
