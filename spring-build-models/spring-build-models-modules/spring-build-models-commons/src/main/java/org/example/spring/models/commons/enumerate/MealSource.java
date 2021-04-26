package org.example.spring.models.commons.enumerate;

import cn.hutool.core.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@AllArgsConstructor
@Getter
public enum MealSource implements IBaseEnum {
    PERSONAL("个人", "1", "1"),
    TEAM("团队", "2", "2"),
    ;

    private final String name;
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