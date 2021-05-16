package org.example.spring.daos.mysql.items.table.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum TFeeItemType {
    COMMON("0", "通用"),
    DELIVERY("1", "外送"),
    PROFESSION("2", "职业"),
    HEALTH("3", "健康"),

    ;
    private final String value;
    private final String name;

    TFeeItemType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static TFeeItemType get(String value) {
        return EnumUtil.likeValueOf(TFeeItemType.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(TFeeItemType::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(TFeeItemType::getName).orElse(null);
    }
}
