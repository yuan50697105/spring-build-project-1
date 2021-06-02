package org.example.spring.repositories.commons.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum CustomerInfoType {
    ORDINARY("1", "普通客户"),
    TEAM("2", "团队客户"),
    PROFESSIONAL("2", "职业客户"),
    VIP("2", "VIP客户"),

    ;
    private final String value;
    private final String name;


    CustomerInfoType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static CustomerInfoType get(String value) {
        return EnumUtil.likeValueOf(CustomerInfoType.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(CustomerInfoType::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(getValue(name)).map(CustomerInfoType::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}