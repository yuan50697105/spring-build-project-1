package org.example.spring.repositories.commons.auth.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentRoleDTO extends DepartmentDTO implements Serializable {
    private List<RoleDTO> roles;
}