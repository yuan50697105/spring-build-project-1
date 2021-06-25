package org.example.spring.repositories.patient.oracle.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

/**
 * t_patient_team_meal_check_item
 */
@ApiModel(value = "org-example-spring-infrastructures-oracle-patient-table-po-TPatientTeamMealCheckItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientTeamMealCheckItem extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * patientId
     */
    @ApiModelProperty(value = "patientId")
    private Long teamId;
    /**
     * mealId
     */
    @ApiModelProperty(value = "mealId")
    private Long mealId;
    /**
     * teamMealId
     */
    @ApiModelProperty(value = "teamMealId")
    private Long teamMealId;
    /**
     * feeItemId
     */
    @ApiModelProperty(value = "feeItemId")
    private Long feeItemId;
    /**
     * teamFeeItemId
     */
    @ApiModelProperty(value = "teamFeeItemId")
    private Long teamFeeItemId;
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
     * source
     */
    @ApiModelProperty(value = "source")
    private String source;
}