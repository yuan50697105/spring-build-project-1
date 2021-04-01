package org.example.domains.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerFormVo extends IBaseVo {
    private CustomerInfoVo customer;
}