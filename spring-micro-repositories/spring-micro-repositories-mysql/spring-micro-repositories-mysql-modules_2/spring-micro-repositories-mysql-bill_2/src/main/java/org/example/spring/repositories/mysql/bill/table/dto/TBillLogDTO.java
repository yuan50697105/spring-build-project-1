package org.example.spring.repositories.mysql.bill.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.mysql.bill.table.po.TBillLog;
import org.example.spring.repositories.mysql.table.enumerate.BillLogType;

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