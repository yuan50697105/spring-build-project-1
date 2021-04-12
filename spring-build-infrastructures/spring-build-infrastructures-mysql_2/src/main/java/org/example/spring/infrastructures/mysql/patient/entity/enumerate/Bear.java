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
public enum Bear implements IBaseEnum {
    COMMONS("通用","1","1"),
    BORN("已生育", "2", "2"),
    UNBORN("未生育", "3", "3");

    @JsonValue
    private final String name;
    @EnumValue
    private final String value;
    private final String code;

    @JsonCreator
    public static Bear get(String value) {
        return EnumUtil.likeValueOf(Bear.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}