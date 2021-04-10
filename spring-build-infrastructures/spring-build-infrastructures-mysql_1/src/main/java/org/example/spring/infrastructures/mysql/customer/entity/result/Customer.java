package org.example.spring.infrastructures.mysql.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.customer.table.enumerate.CustomerType;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerInfo;

@EqualsAndHashCode(callSuper = true)
@Data
public class Customer extends TCustomerInfo {
    @Override
    public String getType() {
        return CustomerType.get(super.getType()).getName();
    }
}