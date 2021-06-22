package org.example.spring.repositories.commons.enumerate;

import cn.hutool.core.util.EnumUtil;

import java.util.Optional;

public enum CheckDepartmentType {
    ORDINARY_INSPECTION("1", "一般检查"),
    INTERNAL_MEDICINE("2", "内科"),
    LABORATORY("3", "检验科"),
    COLOR_DOPPLER("4", "彩超"),
    ;
    private String value;
    private String name;

    CheckDepartmentType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static CheckDepartmentType get(String value) {
        return EnumUtil.likeValueOf(CheckDepartmentType.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(CheckDepartmentType::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(CheckDepartmentType::getName).orElse(null);
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
