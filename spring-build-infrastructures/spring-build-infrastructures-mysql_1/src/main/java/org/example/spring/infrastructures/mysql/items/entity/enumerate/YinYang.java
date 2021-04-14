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
public enum YinYang implements IBaseEnum {
    YIN("阴性", "001", 1),
    YANG("阳性", "002", 2),
    ;
    @JsonValue
    private final String name;
    @EnumValue
    private final String value;
    private final Integer code;

    @JsonCreator
    public static YinYang get(String value) {
        return EnumUtil.likeValueOf(YinYang.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{value, name, String.valueOf(code)};
    }
}
