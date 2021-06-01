package org.example.spring.repositories.mysql.table.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum Bear {
    BRED("1", "已育"),
    INFERTILE("2", "未育"),
    ;
    private String value;
    private String name;

    Bear(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Bear get(String value) {
        return EnumUtil.likeValueOf(Bear.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(Bear::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(Bear::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
