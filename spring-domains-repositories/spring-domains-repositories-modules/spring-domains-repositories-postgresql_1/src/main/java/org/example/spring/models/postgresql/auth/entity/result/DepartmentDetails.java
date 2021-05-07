package org.example.spring.models.postgresql.auth.entity.result;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DepartmentDetails implements Serializable {
    private static final long serialVersionUID = 70376549749134346L;
    private Department department;
    private List<Role> roles;
}