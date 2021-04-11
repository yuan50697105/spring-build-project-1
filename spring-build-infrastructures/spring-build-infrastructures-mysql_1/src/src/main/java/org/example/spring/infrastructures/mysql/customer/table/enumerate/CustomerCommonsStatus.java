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
public enum CustomerCommonsStatus implements IBaseEnum {
    POTENTIAL("潜在", "001", "1"),
    OFFICIAL("正式", "002", "2"),
    LOST("丢失", "003", "3"),
    ;

    @JsonValue
    private final String name;
    @EnumValue
    private final String value;
    private final String code;

    @JsonCreator
    public static CustomerCommonsStatus get(String value) {
        return EnumUtil.likeValueOf(CustomerCommonsStatus.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}