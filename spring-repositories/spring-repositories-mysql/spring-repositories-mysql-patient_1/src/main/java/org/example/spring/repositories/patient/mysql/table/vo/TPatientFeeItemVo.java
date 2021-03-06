package org.example.spring.repositories.patient.mysql.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.FeeItemType;
import org.example.spring.repositories.patient.mysql.table.po.TPatientFeeItem;

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
