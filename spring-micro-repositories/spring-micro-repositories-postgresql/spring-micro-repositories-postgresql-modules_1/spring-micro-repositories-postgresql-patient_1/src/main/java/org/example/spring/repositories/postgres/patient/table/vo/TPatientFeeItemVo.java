package org.example.spring.repositories.postgres.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.postgres.patient.table.po.TPatientFeeItem;
import org.example.spring.daos.mysql.table.enumerate.FeeItemType;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientFeeItemVo extends TPatientFeeItem {
    @Override
    public String getType() {
        return FeeItemType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(FeeItemType.getValue(type));
    }
}
