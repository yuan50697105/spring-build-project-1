package org.example.spring.models.enumerate;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@AllArgsConstructor
@Getter
public enum CustomerCommonsStatus implements IBaseEnum {
    POTENTIAL("潜在", "001", "1"),
    OFFICIAL("正式", "002", "2"),
    LOST("丢失", "003", "3"),
    ;

    private final String name;
    private final String value;
    private final String code;

    public static CustomerCommonsStatus get(String value) {
        return EnumUtil.likeValueOf(CustomerCommonsStatus.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}