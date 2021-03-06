package org.example.spring.repositories.bill.mssql.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.bill.mssql.table.po.TBillSubInfo;
import org.example.spring.repositories.commons.enumerate.BillSubInfoStatus;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TBillSubInfoDTO extends TBillSubInfo implements Serializable {

    @Override
    public String getStatus() {
        return BillSubInfoStatus.getName(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(BillSubInfoStatus.getName(status));
    }

}