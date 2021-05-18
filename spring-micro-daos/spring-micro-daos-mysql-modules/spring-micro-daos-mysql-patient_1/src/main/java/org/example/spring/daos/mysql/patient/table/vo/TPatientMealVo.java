package org.example.spring.daos.mysql.patient.table.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.enumerate.MealType;
import org.example.spring.daos.mysql.patient.table.po.TPatientMeal;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientMealVo extends TPatientMeal {
    @Override
    public String getMealType() {
        return MealType.getValue(super.getMealType());
    }

    @Override
    public void setMealType(String mealType) {
        super.setMealType(MealType.getValue(mealType));
    }
}