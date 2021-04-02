package org.example.modules.repository.mysql.entity.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String name;

    @JsonIgnore
    public String getUsername() {
        return Optional.ofNullable(user).map(User::getUsername).orElse(null);
    }

    @JsonIgnore
    public String getName() {
        return Optional.ofNullable(user).map(User::getName).orElse(null);
    }

}