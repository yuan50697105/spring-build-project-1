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
public enum Marriage implements IBaseEnum {
    COMMONS("通用","1","1"),
    MARRIED("已婚", "2", "2"),
    UNMARRIED("未婚", "3", "3");

    @JsonValue
    private final String name;
    @EnumValue
    private final String value;
    private final String code;

    @JsonCreator
    public static Marriage get(String value) {
        return EnumUtil.likeValueOf(Marriage.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}