package org.example.spring.repositories.mysql.table.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum ItemSource {
    MEAL("1", "套餐"),
    OPTIONAL("2", "自选"),
    ADDITIONAL("2", "科室加项"),
    ;
    private final String value;
    private final String name;

    ItemSource(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static ItemSource get(String value) {
        return EnumUtil.likeValueOf(ItemSource.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(ItemSource::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(ItemSource::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
