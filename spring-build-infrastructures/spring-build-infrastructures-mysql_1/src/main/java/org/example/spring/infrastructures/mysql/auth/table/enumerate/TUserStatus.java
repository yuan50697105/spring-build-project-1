package org.example.spring.infrastructures.mysql.auth.table.enumerate;

import cn.hutool.core.util.EnumUtil;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.SneakyThrows;
import org.example.spring.infrastructures.mysql.auth.table.po.TUser;
import org.example.spring.plugins.commons.converter.IBaseEnum;

import java.util.List;

@AllArgsConstructor
@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TUserStatus implements IBaseEnum, IEnum<String> {
    Normal("正常", "001", 0),
    Resign("离职", "002", 1),
    Forbidden("禁用", "003", 2),
    ;

    @JsonValue
    private final String name;
    @EnumValue
    private final String value;
    private final Integer code;

    @JsonCreator
    public TUserStatus get(String value) {
        return EnumUtil.likeValueOf(TUserStatus.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{value, name, String.valueOf(code), name()};
    }


}