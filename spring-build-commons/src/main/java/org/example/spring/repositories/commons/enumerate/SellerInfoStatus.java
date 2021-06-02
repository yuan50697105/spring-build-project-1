package org.example.spring.repositories.commons.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum SellerInfoStatus {
    WORK("1", "普通客户"),
    RESIGN("2", "团队客户"),
    ;
    private final String value;
    private final String name;


    SellerInfoStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static SellerInfoStatus get(String value) {
        return EnumUtil.likeValueOf(SellerInfoStatus.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(SellerInfoStatus::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(getValue(name)).map(SellerInfoStatus::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}