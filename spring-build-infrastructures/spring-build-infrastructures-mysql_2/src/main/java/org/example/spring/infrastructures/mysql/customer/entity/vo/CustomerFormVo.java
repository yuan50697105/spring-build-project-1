package org.example.spring.infrastructures.mysql.customer.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerFormVo extends IBaseVo {
    private CustomerVo customer;
    private CustomerCommonsVo commons;
}