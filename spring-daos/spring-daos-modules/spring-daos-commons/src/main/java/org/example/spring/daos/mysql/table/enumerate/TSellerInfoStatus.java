package org.example.spring.daos.mysql.table.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum TSellerInfoStatus {
    WORK("1", "普通客户"),
    RESIGN("2", "团队客户"),
    ;
    private final String value;
    private final String name;


    TSellerInfoStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static TSellerInfoStatus get(String value) {
        return EnumUtil.likeValueOf(TSellerInfoStatus.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(TSellerInfoStatus::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(getValue(name)).map(TSellerInfoStatus::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}