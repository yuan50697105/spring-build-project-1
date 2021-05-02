package org.example.spring.daos.es.patient.entity.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.query.IBaseQuery;

/**
 * t_patient_meal
 */
@ApiModel(value = "org-example-spring-daos-mysql-patient-table-po-TPatientMeal")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class EPatientMealQuery extends IBaseQuery {
    private static final long serialVersionUID = 1L;
    /**
     * teamId
     */
    @ApiModelProperty(value = "teamId")
    private Long teamId;
    /**
     * groupId
     */
    @ApiModelProperty(value = "groupId")
    private Long groupId;
    /**
     * mealType
     */
    @ApiModelProperty(value = "mealType")
    private String mealType;
    /**
     * mealSource
     */
    @ApiModelProperty(value = "mealSource")
    private String mealSource;
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
     * mealCode
     */
    @ApiModelProperty(value = "mealCode")
    private String mealCode;
    /**
     * mealName
     */
    @ApiModelProperty(value = "mealName")
    private String mealName;
}