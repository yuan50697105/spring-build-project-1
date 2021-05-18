package org.example.spring.daos.mysql.table.enumerate;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@AllArgsConstructor
@Getter
public enum TPatientType {
    PRIVATE("私人", "1", "1"),
    TEAM("团队", "2", "2"),
    COMPLETION("补检", "3", "3"),
    REVIEW("复查", "4", "4");

    private final String name;
    private final String value;
    private final String code;

    public static TPatientType get(String value) {
        return EnumUtil.likeValueOf(TPatientType.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(TPatientType::getValue).orElse(null);
    }

    public static String getName(String value) {
        return Optional.ofNullable(get(value)).map(TPatientType::getName).orElse(null);
    }
}