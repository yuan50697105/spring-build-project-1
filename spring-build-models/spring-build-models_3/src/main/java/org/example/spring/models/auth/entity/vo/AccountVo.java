package org.example.spring.models.auth.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.enumerate.UserStatus;
import org.example.spring.infrastructures.es.auth.entity.po.TUser;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountVo extends TUser {
    private static final long serialVersionUID = -5114667262512619570L;

    @Override
    public void setStatus(String status) {
        super.setStatus(UserStatus.get(status).getValue());
    }
}