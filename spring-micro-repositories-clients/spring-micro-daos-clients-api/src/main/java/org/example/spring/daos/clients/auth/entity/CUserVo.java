package org.example.spring.daos.clients.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class CUserVo extends CUser {
    private List<Long> roleIds;

    @Override
    public void setStatus(String status) {
        super.setStatus(TUserStatus.getValue(status));
    }
}