package org.example.spring.infrastructures.mysql.patient.table.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientMeal;

import javax.validation.constraints.NotEmpty;
import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientMealVo extends TPatientMeal {
    /**
     * teamId
     */
    @ApiModelProperty(value = "teamId")
    private Long teamId;


}