package org.example.spring.repositories.postgres.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.postgres.patient.table.po.TPatientGroup;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientGroupVo extends TPatientGroup {
}