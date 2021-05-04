package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.po.TRoleResource;
import org.example.spring.daos.mysql.auth.table.po.TUserRole;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;
import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface AuthBuilder {
    default List<TUserRole> buildRoles(Long id, List<Long> existRoleIds) {
        if (existRoleIds != null) {
            ArrayList<TUserRole> list = new ArrayList<>(existRoleIds.size());
            for (Long existRoleId : existRoleIds) {
                list.add(buildRole(id, existRoleId));
            }
            return list;
        } else {
            return null;
        }
    }

    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TUserRole buildRole(Long userId, Long roleId);

    default List<TRoleResource> buildRoleResources(Long roleId, List<Long> permissionIds) {
        if (permissionIds != null) {
            ArrayList<TRoleResource> list = new ArrayList<>(permissionIds.size());
            for (Long permissionId : permissionIds) {
                list.add(buildRoleResource(roleId, permissionId));
            }
            return list;
        } else {
            return null;
        }
    }

    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TRoleResource buildRoleResource(Long roleId, Long resourceId);
}
