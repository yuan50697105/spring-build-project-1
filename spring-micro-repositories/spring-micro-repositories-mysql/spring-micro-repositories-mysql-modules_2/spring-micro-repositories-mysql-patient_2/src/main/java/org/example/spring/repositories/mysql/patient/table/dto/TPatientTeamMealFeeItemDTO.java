package org.example.spring.repositories.mysql.patient.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.FeeItemType;
import org.example.spring.repositories.commons.enumerate.ItemSource;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeamMealFeeItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientTeamMealFeeItemDTO extends TPatientTeamMealFeeItem implements Serializable {
    @Override
    public String getType() {
        return FeeItemType.getName(super.getType());
    }

    @Override
    public String getSource() {
        return ItemSource.getName(super.getSource());
    }
}