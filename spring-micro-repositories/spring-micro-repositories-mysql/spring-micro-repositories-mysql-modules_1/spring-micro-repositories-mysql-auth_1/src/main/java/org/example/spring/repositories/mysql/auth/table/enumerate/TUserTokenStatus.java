package org.example.spring.repositories.commons.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

/**
 * 用户token
 */
public enum TUserTokenStatus {
    VALID("1", "有效"),
    INVALID("0", "无效"),
    ;
    private String value;
    private String name;

    TUserTokenStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static TUserTokenStatus get(String value) {
        return EnumUtil.likeValueOf(TUserTokenStatus.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(TUserTokenStatus::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(TUserTokenStatus::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
