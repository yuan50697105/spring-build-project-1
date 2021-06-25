package org.example.spring.plugins.commons.entity;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class ICommonsEntity extends BaseEntity {
    private Long id;
    private Long createId;
    private Long updateId;
    private String createUser;
    private String updateUser;
    private Date createDate;
    private Date updateDate;

    @Override
    public void copy(Object object) {
        String[] ignoreProperties = new String[]{"id", "createDate", "updateDate"};
        BeanUtil.copyProperties(object, this, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }
}