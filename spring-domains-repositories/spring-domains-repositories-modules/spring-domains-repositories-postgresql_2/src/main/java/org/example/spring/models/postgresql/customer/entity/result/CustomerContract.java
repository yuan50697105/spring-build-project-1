package org.example.spring.models.postgresql.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.TCustomerContractStatus;
import org.example.spring.daos.postgresql.customer.table.po.TCustomerContract;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContract extends TCustomerContract {
    @Override
    public String getStatus() {
        return TCustomerContractStatus.getValue(super.getStatus());
    }
}