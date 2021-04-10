package org.example.spring.infrastructures.mysql.customer.table.enumerate;

import cn.hutool.core.util.EnumUtil;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

    @JsonValue
    private final String name;
    @EnumValue
    private final String value;
    private final String code;

    @JsonCreator
    public static CustomerContractStatus get(String value) {
        return EnumUtil.likeValueOf(CustomerContractStatus.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}