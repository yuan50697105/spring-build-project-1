package org.example.spring.infrastructures.mysql.auth.entity.result;

import lombok.Data;

import java.util.List;

@Data
public class RoleDetails {
    private Role role;
    private List<Resource> permissions;
}