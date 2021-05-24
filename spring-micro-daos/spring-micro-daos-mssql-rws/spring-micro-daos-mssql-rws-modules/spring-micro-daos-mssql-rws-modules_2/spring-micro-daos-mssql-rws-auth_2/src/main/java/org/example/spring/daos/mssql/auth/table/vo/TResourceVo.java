package org.example.spring.daos.mssql.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mssql.auth.table.po.TResource;
import org.example.spring.daos.mysql.table.enumerate.TResourceType;

@EqualsAndHashCode(callSuper = true)
@Data
public class TResourceVo extends TResource {
    @Override
    public String getType() {
        return TResourceType.getValue(super.getType());
    }

    @Override
    public void setType(String type) {
        super.setType(TResourceType.getValue(type));
    }
}