package org.example.spring.repositories.mysql.table.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;


public enum TResourceType {
    MENU("1", "菜单"),
    SUBMENU("2", "子菜单"),
    BUTTON("3", "按钮"),
    ;
    private final String value;
    private final String name;

    TResourceType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static TResourceType get(String value) {
        return EnumUtil.likeValueOf(TResourceType.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(TResourceType::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(TResourceType::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
