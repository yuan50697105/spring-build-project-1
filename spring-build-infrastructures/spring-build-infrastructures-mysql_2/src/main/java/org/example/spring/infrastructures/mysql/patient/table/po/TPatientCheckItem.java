package org.example.spring.infrastructures.mysql.patient.table.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientCheckItem extends IBaseEntity {
    private Long patientId;
    private Long feeItemId;
    private String checkItemId;
    private String checkItemCode;
    private String checkItemName;
}