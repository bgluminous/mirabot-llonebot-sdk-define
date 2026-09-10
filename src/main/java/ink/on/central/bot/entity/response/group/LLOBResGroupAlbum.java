package ink.on.central.bot.entity.response.group;

import ink.on.central.bot.LLOBAPIType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 群相册 LLOneBot扩展 返回实体类
 *
 * @author BGLuminous
 * @version 1.9.0-20260910
 * @see LLOBAPIType.Group#GET_GROUP_ALBUM_LIST
 * @since 1.9.0-20260910
 */
@Accessors(chain = true)
@Data
public class LLOBResGroupAlbum {
  /** 相册 ID */
  private String albumId;
  /** 所有者 */
  private String owner;
  /** 相册名称 */
  private String name;
  /** 相册描述 */
  private String desc;
  /** 创建时间 */
  private String createTime;
  /** 修改时间 */
  private String modifyTime;
  /** 最后上传时间 */
  private String lastUploadTime;
  /** 上传数量 */
  private String uploadNumber;
  /** 置顶标记 */
  private String topFlag;
  /** 业务类型 */
  private Integer busiType;
  /** 状态 */
  private Integer status;
  /** 是否允许分享 */
  private Boolean allowShare;
  /** 是否订阅 */
  private Boolean isSubscribe;
  /** bitmap */
  private String bitmap;
  /** 是否共享相册 */
  private Boolean isShareAlbum;
  /** 空间相册类型 */
  private Integer qzAlbumType;
  /** 封面类型 */
  private Integer coverType;
  /** 默认描述 */
  private String defaultDesc;
  /** 排序类型 */
  private Integer sortType;
  /** 创建者 */
  private Creator creator;

  @Accessors(chain = true)
  @Data
  public static class Creator {
    private String uid;
    private String nick;
    private String uin;
    private Boolean isSweet;
    private Boolean isSpecial;
    private Boolean isSuperLike;
    private String customId;
  }
}
