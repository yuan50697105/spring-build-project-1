package org.example.spring.repositories.clients.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.TUserStatus;

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