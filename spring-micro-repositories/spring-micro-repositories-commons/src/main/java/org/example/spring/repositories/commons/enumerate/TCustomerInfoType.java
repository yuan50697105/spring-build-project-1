package org.example.spring.repositories.mysql.table.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum TCustomerInfoType {
    ORDINARY("1", "普通客户"),
    TEAM("2", "团队客户"),
    PROFESSIONAL("2", "职业客户"),
    VIP("2", "VIP客户"),

    ;
    private final String value;
    private final String name;


    TCustomerInfoType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static TCustomerInfoType get(String value) {
        return EnumUtil.likeValueOf(TCustomerInfoType.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(TCustomerInfoType::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(getValue(name)).map(TCustomerInfoType::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}