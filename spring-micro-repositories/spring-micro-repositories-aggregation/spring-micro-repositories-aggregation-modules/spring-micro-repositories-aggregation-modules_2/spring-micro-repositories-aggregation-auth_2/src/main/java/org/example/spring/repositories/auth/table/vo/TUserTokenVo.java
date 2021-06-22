package org.example.spring.repositories.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.UserTokenStatus;
import org.example.spring.repositories.auth.table.po.TUserToken;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TUserTokenVo extends TUserToken {
    @Override
    public void setStatus(String status) {
        super.setStatus(UserTokenStatus.getValue(status));
    }
}