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
public enum MealSource implements IBaseEnum {
    PERSONAL("个人", "1", "1"),
    TEAM("团队", "2", "2"),
    ;

    @JsonValue
    private final String name;
    @EnumValue
    private final String value;
    private final String code;

    @JsonCreator
    public static MealSource get(String value) {
        return EnumUtil.likeValueOf(MealSource.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
    }