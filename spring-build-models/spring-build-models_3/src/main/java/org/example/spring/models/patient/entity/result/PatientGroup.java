package org.example.spring.models.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.patient.entity.po.TPatientGroup;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientGroup extends TPatientGroup {
}