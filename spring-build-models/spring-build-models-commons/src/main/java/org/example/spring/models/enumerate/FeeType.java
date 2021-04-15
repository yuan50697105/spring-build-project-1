package org.example.spring.models.enumerate;

import cn.hutool.core.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    private final String name;
    private final String value;
    private final Integer code;

    public static FeeType get(String value) {
        return EnumUtil.likeValueOf(FeeType.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{value, name, String.valueOf(code)};
    }
}
