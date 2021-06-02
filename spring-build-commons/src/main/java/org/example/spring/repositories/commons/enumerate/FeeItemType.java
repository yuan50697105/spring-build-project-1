package org.example.spring.repositories.commons.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum FeeItemType {
    COMMON("0", "通用"),
    DELIVERY("1", "外送"),
    PROFESSION("2", "职业"),
    HEALTH("3", "健康"),
    ;
    private final String value;
    private final String name;

    FeeItemType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static FeeItemType get(String value) {
        return EnumUtil.likeValueOf(FeeItemType.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(FeeItemType::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(FeeItemType::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
