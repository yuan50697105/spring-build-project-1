package org.example.spring.repositories.mysql.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.ItemSource;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeamMealCheckItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientTeamMealCheckItemVo extends TPatientTeamMealCheckItem {
    @Override
    public String getSource() {
        return ItemSource.getValue(super.getSource());
    }

    @Override
    public void setSource(String source) {
        super.setSource(ItemSource.getValue(source));
    }
}