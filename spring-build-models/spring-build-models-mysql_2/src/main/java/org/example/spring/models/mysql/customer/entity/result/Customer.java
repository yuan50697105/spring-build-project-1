package org.example.spring.models.mysql.customer.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.enumerate.CustomerType;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerInfo;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class Customer extends TCustomerInfo {
    @Override
    public String getType() {
        return Optional.ofNullable(CustomerType.get(super.getType())).map(CustomerType::getName).orElse(null);
    }

    public String getTypeValue() {
        return Optional.ofNullable(CustomerType.get(super.getType())).map(CustomerType::getValue).orElse(null);
    }
}