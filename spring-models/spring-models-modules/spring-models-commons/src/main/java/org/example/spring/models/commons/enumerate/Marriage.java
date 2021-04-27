package org.example.spring.models.commons.enumerate;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@AllArgsConstructor
@Getter
public enum Marriage implements IBaseEnum {
    COMMONS("通用", "1", "1"),
    MARRIED("已婚", "2", "2"),
    UNMARRIED("未婚", "3", "3");

    private final String name;
    private final String value;
    private final String code;

    public static Marriage get(String value) {
        return EnumUtil.likeValueOf(Marriage.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}