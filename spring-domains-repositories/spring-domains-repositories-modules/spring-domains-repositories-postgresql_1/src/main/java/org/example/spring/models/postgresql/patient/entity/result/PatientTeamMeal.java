package org.example.spring.models.postgresql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.TMealType;
import org.example.spring.daos.postgresql.patient.table.po.TPatientTeamMeal;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMeal extends TPatientTeamMeal {
    @Override
    public String getMealType() {
        return TMealType.getName(super.getMealType());
    }
}