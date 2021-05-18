package org.example.spring.daos.mysql.table.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum TCustomerContractStatus {
    UNSIGNED("1", "未签约"),
    SIGNED("2", "已签约");
    private final String value;
    private final String name;


    TCustomerContractStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static TCustomerContractStatus get(String value) {
        return EnumUtil.likeValueOf(TCustomerContractStatus.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(TCustomerContractStatus::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(getValue(name)).map(TCustomerContractStatus::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}