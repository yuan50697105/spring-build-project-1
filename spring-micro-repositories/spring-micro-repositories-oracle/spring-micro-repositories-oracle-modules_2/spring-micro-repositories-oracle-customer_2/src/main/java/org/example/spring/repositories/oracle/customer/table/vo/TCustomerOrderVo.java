package org.example.spring.repositories.oracle.customer.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.CustomerOrderStatus;
import org.example.spring.repositories.oracle.customer.table.po.TCustomerOrder;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCustomerOrderVo extends TCustomerOrder implements Serializable {
    @Override
    public String getStatus() {
        return CustomerOrderStatus.getValue(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(CustomerOrderStatus.getValue(status));
    }
}