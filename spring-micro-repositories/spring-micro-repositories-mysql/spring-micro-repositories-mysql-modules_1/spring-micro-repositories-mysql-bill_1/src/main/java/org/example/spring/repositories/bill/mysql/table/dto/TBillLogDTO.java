package org.example.spring.repositories.bill.mysql.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.bill.mysql.table.po.TBillLog;
import org.example.spring.repositories.commons.enumerate.BillLogType;

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