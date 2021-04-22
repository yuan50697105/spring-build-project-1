package org.example.spring.models.commons.enumerate;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@AllArgsConstructor
@Getter
public enum CustomerType implements IBaseEnum {
    GENERAL("普通客户", "001", "1"),
    VIP_1("VIP一级", "002", "2"),;

    private final String name;
    private final String value;
    private final String code;

    public static CustomerType get(String value) {
        return EnumUtil.likeValueOf(CustomerType.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}