package org.example.spring.repositories.customer.oracle.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.CustomerOrderStatus;
import org.example.spring.repositories.customer.oracle.table.po.TCustomerOrder;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCustomerOrderDTO extends TCustomerOrder implements Serializable {
    @Override
    public String getStatus() {
        return CustomerOrderStatus.getName(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(CustomerOrderStatus.getName(status));
    }
}