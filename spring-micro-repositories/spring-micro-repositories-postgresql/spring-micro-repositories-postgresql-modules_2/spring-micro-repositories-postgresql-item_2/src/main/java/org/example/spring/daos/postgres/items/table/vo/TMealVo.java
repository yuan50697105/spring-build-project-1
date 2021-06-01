package org.example.spring.daos.postgres.items.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.postgres.items.table.po.TMeal;
import org.example.spring.daos.mysql.table.enumerate.TMealType;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMealVo extends TMeal implements Serializable {
    private List<Long> feeItemIds;

    @Override
    public String getType() {
        return TMealType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(TMealType.getValue(type));
    }
}