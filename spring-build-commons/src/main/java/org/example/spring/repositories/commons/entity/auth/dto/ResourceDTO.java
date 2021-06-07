package org.example.spring.repositories.commons.entity.auth.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.ResourceType;
import org.example.spring.repositories.commons.entity.auth.po.Resource;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceDTO extends Resource implements Serializable {
    @Override
    public String getType() {
        return ResourceType.getName(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(ResourceType.getName(type));
    }
}