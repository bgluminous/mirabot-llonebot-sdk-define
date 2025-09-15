package ink.on.central.bot.entity.types;

import lombok.Getter;

public enum LLOBGroupRole {
  OWNER("owner"),
  ADMINISTRATOR("administrator"),
  MEMBER("member");

  @Getter
  private final String str;

  LLOBGroupRole(String str) {
    this.str = str;
  }

  public static LLOBGroupRole strOf(String str) {
    if (str != null && !str.isEmpty()) {
      for (LLOBGroupRole value : values()) {
        if (value.str.equals(str.toLowerCase())) {
          return value;
        }
      }
    }
    return MEMBER;
  }

}
