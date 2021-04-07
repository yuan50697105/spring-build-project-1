package org.example.spring.infrastructures.mysql.auth.builder;

import org.example.spring.infrastructures.mysql.auth.entity.result.Permission;
import org.example.spring.infrastructures.mysql.auth.table.po.TPermission;
import org.example.spring.infrastructures.mysql.auth.table.po.TRolePermission;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface TRolePermissionBuilder {
    default List<TRolePermission> buildRolePermissions(Long roleId, List<Long> permissionIds) {
        ArrayList<TRolePermission> permissions = new ArrayList<>(permissionIds.size());
        for (Long permissionId : permissionIds) {
            permissions.add(buildRolePermission(roleId, permissionId));
        }
        return permissions;
    }

    TRolePermission buildRolePermission(Long roleId, Long permissionId);

}
