package org.example.spring.repositories.commons.entity.patient.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.ItemSource;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMealCheckItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealCheckItemVo extends PatientTeamMealCheckItem {
    @Override
    public String getSource() {
        return ItemSource.getValue(super.getSource());
    }

    @Override
    public void setSource(String source) {
        super.setSource(ItemSource.getValue(source));
    }
}