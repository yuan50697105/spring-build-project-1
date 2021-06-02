package org.example.spring.repositories.clickhouse.patient.table.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.clickhouse.patient.table.po.TPatientMeal;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientMealVo extends TPatientMeal {
    /**
     * teamId
     */
    @ApiModelProperty(value = "teamId")
    private Long teamId;


}