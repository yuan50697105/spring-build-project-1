package org.example.spring.repositories.postgres.customer.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.TCustomerOrderStatus;
import org.example.spring.repositories.postgres.customer.table.po.TCustomerOrder;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCustomerOrderVo extends TCustomerOrder implements Serializable {
    @Override
    public String getStatus() {
        return TCustomerOrderStatus.getValue(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(TCustomerOrderStatus.getValue(status));
    }
}