package org.example.spring.daos.mssql.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mssql.auth.table.po.TUserToken;
import org.example.spring.daos.mysql.table.enumerate.TUserTokenStatus;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserTokenVo extends TUserToken {
    @Override
    public void setStatus(String status) {
        super.setStatus(TUserTokenStatus.getValue(status));
    }
}