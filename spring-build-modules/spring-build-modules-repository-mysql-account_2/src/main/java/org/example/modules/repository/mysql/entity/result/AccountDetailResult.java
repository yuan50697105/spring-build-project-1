package org.example.modules.repository.mysql.entity.result;

import lombok.Data;

import java.io.Serializable;
import java.util.Optional;
import java.util.Set;

@Data
public class AccountDetailResult implements Serializable {
    private Long id;
    private UserInfoResult user;
    private Set<RoleInfoResult> roles;
    private Set<PermissionResult> permissions;

    public String getUsername() {
        return Optional.ofNullable(user).map(UserInfoResult::getUsername).orElse(null);
    }
}