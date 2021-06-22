package org.example.spring.repositories.aggregation.bill.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.BillSubInfoStatus;
import org.example.spring.repositories.aggregation.bill.table.po.TBillSubInfo;

@EqualsAndHashCode(callSuper = true)
@Data
public class TBillSubInfoVo extends TBillSubInfo {

    @Override
    public String getStatus() {
        return BillSubInfoStatus.getValue(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(BillSubInfoStatus.getValue(status));
    }
}