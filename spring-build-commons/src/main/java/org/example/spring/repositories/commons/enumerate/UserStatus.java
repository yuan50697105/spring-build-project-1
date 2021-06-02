package org.example.spring.repositories.commons.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;


public enum UserStatus {
    NORMAL("1", "正常"),
    DEACTIVATE("0", "停用"),
    ;
    private final String value;
    private final String name;

    UserStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static UserStatus get(String value) {
        return EnumUtil.likeValueOf(UserStatus.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(UserStatus::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(UserStatus::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
