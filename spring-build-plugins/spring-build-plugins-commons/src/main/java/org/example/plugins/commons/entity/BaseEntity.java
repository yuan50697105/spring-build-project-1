package org.example.plugins.commons.entity;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;

@Data
public abstract class BaseEntity {
    public void copy(Object object) {
        BeanUtil.copyProperties(object, this);
    }
}