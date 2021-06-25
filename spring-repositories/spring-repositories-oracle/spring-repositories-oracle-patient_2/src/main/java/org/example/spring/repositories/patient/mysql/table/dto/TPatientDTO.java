package org.example.spring.repositories.patient.oracle.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.Bear;
import org.example.spring.repositories.commons.enumerate.Marriage;
import org.example.spring.repositories.patient.oracle.table.po.TPatient;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientDTO extends TPatient implements Serializable {
    @Override
    public String getBear() {
        return Bear.getName(super.getBear());
    }

    @Override
    public String getMarriage() {
        return Marriage.getName(super.getMarriage());
    }
}