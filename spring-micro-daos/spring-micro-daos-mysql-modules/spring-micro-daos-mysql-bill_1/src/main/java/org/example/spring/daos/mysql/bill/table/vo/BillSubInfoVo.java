package org.example.spring.daos.mysql.bill.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.bill.table.enumerate.BillSubInfoStatus;
import org.example.spring.daos.mysql.bill.table.po.BillSubInfo;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillSubInfoVo extends BillSubInfo {
    @Override
    public String getStatus() {
        return BillSubInfoStatus.getValue(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(BillSubInfoStatus.getValue(status));
    }
}