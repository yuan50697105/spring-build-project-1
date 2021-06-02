package org.example.spring.repositories.commons.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum CustomerOrderStatus {
    CREATED("1", "已创建"),
    PROCESSING("2", "进行中"),
    SETTLED("3", "已结算"),
    UNSETTLEMENT("4", "未结算"),
    ;
    private final String value;
    private final String name;


    CustomerOrderStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static CustomerOrderStatus get(String value) {
        return EnumUtil.likeValueOf(CustomerOrderStatus.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(CustomerOrderStatus::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(getValue(name)).map(CustomerOrderStatus::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}