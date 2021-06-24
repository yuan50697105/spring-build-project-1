package org.example.spring.repositories.commons.entity.auth.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.enumerate.UserStatus;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserVo extends User implements Serializable {
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