package org.example.spring.daos.mysql.table.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum TMealType {
    COMMON("0", "通用"),
    TEAM("1", "团队"),
    VIP("2", "VIP"),
    PROFESSION("3", "职业"),

    ;
    private final String value;
    private final String name;

    TMealType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static TMealType get(String value) {
        return EnumUtil.likeValueOf(TMealType.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(TMealType::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(TMealType::getName).orElse(null);
    }
}
