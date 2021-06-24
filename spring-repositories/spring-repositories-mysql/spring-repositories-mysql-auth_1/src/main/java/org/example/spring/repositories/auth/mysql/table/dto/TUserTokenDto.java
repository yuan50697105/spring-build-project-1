package org.example.spring.repositories.auth.mysql.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.auth.mysql.table.po.TUserToken;
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