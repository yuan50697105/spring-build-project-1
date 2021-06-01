package org.example.spring.repositories.oracle.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.mysql.table.enumerate.TUserTokenStatus;
import org.example.spring.repositories.oracle.auth.table.po.TUserToken;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserTokenDto extends TUserToken {
    @Override
    public String getStatus() {
        return TUserTokenStatus.getName(super.getStatus());
    }
}