package org.example.spring.infrastructures.mysql.auth.table.enumerate;

import com.baomidou.mybatisplus.annotation.IEnum;

public enum TUserStatus implements IEnum<String> {
    Normal("001"), Resign("002"),;

    private final String value;

    TUserStatus(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return null;
    }
}