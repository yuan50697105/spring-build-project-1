package org.example.spring.repositories.commons.entity.customer.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.customer.po.CustomerOrder;
import org.example.spring.repositories.commons.enumerate.CustomerOrderStatus;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerOrderDTO extends CustomerOrder implements Serializable {
    @Override
    public String getStatus() {
        return CustomerOrderStatus.getName(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(CustomerOrderStatus.getName(status));
    }
}