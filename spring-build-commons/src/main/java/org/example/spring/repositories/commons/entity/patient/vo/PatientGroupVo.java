package org.example.spring.repositories.commons.entity.patient.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.patient.po.PatientGroup;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientGroupVo extends PatientGroup {
}