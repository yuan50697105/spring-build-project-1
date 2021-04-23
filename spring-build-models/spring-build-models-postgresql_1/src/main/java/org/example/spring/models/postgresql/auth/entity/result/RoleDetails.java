package org.example.spring.models.postgresql.auth.entity.result;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RoleDetails implements Serializable {
    private static final long serialVersionUID = 1162476286003237154L;
    private Role role;
    private List<Resource> resources;
}