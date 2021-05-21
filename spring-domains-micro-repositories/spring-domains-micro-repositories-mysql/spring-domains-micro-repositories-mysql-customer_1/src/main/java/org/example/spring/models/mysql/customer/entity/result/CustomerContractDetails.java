package org.example.spring.models.mysql.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.entity.ICommonsEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContractDetails extends ICommonsEntity {
    private CustomerContract contract;
}