package org.example.spring.repositories.mssql.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TResourceRoleDTO extends TResourceDTO implements Serializable {
    private List<TRoleDTO> roles;
}