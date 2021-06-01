package org.example.spring.repositories.es.patient.entity.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.query.IBaseQuery;

/**
 * t_patient_group_item
 */
@ApiModel(value = "org-example-spring-daos-mysql-patient-table-po-TPatientGroupItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class EPatientGroupQuery extends IBaseQuery {
    private static final long serialVersionUID = 1L;
    private String code;
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
     * mealName
     */
    @ApiModelProperty(value = "mealName")
    private String mealName;
}