package org.example.spring.daos.mysql.items.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.items.table.enumerate.Sex;
import org.example.spring.daos.mysql.items.table.enumerate.TFeeItemType;
import org.example.spring.daos.mysql.items.table.po.TFeeItem;

import java.io.Serializable;
import java.util.List;

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
        return TFeeItemType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(TFeeItemType.getValue(type));
    }
}