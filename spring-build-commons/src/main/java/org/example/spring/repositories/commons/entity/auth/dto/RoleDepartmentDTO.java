package org.example.spring.repositories.commons.entity.auth.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleDepartmentDTO extends RoleDTO implements Serializable {
    private List<DepartmentDTO> departments;
}