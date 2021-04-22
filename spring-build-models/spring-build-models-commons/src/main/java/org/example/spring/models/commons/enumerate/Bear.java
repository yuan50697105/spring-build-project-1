package org.example.spring.models.commons.enumerate;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@AllArgsConstructor
@Getter
public enum Bear implements IBaseEnum {
    COMMONS("通用","1","1"),
    BORN("已生育", "2", "2"),
    UNBORN("未生育", "3", "3");

    private final String name;
    private final String value;
    private final String code;

    public static Bear get(String value) {
        return EnumUtil.likeValueOf(Bear.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}