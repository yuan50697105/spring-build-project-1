package org.example.spring.repositories.commons.enumerate;

import cn.hutool.core.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum YinYang {
    YIN("1", "阴性"),
    YANG("2", "阳性"),
    ;
    private final String value;
    private final String name;

    public static YinYang get(String value) {
        return EnumUtil.likeValueOf(YinYang.class, value);
    }

    public static String getValue(String value) {
        return Optional.ofNullable(get(value)).map(YinYang::getValue).orElse(null);
    }

    public static String getName(String name) {
        return Optional.ofNullable(get(name)).map(YinYang::getName).orElse(null);
    }
}
