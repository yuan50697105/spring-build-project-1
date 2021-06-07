package org.example.spring.repositories.commons.entity.auth.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.UserTokenStatus;
import org.example.spring.repositories.commons.entity.auth.po.UserToken;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserTokenDto extends UserToken {
    @Override
    public String getStatus() {
        return UserTokenStatus.getName(super.getStatus());
    }
}