package org.example.spring.repositories.commons.enumerate;

import cn.hutool.core.util.EnumUtil;
import lombok.Getter;

import java.util.Optional;


@Getter
public enum BillLogType {
    /**
     * 付款
     */
    PAYMENT("1", "payment", "付款"),
    /**
     * 退款
     */
    REFUND("2", "refund", "退款"),
    ;
    private final String value;
    private final String code;
    private final String name;

    BillLogType(String value, String code, String name) {
        this.value = value;
        this.code = code;
        this.name = name;
    }

    public static BillLogType get(String value) {
        return EnumUtil.likeValueOf(BillLogType.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(BillLogType::getValue).orElse(null);
    }

    public static String getCode(String code) {
        return Optional.ofNullable(get(code)).map(BillLogType::getCode).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(BillLogType::getName).orElse(null);
    }
}
