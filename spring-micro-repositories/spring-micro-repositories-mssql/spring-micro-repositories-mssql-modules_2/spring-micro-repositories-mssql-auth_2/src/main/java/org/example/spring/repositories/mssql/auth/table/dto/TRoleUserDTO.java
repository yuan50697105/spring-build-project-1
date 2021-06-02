package org.example.spring.repositories.mssql.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TRoleUserDTO extends org.example.spring.repositories.mssql.auth.table.dto.TRoleDTO implements Serializable {
    private List<TUserDTO> users;

}