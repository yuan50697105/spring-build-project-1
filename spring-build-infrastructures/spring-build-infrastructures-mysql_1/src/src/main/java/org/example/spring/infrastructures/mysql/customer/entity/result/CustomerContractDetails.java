package org.example.spring.infrastructures.mysql.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContractDetails extends IBaseVo {
    private CustomerContract contract;
}