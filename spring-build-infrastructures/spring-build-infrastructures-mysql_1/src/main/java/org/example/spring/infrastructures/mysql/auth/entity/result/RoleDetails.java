package org.example.spring.infrastructures.mysql.auth.entity.result;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RoleDetails implements Serializable {
    private Role role;
    private List<Resource> resources;
}