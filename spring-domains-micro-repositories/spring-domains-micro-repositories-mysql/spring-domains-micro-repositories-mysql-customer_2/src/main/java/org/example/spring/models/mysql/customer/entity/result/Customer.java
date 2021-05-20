package org.example.spring.models.mysql.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.po.TCustomerInfo;
import org.example.spring.daos.mysql.table.enumerate.TCustomerInfoType;

@EqualsAndHashCode(callSuper = true)
@Data
public class Customer extends TCustomerInfo {
    @Override
    public String getType() {
        return TCustomerInfoType.getName(super.getType());
    }

    public String getTypeValue() {
        return TCustomerInfoType.getValue(super.getType());
    }
}