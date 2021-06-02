package org.example.spring.repositories.mssql.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.mssql.auth.table.po.TUser;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserDTO extends TUser implements Serializable {

    public TUserDTO() {

    }

    @Override
    public String getStatus() {
        return UserStatus.getName(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(UserStatus.getName(status));
    }
}