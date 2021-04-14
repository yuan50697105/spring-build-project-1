package org.example.spring.infrastructures.mysql.auth.entity.enumerate;

import cn.hutool.core.util.EnumUtil;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@AllArgsConstructor
@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TUserStatus implements IBaseEnum {
    Normal("001", "正常", 0),
    Resign("002", "离职", 1),
    Forbidden("003", "禁用", 2),
    ;

    @EnumValue
    private final String value;
    @JsonValue
    private final String name;
    private final Integer code;

    @JsonCreator
    public static TUserStatus get(String value) {
        return EnumUtil.likeValueOf(TUserStatus.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{value, name, String.valueOf(code), name()};
    }


}