package org.example.spring.daos.mysql.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.enumerate.Bear;
import org.example.spring.daos.mysql.patient.table.enumerate.Marriage;
import org.example.spring.daos.mysql.patient.table.po.TPatient;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientVo extends TPatient {
    @Override
    public void setMarriage(String marriage) {
        super.setMarriage(Marriage.getValue(marriage));
    }

    @Override
    public String getMarriage() {
        return Marriage.getValue(super.getMarriage());
    }

    @Override
    public void setBear(String bear) {
        super.setBear(Bear.getValue(bear));
    }

    @Override
    public String getBear() {
        return Bear.getValue(super.getBear());
    }
}