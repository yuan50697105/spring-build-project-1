package org.example.spring.repositories.auth.oracle.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.auth.oracle.table.po.TResource;
import org.example.spring.repositories.commons.enumerate.ResourceType;

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