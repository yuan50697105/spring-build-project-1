package org.example.spring.repositories.commons.auth.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.UserTokenStatus;
import org.example.spring.repositories.commons.auth.po.UserToken;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserTokenVo extends UserToken {
    @Override
    public void setStatus(String status) {
        super.setStatus(UserTokenStatus.getValue(status));
    }
}