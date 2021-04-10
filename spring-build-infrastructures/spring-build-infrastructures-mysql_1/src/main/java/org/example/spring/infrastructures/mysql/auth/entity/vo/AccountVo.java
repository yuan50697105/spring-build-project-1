package org.example.spring.infrastructures.mysql.auth.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.table.enumerate.TUserStatus;
import org.example.spring.infrastructures.mysql.auth.table.po.TUser;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountVo extends TUser {
    @Override
    public void setStatus(String status) {
        super.setStatus(TUserStatus.get(status).getValue());
    }
}