package org.example.spring.repositories.auth.oracle.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TRoleDepartmentDTO extends org.example.spring.repositories.auth.oracle.table.dto.TRoleDTO implements Serializable {
    private List<org.example.spring.repositories.auth.oracle.table.dto.TDepartmentDTO> departments;
}