package org.example.spring.models.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.customer.entity.po.TCustomerContract;
import org.example.spring.models.enumerate.CustomerContractStatus;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContract extends TCustomerContract {
    @Override
    public String getStatus() {
        return Optional.ofNullable(CustomerContractStatus.get(super.getStatus())).map(CustomerContractStatus::getName).orElse(null);
    }
}