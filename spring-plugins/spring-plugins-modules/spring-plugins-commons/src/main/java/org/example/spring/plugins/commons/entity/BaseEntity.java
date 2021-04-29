package org.example.spring.plugins.commons.entity;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class BaseEntity implements Serializable {


    private static final long serialVersionUID = -5543758035153062715L;

    public void copy(Object object) {
        BeanUtil.copyProperties(object, this, CopyOptions.create().ignoreNullValue());
    }
}