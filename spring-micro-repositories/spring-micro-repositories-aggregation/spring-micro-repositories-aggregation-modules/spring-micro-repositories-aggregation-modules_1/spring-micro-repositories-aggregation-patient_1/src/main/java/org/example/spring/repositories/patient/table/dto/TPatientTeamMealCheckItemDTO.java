package org.example.spring.repositories.patient.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.ItemSource;
import org.example.spring.repositories.patient.table.po.TPatientTeamMealCheckItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientTeamMealCheckItemDTO extends TPatientTeamMealCheckItem implements Serializable {
    @Override
    public String getSource() {
        return ItemSource.getName(super.getSource());
    }
}