package org.example.spring.infrastructures.mysql.patient.entity.enumerate;

import cn.hutool.core.util.EnumUtil;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

    @JsonValue
    private final String name;
    @EnumValue
    private final String value;
    private final String code;

    @JsonCreator
    public static FeeItemType get(String value) {
        return EnumUtil.likeValueOf(FeeItemType.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}