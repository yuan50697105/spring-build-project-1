package org.example.spring.models.enumerate;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@AllArgsConstructor
@Getter
public enum SellerInfoStatus implements IBaseEnum {
    NORMAL("正常", "001", "1"),
    RESIGN("离职", "002", "2"),
    ;

    private final String name;
    private final String value;
    private final String code;

    public static SellerInfoStatus get(String value) {
        return EnumUtil.likeValueOf(SellerInfoStatus.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}