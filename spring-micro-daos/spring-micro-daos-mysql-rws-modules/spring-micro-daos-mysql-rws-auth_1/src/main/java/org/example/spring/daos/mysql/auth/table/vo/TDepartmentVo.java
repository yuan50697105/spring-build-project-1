package org.example.spring.daos.mysql.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.builder.TDepartmentBuilder;
import org.example.spring.daos.mysql.auth.builder.TDepartmentRoleBuilder;
import org.example.spring.daos.mysql.auth.table.po.TDepartment;
import org.example.spring.daos.mysql.auth.table.po.TDepartmentRole;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TDepartmentVo extends TDepartment implements Serializable {
    private List<Long> roleIds;

    public TDepartmentVo() {
        setPid(0L);
    }

    public TDepartment toDepartment() {
        return TDepartmentBuilder.INSTANCE.buildDepartment(this);
    }

    public List<TDepartmentRole> toRoles(Long departmentId) {
        return TDepartmentRoleBuilder.INSTANCE.buildRoles(departmentId, roleIds);
    }
}