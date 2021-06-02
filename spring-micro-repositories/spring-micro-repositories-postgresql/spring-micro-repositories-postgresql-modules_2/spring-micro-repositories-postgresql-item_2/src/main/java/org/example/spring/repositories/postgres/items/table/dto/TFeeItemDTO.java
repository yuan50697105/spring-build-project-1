package org.example.spring.repositories.postgres.items.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.postgres.table.enumerate.Sex;
import org.example.spring.repositories.postgres.table.enumerate.TFeeItemType;
import org.example.spring.repositories.postgres.items.table.po.TFeeItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TFeeItemDTO extends TFeeItem implements Serializable {
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
        return TFeeItemType.getName(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(TFeeItemType.getName(type));
    }
}