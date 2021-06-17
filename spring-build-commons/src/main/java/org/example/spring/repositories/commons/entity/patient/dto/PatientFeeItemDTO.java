package org.example.spring.repositories.commons.entity.patient.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.patient.po.PatientFeeItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientFeeItemDTO extends PatientFeeItem {
}