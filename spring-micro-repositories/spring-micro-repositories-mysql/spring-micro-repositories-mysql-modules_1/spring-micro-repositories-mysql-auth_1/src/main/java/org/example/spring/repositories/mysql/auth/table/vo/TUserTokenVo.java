package org.example.spring.repositories.mysql.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.mysql.auth.table.po.TUserToken;
import org.example.spring.repositories.mysql.table.enumerate.TUserTokenStatus;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserTokenVo extends TUserToken {
    @Override
    public void setStatus(String status) {
        super.setStatus(TUserTokenStatus.getValue(status));
    }
}