package org.example.spring.repositories.aggregation.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.ResourceType;
import org.example.spring.repositories.aggregation.auth.table.po.TResource;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TResourceVo extends TResource implements Serializable {
    public TResourceVo() {
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