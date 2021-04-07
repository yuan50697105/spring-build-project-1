package org.example.spring.infrastructures.mysql.auth.entity.result;

import lombok.Data;
import org.example.spring.infrastructures.mysql.auth.table.po.TRole;

import java.util.List;

@Data
public class AccountDetails {
    private Account account;
    private List<Role> roles;
    private List<Permission> permissions;

}