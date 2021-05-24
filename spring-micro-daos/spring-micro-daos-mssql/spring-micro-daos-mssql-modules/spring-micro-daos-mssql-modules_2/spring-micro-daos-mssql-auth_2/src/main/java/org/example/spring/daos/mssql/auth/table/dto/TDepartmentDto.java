package org.example.spring.daos.mssql.auth.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mssql.auth.table.po.TDepartment;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TDepartmentDto extends TDepartment implements Serializable {
}