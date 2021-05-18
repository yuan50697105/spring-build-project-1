package org.example.spring.daos.mysql.patient.table.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum FeeItemType {
    COMMON("1", "普通"),
    ADDITIONAL("2", "加项"),
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
