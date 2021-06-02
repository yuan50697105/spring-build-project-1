package org.example.spring.repositories.commons.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum CustomerContractStatus {
    UNSIGNED("1", "未签约"),
    SIGNED("2", "已签约");
    private final String value;
    private final String name;


    CustomerContractStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static CustomerContractStatus get(String value) {
        return EnumUtil.likeValueOf(CustomerContractStatus.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(CustomerContractStatus::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(getValue(name)).map(CustomerContractStatus::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}