package org.example.spring.repositories.mysql.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * t_user_role
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TUserRoleDTO extends org.example.spring.repositories.mysql.auth.table.dto.TUserDTO implements Serializable {
    private List<org.example.spring.repositories.mysql.auth.table.dto.TRoleDTO> roles;

}