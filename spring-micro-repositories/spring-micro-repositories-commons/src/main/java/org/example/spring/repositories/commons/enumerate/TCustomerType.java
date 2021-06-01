package org.example.spring.repositories.mysql.table.enumerate;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@AllArgsConstructor
@Getter
public enum TCustomerType {
    GENERAL("1", "普通客户"),
    VIP_1("2", "VIP一级"),
    ;

    private final String value;
    private final String name;

    public static TCustomerType get(String value) {
        return EnumUtil.likeValueOf(TCustomerType.class, value);
    }


    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(TCustomerType::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(TCustomerType::getName).orElse(null);
    }
}