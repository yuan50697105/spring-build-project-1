package org.example.spring.repositories.commons.entity.auth.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.UserStatus;
import org.example.spring.repositories.commons.entity.auth.po.User;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserDTO extends User implements Serializable {

    public UserDTO() {

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