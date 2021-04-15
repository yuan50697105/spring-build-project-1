package org.example.spring.models.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.customer.entity.enumerate.CustomerContractStatus;
import org.example.spring.infrastructures.es.customer.entity.po.TCustomerContract;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContract extends TCustomerContract {
    @Override
    public String getStatus() {
        return Optional.ofNullable(CustomerContractStatus.get(super.getStatus())).map(CustomerContractStatus::getName).orElse(null);
    }
}