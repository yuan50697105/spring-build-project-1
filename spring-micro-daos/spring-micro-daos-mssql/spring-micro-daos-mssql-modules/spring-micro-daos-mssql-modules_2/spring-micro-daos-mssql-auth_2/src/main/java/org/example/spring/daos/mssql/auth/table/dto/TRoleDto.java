package org.example.spring.daos.mssql.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mssql.auth.table.po.TRole;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TRoleDto extends TRole implements Serializable {
}