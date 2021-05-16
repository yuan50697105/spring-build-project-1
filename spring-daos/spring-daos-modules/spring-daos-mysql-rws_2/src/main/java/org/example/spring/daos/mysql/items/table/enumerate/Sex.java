package org.example.spring.daos.mysql.items.table.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum Sex {
    MAN("0", "男"),
    WOMAN("1", "女");
    private final String value;
    private final String name;

    Sex(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static Sex get(String value) {
        return EnumUtil.likeValueOf(Sex.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(Sex::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(Sex::getName).orElse(null);
    }
}
