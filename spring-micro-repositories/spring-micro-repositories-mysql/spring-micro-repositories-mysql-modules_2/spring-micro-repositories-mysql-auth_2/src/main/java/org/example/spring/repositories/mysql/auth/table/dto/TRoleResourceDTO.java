package org.example.spring.repositories.mysql.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TRoleResourceDTO extends org.example.spring.repositories.mysql.auth.table.dto.TRoleDTO implements Serializable {
    private List<org.example.spring.repositories.mysql.auth.table.dto.TResourceDTO> resources;
}