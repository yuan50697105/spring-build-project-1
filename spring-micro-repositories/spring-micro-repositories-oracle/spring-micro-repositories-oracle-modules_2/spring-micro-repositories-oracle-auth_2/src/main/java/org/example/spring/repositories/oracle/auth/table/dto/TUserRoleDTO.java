package org.example.spring.repositories.oracle.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * t_user_role
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TUserRoleDTO extends TUserDTO implements Serializable {
    private List<TRoleDTO> roles;

}