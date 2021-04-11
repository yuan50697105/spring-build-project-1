package org.example.spring.infrastructures.mysql.auth.table.enumerate;

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
public enum ResourceType implements IBaseEnum {
    MENU("菜单", "001", 1),
    SUB_MENU("子菜单", "002", 2),
    BUTTON("按钮", "003", 3);
    @JsonValue
    private final String name;
    @EnumValue
    private final String value;
    private final Integer code;

    @JsonCreator
    public static ResourceType get(String value) {
        return EnumUtil.likeValueOf(ResourceType.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{value, name, String.valueOf(code)};
    }
}
