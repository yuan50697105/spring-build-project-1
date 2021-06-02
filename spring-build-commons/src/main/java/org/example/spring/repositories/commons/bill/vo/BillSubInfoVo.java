package org.example.spring.repositories.commons.bill.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.BillSubInfoStatus;
import org.example.spring.repositories.commons.bill.po.BillSubInfo;

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