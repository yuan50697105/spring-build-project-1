package org.example.spring.models.mysql.auth.client.entity;

import lombok.Data;
import org.example.spring.daos.mysql.table.enumerate.TUserStatus;

import java.util.List;

@Data
public class AccountAddVo {
    private String username;
    private String name;
    private String password;
    private TUserStatus status;
    private List<Long> roleIds;
}