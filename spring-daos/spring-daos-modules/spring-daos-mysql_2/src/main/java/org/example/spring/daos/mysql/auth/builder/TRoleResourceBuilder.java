package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.po.TRoleResource;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TRoleResourceBuilder {
    TRoleResourceBuilder instance = Mappers.getMapper(TRoleResourceBuilder.class);

    default List<TRoleResource> buildRoleResources(Long roleId, List<Long> permissionIds) {
        ArrayList<TRoleResource> tRoleResources = new ArrayList<>(permissionIds.size());
        for (Long permissionId : permissionIds) {
            tRoleResources.add(new TRoleResource(roleId, permissionId));
        }
        return tRoleResources;
    }
}