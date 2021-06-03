package org.example.spring.repositories.commons.patient.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;

/**
 * t_patient_fee_item
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientFeeItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class PatientFeeItemQuery extends ICommonsQuery {
    private static final long serialVersionUID = 1L;
    /**
     * mealId
     */
    @ApiModelProperty(value = "mealId")
    private Long mealId;

    /**
     * patientMealId
     */
    @ApiModelProperty(value = "patientMealId")
    private Long patientMealId;
    /**
     * patientId
     */
    @ApiModelProperty(value = "patientId")
    private Long patientId;
    /**
     * feeItemId
     */
    @ApiModelProperty(value = "feeItemId")
    private String feeItemId;
    /**
     * feeItemCode
     */
    @ApiModelProperty(value = "feeItemCode")
    private String feeItemCode;
    /**
     * feeItemName
     */
    @ApiModelProperty(value = "feeItemName")
    private String feeItemName;
    /**
     * source
     */
    @ApiModelProperty(value = "source")
    private String source;
    /**
     * type
     */
    @ApiModelProperty(value = "type")
    private String type;
}