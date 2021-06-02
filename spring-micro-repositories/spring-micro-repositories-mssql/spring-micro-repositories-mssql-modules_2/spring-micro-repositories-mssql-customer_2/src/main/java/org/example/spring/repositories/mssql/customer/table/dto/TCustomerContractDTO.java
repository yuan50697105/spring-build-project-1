package org.example.spring.repositories.mssql.customer.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.CustomerContractStatus;
import org.example.spring.repositories.mssql.customer.table.po.TCustomerContract;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCustomerContractDTO extends TCustomerContract implements Serializable {
    @Override
    public String getStatus() {
        return CustomerContractStatus.getName(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(CustomerContractStatus.getName(status));
    }
}