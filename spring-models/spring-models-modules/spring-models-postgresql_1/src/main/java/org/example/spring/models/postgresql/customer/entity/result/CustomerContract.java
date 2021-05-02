package org.example.spring.models.postgresql.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.postgresql.customer.table.po.TCustomerContract;
import org.example.spring.models.commons.enumerate.CustomerContractStatus;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContract extends TCustomerContract {
    @Override
    public String getStatus() {
        return Optional.ofNullable(CustomerContractStatus.get(super.getStatus())).map(CustomerContractStatus::getName).orElse(null);
    }
}