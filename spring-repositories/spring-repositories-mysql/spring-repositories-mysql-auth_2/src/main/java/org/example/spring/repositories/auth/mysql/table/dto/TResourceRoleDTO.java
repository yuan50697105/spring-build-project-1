package org.example.spring.repositories.auth.mysql.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Deprecated
public class TResourceRoleDTO extends org.example.spring.repositories.auth.mysql.table.dto.TResourceDTO implements Serializable {
    private List<TRoleDTO> roles;
}