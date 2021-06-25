package org.example.spring.repositories.patient.mssql.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.Bear;
import org.example.spring.repositories.commons.enumerate.Marriage;
import org.example.spring.repositories.patient.mssql.table.po.TPatient;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientVo extends TPatient {
    @Override
    public String getMarriage() {
        return Marriage.getValue(super.getMarriage());
    }

    @Override
    public void setMarriage(String marriage) {
        super.setMarriage(Marriage.getValue(marriage));
    }

    @Override
    public String getBear() {
        return Bear.getValue(super.getBear());
    }

    @Override
    public void setBear(String bear) {
        super.setBear(Bear.getValue(bear));
    }
}