package org.example.spring.repositories.commons.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;


public enum ResourceType {
    MENU("1", "菜单"),
    SUBMENU("2", "子菜单"),
    BUTTON("3", "按钮"),
    ;
    private final String value;
    private final String name;

    ResourceType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static ResourceType get(String value) {
        return EnumUtil.likeValueOf(ResourceType.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(ResourceType::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(ResourceType::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
