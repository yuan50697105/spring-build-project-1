package org.example.spring.repositories.commons.patient.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.io.Serializable;

/**
 * t_patient_group
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientGroup")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class PatientGroup extends ICommonsEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;
    /**
     * customerId
     */
    @ApiModelProperty(value = "customerId")
    private Long customerId;
    /**
     * groupId
     */
    @ApiModelProperty(value = "teamId")
    private Long teamId;
    /**
     * teamMealId
     */
    @ApiModelProperty(value = "teamMealId")
    private Long teamMealId;
    /**
     * mealId
     */
    @ApiModelProperty(value = "mealId")
    private Long mealId;
    /**
     * mealName
     */
    @ApiModelProperty(value = "mealName")
    private String mealName;
    /**
     * personNum
     */
    @ApiModelProperty(value = "personNum")
    private Integer personNum;
}