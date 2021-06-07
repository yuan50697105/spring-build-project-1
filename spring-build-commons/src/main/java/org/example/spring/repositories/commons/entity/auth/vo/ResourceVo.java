package org.example.spring.repositories.commons.entity.auth.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.ResourceType;
import org.example.spring.repositories.commons.entity.auth.po.Resource;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceVo extends Resource implements Serializable {
    public ResourceVo() {
        setPid(0L);
        setType(ResourceType.MENU.getValue());
    }

    @Override
    public String getType() {
        return ResourceType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(ResourceType.getValue(type));
    }

}