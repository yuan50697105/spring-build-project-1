package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.po.TUserRole;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TUserRoleBuilder {
    TUserRoleBuilder INSTANCE = Mappers.getMapper(TUserRoleBuilder.class);

    default List<TUserRole> buildRoles(Long userId, List<Long> roleIds) {
        ArrayList<TUserRole> list = new ArrayList<>(roleIds.size());
        for (Long roleId : roleIds) {
            list.add(new TUserRole(userId, roleId));
        }
        return list;
    }
}
