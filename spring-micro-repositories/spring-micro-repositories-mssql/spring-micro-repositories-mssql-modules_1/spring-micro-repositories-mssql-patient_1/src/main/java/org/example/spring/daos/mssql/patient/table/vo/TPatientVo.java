package org.example.spring.daos.mssql.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mssql.patient.table.po.TPatient;
import org.example.spring.daos.mysql.table.enumerate.Bear;
import org.example.spring.daos.mysql.table.enumerate.Marriage;

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