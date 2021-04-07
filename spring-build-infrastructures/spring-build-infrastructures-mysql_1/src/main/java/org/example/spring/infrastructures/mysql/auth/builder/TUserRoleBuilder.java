package org.example.spring.infrastructures.mysql.auth.builder;

import org.example.spring.infrastructures.mysql.auth.entity.result.Role;
import org.example.spring.infrastructures.mysql.auth.table.po.TRole;
import org.example.spring.infrastructures.mysql.auth.table.po.TUserRole;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface TUserRoleBuilder {
    default List<TUserRole> buildRoles(Long userId, List<Long> roleIds) {
        ArrayList<TUserRole> userRoles = new ArrayList<>(roleIds.size());
        for (Long roleId : roleIds) {
            userRoles.add(buildRole(userId,roleId));
        }
        return userRoles;
    }

    TUserRole buildRole(Long userId, Long roleId);

    List<Role> buildRoleResults(List<TRole> roles);
}
