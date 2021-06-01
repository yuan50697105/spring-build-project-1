package org.example.spring.daos.postgres.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.postgres.auth.table.po.TResource;
import org.example.spring.daos.mysql.table.enumerate.TResourceType;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TResourceVo extends TResource implements Serializable {
    public TResourceVo() {
        setPid(0L);
        setType(TResourceType.MENU.getValue());
    }

    @Override
    public String getType() {
        return TResourceType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(TResourceType.getValue(type));
    }

}