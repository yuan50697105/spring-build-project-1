package org.example.spring.infrastructures.es.patient.entity.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.query.IBaseQuery;

/**
 * t_patient_team_meal
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientTeamMeal")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientTeamMealQuery extends IBaseQuery {
    private static final long serialVersionUID = 1L;
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
}