package org.example.spring.models.customer.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.entity.IModelVo;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerFormVo extends IModelVo {
    private CustomerVo customer;

}