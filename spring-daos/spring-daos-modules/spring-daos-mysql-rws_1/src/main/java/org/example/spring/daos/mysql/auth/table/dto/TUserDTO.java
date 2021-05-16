package org.example.spring.daos.mysql.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.table.enumerate.TUserStatus;
import org.example.spring.daos.mysql.auth.table.po.TUser;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserDTO extends TUser implements Serializable {

    @Override
    public String getStatus() {
        return TUserStatus.getName(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(TUserStatus.getName(status));
    }
}