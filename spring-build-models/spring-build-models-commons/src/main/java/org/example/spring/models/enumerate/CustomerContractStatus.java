package org.example.spring.models.enumerate;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@AllArgsConstructor
@Getter
public enum CustomerContractStatus implements IBaseEnum {
    CONTRACT_ADDITION("合同添加", "001", "1"),
    CONTRACT_FOLLOW_UP("合同跟进", "002", "2"),
    CONTRACT_COMPLETED("合同完成", "003", "3"),
    ;

    private final String name;
    private final String value;
    private final String code;

    public static CustomerContractStatus get(String value) {
        return EnumUtil.likeValueOf(CustomerContractStatus.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}