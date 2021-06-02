package org.example.spring.repositories.mysql.customer.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.TCustomerOrderStatus;
import org.example.spring.repositories.mysql.customer.table.po.TCustomerOrder;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCustomerOrderDTO extends TCustomerOrder implements Serializable {
    @Override
    public String getStatus() {
        return TCustomerOrderStatus.getName(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(TCustomerOrderStatus.getName(status));
    }
}