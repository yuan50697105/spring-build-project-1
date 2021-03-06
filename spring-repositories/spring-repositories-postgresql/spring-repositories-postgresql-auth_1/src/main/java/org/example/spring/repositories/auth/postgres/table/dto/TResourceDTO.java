package org.example.spring.repositories.auth.postgres.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.auth.postgres.table.po.TResource;
import org.example.spring.repositories.commons.enumerate.ResourceType;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TResourceDTO extends TResource implements Serializable {
    @Override
    public String getType() {
        return ResourceType.getName(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(ResourceType.getName(type));
    }
}