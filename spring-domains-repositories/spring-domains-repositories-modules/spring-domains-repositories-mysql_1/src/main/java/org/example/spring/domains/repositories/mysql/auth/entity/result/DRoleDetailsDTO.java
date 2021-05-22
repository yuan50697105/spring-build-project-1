package org.example.spring.domains.repositories.mysql.auth.entity.result;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DRoleDetailsDTO implements Serializable {
    private static final long serialVersionUID = 1162476286003237154L;
    private DRoleDTO DRoleDTO;
    private List<DResourceDTO> DResourceDTOS;
}