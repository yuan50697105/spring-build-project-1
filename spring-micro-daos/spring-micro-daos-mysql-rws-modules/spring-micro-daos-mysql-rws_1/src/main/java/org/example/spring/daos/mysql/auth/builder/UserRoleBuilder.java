package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.po.TUserRole;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface UserRoleBuilder {
    default List<TUserRole> buildRoles(Long userId, List<Long> roleIds) {
        ArrayList<TUserRole> list = new ArrayList<>(roleIds.size());
        for (Long roleId : roleIds) {
            list.add(new TUserRole(userId, roleId));
        }
        return list;
    }
}
