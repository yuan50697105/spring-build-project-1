package org.example.spring.repositories.postgres.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.postgres.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.daos.mysql.table.enumerate.ItemSource;

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