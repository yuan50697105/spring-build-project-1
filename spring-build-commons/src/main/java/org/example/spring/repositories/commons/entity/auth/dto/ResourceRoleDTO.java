package org.example.spring.repositories.commons.entity.auth.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceRoleDTO extends ResourceDTO implements Serializable {
    private List<RoleDTO> roles;
}