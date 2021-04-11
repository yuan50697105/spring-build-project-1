package org.example.spring.infrastructures.mysql.patient.table.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientFeeItemItem extends IBaseEntity {
    private Long patientId;
    private String feeItemId;
    private String feeItemCode;
    private String feeItemName;
}