package org.example.spring.domains.repositories.mysql.auth.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DDepartmentDetailsDTO extends DDepartmentDTO implements Serializable {
    private static final long serialVersionUID = 70376549749134346L;
    private List<DRoleDTO> DRoleDTOS;
}