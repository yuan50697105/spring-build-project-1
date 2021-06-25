package org.example.spring.repositories.auth.postgres.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TDepartmentRoleDTO extends org.example.spring.repositories.auth.postgres.table.dto.TDepartmentDTO implements Serializable {
    private List<TRoleDTO> roles;
}