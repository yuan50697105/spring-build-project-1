package org.example.spring.infrastructures.mysql.patient.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_patient_group_patient
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientGroupPatient")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientGroupPatient extends IBaseEntity implements Serializable {
    /**
     * groupId
     */
    @ApiModelProperty(value = "groupId")
    private Long groupId;

    /**
     * groupItemId
     */
    @ApiModelProperty(value = "groupItemId")
    private Long groupItemId;

    /**
     * patientId
     */
    @ApiModelProperty(value = "patientId")
    private Long patientId;

    private static final long serialVersionUID = 1L;
}