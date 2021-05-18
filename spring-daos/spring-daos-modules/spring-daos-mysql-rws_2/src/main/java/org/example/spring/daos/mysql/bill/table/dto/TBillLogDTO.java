package org.example.spring.daos.mysql.bill.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.BillLogType;
import org.example.spring.daos.mysql.bill.table.po.TBillLog;

@EqualsAndHashCode(callSuper = true)
@Data
public class TBillLogDTO extends TBillLog {

    @Override
    public String getType() {
        return BillLogType.getName(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(BillLogType.getName(type));
    }
}