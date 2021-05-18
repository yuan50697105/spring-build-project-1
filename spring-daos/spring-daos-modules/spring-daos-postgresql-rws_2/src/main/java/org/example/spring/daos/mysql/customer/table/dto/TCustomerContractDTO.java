package org.example.spring.daos.mysql.customer.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.po.TCustomerContract;
import org.example.spring.daos.mysql.table.enumerate.TCustomerContractStatus;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCustomerContractDTO extends TCustomerContract implements Serializable {
    @Override
    public String getStatus() {
        return TCustomerContractStatus.getName(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(TCustomerContractStatus.getName(status));
    }
}