package org.example.spring.repositories.customer.postgres.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.CustomerContractStatus;
import org.example.spring.repositories.customer.postgres.table.po.TCustomerContract;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCustomerContractVo extends TCustomerContract implements Serializable {
    @Override
    public String getStatus() {
        return CustomerContractStatus.getValue(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(CustomerContractStatus.getValue(status));
    }
}