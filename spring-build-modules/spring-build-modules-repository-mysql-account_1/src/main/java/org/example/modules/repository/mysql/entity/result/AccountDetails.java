package org.example.modules.repository.mysql.entity.result;

import lombok.Data;

import java.io.Serializable;
import java.util.Optional;
import java.util.Set;

@Data
public class AccountDetails implements Serializable {
    private Long id;
    private User user;
    private Set<Role> roles;
    private Set<Permission> permissions;

    public String getUsername() {
        return Optional.ofNullable(user).map(User::getUsername).orElse(null);
    }
}