package org.example.spring.infrastructures.mysql.auth.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.auth.table.po.TDepartment;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentVo extends TDepartment {
    private static final long serialVersionUID = 2967156441152482970L;
}