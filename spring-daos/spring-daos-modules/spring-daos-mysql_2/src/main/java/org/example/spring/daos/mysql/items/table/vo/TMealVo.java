package org.example.spring.daos.mysql.items.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.items.table.enumerate.TMealType;
import org.example.spring.daos.mysql.items.table.po.TMeal;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMealVo extends TMeal implements Serializable {
    @Override
    public String getType() {
        return TMealType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(TMealType.getValue(type));
    }
}