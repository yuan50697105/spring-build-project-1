package org.example.spring.daos.mysql.bill.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.bill.table.enumerate.BillSubInfoStatus;
import org.example.spring.daos.mysql.bill.table.po.TBillSubInfo;

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