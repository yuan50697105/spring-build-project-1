package org.example.spring.daos.mysql.patient.table.enumerate;

import cn.hutool.core.util.EnumUtil;
import jdk.nashorn.internal.ir.Optimistic;

import java.util.Optional;

public enum Marriage {
    MARRIED("1", "已婚"),
    UNMARRIED("2", "未婚"),
    ;
    private final String value;
    private final String name;

    Marriage(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Marriage get(String value) {
        return EnumUtil.likeValueOf(Marriage.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(Marriage::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(Marriage::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
