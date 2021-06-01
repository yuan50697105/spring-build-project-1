package org.example.spring.repositories.mysql.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.mysql.auth.table.po.TUserToken;
import org.example.spring.repositories.mysql.table.enumerate.TUserTokenStatus;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserTokenDto extends TUserToken {
    @Override
    public String getStatus() {
        return TUserTokenStatus.getName(super.getStatus());
    }
}