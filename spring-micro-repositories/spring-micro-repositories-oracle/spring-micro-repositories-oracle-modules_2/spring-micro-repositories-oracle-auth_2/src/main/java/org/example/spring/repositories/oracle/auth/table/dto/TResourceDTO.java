package org.example.spring.repositories.oracle.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.TResourceType;
import org.example.spring.repositories.oracle.auth.table.po.TResource;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TResourceDTO extends TResource implements Serializable {
    @Override
    public String getType() {
        return TResourceType.getName(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(TResourceType.getName(type));
    }
}