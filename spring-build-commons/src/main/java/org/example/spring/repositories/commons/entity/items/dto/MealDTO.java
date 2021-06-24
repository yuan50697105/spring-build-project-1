package org.example.spring.repositories.commons.entity.items.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.items.po.Meal;
import org.example.spring.repositories.commons.enumerate.MealType;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class MealDTO extends Meal implements Serializable {
    @Override
    public String getType() {
        return MealType.getName(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(MealType.getName(type));
    }
}