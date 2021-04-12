package org.example.spring.infrastructures.mysql.patient.entity.result;

import lombok.Data;

import java.util.List;

@Data
public class PatientGroupItemDetails {
    private PatientGroup item;
    private List<Patient> patients;
}