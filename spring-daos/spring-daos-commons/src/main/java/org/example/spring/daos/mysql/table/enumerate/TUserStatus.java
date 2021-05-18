package org.example.spring.daos.mysql.table.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;


public enum TUserStatus {
    NORMAL("1", "正常"),
    DEACTIVATE("0", "停用"),
    ;
    private final String value;
    private final String name;

    TUserStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static TUserStatus get(String value) {
        return EnumUtil.likeValueOf(TUserStatus.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(TUserStatus::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(TUserStatus::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
