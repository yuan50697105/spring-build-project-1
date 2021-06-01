package org.example.spring.repositories.oracle.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TRoleDepartmentDTO extends TRoleDTO implements Serializable {
    private List<TDepartmentDTO> departments;
}