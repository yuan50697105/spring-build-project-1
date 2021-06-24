package org.example.spring.repositories.commons.entity.items.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.items.po.FeeItem;
import org.example.spring.repositories.commons.enumerate.FeeItemType;
import org.example.spring.repositories.commons.enumerate.Sex;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class FeeItemDTO extends FeeItem implements Serializable {
    @Override
    public String getSex() {
        return Sex.getName(super.getSex());
    }

    @Override
    public void setSex(String sex) {
        super.setSex(Sex.getName(sex));
    }

    @Override
    public String getType() {
        return FeeItemType.getName(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(FeeItemType.getName(type));
    }
}