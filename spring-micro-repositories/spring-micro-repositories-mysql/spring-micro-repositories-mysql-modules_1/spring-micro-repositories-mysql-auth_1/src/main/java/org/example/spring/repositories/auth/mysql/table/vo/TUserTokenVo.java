package org.example.spring.repositories.auth.mysql.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.auth.mysql.table.po.TUserToken;
import org.example.spring.repositories.commons.enumerate.UserTokenStatus;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TUserTokenVo extends TUserToken {
    @Override
    public void setStatus(String status) {
        super.setStatus(UserTokenStatus.getValue(status));
    }
}