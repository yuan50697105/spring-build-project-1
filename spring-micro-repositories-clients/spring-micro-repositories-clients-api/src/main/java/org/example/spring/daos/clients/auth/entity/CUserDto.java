package org.example.spring.repositories.clients.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.TUserStatus;

@EqualsAndHashCode(callSuper = true)
@Data
public class CUserDto extends CUser {
    @Override
    public String getStatus() {
        return TUserStatus.getName(super.getStatus());
    }
}