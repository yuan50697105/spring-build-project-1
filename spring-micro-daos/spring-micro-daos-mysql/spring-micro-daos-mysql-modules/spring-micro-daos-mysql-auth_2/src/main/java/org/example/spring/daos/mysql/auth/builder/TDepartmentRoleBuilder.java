package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.po.TDepartmentRole;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TDepartmentRoleBuilder {
    TDepartmentRoleBuilder INSTANCE = Mappers.getMapper(TDepartmentRoleBuilder.class);

    default List<TDepartmentRole> buildRoles(Long departmentId, List<Long> roleIds) {
        ArrayList<TDepartmentRole> departmentRoles = new ArrayList<>(roleIds.size());
        for (Long roleId : roleIds) {
            departmentRoles.add(new TDepartmentRole(departmentId, roleId));
        }
        return departmentRoles;
    }
}
