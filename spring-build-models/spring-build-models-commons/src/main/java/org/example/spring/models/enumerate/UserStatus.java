package org.example.spring.models.enumerate;

import cn.hutool.core.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@AllArgsConstructor
@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum UserStatus implements IBaseEnum {
    Normal("正常", "001", "0"),
    Resign("离职", "002", "1"),
    Forbidden("禁用", "003", "2"),
    ;

    private final String name;
    private final String value;
    private final String code;

    public static UserStatus get(String value) {
        UserStatus userStatus = EnumUtil.likeValueOf(UserStatus.class, value);
        return userStatus;
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{value, name, String.valueOf(code), name()};
    }


}