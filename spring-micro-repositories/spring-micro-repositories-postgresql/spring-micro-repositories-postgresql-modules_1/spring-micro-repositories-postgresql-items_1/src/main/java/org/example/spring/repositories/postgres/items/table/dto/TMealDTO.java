package org.example.spring.repositories.postgres.items.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.MealType;
import org.example.spring.repositories.postgres.items.table.po.TMeal;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMealDTO extends TMeal implements Serializable {
    @Override
    public String getType() {
        return MealType.getName(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(MealType.getName(type));
    }
}