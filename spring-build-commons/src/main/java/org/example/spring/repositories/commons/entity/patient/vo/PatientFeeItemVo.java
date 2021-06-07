package org.example.spring.repositories.commons.entity.patient.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.FeeItemType;
import org.example.spring.repositories.commons.entity.patient.po.PatientFeeItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientFeeItemVo extends PatientFeeItem {
    @Override
    public String getType() {
        return FeeItemType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(FeeItemType.getValue(type));
    }
}
