package org.example.spring.models.mysql.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.po.TCustomerContract;
import org.example.spring.daos.mysql.table.enumerate.TCustomerContractStatus;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContract extends TCustomerContract {
    @Override
    public String getStatus() {
        return TCustomerContractStatus.getName(super.getStatus());
    }
}