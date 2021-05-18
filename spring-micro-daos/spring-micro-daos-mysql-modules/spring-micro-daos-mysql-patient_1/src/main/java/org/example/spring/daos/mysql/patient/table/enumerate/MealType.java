package org.example.spring.daos.mysql.patient.table.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum MealType {
    PUBLIC("1", "综合"),
    PROFESSION("2", "职业"),
    HEALTH("3", "健康"),
    SPECIAL("4", "专用"),
    VIP("5", "VIP"),
    ;
    private final String value;
    private final String name;

    MealType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static MealType get(String value) {
        return EnumUtil.likeValueOf(MealType.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(MealType::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(MealType::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
