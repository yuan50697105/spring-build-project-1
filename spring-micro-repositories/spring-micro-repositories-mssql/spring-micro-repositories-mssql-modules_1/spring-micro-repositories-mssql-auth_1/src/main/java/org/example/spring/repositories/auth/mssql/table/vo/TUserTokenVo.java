package org.example.spring.repositories.auth.mssql.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.UserTokenStatus;
import org.example.spring.repositories.auth.mssql.table.po.TUserToken;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TUserTokenVo extends TUserToken {
    @Override
    public void setStatus(String status) {
        super.setStatus(UserTokenStatus.getValue(status));
    }
}