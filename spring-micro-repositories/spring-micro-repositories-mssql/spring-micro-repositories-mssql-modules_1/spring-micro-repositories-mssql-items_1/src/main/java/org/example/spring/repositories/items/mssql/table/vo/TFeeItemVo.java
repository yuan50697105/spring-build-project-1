package org.example.spring.repositories.items.mssql.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.FeeItemType;
import org.example.spring.repositories.commons.enumerate.Sex;
import org.example.spring.repositories.items.mssql.table.po.TFeeItem;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TFeeItemVo extends TFeeItem implements Serializable {
    @Override
    public String getSex() {
        return Sex.getValue(super.getSex());
    }

    @Override
    public void setSex(String sex) {
        super.setSex(Sex.getValue(sex));
    }

    @Override
    public String getType() {
        return FeeItemType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(FeeItemType.getValue(type));
    }
}