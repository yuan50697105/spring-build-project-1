package org.example.spring.models.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.entity.IModelVo;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContractDetails extends IModelVo {
    private CustomerContract contract;
}