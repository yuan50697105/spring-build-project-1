package org.example.spring.daos.postgres.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TRoleUserDTO extends TRoleDTO implements Serializable {
    private List<TUserDTO> users;

}