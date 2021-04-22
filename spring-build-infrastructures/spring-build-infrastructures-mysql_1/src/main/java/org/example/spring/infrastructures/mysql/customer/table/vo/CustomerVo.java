package org.example.spring.infrastructures.mysql.customer.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.enumerate.CustomerType;
import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerInfo;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerVo extends TCustomerInfo {
    @Override
    public void setType(String type) {
        super.setType(Optional.ofNullable(CustomerType.get(type)).map(CustomerType::getValue).orElse(null));
    }
}