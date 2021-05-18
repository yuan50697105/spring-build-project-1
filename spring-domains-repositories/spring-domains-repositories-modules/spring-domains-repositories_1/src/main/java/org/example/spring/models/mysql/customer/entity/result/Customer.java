package org.example.spring.models.mysql.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.po.TCustomerInfo;
import org.example.spring.daos.mysql.table.enumerate.TCustomerType;

@EqualsAndHashCode(callSuper = true)
@Data
public class Customer extends TCustomerInfo {
    @Override
    public String getType() {
        return TCustomerType.getName(super.getType());
    }

    public String getTypeValue() {
        return TCustomerType.getValue(super.getType());
    }
}