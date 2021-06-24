package org.example.spring.repositories.commons.entity.patient.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMealFeeItem;
import org.example.spring.repositories.commons.enumerate.FeeItemType;
import org.example.spring.repositories.commons.enumerate.ItemSource;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealFeeItemVo extends PatientTeamMealFeeItem {
    @Override
    public String getType() {
        return FeeItemType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(FeeItemType.getValue(type));
    }

    @Override
    public String getSource() {
        return ItemSource.getValue(super.getSource());
    }

    @Override
    public void setSource(String source) {
        super.setSource(ItemSource.getValue(source));
    }
}