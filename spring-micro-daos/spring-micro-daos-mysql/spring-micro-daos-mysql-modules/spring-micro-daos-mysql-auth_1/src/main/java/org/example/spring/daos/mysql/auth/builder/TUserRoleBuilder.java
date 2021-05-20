package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.po.TUserRole;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TUserRoleBuilder {
    TUserRoleBuilder instance = Mappers.getMapper(TUserRoleBuilder.class);

    List<TUserRole> buildRoles(Long id, List<Long> roleIds);
}
