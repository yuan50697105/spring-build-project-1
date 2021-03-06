package org.example.spring.repositories.items.oracle.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.MealType;
import org.example.spring.repositories.items.oracle.table.po.TMeal;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMealVo extends TMeal implements Serializable {
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