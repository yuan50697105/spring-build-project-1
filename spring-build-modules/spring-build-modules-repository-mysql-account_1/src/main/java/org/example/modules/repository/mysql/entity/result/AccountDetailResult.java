package org.example.modules.repository.mysql.entity.result;

import lombok.Data;

import java.util.Set;

@Data
public class AccountDetailResult {
    private Long id;
    private UserInfoResult user;
    private Set<RoleInfoResult> roles;
    private Set<PermissionResult> permissions;
}