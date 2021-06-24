package org.example.spring.repositories.commons.entity.bill.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.bill.po.BillSubInfo;
import org.example.spring.repositories.commons.enumerate.BillSubInfoStatus;

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