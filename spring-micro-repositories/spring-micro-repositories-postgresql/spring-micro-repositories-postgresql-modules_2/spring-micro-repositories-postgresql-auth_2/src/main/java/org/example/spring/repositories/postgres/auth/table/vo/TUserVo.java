package org.example.spring.repositories.postgres.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.postgres.auth.table.po.TUser;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserVo extends TUser implements Serializable {
    private List<Long> roleIds;

    @Override
    public String getStatus() {
        return UserStatus.getValue(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(UserStatus.getValue(status));
    }

}