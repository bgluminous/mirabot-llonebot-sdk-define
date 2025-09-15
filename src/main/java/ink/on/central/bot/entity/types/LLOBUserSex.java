package ink.on.central.bot.entity.types;

import lombok.Getter;

public enum LLOBUserSex {
  MALE("male", 1),
  FEMALE("female", 2),
  UNKNOWN("unknown", 3);

  @Getter
  private final String str;

  @Getter
  private final Integer code;

  LLOBUserSex(String str, Integer code) {
    this.str = str;
    this.code = code;
  }

  public static LLOBUserSex strOf(String sex) {
    if (sex != null && !sex.isEmpty()) {
      for (LLOBUserSex value : values()) {
        if (value.str.equals(sex.toLowerCase())) {
          return value;
        }
      }
    }
    return UNKNOWN;
  }

  public static LLOBUserSex codeOf(Integer sex) {
    if (sex != null) {
      for (LLOBUserSex value : values()) {
        if (value.code.equals(sex)) {
          return value;
        }
      }
    }
    return UNKNOWN;
  }

}
