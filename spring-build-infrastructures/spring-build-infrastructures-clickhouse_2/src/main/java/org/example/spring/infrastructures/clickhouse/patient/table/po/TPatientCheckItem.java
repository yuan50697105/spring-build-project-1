package org.example.spring.infrastructures.clickhouse.patient.table.po;

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
 * t_patient_check_item
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientCheckItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientCheckItem extends IBaseEntity implements Serializable {
    /**
     * patientId
     */
    @ApiModelProperty(value = "patientId")
    private Long patientId;

    /**
     * feeItemId
     */
    @ApiModelProperty(value = "feeItemId")
    private Long feeItemId;

    /**
     * checkItemId
     */
    @ApiModelProperty(value = "checkItemId")
    private String checkItemId;

    /**
     * checkItemCode
     */
    @ApiModelProperty(value = "checkItemCode")
    private String checkItemCode;

    /**
     * checkItemName
     */
    @ApiModelProperty(value = "checkItemName")
    private String checkItemName;

    /**
     * mealId
     */
    @ApiModelProperty(value = "mealId")
    private Long mealId;

    /**
     * source
     */
    @ApiModelProperty(value = "source")
    private String source;

    private static final long serialVersionUID = 1L;
}