package org.example.spring.daos.mysql.customer.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.customer.table.enumerate.TCustomerContractStatus;
import org.example.spring.daos.mysql.customer.table.po.TCustomerContract;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TCustomerContractVo extends TCustomerContract implements Serializable {
    @Override
    public String getStatus() {
        return TCustomerContractStatus.getValue(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(TCustomerContractStatus.getValue(status));
    }
}