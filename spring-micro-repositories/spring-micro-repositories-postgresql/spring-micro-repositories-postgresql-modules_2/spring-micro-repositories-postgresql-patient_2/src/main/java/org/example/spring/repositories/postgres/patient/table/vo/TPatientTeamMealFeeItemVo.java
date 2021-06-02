package org.example.spring.repositories.postgres.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.postgres.table.enumerate.FeeItemType;
import org.example.spring.repositories.postgres.table.enumerate.ItemSource;
import org.example.spring.repositories.postgres.patient.table.po.TPatientTeamMealFeeItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientTeamMealFeeItemVo extends TPatientTeamMealFeeItem {
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