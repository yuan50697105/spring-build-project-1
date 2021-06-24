package org.example.spring.repositories.auth.postgres.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TRoleResourceDTO extends org.example.spring.repositories.auth.postgres.table.dto.TRoleDTO implements Serializable {
    private List<TResourceDTO> resources;
}