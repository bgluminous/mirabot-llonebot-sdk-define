package ink.on.central.bot.entity.event.notice;

import ink.on.central.bot.entity.event.LLOBEventRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 群文件上传事件实体类
 *
 * @author BGLuminous
 * @version 1.1.0-20250915
 * @since 1.1.0-20250915
 */
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class LLOBEventNoticeGroupUpload extends LLOBEventRoot {
  /**  */
  private String noticeType;
  /** 群号 */
  private Long groupId;
  /** 用户ID */
  private Long userId;
  /** 文件列表 */
  private Files[] file;

  /** 文件属性 */
  @Accessors(chain = true)
  @Data
  public static class Files {
    /** 文件ID */
    private String id;
    /** 文件名 */
    private String name;
    /** 文件大小 */
    private Integer size;
    /** 业务ID */
    private Long busid;
  }
}
