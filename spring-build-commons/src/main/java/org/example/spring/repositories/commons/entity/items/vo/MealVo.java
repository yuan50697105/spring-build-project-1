package org.example.spring.repositories.commons.entity.items.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.items.po.Meal;
import org.example.spring.repositories.commons.enumerate.MealType;

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