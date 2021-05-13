package org.example.spring.models.mysql.auth.client.entity;

import lombok.Data;
import org.example.spring.models.commons.enumerate.UserStatus;

import java.util.List;

@Data
public class AccountAddVo {
    private String username;
    private String name;
    private String password;
    private UserStatus status;
    private List<Long> roleIds;
}