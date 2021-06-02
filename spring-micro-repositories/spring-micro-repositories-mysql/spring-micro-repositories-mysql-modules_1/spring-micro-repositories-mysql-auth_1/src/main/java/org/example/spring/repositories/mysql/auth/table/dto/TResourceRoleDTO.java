package org.example.spring.repositories.mysql.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TResourceRoleDTO extends org.example.spring.repositories.mysql.auth.table.dto.TResourceDTO implements Serializable {
    private List<TRoleDTO> roles;
}