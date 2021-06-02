package org.example.spring.repositories.commons.enumerate;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@AllArgsConstructor
@Getter
public enum PatientType {
    PRIVATE("1", "私人"),
    TEAM("2", "团队"),
    COMPLETION("3", "补检"),
    REVIEW("4", "复查"),
    ;

    private final String value;
    private final String name;

    public static PatientType get(String value) {
        return EnumUtil.likeValueOf(PatientType.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(PatientType::getValue).orElse(null);
    }

    public static String getName(String value) {
        return Optional.ofNullable(get(value)).map(PatientType::getName).orElse(null);
    }
}