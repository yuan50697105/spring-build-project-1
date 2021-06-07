package org.example.spring.repositories.commons.entity.customer.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.customer.po.CustomerInfo;
import org.example.spring.repositories.commons.enumerate.CustomerInfoType;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerInfoDTO extends CustomerInfo implements Serializable {
    @Override
    public String getType() {
        return CustomerInfoType.getName(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(CustomerInfoType.getName(type));
    }
}