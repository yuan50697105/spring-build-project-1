package org.example.spring.models.customer.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.customer.entity.po.TCustomerInfo;
import org.example.spring.models.enumerate.CustomerType;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerVo extends TCustomerInfo {
    @Override
    public void setType(String type) {
        super.setType(Optional.ofNullable(CustomerType.get(type)).map(CustomerType::getValue).orElse(null));
    }
}