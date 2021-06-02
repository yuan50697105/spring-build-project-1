package org.example.spring.repositories.commons.items.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.MealType;
import org.example.spring.repositories.commons.items.po.Meal;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class MealVo extends Meal implements Serializable {
    private List<Long> feeItemIds;

    @Override
    public String getType() {
        return MealType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(MealType.getValue(type));
    }
}