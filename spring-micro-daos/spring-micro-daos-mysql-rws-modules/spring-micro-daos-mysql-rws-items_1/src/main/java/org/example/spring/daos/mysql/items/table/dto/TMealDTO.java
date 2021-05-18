package org.example.spring.daos.mysql.items.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.items.table.po.TMeal;
import org.example.spring.daos.mysql.table.enumerate.TMealType;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMealDTO extends TMeal implements Serializable {
    @Override
    public String getType() {
        return TMealType.getName(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(TMealType.getName(type));
    }
}