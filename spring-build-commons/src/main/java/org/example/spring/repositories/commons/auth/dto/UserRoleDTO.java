package org.example.spring.repositories.commons.auth.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * t_user_role
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserRoleDTO extends UserDTO implements Serializable {
    private List<RoleDTO> roles;

}