package org.example.spring.daos.mysql.bill.table.enumerate;

import cn.hutool.core.util.EnumUtil;

public enum BillSubInfoStatus {
    PENDING_PAYMENT("1", "待付款"),
    PAID("2", "已付款"),
    CANCELLED("3", "已取消"),
    REFUNDED("4", "已退款"),
    ;
    private String value;
    private String name;

    BillSubInfoStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static BillSubInfoStatus get(String value) {
        return EnumUtil.likeValueOf(BillSubInfoStatus.class, value);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
