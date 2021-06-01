package org.example.spring.repositories.mssql.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;
import org.example.spring.repositories.mssql.auth.table.po.TUser;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserVo extends TUser implements Serializable {
    private List<Long> roleIds;

    @Override
    public String getStatus() {
        return TUserStatus.getValue(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(TUserStatus.getValue(status));
    }

}