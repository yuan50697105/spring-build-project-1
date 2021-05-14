package org.example.spring.daos.mysql.bill.table.enumerate;

import cn.hutool.core.util.EnumUtil;


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

    public String getValue() {
        return value;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
