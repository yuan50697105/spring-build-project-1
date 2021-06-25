package org.example.spring.repositories.patient.postgres.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.patient.postgres.table.po.TPatientGroup;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientGroupVo extends TPatientGroup {
}