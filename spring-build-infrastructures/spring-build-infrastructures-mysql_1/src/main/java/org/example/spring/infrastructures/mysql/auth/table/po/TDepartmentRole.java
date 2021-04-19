package org.example.spring.infrastructures.mysql.auth.table.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class TDepartmentRole extends IBaseEntity {
    private Long departmentId;
    private Long roleId;
}