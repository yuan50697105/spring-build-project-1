package org.example.spring.infrastructures.mysql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatient;

@EqualsAndHashCode(callSuper = true)
@Data
public class Patient extends TPatient {
}