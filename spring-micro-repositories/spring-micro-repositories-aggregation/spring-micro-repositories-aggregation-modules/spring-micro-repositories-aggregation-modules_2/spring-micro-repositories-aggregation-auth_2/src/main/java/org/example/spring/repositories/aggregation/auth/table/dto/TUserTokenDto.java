package org.example.spring.repositories.aggregation.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.UserTokenStatus;
import org.example.spring.repositories.aggregation.auth.table.po.TUserToken;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TUserTokenDto extends TUserToken {
    @Override
    public String getStatus() {
        return UserTokenStatus.getName(super.getStatus());
    }
}