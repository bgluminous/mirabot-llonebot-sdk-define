package ink.on.central.bot.entity.request.msg;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 获取语音 实体类
 *
 * @author BGLuminous
 * @version 1.0.0-20250722
 * @see ink.on.central.bot.LLOBAPIEntityMapper#GET_RECORD
 * @since 1.0.0-20250722
 */
@Accessors(chain = true)
@Data
public class LLOBSendMsgGetRecord {
  /** 语音文件名 */
  private String file;
  /** 语音文件格式 */
  private String outFormat;
}
