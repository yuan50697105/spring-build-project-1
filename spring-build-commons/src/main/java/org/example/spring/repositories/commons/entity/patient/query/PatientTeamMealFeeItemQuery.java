package org.example.spring.repositories.commons.entity.patient.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;

/**
 * t_patient_team_meal_fee_item
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientTeamMealFeeItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class PatientTeamMealFeeItemQuery extends ICommonsQuery {
    private static final long serialVersionUID = 1L;
    /**
     * teamId
     */
    @ApiModelProperty(value = "teamId")
    private Long teamId;
    @ApiModelProperty(value = "teamMealId")
    private Long teamMealId;
    /**
     * patientId
     */
    @ApiModelProperty(value = "mealId")
    private Long mealId;
    /**
     * feeItemId
     */
    @ApiModelProperty(value = "feeItemId")
    private Long feeItemId;
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