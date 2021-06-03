package org.example.spring.repositories.commons.auth.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleResourceDTO extends RoleDTO implements Serializable {
    private List<ResourceDTO> resources;
}