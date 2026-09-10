package ink.on.central.bot.entity.types;

import lombok.Getter;

public enum LLOBGroupRole {
  OWNER("owner"),
  ADMINISTRATOR("admin"),
  MEMBER("member");

  @Getter
  private final String str;

  LLOBGroupRole(String str) {
    this.str = str;
  }

  public static LLOBGroupRole strOf(String str) {
    if (str != null && !str.isEmpty()) {
      String normalized = str.toLowerCase();
      if ("administrator".equals(normalized)) {
        return ADMINISTRATOR;
      }
      for (LLOBGroupRole value : values()) {
        if (value.str.equals(normalized)) {
          return value;
        }
      }
    }
    return MEMBER;
  }

}
