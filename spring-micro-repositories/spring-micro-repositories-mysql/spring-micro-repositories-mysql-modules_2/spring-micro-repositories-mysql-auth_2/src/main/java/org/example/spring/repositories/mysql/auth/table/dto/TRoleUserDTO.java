package org.example.spring.daos.mysql.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TRoleUserDTO extends org.example.spring.daos.mysql.auth.table.dto.TRoleDTO implements Serializable {
    private List<org.example.spring.daos.mysql.auth.table.dto.TUserDTO> users;

}