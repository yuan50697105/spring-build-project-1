package org.example.spring.models.mysql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.po.TPatientTeamMeal;
import org.example.spring.daos.mysql.table.enumerate.TMealType;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMeal extends TPatientTeamMeal {
    @Override
    public String getMealType() {
        return TMealType.getName(super.getMealType());
    }
}