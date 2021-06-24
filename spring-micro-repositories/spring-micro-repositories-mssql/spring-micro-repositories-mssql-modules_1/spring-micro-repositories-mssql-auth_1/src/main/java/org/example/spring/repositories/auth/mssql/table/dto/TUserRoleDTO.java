package org.example.spring.repositories.auth.mssql.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * t_user_role
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TUserRoleDTO extends org.example.spring.repositories.auth.mssql.table.dto.TUserDTO implements Serializable {
    private List<TRoleDTO> roles;

}