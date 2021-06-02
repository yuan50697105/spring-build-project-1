package org.example.spring.repositories.oracle.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TRoleDepartmentDTO extends org.example.spring.repositories.oracle.auth.table.dto.TRoleDTO implements Serializable {
    private List<org.example.spring.repositories.oracle.auth.table.dto.TDepartmentDTO> departments;
}