package org.example.spring.daos.mssql.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TDepartmentRoleDTO extends TDepartmentDTO implements Serializable {
    private List<TRoleDTO> roles;
}