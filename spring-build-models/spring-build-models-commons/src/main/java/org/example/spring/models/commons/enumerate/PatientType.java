package org.example.spring.models.commons.enumerate;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.spring.plugins.commons.converter.IBaseEnum;

@AllArgsConstructor
@Getter
public enum PatientType implements IBaseEnum {
    PRIVATE("私人", "1", "1"),
    TEAM("团队", "2", "2"),
    COMPLETION("补检", "3", "3"),
    REVIEW("复查", "4", "4");

    private final String name;
    private final String value;
    private final String code;

    public static PatientType get(String value) {
        return EnumUtil.likeValueOf(PatientType.class, value);
    }

    @Override
    public String[] getValueArrays() {
        return new String[]{name, value, code, name()};
    }
}