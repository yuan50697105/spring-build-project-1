package org.example.spring.models.enumerate;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@AllArgsConstructor
@Getter
public enum Sex implements IBaseEnum {
    COMMONS("通用", "1", ""),
    MAN("男", "2", "2"),
    WOMAN("女", "3", "3"),
    ;

    private final String name;
    private final String value;
    private final String code;

    public static Sex get(String value) {
        return EnumUtil.likeValueOf(Sex.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}