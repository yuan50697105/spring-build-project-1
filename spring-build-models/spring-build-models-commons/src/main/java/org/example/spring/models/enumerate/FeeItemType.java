package org.example.spring.models.enumerate;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@AllArgsConstructor
@Getter
public enum FeeItemType implements IBaseEnum {
    PERSONAL("个人项目", "001", "1"),
    ADDITIONAL("医生加项", "002", "2"),
    GROUP("团队项目", "003", "3"),
    ;

    private final String name;
    private final String value;
    private final String code;

    public static FeeItemType get(String value) {
        return EnumUtil.likeValueOf(FeeItemType.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}