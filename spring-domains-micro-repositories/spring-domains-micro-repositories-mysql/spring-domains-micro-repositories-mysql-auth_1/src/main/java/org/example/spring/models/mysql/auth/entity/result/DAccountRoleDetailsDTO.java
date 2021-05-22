package org.example.spring.models.mysql.auth.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DAccountRoleDetailsDTO extends DAccountDTO implements Serializable {
    private List<DRoleDTO> roles;
}