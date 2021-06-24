package org.example.spring.plugins.commons.entity;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.audit.annotation.CreateTime;
import org.example.spring.plugins.mybatis.audit.annotation.Id;
import org.example.spring.plugins.mybatis.audit.annotation.UpdateTime;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public abstract class ICommonsEntity extends BaseEntity {
    @JsonSerialize(using = StringSerializer.class)
    @Id
    @javax.persistence.Id
    @TableId
    private Long id;
    private Long createId;
    private Long updateId;
    private String createUser;
    private String updateUser;
    @CreateTime
    private Date createDate;
    @UpdateTime
    private Date updateDate;

    @Override
    public void copy(Object object) {
        String[] ignoreProperties = new String[]{"id", "createDate", "updateDate"};
        BeanUtil.copyProperties(object, this, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }
}