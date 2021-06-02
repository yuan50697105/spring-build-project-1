package org.example.spring.repositories.commons.customer.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.customer.po.CustomerInfo;
import org.example.spring.repositories.commons.enumerate.CustomerInfoType;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerInfoVo extends CustomerInfo implements Serializable {
    @Override
    public String getType() {
        return CustomerInfoType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(CustomerInfoType.getValue(type));
    }
}
