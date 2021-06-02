package org.example.spring.repositories.commons.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum TCustomerOrderStatus {
    CREATED("1", "已创建"),
    PROCESSING("2", "进行中"),
    SETTLED("3", "已结算"),
    UNSETTLEMENT("4", "未结算"),
    ;
    private final String value;
    private final String name;


    TCustomerOrderStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static TCustomerOrderStatus get(String value) {
        return EnumUtil.likeValueOf(TCustomerOrderStatus.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(TCustomerOrderStatus::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(getValue(name)).map(TCustomerOrderStatus::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}