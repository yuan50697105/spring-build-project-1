package org.example.spring.daos.mssql.customer.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mssql.customer.table.po.TCustomerContract;
import org.example.spring.daos.mysql.table.enumerate.TCustomerContractStatus;

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