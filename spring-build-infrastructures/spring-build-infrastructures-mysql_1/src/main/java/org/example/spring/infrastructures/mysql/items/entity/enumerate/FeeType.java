package org.example.spring.infrastructures.mysql.items.entity.enumerate;

import cn.hutool.core.util.EnumUtil;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum FeeType implements IBaseEnum {
    PROFESSION("职业", "001", 1),
    PHYSICAL_EXAMINATION("体检", "002", 2),
    COMPOSITE("综合", "003", 3);
    @JsonValue
    private final String name;
    @EnumValue
    private final String value;
    private final Integer code;

    @JsonCreator
    public static FeeType get(String value) {
        return EnumUtil.likeValueOf(FeeType.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{value, name, String.valueOf(code)};
    }
}
