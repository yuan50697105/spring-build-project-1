package org.example.spring.infrastructures.mysql.patient.entity.result;

import lombok.Data;

import java.util.List;

@Data
public class PatientGroupDetails {
    private PatientGroup group;
    private List<Patient> patients;
}