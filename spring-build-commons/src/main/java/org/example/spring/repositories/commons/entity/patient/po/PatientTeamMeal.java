package org.example.spring.repositories.commons.entity.patient.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * t_patient_team_meal
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientTeamMeal")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class PatientTeamMeal extends ICommonsEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 体检者ID
     */
    private Long patientId;
    /**
     * teamId
     */
    @ApiModelProperty(value = "teamId")
    private Long teamId;
    /**
     * teamCode
     */
    @ApiModelProperty(value = "teamCode")
    private String teamCode;
    /**
     * teamName
     */
    @ApiModelProperty(value = "teamName")
    private String teamName;
    /**
     * mealType
     */
    @ApiModelProperty(value = "mealType")
    private String mealType;
    /**
     * mealId
     */
    @ApiModelProperty(value = "mealId")
    private Long mealId;
    /**
     * mealCode
     */
    @ApiModelProperty(value = "mealCode")
    private String mealCode;
    /**
     * mealName
     */
    @ApiModelProperty(value = "mealName")
    private String mealName;
    /**
     * price
     */
    @ApiModelProperty(value = "price")
    private BigDecimal price;
    /**
     * disPrice
     */
    @ApiModelProperty(value = "disPrice")
    private BigDecimal disPrice;
    /**
     * marketPrice
     */
    @ApiModelProperty(value = "marketPrice")
    private BigDecimal marketPrice;
}