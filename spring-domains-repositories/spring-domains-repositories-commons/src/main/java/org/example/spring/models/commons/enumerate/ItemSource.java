package org.example.spring.models.commons.enumerate;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@AllArgsConstructor
@Getter
public enum ItemSource implements IBaseEnum {
    OPTIONAL("自选", "001", "1"),
    MEAL("套餐", "002", "2"),
    ;

    private final String name;
    private final String value;
    private final String code;

    public static ItemSource get(String value) {
        return EnumUtil.likeValueOf(ItemSource.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}