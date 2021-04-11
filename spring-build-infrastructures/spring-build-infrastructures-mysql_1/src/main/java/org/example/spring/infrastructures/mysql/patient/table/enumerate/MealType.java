package org.example.spring.infrastructures.mysql.patient.table.enumerate;

import cn.hutool.core.util.EnumUtil;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@AllArgsConstructor
@Getter
public enum MealType implements IBaseEnum {
    OPTIONAL("自选套餐","1","1"),
    CAREER_MEAL("职业套餐", "2", "2"),
    TEAM_MEAL("团队套餐", "3", "3"),
    VIP_MEAL("VIP套餐", "4", "4"),;

    @JsonValue
    private final String name;
    @EnumValue
    private final String value;
    private final String code;

    @JsonCreator
    public static MealType get(String value) {
        return EnumUtil.likeValueOf(MealType.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}