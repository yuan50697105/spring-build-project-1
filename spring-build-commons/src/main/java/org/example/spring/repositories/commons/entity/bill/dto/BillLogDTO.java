package org.example.spring.repositories.commons.entity.bill.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.BillLogType;
import org.example.spring.repositories.commons.entity.bill.po.BillLog;

@EqualsAndHashCode(callSuper = true)
@Data
public class BillLogDTO extends BillLog {

    @Override
    public String getType() {
        return BillLogType.getName(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(BillLogType.getName(type));
    }
}