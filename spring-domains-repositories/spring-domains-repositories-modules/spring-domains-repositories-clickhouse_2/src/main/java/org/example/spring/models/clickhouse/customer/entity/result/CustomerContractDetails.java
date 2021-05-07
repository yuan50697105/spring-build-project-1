package org.example.spring.models.clickhouse.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.entity.IModelVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContractDetails extends IModelVo {
    private CustomerContract contract;
}