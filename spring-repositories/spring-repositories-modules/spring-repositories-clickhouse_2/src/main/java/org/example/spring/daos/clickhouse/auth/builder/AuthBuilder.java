package org.example.spring.repositories.clickhouse.auth.builder;

import org.example.spring.repositories.clickhouse.auth.table.po.TRoleResource;
import org.example.spring.repositories.clickhouse.auth.table.po.TUserRole;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface AuthBuilder {
    default List<TUserRole> buildRoles(Long id, List<Long> existRoleIds) {
        if (existRoleIds != null) {
            ArrayList<TUserRole> list = new ArrayList<>(existRoleIds.size());
            Iterator<Long> iterator = existRoleIds.iterator();
            while (iterator.hasNext()) {
                list.add(buildRole(id, iterator.next()));
            }
            return list;
        } else {
            return null;
        }
    }

    TUserRole buildRole(Long userId, Long roleId);

    default List<TRoleResource> buildRoleResources(Long roleId, List<Long> permissionIds) {
        if (permissionIds != null) {
            ArrayList<TRoleResource> list = new ArrayList<>(permissionIds.size());
            Iterator<Long> iterator = permissionIds.iterator();
            while (iterator.hasNext()) {
                list.add(buildRoleResource(roleId, iterator.next()));
            }
            return list;
        } else {
            return null;
        }
    }

    TRoleResource buildRoleResource(Long roleId, Long resourceId);
}
