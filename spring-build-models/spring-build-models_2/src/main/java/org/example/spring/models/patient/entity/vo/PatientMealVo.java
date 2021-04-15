package org.example.spring.models.patient.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.enumerate.MealType;
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
    @NotEmpty(groups = {Add.class})
    private Long teamId;

    @Override
    public void setMealType(String mealType) {
        super.setMealType(Optional.ofNullable(MealType.get(mealType)).map(MealType::getValue).orElse(null));
    }

    public interface Add {
    }

    public interface Update {
    }


}