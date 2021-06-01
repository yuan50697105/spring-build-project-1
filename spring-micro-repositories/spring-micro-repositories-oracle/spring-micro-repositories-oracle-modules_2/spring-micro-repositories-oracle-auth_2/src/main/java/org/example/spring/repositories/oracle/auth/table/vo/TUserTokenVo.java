package org.example.spring.repositories.oracle.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.mysql.table.enumerate.TUserTokenStatus;
import org.example.spring.repositories.oracle.auth.table.po.TUserToken;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserTokenVo extends TUserToken {
    @Override
    public void setStatus(String status) {
        super.setStatus(TUserTokenStatus.getValue(status));
    }
}