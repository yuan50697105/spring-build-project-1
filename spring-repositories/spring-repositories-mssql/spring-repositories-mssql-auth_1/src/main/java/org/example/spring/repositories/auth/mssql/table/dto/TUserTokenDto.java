package org.example.spring.repositories.auth.mssql.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.auth.mssql.table.po.TUserToken;
import org.example.spring.repositories.commons.enumerate.UserTokenStatus;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TUserTokenDto extends TUserToken {
    @Override
    public String getStatus() {
        return UserTokenStatus.getName(super.getStatus());
    }
}