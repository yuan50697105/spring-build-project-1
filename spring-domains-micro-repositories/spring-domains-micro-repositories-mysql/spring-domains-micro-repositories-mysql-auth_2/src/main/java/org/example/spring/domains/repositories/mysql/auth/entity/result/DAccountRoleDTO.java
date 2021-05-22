package org.example.spring.domains.repositories.mysql.auth.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DAccountRoleDTO extends DAccountDTO implements Serializable {
    private List<DRoleDTO> roles;
}