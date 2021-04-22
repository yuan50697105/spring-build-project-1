package org.example.spring.models.customer.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.customer.table.vo.CustomerVo;
import org.example.spring.models.commons.entity.IModelVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerFormVo extends IModelVo {
    private CustomerVo customer;

}