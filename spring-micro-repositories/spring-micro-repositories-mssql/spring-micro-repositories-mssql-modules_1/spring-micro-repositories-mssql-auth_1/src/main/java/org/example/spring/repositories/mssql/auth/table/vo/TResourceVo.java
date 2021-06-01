package org.example.spring.repositories.mssql.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.mysql.table.enumerate.TResourceType;
import org.example.spring.repositories.mssql.auth.table.po.TResource;

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